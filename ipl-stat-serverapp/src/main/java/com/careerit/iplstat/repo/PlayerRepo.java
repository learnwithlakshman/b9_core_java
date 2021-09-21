package com.careerit.iplstat.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.careerit.iplstat.domain.Player;
import com.careerit.iplstat.dto.PlayerCountAndAmountDTO;
import com.careerit.iplstat.dto.PlayerDTO;
import com.careerit.iplstat.dto.RoleCountAndAmountDTO;

public interface PlayerRepo extends   JpaRepository<Player,Long> {
	
	@Query(
			value = "select new com.careerit.iplstat.dto.PlayerCountAndAmountDTO(t.label,count(*),sum(p.price))from Team t inner join t.players p group by t.teamId"
			
	)
	
	List<PlayerCountAndAmountDTO> selectTeamAmountAndPlayerCount();
	
	@Query(
			value = "select p.role as role,count(*) as playerCount,sum(p.price) as totalAmount from team t inner join player p on p.team_id=t.team_id and t.label = :teamLabel group by p.role"
			,nativeQuery = true
	)
	List<RoleCountAndAmountDTO> selectRoleCountAndAmount(@Param("teamLabel") String label);
	
	@Query(
			value = "select t.label as label,p.name as name,p.price as amount,p.role as role from team t inner join player p on t.team_id=p.team_id where t.label= :label",
			nativeQuery = true
	)
	List<PlayerDTO> selectPlayerDetailsBy(@Param("label") String label);
	
	@Query(
			value = "select t.label as label,p.name as name,p.price as amount,p.role as role from team t inner join player p on t.team_id=p.team_id where t.label= :label and p.role= :role"
			,nativeQuery = true
			)
	List<PlayerDTO> selectPlayerDetailsBy(@Param("label") String label,@Param("role") String role);

}
