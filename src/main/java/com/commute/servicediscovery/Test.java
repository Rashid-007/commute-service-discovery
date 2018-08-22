package com.commute.servicediscovery;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class Test {
  @Value(("${eureka.client.serviceUrl.defaultZone}"))
  private String eurekaFuck;
  @RequestMapping(value = "/api/test", method = RequestMethod.GET, consumes = MediaType.ALL_VALUE)
  public Map<String, String> env(){
    Map<String, String> variables = new HashMap<>();
    variables.put("defaultZone", eurekaFuck);
    //variables.put("", "");

    return variables;
  }
}
