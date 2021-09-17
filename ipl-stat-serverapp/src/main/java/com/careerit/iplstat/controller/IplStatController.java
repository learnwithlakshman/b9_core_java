package com.careerit.iplstat.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.careerit.iplstat.dto.TeamLabelDTO;
import com.careerit.iplstat.service.IplStatService;

@RestController
@RequestMapping("/api")
public class IplStatController {

	private final IplStatService iplStatService;

	public IplStatController(IplStatService iplStatService) {
		this.iplStatService = iplStatService;
	}

	@GetMapping("/teamlabels")
	public ResponseEntity<TeamLabelDTO> getTeamLabels() {
		TeamLabelDTO obj = iplStatService.getLabelNames();
		return ResponseEntity.ok(obj);
	}

}
