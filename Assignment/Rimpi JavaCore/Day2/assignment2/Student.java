package com.sonata.assignment2;


class Student{
	  
	  int stdId;
	  String stdName;
	  int stdClass;
	}

	
class Ans{
	  public static void main(String[] args){
	    Student s1 = new Student();
	    s1.stdId = 795;
	    s1.stdName ="patrick";
	    s1.stdClass=9;
	    
	    Student s2= new Student();
	    s2.stdId = 895;
	    s2.stdName ="sam";
	    s2.stdClass=10;
	    
	    
	    
	    
	    System.out.println("Student id is "+s1.stdId+ " and student name is " + s1.stdName 
	    		+ " and class is "+s1.stdClass);
	    
	    System.out.println("Student id is "+s2.stdId+ " and student name is " + s2.stdName 
	    		+ " and class is "+s2.stdClass);
	    
	  }
}
