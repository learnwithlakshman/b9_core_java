package com.careerit.cj;

import java.util.List;
import java.util.stream.Collectors;

import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@Setter
@AllArgsConstructor
public class IplStatServiceImpl implements IplStatService{

	private List<Player> list;
	
	@Override
	public List<String> getTeamLabels() {
		if(list !=null) {
			return list.stream().map(e->e.getTeam()).distinct().collect(Collectors.toList());
		}
		return null;
	}

	@Override
	public List<TeamAmountDTO> getTeamAmount() {
		// TODO Auto-generated method stub
		return null;
	}

   
}
