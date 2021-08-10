package com.careerit.cj.collections.ipl;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class RoleCountDTO {
    private String role;
    private int count;
    private double totalAmount;

}
