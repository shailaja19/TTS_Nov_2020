package com.sonata;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentDetails {
	
	@Id
    private int stdId;
    private String stdName;
    private float stdMarks;
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
	public float getStdMarks() {
		return stdMarks;
	}
	public void setStdMarks(float stdMarks) {
		this.stdMarks = stdMarks;
	}
    
    
}
