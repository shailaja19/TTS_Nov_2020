package com.Sonata;

import javax.persistence.Entity;

@Entity
public class CurrentBank extends Bank{
	private double cbalance;

	public double getCbalance() {
		return cbalance;
	}

	public void setCbalance(double cbalance) {
		this.cbalance = cbalance;
	}
	

}
