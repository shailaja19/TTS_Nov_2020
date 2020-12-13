package com.sonata.student;


	import java.util.ArrayList;
	import java.util.List;
	public class DataBaseStudent {
		public static List<Student> getStudent(){
	       List<Student> list=new ArrayList(); 
	    	   list.add(new Student(172,"Roshan",80));
	    	   list.add(new Student(388,"Santosh",90));
	    	   list.add(new Student(245,"Bimal",65));
	    	   list.add(new Student(786,"Prakash",70));
	    	   return list;
	       }
	}


