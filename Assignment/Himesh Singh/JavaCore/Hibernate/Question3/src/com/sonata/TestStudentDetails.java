package com.sonata;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestStudentDetails {
   public static void main(String[] args) {
	   StudentDetails sd1=new StudentDetails();
		sd1.setStdId(1);
		sd1.setStdName("sheela");
		sd1.setStdMarks(85);
		
		   StudentDetails sd11=new StudentDetails();
			sd11.setStdId(2);
			sd11.setStdName("harsh");
			sd11.setStdMarks(87);
			
			   StudentDetails sd111=new StudentDetails();
				sd111.setStdId(3);
				sd111.setStdName("himesh");
				sd111.setStdMarks(93);
				
				 StudentDetails sd1111=new StudentDetails();
					sd1111.setStdId(4);
					sd1111.setStdName("jai");
					sd1111.setStdMarks(85);
		
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session s1=factory.openSession();
		s1.beginTransaction();
		s1.save(sd1);
		s1.save(sd11);
		s1.save(sd111);
		s1.save(sd1111);
		
	
		s1.getTransaction().commit();
		s1.close();
		
}
}
