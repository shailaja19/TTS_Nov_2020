package com.sonata;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestStudent {
public static void main(String args[]) {
		
	StudentDetails std=new StudentDetails();
	std.setStdId(6);
	std.setStdName("Oggy");
	std.setStdMarks(88);
	SessionFactory factory=new Configuration().configure().buildSessionFactory();
	Session s1=factory.openSession();
	s1.beginTransaction();
	s1.save(std);
	s1.getTransaction().commit();;
	s1.close();
		
	}

}
