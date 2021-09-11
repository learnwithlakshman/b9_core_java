package com.careerit.springcore.di;

import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Primary
@Component
@Slf4j
public class JPMParser implements Parser {

	
	public List<String> getActivities(String file){
		//Logic
		log.debug("This is debug message from JPMparser");
		return List.of("JPM","Activity-1","Activity-2");
	}
}
