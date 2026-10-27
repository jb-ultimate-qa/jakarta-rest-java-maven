package com.example.rest;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

@Path("/greeting")
public class GreetingResource {
  @Inject GreetingService greetingService;

  @GET
  @Produces("text/plain")
  public String greeting() {
    return greetingService.greet();
  }
}
