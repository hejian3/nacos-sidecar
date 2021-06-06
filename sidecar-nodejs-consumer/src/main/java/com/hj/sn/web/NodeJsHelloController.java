package com.hj.sn.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class NodeJsHelloController {

    @Autowired
    private NodeClient nodeClient;

    @GetMapping("/nodejs/hello")
    public Mono<String> test() {
        return Mono.just(nodeClient.hello());
    }
}
