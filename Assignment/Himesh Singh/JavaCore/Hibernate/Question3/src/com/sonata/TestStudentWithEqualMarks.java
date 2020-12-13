package com.sonata;


import java.util.List;


import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class TestStudentWithEqualMarks {

	
	
	public static void main(String[] args) {
    	SessionFactory factory=new Configuration().configure().buildSessionFactory();
    	Session s1=factory.openSession();
    	s1.beginTransaction();
    	
    	
    	Criteria criteria=s1.createCriteria(StudentDetails.class);
    	criteria.add(Restrictions.eq("stdMarks", 85.0f));
    	
    	List<StudentDetails> users =(List<StudentDetails>)criteria.list();
    	s1.getTransaction().commit();
    	s1.close();
    	
    
    	for(StudentDetails s:users) {
    		System.out.println(s.getStdName());
    	
	}
}
}
