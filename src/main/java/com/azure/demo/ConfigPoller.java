package com.azure.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.microsoft.azure.spring.cloud.config.AppConfigurationRefresh;

@Component
public class ConfigPoller {
	@Autowired
	AppConfigurationRefresh appConfigurationRefresh;


	@Scheduled(fixedDelay = 60000)
	public void scheduleFixedDelayTask() {
		System.out.println(" ----   refreshing");
		appConfigurationRefresh.refreshConfigurations();
	}
}
