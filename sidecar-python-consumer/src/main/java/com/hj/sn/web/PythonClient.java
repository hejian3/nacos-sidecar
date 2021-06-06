package com.hj.sn.web;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "python")
public interface PythonClient {

    @GetMapping("/hello")
    String hello();
}
