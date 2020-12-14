package com.sonata;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentBetween {

  public static void main(String[] args) {

  Session sess = null;
  try {
  SessionFactory fact = new 
Configuration().configure().buildSessionFactory();
  sess = fact.openSession();
  String SQL_QUERY = "select  stdMarks from StudentDetails where stdmarks between 80 and 90" ;
  Query query = sess.createQuery(SQL_QUERY);
  
  List list = query.list();
  for(int i=0;i<list.size();i++) {
  System.out.println("Marks between 80 and 90: " + list.get(i)); 
  }
  sess.close();
  }
  catch(Exception e){
  System.out.println(e.getMessage());
  }
  }
}