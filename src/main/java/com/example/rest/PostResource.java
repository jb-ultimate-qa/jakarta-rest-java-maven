package com.example.rest;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.FormParam;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

@Path("/po")
public class PostResource {
  @POST
  @Path("simple")
  @Consumes("application/x-www-form-urlencoded")
  public String simple(@FormParam("firstName") String firstName, @FormParam("lastName") String lastName) {
    return "Ok. firstName: " + firstName + ", lastName: " + lastName;
  }
}
