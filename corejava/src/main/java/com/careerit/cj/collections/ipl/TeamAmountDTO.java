package com.careerit.cj.collections.ipl;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class TeamAmountDTO {
        private String label;
        private int count;
        private double totalAmount;
}
