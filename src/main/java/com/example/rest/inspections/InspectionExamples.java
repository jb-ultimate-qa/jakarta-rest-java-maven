package com.example.rest.inspections;

import jakarta.ws.rs.DefaultValue;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/inspections")
public class InspectionExamples {
  @GET
  @Path("/list")
  @Produces(MediaType.APPLICATION_JSON)
  public void getList() {
  }

  @GET
  @Path("/{unused}")
  public String getWithUnusedTemplate() {
    return "";
  }

  @GET
  @Path("/number/{n}")
  public String getNumber(@PathParam("n") @DefaultValue("III") int n) {
    return String.valueOf(n);
  }

  @POST
  @GET
  @Path("/getPost")
  public String getPost() {
    return "";
  }
}
