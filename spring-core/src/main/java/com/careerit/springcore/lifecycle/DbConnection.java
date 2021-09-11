package com.careerit.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class DbConnection{

	@PostConstruct
	public void init() throws Exception {
		System.out.println("After property set");
	}

	@PreDestroy
	public void destroy() throws Exception {
		System.out.println("Before destory");
	}

		
		
			
		
}
