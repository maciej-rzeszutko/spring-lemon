package com.naturalprogrammer.spring.lemondemo.controllers;

import org.bson.types.ObjectId;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.naturalprogrammer.spring.lemon.commons.security.UserDto;
import com.naturalprogrammer.spring.lemondemo.domain.User;
import com.naturalprogrammer.spring.lemonreactive.LemonReactiveController;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/core")
public class MyController extends LemonReactiveController<User, ObjectId> {

	@Override
	public Mono<UserDto<ObjectId>> signup(@RequestBody Mono<User> user, ServerHttpResponse response) {
		
		return super.signup(user, response);
	}
}
