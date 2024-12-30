package com.vibhashana.spring_docker.controller;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.vibhashana.spring_docker.models.Post;

@RestController
@RequestMapping("/api")
public class DemoController {
    private final RestTemplate restTemplate;

    public DemoController(RestTemplateBuilder restTemplateBuilder) {
        restTemplate = restTemplateBuilder.build();
    }

    @GetMapping("/v1/posts")
    public ResponseEntity<Post[]> getPosts() {
        return restTemplate.getForEntity("https://jsonplaceholder.typicode.com/posts", Post[].class);
    }
}
