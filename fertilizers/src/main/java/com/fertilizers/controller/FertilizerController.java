package com.fertilizers.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fertilizers.entity.Fertilizer;
import com.fertilizers.service.FertilizerService;

@RestController
@RequestMapping("/fertilizers")
public class FertilizerController {
	
	@Autowired
	private FertilizerService fertilizerService;
	
	@PostMapping("/save")
	public Fertilizer saveFertilizer(@RequestBody Fertilizer fertilizer) {
		return fertilizerService.saveFertilizer(fertilizer);
	}
	
	@GetMapping("/getAll")
	public List<Fertilizer> getAllFertilizers() {
		return fertilizerService.getAllFertilizers();
	}
	
	@GetMapping("/getFertilizerById/{fertilizerId}")
	public Fertilizer getFertilizerById(@PathVariable int fertilizerId) {
		return fertilizerService.getFertilizerById(fertilizerId);
	}
	
	@GetMapping("/getFertilizerByName/{fertilizerName}")
	public Fertilizer getFertilizerByName(@PathVariable String fertilizerName) {
		return fertilizerService.getFertilizerByName(fertilizerName);
	}
	
	@DeleteMapping("/deleteFertilizerById/{fertilizerId}")
	public String deleteFertilizerById(@PathVariable int fertilizerId) {
		return fertilizerService.deleteFertilizerById(fertilizerId);
	}
	

	
}
