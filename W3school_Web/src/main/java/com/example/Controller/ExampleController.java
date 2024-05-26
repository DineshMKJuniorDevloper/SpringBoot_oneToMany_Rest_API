package com.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.ExampleEntity;
import com.example.Service.ExampleService;

@RestController
public class ExampleController {
	
	 @Autowired
	    private ExampleService exampleService;

	    @PostMapping("/add")
	    public ResponseEntity<?> createExample(@RequestBody ExampleEntity exampleEntity) {
	        try {
	            ExampleEntity savedExample = exampleService.saveExample(exampleEntity);
	            return ResponseEntity.ok(savedExample);
	        } catch (IllegalArgumentException e) {
	            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
	                    .body("{\"status\": 400, \"data\": null, \"error\": [{\"target\": \"name\", \"message\": \"" + e.getMessage() + "\"}]}");
	        }
	    }

}
