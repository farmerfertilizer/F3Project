package com.fertilizers.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fertilizers.entity.Fertilizer;
import com.fertilizers.repository.FertlizerRepository;

@Service
public class FertilizerService {
	
	@Autowired
	private FertlizerRepository fertlizerRepository;

	public Fertilizer saveFertilizer(Fertilizer fertilizer) {
		return fertlizerRepository.save(fertilizer);
		 
	}

	public List<Fertilizer> getAllFertilizers() {
		return fertlizerRepository.findAll();
		
	}

	public Fertilizer getFertilizerById(int fertilizerId) {	
		return  fertlizerRepository.findById(fertilizerId).get();
	}

	public String deleteFertilizerById(int fertilizerId) {
		fertlizerRepository.deleteById(fertilizerId);
		return "fertilizerId: " +fertilizerId+ " deleted";
	
	}

	public Fertilizer getFertilizerByName(String fertilizerName) {
	Fertilizer f = fertlizerRepository.findByFertilizerName(fertilizerName);
		return f;
	}

}
