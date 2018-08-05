package org.roisandia.so.callservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CallController {

  @Autowired
  private MockCall mockCall;

  @RequestMapping(value = "/get-calls", method = RequestMethod.GET)
  public @ResponseBody List<Call> getCalls() {
    return mockCall.calls;
  }

}
