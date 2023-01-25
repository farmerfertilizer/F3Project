package com.crops.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="crops")
public class Crops {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer crop_id;
	
	private String crop_name;
	
	private Double cost_per_gm;
	

}
