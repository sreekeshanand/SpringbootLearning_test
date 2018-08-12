package com.spring.testing.stock.web.component;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduleComponent {

	
	@Scheduled(fixedRate=2000)
	public void task(){
		System.out.println("Testing the the Schedule task ");
	}
}
