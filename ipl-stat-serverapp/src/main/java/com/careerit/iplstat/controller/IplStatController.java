package com.careerit.iplstat.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.careerit.iplstat.dto.PlayerCountAndAmountDTO;
import com.careerit.iplstat.dto.RoleCountAndAmountDTO;
import com.careerit.iplstat.dto.TeamLabelDTO;
import com.careerit.iplstat.service.IplStatService;

@RestController
@RequestMapping("/api/stat")
public class IplStatController {

	private final IplStatService iplStatService;

	public IplStatController(IplStatService iplStatService) {
		this.iplStatService = iplStatService;
	}

	@GetMapping("/labels")
	public ResponseEntity<TeamLabelDTO> getTeamLabels() {
		TeamLabelDTO obj = iplStatService.getLabelNames();
		return ResponseEntity.ok(obj);
	}
	
	@GetMapping("/countamount")
	public ResponseEntity<List<PlayerCountAndAmountDTO>> getPlayerCountAmount(){
		List<PlayerCountAndAmountDTO> list = iplStatService.getPlayerCountAndAmountDetails();
		return ResponseEntity.ok(list);
	}
	
	@GetMapping("/countanamount/{label}")
	public ResponseEntity<List<RoleCountAndAmountDTO>> getPlayerCountAmount(@PathVariable("label") String label){
		List<RoleCountAndAmountDTO> list = iplStatService.getAmountAndPlayerCountBy(label);
		return ResponseEntity.ok(list);
	}

}
