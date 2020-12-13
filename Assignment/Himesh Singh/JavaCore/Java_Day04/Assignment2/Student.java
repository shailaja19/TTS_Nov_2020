package com.sonata.student;

public class Student {
       private int stdId;
       private String name;
       private float marks;
       
      public Student(int id,String name,float marks){
    	   this.stdId=id;
    	   this.name=name;
    	   this.marks=marks;
    	   
    	   
       }

	public int getStdId() {
		return stdId;
	}

	public void setStdId(int stdId) {
		this.stdId = stdId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", name=" + name + ", marks=" + marks + "]";
	}
	
}
