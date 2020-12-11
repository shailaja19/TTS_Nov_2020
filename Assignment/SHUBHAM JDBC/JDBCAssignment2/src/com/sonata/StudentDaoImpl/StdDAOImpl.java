package com.sonata.StudentDaoImpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.jdbc.CallableStatement;
import com.sonata.StudentDao.StdDao;
import com.sonata.StudentModel.Student;

public class StdDAOImpl implements StdDao {
	int row=0;
	DbConnection db=new DbConnection();
	Student student=null;
	@Override
	public int addStudent(Object object) {
		// TODO Auto-generated method stub
		try {
			student =(Student)object;
//			PreparedStatement cs=db.getConnection().prepareStatement
//					("insert into student values(?,?,?)");
			//Creating procedure savestudent for callable statement
			CallableStatement cs = (CallableStatement) db.getConnection().prepareCall("{call savestudent(?,?,?)}");
			cs.setInt(1, student.getStdId());
			cs.setString(2,student.getStdName());
			cs.setDouble(3,student.getStdMarks());
			row =cs.executeUpdate();
			db.closeConnection();
		}catch(SQLException e) {
			System.out.println(e);
		}
		return row;
	}



	@Override
	public int deleteStudent(Object object) {
		try {
			student= (Student)object;
			PreparedStatement cs = db.getConnection().prepareStatement
					("delete from student where stdId=?");
			
			cs.setInt(1,student.getStdId());
			row=cs.executeUpdate();
			db.closeConnection();
		}catch(SQLException e) {System.out.println(e);}
		return row;
	}

	@Override
	public int updateStudent(Object object) {
		try {
			student= (Student)object;
			PreparedStatement cs = db.getConnection().prepareStatement
					("update student set stdMarks=? where stdId=?");
			cs.setDouble(1, student.getStdMarks());
			cs.setInt(2,student.getStdId());
			row=cs.executeUpdate();			
			db.closeConnection();
		}catch(SQLException e) {System.out.println(e);}
		return row;
}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		List<Student> stdList=new ArrayList<>();
		try {
			PreparedStatement cs1 =db.getConnection().prepareStatement("select * from student");
			ResultSet rs=cs1.executeQuery();
			while(rs.next()) {
				Student st=new Student();
				int stdId=rs.getInt(1);
				String stdName=rs.getString(2);
				double stdMarks=rs.getDouble(3);
				st.setStdId(stdId);
				st.setStdName(stdName);
				st.setStdMarks(stdMarks);
				stdList.add(st);
			}
		}catch(SQLException se) {
			se.printStackTrace();
		}
		return stdList;
	}
	public int getStudents() {
		List<Student> list = new ArrayList<>();
		list = this.getAllStudent();
		list.stream().sorted((s2,s1) -> (int)(s1.getStdMarks() - s2.getStdMarks())).forEach(System.out :: println);
		return row;
}
}

