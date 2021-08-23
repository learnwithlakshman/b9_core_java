package com.careerit.cj;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class Player {

		
		private String name;
		private String team;
		private String role;
	    private double price;
}
