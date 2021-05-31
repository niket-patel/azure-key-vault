package com.azure.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppConfigController {

	@Autowired MessageProperties properties;
	@Autowired TaskStatusRepo taskStatusRepo;
    
    
    @GetMapping("/url")
    public String getUrl() {
        return "Message: " + properties.getUrl();
    }
    @GetMapping("/port")
    public String getPort() {
        return "Message: " + properties.getPort();
    }

    @GetMapping("/status")
	public ResponseEntity getTaskStatus() {		
		return new ResponseEntity(taskStatusRepo.findAll(), HttpStatus.OK);
	}
}
