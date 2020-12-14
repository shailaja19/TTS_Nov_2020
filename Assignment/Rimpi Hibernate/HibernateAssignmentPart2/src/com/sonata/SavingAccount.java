package com.sonata;

import javax.persistence.Entity;

@Entity
public class SavingAccount extends Bank{
	private double sbalance;

	public double getSbalance() {
		return sbalance;
	}

	public void setSbalance(double sbalance) {
		this.sbalance = sbalance;
	}

}
