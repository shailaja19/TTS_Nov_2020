package com.sonata;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class SchoolData {
       
	   
	
	   @Id
	   int schoolId;
	   int countStudent;
	   public Address ob;
	 
	   
	@Embedded   
	


	public int getSchoolId() {
		return schoolId;
	}



	public void setSchoolId(int schoolId) {
		this.schoolId = schoolId;
	}



	public int getCountStudent() {
		return countStudent;
	}



	public void setCountStudent(int countStudent) {
		this.countStudent = countStudent;
	}



	public Address getOb() {
		return ob;
	}



	public void setOb(Address ob) {
		this.ob = ob;
	}



	
      
	
       
       
}
