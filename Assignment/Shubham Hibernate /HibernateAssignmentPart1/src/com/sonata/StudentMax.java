package com.sonata;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentMax {

  public static void main(String[] args) {

  Session sess = null;
  try {
  SessionFactory fact = new 
Configuration().configure().buildSessionFactory();
  sess = fact.openSession();
  String SQL_QUERY = "select max(s.stdMarks)from StudentDetails s";
  Query query = sess.createQuery(SQL_QUERY);
  List list = query.list();
  System.out.println("Maximum marks: " + list.get(0)); 
  sess.close();
  }
  catch(Exception e){
  System.out.println(e.getMessage());
  }
  }
}
