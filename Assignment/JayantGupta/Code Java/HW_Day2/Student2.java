package HW_DAY2;

public class Student2 {
	int stdID;
	String stdName;
	String stdClass;
	
	public int getStdID() {
		return stdID;
	}
	public void setStdID(int stdID) {
		this.stdID = stdID;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public String getStdClass() {
		return stdClass;
	}
	public void setStdClass(String stdClass) {
		this.stdClass = stdClass;
	}
	
	@Override
	public String toString() {
		return "Student2 [stdID=" + stdID + ", stdName=" + stdName + ", stdClass=" + stdClass + "]";
	}

}
