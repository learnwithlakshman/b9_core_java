package com.careerit.iplstat;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IplStatServerappApplication implements CommandLineRunner {

//	@Autowired
//	private TeamRepo teamRepo;
//	@Autowired
//	private ModelMapper mapper;
	public static void main(String[] args) {
		SpringApplication.run(IplStatServerappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

//		ObjectMapper obj = new ObjectMapper();
//
//		List<TeamDto> list = obj.readValue(this.getClass().getResourceAsStream("/ipl2020.json"),
//				new TypeReference<List<TeamDto>>() {
//				});
//		
//		for(TeamDto t:list) {
//			Team team = mapper.map(t,Team.class);
//			teamRepo.save(team);
//			
//	
//		}
		

	}

}
