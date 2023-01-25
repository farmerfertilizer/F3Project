package com.manufacturer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manufacturer.entity.Manufacturer;
import com.manufacturer.repository.ManufacturerRepository;

@Service
public class ManufacturerService {
	
	@Autowired
	private ManufacturerRepository manufacturerRepository;

	public Manufacturer saveManufacturerId(Manufacturer manufacturer) {
		return manufacturerRepository.save(manufacturer);
	}

	public List<Manufacturer> getAllManufacturers() {
		return manufacturerRepository.findAll();
	}

	public Manufacturer getManufacturerById(int manufacturerId) {
		return manufacturerRepository.findById(manufacturerId).get();
	}


	public String deleteManufacturerById(int manufacturerId) {
		manufacturerRepository.deleteById(manufacturerId);
		return "ManufacturerId: " +manufacturerId+ " deleted";
	}

}
