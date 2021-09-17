package com.careerit.iplstat.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Team {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long teamId;
	private String city;
	private String name;
	private String label;
	private String home;
	private String coach;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "teamId",referencedColumnName = "teamId")
	private List<Player> players = new ArrayList<>();

	public void addPlayer(Player player) {
		this.players.add(player);
	}

	public void removePlayer(Player player) {
		this.players.remove(player);
	}
}
