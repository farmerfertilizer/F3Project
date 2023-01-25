package com.manufacturer.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Manufacturer {
	
	@Id
	private int manufacturerId;
	private int itemId;
	private int quantity;
	private int amount;
	
	public int getManufacturerId() {
		return manufacturerId;
	}
	public void setManufacturerId(int manufacturerId) {
		this.manufacturerId = manufacturerId;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public Manufacturer(int manufacturerId, int itemId, int quantity, int amount) {
		this.manufacturerId = manufacturerId;
		this.itemId = itemId;
		this.quantity = quantity;
		this.amount = amount;
	}
	
	
	

}
