package org.roisandia.so.charts.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mashape.unirest.http.ObjectMapper;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.springframework.beans.factory.annotation.Value;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public abstract class AbstractRestfulService {
  public static final String MAGIC_SERVER_KEY = "XkF4mQG15tWh";

  protected final Logger log = Logger.getLogger(getClass().getName());

  @Value("${backend.address}")
  private String backendAddress;

  public AbstractRestfulService() {
    Unirest.setObjectMapper(new ObjectMapper() {
      private Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss.S").create();

      @Override
      public <T> T readValue(String value, Class<T> valueType) {
        return gson.fromJson(value, valueType);
      }

      @Override
      public String writeValue(Object value) {
        return gson.toJson(value);
      }
    });
  }

  protected <T, V> T post(Class<T> type, String method, V body) {
    try {
      long start = System.currentTimeMillis();
      T response = Unirest.post(backendAddress).queryString(getQueryString(method)).body(body).asObject(type).getBody();
      log.fine(String.format("POST %s (%dms) [%s]", method, System.currentTimeMillis() - start,
          new ReflectionToStringBuilder(body)));
      return response;
    } catch (UnirestException e) {
      log.warning(
          String.format("POST %s FAILED ON %s [%s]", method, e.getMessage(), new ReflectionToStringBuilder(body)));
      throw new RuntimeException(e);
    }
  }

  protected <T> T get(Class<T> type, String method) {
    try {
      long start = System.currentTimeMillis();
      T response = Unirest.post(backendAddress).queryString(getQueryString(method)).asObject(type).getBody();
      log.fine(String.format("GET %s (%dms)", method, System.currentTimeMillis() - start));
      return response;
    } catch (UnirestException e) {
      log.warning(String.format("GET %s FAILED ON %s", method, e.getMessage()));
      throw new RuntimeException(e);
    }
  }

  private Map<String, Object> getQueryString(String method) {
    Map<String, Object> qparams = new HashMap<>();
    qparams.put("cmd", method);
    qparams.put("key", MAGIC_SERVER_KEY);
    return qparams;
  }
}
