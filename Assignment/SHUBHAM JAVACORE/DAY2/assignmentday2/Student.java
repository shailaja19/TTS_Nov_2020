package com.sonata.assignmentday2;
//Create student class having stdID , stdName, stdClass and
//display the information of two objects


class Student{
	  
	  int stdId;
	  String stdName;
	  int stdClass;
	}

	
class Ans{
	  public static void main(String[] args){
	    Student s1 = new Student();
	    s1.stdId = 700;
	    s1.stdName ="Bond";
	    s1.stdClass=7;
	    
	    Student s2= new Student();
	    s2.stdId = 800;
	    s2.stdName ="James";
	    s2.stdClass=8;
	    
	    
	    
	    
	    System.out.println("Student id is "+s1.stdId+ " and student name is " + s1.stdName 
	    		+ " and class is "+s1.stdClass);
	    
	    System.out.println("Student id is "+s2.stdId+ " and student name is " + s2.stdName 
	    		+ " and class is "+s2.stdClass);
	    
	  }
}
