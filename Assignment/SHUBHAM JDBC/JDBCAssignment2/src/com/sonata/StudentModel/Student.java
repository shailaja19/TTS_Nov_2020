package com.sonata.StudentModel;

public class Student {
	/**
	 * @author apple
	 *
	 */
	int stdId;
	String stdName;
	double stdMarks;
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
	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", stdMarks=" + stdMarks + "]";
	}

}
