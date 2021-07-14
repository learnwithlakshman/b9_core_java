package com.careerit.cj.loops;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class EmailService {

		public static void main(String[] args) throws IOException {
			
				List<String> lines = Files.readAllLines(Paths.get("empdata.csv"));
				
				for(int i=0;i<lines.size();i++) {
					String line = lines.get(i);
					String[] data = line.split(",");
					String name = data[0];
					String email = data[1];
					System.out.println("To :"+email);
					System.out.println("Dear :"+name);
					System.out.println("\t Congratulation......");
					System.out.println("\n"+"-".repeat(100));
				}
		}
}
