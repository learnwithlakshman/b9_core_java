package com.careerit.cj.collections.ipl;

import java.util.List;

public interface IplStatService {

        public List<String> getTeamLabels();
        public List<TeamDetailsDTO> getTeamDetails();
        public List<TeamAmountDTO> getTeamAmount();
        public List<RoleCountDTO> getRoleCountAndAmount(String label);
}
