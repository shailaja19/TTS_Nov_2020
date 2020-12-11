package com.Sonata;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;


//@NamedNativeQuery(name="getStudent.byHighestMarks", 
//					query ="select * "
//							+ "from StudentTable "
//							+ "order by StudMarks",
//							resultClass=StudentTable.class)
//@NamedNativeQuery(name="getStudent.byEqualMarks", 
//query ="select * from StudentTable",
//		resultClass=StudentTable.class)
//@NamedNativeQuery(name="getStudent.byRangeMarks", 
//query ="select * from StudentTable where StudMarks between ? and ?",
//		resultClass=StudentTable.class)
//@NamedNativeQuery(name="getUserDetails.byName", query ="select * from userdetails",resultClass=UserDetails.class)

@Entity
public class StudentTable {
	@Id
	private int StudId;
	private String StudName;
	private double StudMarks;
	public int getStudId() {
		return StudId;
	}
	public void setStudId(int studId) {
		StudId = studId;
	}
	public String getStudName() {
		return StudName;
	}
	public void setStudName(String studName) {
		StudName = studName;
	}
	public double getStudMarks() {
		return StudMarks;
	}
	public void setStudMarks(double studMarks) {
		StudMarks = studMarks;
	}
	@Override
	public String toString() {
		return "StudentTable [StudId=" + StudId + ", StudName=" + StudName + ", StudMarks=" + StudMarks + "]";
	}
}
