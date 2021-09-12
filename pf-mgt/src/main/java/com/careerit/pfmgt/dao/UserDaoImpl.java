package com.careerit.pfmgt.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.careerit.pfmgt.domain.AppUser;

@Repository
public class UserDaoImpl implements UserDao {

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public UserDaoImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public Long insertUser(AppUser appUser) {

		int updatedCount = jdbcTemplate.update("insert into appuser(name,email,password) values(?,?,?)",
				new Object[] { appUser.getName(), appUser.getEmail(), appUser.getPassword() });
		return (long) updatedCount;
	}

	@Override
	public boolean update(AppUser appUser) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteUser(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public AppUser selectUser(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
