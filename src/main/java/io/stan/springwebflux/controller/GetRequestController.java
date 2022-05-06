package io.stan.springwebflux.controller;

import io.stan.springwebflux.filters.ReactiveRequestContextHolder;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class GetRequestController {

    @RequestMapping("/request")
    public Mono<String> getRequest() {
       // return ReactiveRequestContextHolder.getRequest()
       //         .map(request -> request.getHeaders().getFirst("user"));
        Mono<ServerHttpRequest> request = Mono.subscriberContext().map(c->c.get("context"));
        Mono<String> parameter= Mono.subscriberContext().map(s->s.get("stano"));
        return parameter;
        //return request.map(r -> r.getHeaders().getFirst("user"));
    }
}