package com.manufacturer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manufacturer.entity.Manufacturer;
import com.manufacturer.service.ManufacturerService;

@RestController
@RequestMapping("/manufacturer")
public class ManufacturerController {
	
	@Autowired
	private ManufacturerService manufacturerService;
	
	@PostMapping("/save")
	public Manufacturer saveManufacturer(@RequestBody Manufacturer manufacturer) {
		return manufacturerService.saveManufacturerId(manufacturer);
	}
	
	@GetMapping("/getAll")
	public List<Manufacturer> getAllManufacturerId() {
		return manufacturerService.getAllManufacturers();
	}
	
	@GetMapping("/getManufacturerIdById/{ManufacturerIdId}")
	public Manufacturer getManufacturerIdById(@PathVariable int manufacturerId) {
		return manufacturerService.getManufacturerById(manufacturerId);
	}
	
	
	@DeleteMapping("/deleteFertilizerById/{fertilizerId}")
	public String deleteManufacturerById(@PathVariable int manufacturerId) {
		return manufacturerService.deleteManufacturerById(manufacturerId);
	}
	

}
