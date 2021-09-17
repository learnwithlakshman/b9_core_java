package com.careerit.iplstat.service;

import java.util.List;

import com.careerit.iplstat.dto.PlayerCountAndAmountDTO;
import com.careerit.iplstat.dto.PlayerDTO;
import com.careerit.iplstat.dto.RoleCountAndAmountDTO;
import com.careerit.iplstat.dto.TeamAmountAndPlayerCountDTO;
import com.careerit.iplstat.dto.TeamLabelDTO;

public interface IplStatService {

	List<PlayerCountAndAmountDTO> getPlayerCountAndAmountDetails();

	List<TeamAmountAndPlayerCountDTO> getTeamAmountAndPlayerCount();

	TeamLabelDTO getLabelNames();

	List<RoleCountAndAmountDTO> getAmountAndPlayerCountBy(String label);

	List<PlayerDTO> getPlayerDetailsBy(String label, String role);
}
