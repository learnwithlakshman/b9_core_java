package com.careerit.cj.strexamples;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class StringBuilderUsageExample {

		public static void main(String[] args) throws IOException {
			
				List<String> lines = Files.readAllLines(Paths.get("seed_data/randomdata.txt"));
				StringBuilder sb = new StringBuilder();
				for(String line:lines) {
					sb.append(line+",");
				}
				String data  = sb.substring(0, sb.length()-1);				
				System.out.println(data);
		}
}
