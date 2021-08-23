package com.careerit.cj;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class IplStatServiceTest {

	
			private static List<Player> list;
			private IplStatService iplStatService;
		
			@BeforeAll
			public static void init() {
				System.out.println("Init Using Before All");
				try {
					list = FileReaderUtil.loadPlayerDetails();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			@BeforeEach
			public void initBeforeEach() {
				new StringBuilder("A").reverse().toString().equals("A");
				System.out.println("Init Using Before Each");
				iplStatService = new IplStatServiceImpl(list);
			}
			
			@Test
			public void teamLabels() {
				List<String> expectedList = List.of("MI", "DC", "KXIP", "KKR", "RR", "RCB", "SRH", "CSK");
				List<String> resultList = iplStatService.getTeamLabels();
				assertThat(resultList).containsAll(expectedList);
			}
			
			
			
			@AfterEach
			public void close() {
				System.out.println("Close Using After Each");
				iplStatService = new IplStatServiceImpl(Collections.EMPTY_LIST);
			}
}
