package com.careerit.iplstat.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.careerit.iplstat.domain.Team;

public interface TeamRepo extends JpaRepository<Team,Long> {

		@Query("select t.label from Team t")
		public List<String> selectTeamLabels();
}
