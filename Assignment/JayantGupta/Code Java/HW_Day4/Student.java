package HW_Day4;

public class Student implements Comparable<Student>{
	int stdId;
	String stdName;
	int stdAge;
	double stdMarks;
	
	public Student(int a, String b, int c, double d)
	{
		this.stdId=a;
		this.stdName=b;
		this.stdAge=c;
		this.stdMarks=d;
	}

	public int getStdId() {
		return stdId;
	}

	public void setStdId(int stdId) {
		this.stdId = stdId;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public int getStdAge() {
		return stdAge;
	}

	public void setStdAge(int stdAge) {
		this.stdAge = stdAge;
	}

	public double getStdMarks() {
		return stdMarks;
	}

	public void setStdMarks(double stdMarks) {
		this.stdMarks = stdMarks;
	}
	public int compareTo(Student st) {
		if(stdMarks==st.stdMarks)
		return 0;
		else if(stdMarks>st.stdMarks)
			return -1;
		else
			return 1;
	}
	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", stdAge=" + stdAge + ", stdMarks=" + stdMarks
				+ "]";
	}
//	@Override
//	public int compareTo(Student arg0) {
//		// TODO Auto-generated method stub
//		return 0;
//	}	
}
