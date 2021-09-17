package com.careerit.iplstat.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Player {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long playerId;
	private String name;
	private String role;
	private double price;
	

}
