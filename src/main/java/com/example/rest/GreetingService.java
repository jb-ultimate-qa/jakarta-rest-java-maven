package com.example.rest;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingService {
  public String greet() {
    return "Hello from CDI";
  }
}
