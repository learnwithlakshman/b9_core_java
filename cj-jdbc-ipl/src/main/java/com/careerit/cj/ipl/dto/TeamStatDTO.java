package com.careerit.cj.ipl.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class TeamStatDTO {

		private String team;
		private int count;
		private double totalAmount;
}
