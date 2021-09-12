package com.careerit.springcore.props;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Component
public class GreetingsService {

		@Value("${app.message}")
		private String message;
}
