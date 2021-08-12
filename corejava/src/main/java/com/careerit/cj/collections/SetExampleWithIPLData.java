package com.careerit.cj.collections;

import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.careerit.cj.collections.ipl.FileReaderUtil;
import com.careerit.cj.collections.ipl.Player;

public class SetExampleWithIPLData {

	public static void main(String[] args) throws IOException {

		List<Player> players = FileReaderUtil.loadPlayerDetails();
		Set<String> teamLabels = players.stream().map(p -> p.getLabel()).collect(Collectors.toSet());
		System.out.println(teamLabels);
	}
}
