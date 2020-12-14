package com.sonata;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Bank {

		@Id
		@GeneratedValue
		private int bankId;
		private String customerName;
		public int getBankId() {
			return bankId;
		}
		public void setBankId(int bankId) {
			this.bankId = bankId;
		}
		public String getCustomerName() {
			return customerName;
		}
		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}
}
