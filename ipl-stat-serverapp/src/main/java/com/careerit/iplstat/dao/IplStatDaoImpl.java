package com.careerit.iplstat.dao;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.careerit.iplstat.domain.Player;
import com.careerit.iplstat.dto.PlayerCountAndAmountDTO;
import com.careerit.iplstat.dto.PlayerDTO;
import com.careerit.iplstat.dto.RoleCountAndAmountDTO;
import com.careerit.iplstat.dto.TeamAmountAndPlayerCountDTO;
import com.careerit.iplstat.repo.PlayerRepo;
import com.careerit.iplstat.repo.TeamRepo;

@Repository
public class IplStatDaoImpl implements IplStatDao {

	private Logger log = LoggerFactory.getLogger(IplStatDaoImpl.class);
	private final PlayerRepo playerRepo;
	private final TeamRepo teamRepo;

	@Autowired
	public IplStatDaoImpl(PlayerRepo playerRepo, TeamRepo teamRepo) {
		this.playerRepo = playerRepo;
		this.teamRepo = teamRepo;
	}

	@Override
	public List<PlayerCountAndAmountDTO> selectPlayerCountAndAmountDetails() {
		//Collection
		List<Player> players = playerRepo.findAll();
		
		return null;
	}

	@Override
	public List<TeamAmountAndPlayerCountDTO> selectTeamAmountAndPlayerCount() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> selectLabelNames() {
		List<String> teamNames = teamRepo.selectTeamLabels();
		log.info("Team labels count :{}", teamNames.size());
		return teamNames;
	}

	@Override
	public List<RoleCountAndAmountDTO> selectAmountAndPlayerCountBy(String label) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PlayerDTO> selectPlayerDetailsBy(String label, String role) {
		// TODO Auto-generated method stub
		return null;
	}

}
