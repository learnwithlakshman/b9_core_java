package com.careerit.iplstat.dm;

import java.util.List;

import lombok.Data;


@Data
public class TeamDto {

	private String city;
	private String name;
	private String label;
	private String home;
	private String coach;
	private List<PlayerDto> players;
}
