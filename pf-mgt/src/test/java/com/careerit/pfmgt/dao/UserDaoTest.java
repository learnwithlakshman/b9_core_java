package com.careerit.pfmgt.dao;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.jdbc.core.JdbcTemplate;

import com.careerit.pfmgt.domain.AppUser;

@SpringBootTest
public class UserDaoTest {

	@Autowired
	private UserDao userDao;
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@BeforeEach
	void clean() {
		jdbcTemplate.update("delete  from appuser");
	}
	
	@Test
	void registerUser() {
		AppUser appUser = new AppUser();
		appUser.setEmail("krish@gmail.com");
		appUser.setName("Krish");
		appUser.setPassword("krish@123");
		Long count = userDao.insertUser(appUser);
		assertThat(count>0);
	}
	
	@Test
	void registerUserDuplicateEmail() {
		AppUser appUser = new AppUser();
		appUser.setEmail("krish@gmail.com");
		appUser.setName("Krish");
		appUser.setPassword("krish@123");
		userDao.insertUser(appUser);
		
		AppUser appUser1 = new AppUser();
		appUser1.setEmail("krish@gmail.com");
		appUser1.setName("Krishna");
		appUser1.setPassword("krishna@123");
		assertThrows(DuplicateKeyException.class,()->userDao.insertUser(appUser1)); 
		
	}
}
