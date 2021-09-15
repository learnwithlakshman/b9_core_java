package com.careerit.cbook.dto;

import lombok.ToString;


@ToString
public class AgeStatDto {

		private int max;
		private int min;
		private double avg;
		private long totalAge;
		public AgeStatDto(int max, int min, double avg, long totalAge) {
			super();
			this.max = max;
			this.min = min;
			this.avg = avg;
			this.totalAge = totalAge;
		}
		
		
		
}
