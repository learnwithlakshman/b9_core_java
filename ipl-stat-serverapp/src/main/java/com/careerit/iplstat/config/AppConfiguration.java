package com.careerit.iplstat.config;

import javax.sql.DataSource;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
public class AppConfiguration {

	@Bean
	public DataSource dataSource() {
		HikariConfig config = new HikariConfig("/hikaricp.properties");
		HikariDataSource dataSource = new HikariDataSource(config);
		return dataSource;
	}
	
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
}
