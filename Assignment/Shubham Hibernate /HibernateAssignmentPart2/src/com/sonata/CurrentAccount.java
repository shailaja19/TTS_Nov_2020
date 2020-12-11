package com.sonata;

import javax.persistence.Entity;

@Entity
public class CurrentAccount extends Bank{
	private double cbalance;

	public double getCbalance() {
		return cbalance;
	}

	public void setCbalance(double cbalance) {
		this.cbalance = cbalance;
	}
	

}
