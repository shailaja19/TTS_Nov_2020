package com.sonata.student.one;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.Comparator;
import com.sonata.student.DataBaseStudent;
import com.sonata.student.Student;


public class TestService{ 
public static List<Student> evaluateMarks(){
	 return DataBaseStudent.getStudent().stream()
	 .filter(std->std.getMarks()>80)
	 .collect(Collectors.toList());
}
public static List<Student> evaluateid(){
	 return DataBaseStudent.getStudent().stream()
	 .filter(std->std.getStdId()>300)
	 .collect(Collectors.toList());
}
public static Optional<Student> findMax(){
	 return DataBaseStudent.getStudent().stream()
	 .collect(Collectors.maxBy(Comparator.comparing(Student::getMarks)));
}
public static void main(String[] args) {
	System.out.println(evaluateid());
	System.out.println(evaluateMarks());
	System.out.println(findMax());
	
}
}