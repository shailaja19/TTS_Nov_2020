package com.sonata;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentDetails{
	@Id
	int stdId;
	String stdName;
	public double stdMarks;
	public int getStdId() {
		return stdId;
	}

	public void setStdId(int stdId) {
		this.stdId = stdId;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public double getStdMarks() {
		return stdMarks;
	}

	public void setStdMarks(double stdMarks) {
		this.stdMarks = stdMarks;
	}

	
}
