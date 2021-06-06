package com.hj.sn.web;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "nodejs")
public interface NodeClient {

    @GetMapping("/hello")
    String hello();
}
