package com.careerit.cbook.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.careerit.cbook.domain.Contact;
import com.careerit.cbook.dto.AgeStatDto;

public interface ContactRepo extends JpaRepository<Contact,Long> {

	Optional<Contact> findByEmail(String email);
	
	@Query(
			value = "select c from Contact c where c.name like %:str% or c.email like %:str% or c.mobile like %:str%"
	)
	List<Contact>  search(@Param("str")String str);

	@Query(
			value = "select avg(age) from contact",
			nativeQuery = true
	)
	double avgAge();
	
	@Query(value="select new com.careerit.cbook.dto.AgeStatDto(max(c.age),min(c.age),avg(c.age),sum(c.age)) from Contact c")
	AgeStatDto getAgeStat();

}
