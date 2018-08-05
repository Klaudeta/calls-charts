package org.roisandia.so.charts;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The entry point of the Spring Boot application.
 */
@SpringBootApplication
public class Application {

  private static final Logger log = LoggerFactory.getLogger(Application.class);

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

  // @Bean
  // public RestTemplate restTemplate(RestTemplateBuilder builder) {
  // return builder.build();
  // }
  //
  // @Bean
  // public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
  // return args -> {
  // ResponseEntity<Call[]> calls =
  // restTemplate.getForEntity("http://localhost:9999/get-calls", Call[].class);
  //
  // Arrays.asList(calls.getBody()).stream().forEach(c ->
  // log.info(c.toString()));
  // };
  // }

}
