package com.onesoft.operationone.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Operationone {
@GetMapping("getfull")
public String get() {
	return "sapteengala madam";
}
}
