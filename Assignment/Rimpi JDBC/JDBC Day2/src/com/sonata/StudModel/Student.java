package com.sonata.StudModel;

public class Student {
	
	int stdId;
	String stdName;
	double Marks;
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
	public double getMarks() {
		return Marks;
	}
	public void setMarks(double stdMarks) {
		this.Marks = stdMarks;
	}
	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", stdMarks=" + Marks + "]";
	}

}


