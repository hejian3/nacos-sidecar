package com.hj.sn.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PythonHelloController {

    @Autowired
    private PythonClient pythonClient;

    @GetMapping("/python/hello")
    public String test() {
        return pythonClient.hello();
    }
}
