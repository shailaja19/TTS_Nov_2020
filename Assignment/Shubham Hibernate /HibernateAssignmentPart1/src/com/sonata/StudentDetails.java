package com.sonata;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.NamedNativeQuery;
import org.hibernate.annotations.NamedQuery;
import org.hibernate.annotations.NamedQueries;

@NamedQuery(name="getStudentDetails.byStdId", query ="from StudentDetails where StdId =?")
//@NamedQuery(name="getStudentDetails.byStdMarks", query ="from StudentDetails where StdId =?")

@NamedNativeQuery(name="getStudentDetails.byStdName", query ="select * from StudentDetails where stdname like 's%'",resultClass=StudentDetails.class)
//@NamedNativeQuery(name="getStudentDetails.byStdMarks", query ="select  stdMarks from StudentDetails where stdmarks between 90 and 100",resultClass=StudentDetails.class)
@NamedQueries({
//    @NamedQuery(name="StudentDetails.findAll",
//                query="SELECT s FROM StudentDetails s where stdname like 's%'"),
//    @NamedQuery(name="StudentDetails.findAll",
//    query="SELECT s FROM StudentDetails s"),
//    @NamedQuery(name="StudentDetails.findByMarks",
//                query="SELECT a FROM StudentDetails s WHERE stdmarks between 80 and 90 "),
})

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
//Hibernate Assignment -2
//•	Create the Student table with required fields, fetch the data using HQL with following criteria .
//•	Highest Marks 
//•	Equal marks
//•	Between range (80 to 90)
//•	Display the students there name starts with (“ s” like “Sonata”)

