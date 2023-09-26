package com.kosa.jenkins;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/hello")
	public ResponseEntity<Model> hello(Model model) {
		
		
		return new ResponseEntity<Model> (model.addAttribute("message", "Hello Kosa!!!"), HttpStatus.OK);
	}

}
