package com.careerit.iplstat.dto;

import lombok.Data;

@Data
public class PlayerCountAndAmountDTO {

		private String teamLabel;
		private long playerCount;
		private double totalAmount;
		public PlayerCountAndAmountDTO(String teamLabel, long playerCount, double totalAmount) {
			this.teamLabel = teamLabel;
			this.playerCount = playerCount;
			this.totalAmount = totalAmount;
		}
		
		
}
