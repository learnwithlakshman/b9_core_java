package com.careerit.springcore.props;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
@Component
@ConfigurationProperties(prefix = "db")

public class DatabaseConnection {
		
	
		private String url;
		private String username;
		private String password;
}
