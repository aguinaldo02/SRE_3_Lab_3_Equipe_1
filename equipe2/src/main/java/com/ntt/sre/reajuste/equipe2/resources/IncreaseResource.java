package com.ntt.sre.reajuste.equipe2.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ntt.sre.reajuste.equipe2.dto.IncreaseDTO;
//import com.ntt.sre.reajuste.equipe2.entities.SalaryIncrease;
import com.ntt.sre.reajuste.equipe2.services.IncreaseService;

@RestController
@RequestMapping(value = "/increases")
public class IncreaseResource {
	
	@Autowired
	private IncreaseService increaseService;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<IncreaseDTO> salary(@PathVariable Long id){
		IncreaseDTO DTO = increaseService.getIncrease(id);
		return ResponseEntity.ok(DTO);
	}
	
	
	/*@PostMapping(value = "/{id}/increase")
	public ResponseEntity<SalaryIncrease> createSalary (@RequestBody SalaryIncrease salaryIncrease) {
	}*/
}
