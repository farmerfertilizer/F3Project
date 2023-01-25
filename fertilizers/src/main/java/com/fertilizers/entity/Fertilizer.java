package com.fertilizers.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="fertilizer")
public class Fertilizer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int fertilizerId;
	private String fertilizerName;
	private double costPerGm;
	
	public int getFertilizerId() {
		return fertilizerId;
	}
	public void setFertilizerId(int fertilizerId) {
		this.fertilizerId = fertilizerId;
	}
	public String getFertilizerName() {
		return fertilizerName;
	}
	public void setFertilizerName(String fertilizerName) {
		this.fertilizerName = fertilizerName;
	}
	public double getCostPerGm() {
		return costPerGm;
	}
	public void setCostPerGm(double costPerGm) {
		this.costPerGm = costPerGm;
	}
	public Fertilizer(int fertilizerId, String fertilizerName, double costPerGm) {
		this.fertilizerId = fertilizerId;
		this.fertilizerName = fertilizerName;
		this.costPerGm = costPerGm;
	}
	
	

}
