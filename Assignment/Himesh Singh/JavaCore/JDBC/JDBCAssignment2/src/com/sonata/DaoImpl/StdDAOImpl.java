package com.sonata.DaoImpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sonata.Dao.StdDao;
import com.sonata.Model.Student;


public class StdDAOImpl implements StdDao{

	 int row=0;
	 int del=0;
	 int upd=0;
	 int temp=0;
	    DbConnection db=new DbConnection();
	    Student student=null;
	    
	    public int addStudent(Object object) {
	    	try {
	    		student=(Student)object;
	    		PreparedStatement cs=db.getConnection().prepareStatement("insert into Student values(?,?,?)" );
	             
	    		cs.setInt(1,student.getStdId());
	             
	             cs.setString(2, student.getStdName());
	             cs.setDouble(3, student.getMarks());
	             row=cs.executeUpdate();
	             db.closeConnection();
	             
	    	}catch(SQLException e2) {System.out.println(e2);
	    		
	    	}
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
	    		PreparedStatement cs=db.getConnection().prepareStatement("update Student set marks= ? where stdId= ?" );
	             cs.setDouble(1, student.getMarks());
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
	    			s.setMarks(marks);
	    			stdList.add(s);
	    		}
	    	}catch(SQLException se) {
	    		se.printStackTrace();
	    	}
	    	return stdList;
	    }
	    public int getStudent() {
			List<Student> list = new ArrayList<>();
			list = this.getAllStudent();
			list.stream().sorted((s2,s1) -> (int)(s1.getMarks() - s2.getMarks())).forEach(System.out :: println);
			return temp;

}
}

