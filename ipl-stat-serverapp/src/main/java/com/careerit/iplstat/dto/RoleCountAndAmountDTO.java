package com.careerit.iplstat.dto;

import lombok.Data;

@Data
public class RoleCountAndAmountDTO {

		private String role;
		private long playerCount;
		private double totalAmount;
}
