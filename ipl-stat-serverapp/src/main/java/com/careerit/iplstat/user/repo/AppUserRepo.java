package com.careerit.iplstat.user.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.careerit.iplstat.user.domain.AppUser;

public interface AppUserRepo extends JpaRepository<AppUser, Long> {

}
