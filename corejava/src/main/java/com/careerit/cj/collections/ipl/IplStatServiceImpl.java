package com.careerit.cj.collections.ipl;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class IplStatServiceImpl implements IplStatService{

    private List<Team> teams;
    private List<Player> players;

    IplStatServiceImpl() throws IOException {
        teams = FileReaderUtil.loadTeamDetails();
        players = FileReaderUtil.loadPlayerDetails();
    }


    @Override
    public List<String> getTeamLabels() {
       return teams.stream().map(t->t.getLabel()).collect(Collectors.toList());
    }

    @Override
    public List<TeamDetailsDTO> getTeamDetails() {
        List<TeamDetailsDTO> teamDetails = new ArrayList<>();
        for(Team team:teams){
            String name = team.getName();
            String label = team.getLabel();
            List<Player> list = players.stream().filter(p->p.getLabel().equals(label)).collect(Collectors.toList());
            TeamDetailsDTO obj = TeamDetailsDTO.builder().name(name).label(label).players(list).build();
            teamDetails.add(obj);
        }
        return teamDetails;
    }

    @Override
    public List<TeamAmountDTO> getTeamAmount() {
        List<TeamAmountDTO> teamDetails = new ArrayList<>();
        for(Team team:teams) {
            String label = team.getLabel();
            List<Player> list = players.stream().filter(p -> p.getLabel().equals(label)).collect(Collectors.toList());
            int count = list.size();
            double totalAmount = list.stream().mapToDouble(p->p.getAmount()).sum();
            TeamAmountDTO teamAmountDTO = TeamAmountDTO.builder().label(label).totalAmount(totalAmount).count(count).build();
            teamDetails.add(teamAmountDTO);
        }
        return teamDetails;
    }

    @Override
    public List<RoleCountDTO> getRoleCountAndAmount(String label) {
        List<RoleCountDTO> roleCountList = new ArrayList<>();
        List<Player> playerList = players.stream().filter(p->p.getLabel().equals(label)).collect(Collectors.toList());

        Map<String,List<Player>> map = playerList.stream().collect(Collectors.groupingBy(p->p.getRole()));

        map.entrySet().forEach(entry->{
            String role = entry.getKey();
            List<Player> list = entry.getValue();
            int count = list.size();
            double amount = list.stream().mapToDouble(p->p.getAmount()).sum();
            RoleCountDTO roleCountDTO = RoleCountDTO.builder().count(count).totalAmount(amount).role(role).build();
            roleCountList.add(roleCountDTO);
        });
        return roleCountList;
    }
}
