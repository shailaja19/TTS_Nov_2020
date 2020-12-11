package com.sonata;


import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class StudAddress {

	@Id
	@GeneratedValue
	private int schoolId;
	private String State;
	private String City;
	private String Street;
	
	@Embedded 
	public School_Details schDetails;
	
	public int getSchoolId() {
		return schoolId;
	}
	public void setSchoolId(int schoolId) {
		this.schoolId = schoolId;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public School_Details getSchDetails() {
		return schDetails;
	}
	public void setSchDetails(School_Details schDetails) {
		this.schDetails = schDetails;
	}
	@Override
	public String toString() {
		return "Student_Address [schoolId=" + schoolId + ", State=" + State + ", City=" + City + ", Street="
				+ Street + ", schDetails=" + schDetails + "]";
	}
}