package com.unit.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BaseController {

	@RequestMapping(value="/hello")
	public ResponseEntity<String> getValue(){
		return new ResponseEntity<String>(this.calculate(5), HttpStatus.OK);
	}
	
	
	public String calculate(int value) {
		if(value!=0) {
			return Integer.toString(value*value);
		}else {
			return "Invalid value given in input";
		}
		
	}
}
