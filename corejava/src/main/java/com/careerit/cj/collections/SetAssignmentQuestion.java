package com.careerit.cj.collections;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetAssignmentQuestion {

	public static void main(String[] args) {

		List<String> cs = List.of("CSV", "CMS", "JVM", "KGF", "ALN", "GLN", "RVJ");
		List<String> is = List.of("CSV", "CMS", "SRK", "M&M", "ALN", "GLN", "RVJ");
		List<String> ec = List.of("CSV", "CMS", "RVJ", "RGV");

		Set<String> set = new HashSet<>();
		for (String name : ec) {
			if (is.contains(name) && cs.contains(name)) {
				set.add(name);
			}
		}
		System.out.println(set);
	}
}
