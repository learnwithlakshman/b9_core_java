package com.careerit.cj.collections.ipl;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class TeamDetailsDTO {

        private String name;
        private String label;
        private List<Player> players;
}
