package com.example.hystrixx;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "albums", fallback = ServiceFallback.class)
public interface ServiceClient {

    @GetMapping("/users/{id}/albums")
    String getAlbums(@PathVariable String id);

}
