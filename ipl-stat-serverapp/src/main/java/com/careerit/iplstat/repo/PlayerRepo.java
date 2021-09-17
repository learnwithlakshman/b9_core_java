package com.careerit.iplstat.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.careerit.iplstat.domain.Player;
import com.careerit.iplstat.domain.Team;

public interface PlayerRepo extends   JpaRepository<Player,Long> {

}
