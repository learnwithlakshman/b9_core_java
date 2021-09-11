package com.careerit.springcore.di;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class BofaParser implements Parser {
	public List<String> getActivities(String file) {

		return List.of("Activity-1", "Activity-2");
	}
}
