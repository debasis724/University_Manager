package uni;
import java.util.*;

class Student extends person {
	private int rollNo;
	
	private HashMap<Integer, String> studentsData = new HashMap<>();
	Student(String name, String gender, int age){
		super(name, gender, age);
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void displayDetails() {
		System.out.println("Student details: Name - " + getName() + ", Gender - " + getGender() + ", age - " + getAge() + ", RollNo. - " + getRollNo());
	} 
	void enrollStudents(int RollNo, String name) {
		studentsData.put(RollNo, name);
	}
	void displayStudentData() {
		System.out.println(studentsData);
	}
	void searchStudent(int RollNo) {
		boolean check = studentsData.containsKey(RollNo);
		if (check) {
			studentsData.get(RollNo);
		}
		else {
			System.out.println("Student data not found.");
		}
	}
	void removeStudent(int RollNo) {
		studentsData.remove(RollNo);
	}
}
