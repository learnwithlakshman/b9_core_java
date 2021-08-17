package com.careerit.cj.ipl.service;

import java.util.List;

import com.careerit.cj.ipl.domain.Player;
import com.careerit.cj.ipl.dto.RoleCountAmountDTO;
import com.careerit.cj.ipl.dto.TeamStatDTO;


public interface IplStatService {

		List<TeamStatDTO> getTeamStats(); 
		List<RoleCountAmountDTO> getRoleAndAmountStats(String team);
		List<String> getTeamNames();
		List<Player> getPlayers(String team);
}
