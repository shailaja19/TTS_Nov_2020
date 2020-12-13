package com.sonata;

import javax.persistence.Entity;

@Entity
public class SavingAccount extends Bank{
    private double saveBalance;

	public double getSaveBalance() {
		return saveBalance;
	}

	public void setSaveBalance(double saveBalance) {
		this.saveBalance = saveBalance;
	}
    
    
}
