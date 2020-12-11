package com.sonata;

import javax.persistence.Embeddable;

@Embeddable
public class School_Details {
	private String schoolAddress;
	private boolean isPublic;
	private int studentCount;
	public String getSchoolAddress() {
		return schoolAddress;
	}
	public void setSchoolAddress(String schoolAddress) {
		this.schoolAddress = schoolAddress;
	}
	public boolean isPublic() {
		return isPublic;
	}
	public void setPublic(boolean isPublic) {
		this.isPublic = isPublic;
	}
	public int getStudentCount() {
		return studentCount;
	}
	public void setStudentCount(int studentCount) {
		this.studentCount = studentCount;
	}
	@Override
	public String toString() {
		return "School_Details [schoolAddress=" + schoolAddress + ", isPublic=" + isPublic + ", studentCount="
				+ studentCount + "]";
	}
	
}
