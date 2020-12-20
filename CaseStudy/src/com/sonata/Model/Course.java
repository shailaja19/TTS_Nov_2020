package com.sonata.Model;

import java.util.ArrayList;
import java.util.Calendar;

public class Course {
	private int courseID;
	private String courseName;
	private Employee courseTrainer;
	private ArrayList<Integer> preRequisites;
	private int duration;
	private Calendar startDate;
	private Calendar endDate;
	private ArrayList<Calendar> timings;
	private String url;
	
	public Course() {}
	public Course(int courseID, String courseName, Employee courseTrainer, ArrayList<Integer> preRequisites,
			int duration, Calendar startDate, Calendar endDate, ArrayList<Calendar> timings, String url) {
		super();
		this.courseID = courseID;
		this.courseName = courseName;
		this.courseTrainer = courseTrainer;
		this.preRequisites = preRequisites;
		this.duration = duration;
		this.startDate = startDate;
		this.endDate = endDate;
		this.timings = timings;
		this.url = url;
	}
	public int getCourseID() {
		return courseID;
	}
	public void setCourseID(int courseID) {
		this.courseID = courseID;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public Employee getCourseTrainer() {
		return courseTrainer;
	}
	public void setCourseTrainer(Employee courseTrainer) {
		this.courseTrainer = courseTrainer;
	}
	public ArrayList<Integer> getPreRequisites() {
		return preRequisites;
	}
	public void setPreRequisites(ArrayList<Integer> preRequisites) {
		this.preRequisites = preRequisites;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public Calendar getStartDate() {
		return startDate;
	}
	public void setStartDate(Calendar startDate) {
		this.startDate = startDate;
	}
	public Calendar getEndDate() {
		return endDate;
	}
	public void setEndDate(Calendar endDate) {
		this.endDate = endDate;
	}
	public ArrayList<Calendar> getTimings() {
		return timings;
	}
	public void setTimings(ArrayList<Calendar> timings) {
		this.timings = timings;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
}