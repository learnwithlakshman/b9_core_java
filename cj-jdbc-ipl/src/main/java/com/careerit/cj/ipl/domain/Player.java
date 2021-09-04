package com.careerit.cj.ipl.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class Player {

		private int id;
		private String name;
		private String team;
		private String role;
		private String country;
		private double price;
}