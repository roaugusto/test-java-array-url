package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class controller {

  @GetMapping("/process")
  public ResponseEntity<String> process(@RequestParam("field[]") String[] field) {
    List<String> list = Arrays.asList(field);
    list.forEach(System.out::println);
    return ResponseEntity.ok().body("ok");
  }

}
