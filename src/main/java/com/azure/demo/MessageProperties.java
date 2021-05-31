package com.azure.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;
@Data
@ConfigurationProperties
public class MessageProperties {
	
    private String url;
    
    private String port;







}
