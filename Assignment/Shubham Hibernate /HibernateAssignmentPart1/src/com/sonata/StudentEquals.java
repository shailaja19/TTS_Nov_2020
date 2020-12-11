package com.sonata;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentEquals {

  public static void main(String[] args) {

  Session sess = null;
  try {
  SessionFactory fact = new 
Configuration().configure().buildSessionFactory();
  sess = fact.openSession();
  String SQL_QUERY = "SELECT stdMarks FROM StudentDetails GROUP BY StdMarks HAVING COUNT(StdMarks) > 1" ;
  Query query = sess.createQuery(SQL_QUERY);
  
  List list = query.list();
//  for(int i=0;i<list.size();i++) {
//	  for(int j=i+1;j<list.size();j++) {
//		  if(list.get(i) == list.get(j))  {
//              
//              System.out.print(list.get(j) +" ");  
//          }
//  }
//  }
  for(int i=0;i<list.size();i++) {
	  System.out.println("Duplicate Marks: " + list.get(i)); 
	  }
  sess.close();
  }
  catch(Exception e){
  System.out.println(e.getMessage());
  }
  }
}