package com.sonata;

import javax.persistence.Entity;

@Entity
public class CurrentAccount extends Bank{
	private double currBalance;

	public double getCurrBalance() {
		return currBalance;
	}

	public void setCurrBalance(double currBalance) {
		this.currBalance = currBalance;
	}
	
	

}
