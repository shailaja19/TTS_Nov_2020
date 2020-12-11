package com.sonata.StudDaoImpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sonata.StudDao.StdntDao;
import com.sonata.StudModel.Student;

public class StdntDaoImpl implements StdntDao {
	int row=0;
	DbConnection db=new DbConnection();
	Student student=null;
	@Override
	public int addStudent(Object object) {
		// TODO Auto-generated method stub
		try {
			student =(Student)object;
			PreparedStatement cs=db.getConnection().prepareStatement
					("insert into student values(?,?,?)");
			cs.setInt(1, student.getStdId());
			cs.setString(2,student.getStdName());
			cs.setDouble(3,student.getMarks());
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
					("update student set Marks=? where stdId=?");
			cs.setDouble(1, student.getMarks());
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
				double Marks=rs.getDouble(3);
				st.setStdId(stdId);
				st.setStdName(stdName);
				st.setMarks(Marks);
				stdList.add(st);
			}
		}catch(SQLException se) {
			se.printStackTrace();
		}
		return stdList;
	}
	public List<Student> getStudents() {
		List<Student> list = new ArrayList<>();
		list = this.getAllStudent();
		list.stream().sorted((s2,s1) -> (int)(s1.getMarks() - s2.getMarks())).forEach(System.out :: println);
		return list;
}
}