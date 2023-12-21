package uni;
import java.util.*;

public class Manager {

	public static void main(String[] args) {
		Student s1 = new Student("Rahul", "Male", 21);
		s1.setRollNo(12345);
		s1.enrollStudents(12345, "Rahul");
		Student s2 = new Student("Sai", "Male", 21);
		s2.setRollNo(99999);
		s2.enrollStudents(99999, "sai");
		Teacher t1 = new Teacher("Ram", "Male", 51);
		t1.setEmployeeId("T12345");
		List<Course> courses = new ArrayList<>();
		Course c1 = new Course("ICP", "Introduction to Computer Programming");
		Course c2 = new Course("UPM", "University Physics with Modern physics");
		courses.add(c1);
		courses.add(c2);
		System.out.println("The Courses taught are:");
		for (Course course : courses) {
            course.getcourseDetails();
        }
		System.out.println("The first course is: " + c1.getCourseCode() + " : " + c1.getCourseName());
		s1.displayDetails();
		s2.displayDetails();
		t1.displayDetails();
	}

}
