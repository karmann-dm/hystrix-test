package com.example.hystrixx;

import org.springframework.stereotype.Component;

@Component
public class ServiceFallback implements ServiceClient {
    @Override
    public String getAlbums(String id) {
        return "AAAAAAA";
    }
}
