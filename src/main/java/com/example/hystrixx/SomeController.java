package com.example.hystrixx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SomeController {
    @Autowired
    ServiceClient serviceClient;

    @GetMapping
    public void abc() {
        serviceClient.getAlbums("abc");
    }
}
