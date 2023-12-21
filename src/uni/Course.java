package uni;

import java.util.HashMap;

class Course {
	private String courseCode;
	private String courseName;
	
	private HashMap<String, String> courseData = new HashMap<>();
	
	Course(String courseCode, String courseName){
		this.courseCode = courseCode;
		this.courseName = courseName;
		courseData.put(courseCode, courseName);
	}
	public String getCourseCode() {
		return courseCode;
	}
	public String getCourseName() {
		return courseName;
	}
	void getcourseDetails() {
		System.out.println(courseData.get(courseCode));
	}
}
