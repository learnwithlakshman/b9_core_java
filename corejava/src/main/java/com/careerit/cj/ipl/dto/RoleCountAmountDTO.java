package com.careerit.cj.ipl.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class RoleCountAmountDTO {

		private String team;
		private String role;
		private int count;
		private double totalAmount;
}
