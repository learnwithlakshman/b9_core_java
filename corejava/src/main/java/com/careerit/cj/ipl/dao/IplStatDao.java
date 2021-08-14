package com.careerit.cj.ipl.dao;

import java.util.List;

import com.careerit.cj.ipl.domain.Player;
import com.careerit.cj.ipl.dto.RoleCountAmountDTO;
import com.careerit.cj.ipl.dto.TeamStatDTO;

public interface IplStatDao {

	List<TeamStatDTO> selectTeamStats();

	List<RoleCountAmountDTO> selectRoleAndAmountStats(String team);

	List<String> selectTeamNames();

	List<Player> selectPlayers(String team);
}
