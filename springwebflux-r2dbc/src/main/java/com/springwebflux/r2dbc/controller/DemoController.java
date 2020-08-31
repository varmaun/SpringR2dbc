package com.springwebflux.r2dbc.controller;

import java.time.Duration;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;

@RestController
public class DemoController {

	@GetMapping(value="/flux")
	public Flux<Integer> returnFlux(){
		return Flux.just(1,2,3,4,5)
				.delayElements(Duration.ofSeconds(1))
				.log();
	}
	
	@GetMapping(value="/fluxStream",produces = MediaType.APPLICATION_STREAM_JSON_VALUE)
	public Flux<Integer> returnFluxStream(){
		return Flux.just(1,2,3,4,5)
				.delayElements(Duration.ofSeconds(1))
				.log();
	}
	
	
}
