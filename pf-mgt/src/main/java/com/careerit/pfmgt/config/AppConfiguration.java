package com.careerit.pfmgt.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class AppConfiguration {

		@Value("${db.username}")
		private String username;

		@Value("${db.password}")
		private String password;

		@Value("${db.url}")
		private String url;
		
		@Bean
		public DataSource dataSource() {
			 DriverManagerDataSource dataSource = new DriverManagerDataSource();
		     dataSource.setUrl(url);
		     dataSource.setUsername(username);
		     dataSource.setPassword(password);
        	  return dataSource;
		}
		@Autowired
		public JdbcTemplate jdbcTemplate() {
			return new JdbcTemplate(dataSource());
		}
}
