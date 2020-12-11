package com.Sonata.DaoImpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.Sonata.Dao.StudDao;
//import com.Sonata.Exception.CustumException;
import com.Sonata.Model.Student;

public class StudDAOImpl implements StudDao{

		 int row=0;
		 int del=0;
		 int upd=0;
	    DbConnection db=new DbConnection();
	    Student student=null;

	    public int addStudent(Object object){
	    	try {
	    		student=(Student)object;
	    		PreparedStatement cs=db.getConnection().prepareStatement("insert into Student values(?,?,?)" );
	             cs.setInt(1,student.getStdId());
	             cs.setString(2, student.getStdName());
	             cs.setDouble(3, student.getStdMarks());
	             row=cs.executeUpdate();
	             db.closeConnection();
	             
	    	}catch(SQLException e2) {System.out.println(e2);}
	    	return row;
}
	    public int deleteStudent(Object object) {
	    	try {
	    		student=(Student)object;
	    		PreparedStatement cs=db.getConnection().prepareStatement("delete from Student where stdId=?" );
	             cs.setInt(1, student.getStdId());
	             del=cs.executeUpdate();
	             db.closeConnection();
	             
	    	}catch(SQLException e2) {System.out.println(e2);
	    		
	    	}
	    	return del;
	    }
	    public int updateStudent(Object object) {
	    	try {
	    		student=(Student)object;
	    		PreparedStatement cs=db.getConnection().prepareStatement("update Student set stdMarks= ? where stdId= ?" );
	             cs.setDouble(1, student.getStdMarks());
	             cs.setInt(2, student.getStdId());
	            
	             upd=cs.executeUpdate();
	             db.closeConnection();
	    		
	    	}
	    	catch(SQLException e2) {System.out.println(e2);
   		
	    	}
	    	return upd;
	    }
	   
	    @Override
	    public List<Student> getAllStudent(){
	    
	    	List<Student> stdList=new ArrayList<>();
	    	try {
	    		PreparedStatement cs1=db.getConnection().prepareStatement("select * from Student");
	    		ResultSet rs=cs1.executeQuery();
	    		while(rs.next()) {
	    			Student s=new Student();
	    			int stdId=rs.getInt(1);
	    			String stdName=rs.getString(2);
	    			double marks=rs.getDouble(3);
	    			s.setStdId(stdId);
	    			s.setStdName(stdName);
	    			s.setStdMarks(marks);
	    			stdList.add(s);
	    		}
	    	}catch(SQLException se) {
	    		se.printStackTrace();
	    	}
	    	return stdList;
	    }
	    public void getStudent() {
	    	List<Student> list = new ArrayList<>();
	    	list=this.getAllStudent();
	    	list.stream().sorted((s1,s2)->(int)(s1.getStdMarks()-s2.getStdMarks()))
	    	.forEach(System.out::println);
	 	    }
	    
	    public void removeDulplicate() {
	    	List<Student> list = new ArrayList<>();
	    	list=this.getAllStudent();
	    	List<Student> newListUsingSteram = list.stream().distinct().collect(Collectors.toList());
			newListUsingSteram.forEach(System.out::println);
	    	
	    }
}
