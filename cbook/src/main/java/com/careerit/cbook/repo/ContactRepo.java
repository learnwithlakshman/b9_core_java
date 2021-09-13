package com.careerit.cbook.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.careerit.cbook.domain.Contact;

public interface ContactRepo extends JpaRepository<Contact,Long> {

}
