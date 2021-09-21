package com.careerit.iplstat.dao;

import java.util.List;

import com.careerit.iplstat.dto.PlayerCountAndAmountDTO;
import com.careerit.iplstat.dto.PlayerDTO;
import com.careerit.iplstat.dto.RoleCountAndAmountDTO;
import com.careerit.iplstat.dto.TeamAmountAndPlayerCountDTO;

public interface IplStatDao {

	List<PlayerCountAndAmountDTO> selectPlayerCountAndAmountDetails();

	List<TeamAmountAndPlayerCountDTO> selectTeamAmountAndPlayerCount();

	List<String> selectLabelNames();

	List<RoleCountAndAmountDTO> selectAmountAndPlayerCountBy(String label);

	List<PlayerDTO> selectPlayerDetailsBy(String label, String role);
	List<PlayerDTO> selectPlayerDetailsBy(String label);
}
