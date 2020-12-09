package Day4Assignment2;


//Create a student class with list of students and 
//display the students based on markers with descending order 
//using the compareTo method with lambda expressions.



public class Student  implements Comparable<Student>{
		int stdId;
		String stdName;
		int stdMarks;

		public Student(int stdId, String stdName, int stdAge)
		{				
				this.stdId = stdId;
				this.stdName= stdName;
				this.stdMarks= stdAge;							
		}
		

		@Override
		public int compareTo(Student st) {
			if(stdMarks==st.stdMarks)
				return 0;
			else if(stdMarks > st.stdMarks)
				return 1;
			else
				return -1;
			
		}
		
		
}
