package com.careerit.iplstat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.careerit.iplstat.dao.IplStatDao;
import com.careerit.iplstat.dto.PlayerCountAndAmountDTO;
import com.careerit.iplstat.dto.PlayerDTO;
import com.careerit.iplstat.dto.RoleCountAndAmountDTO;
import com.careerit.iplstat.dto.TeamAmountAndPlayerCountDTO;
import com.careerit.iplstat.dto.TeamLabelDTO;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class IplStatServiceImpl implements IplStatService {

	private final IplStatDao iplStatDao;

	@Autowired
	public IplStatServiceImpl(IplStatDao iplStatDao) {
		this.iplStatDao = iplStatDao;
	}

	@Override
	public List<PlayerCountAndAmountDTO> getPlayerCountAndAmountDetails() {
		
		return null;
	}

	@Override
	public List<TeamAmountAndPlayerCountDTO> getTeamAmountAndPlayerCount() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TeamLabelDTO getLabelNames() {
		List<String> list = iplStatDao.selectLabelNames();
		TeamLabelDTO teamLabelDTO = new TeamLabelDTO();
		teamLabelDTO.setTeamLabels(list);
		log.debug("Total team label count is :{}", list.size());
		return teamLabelDTO;
	}

	@Override
	public List<RoleCountAndAmountDTO> getAmountAndPlayerCountBy(String label) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PlayerDTO> getPlayerDetailsBy(String label, String role) {
		// TODO Auto-generated method stub
		return null;
	}

}
