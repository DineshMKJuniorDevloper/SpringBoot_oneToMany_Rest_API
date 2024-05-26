package com.example.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entity.ExampleEntity;
import com.example.Repo.ExampleRepository;

@Service
public class ExampleService {

	@Autowired
	 private ExampleRepository exampleRepository;
	
	      public ExampleEntity saveExample(ExampleEntity exampleEntity) {
	        // Perform validation
	        if (exampleEntity.getName() == null) {
	            throw new IllegalArgumentException("Name field is null");
	        }
	        
	        return exampleRepository.save(exampleEntity);
	      }

}
