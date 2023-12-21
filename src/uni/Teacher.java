package uni;

import java.util.HashMap;

class Teacher extends person {
	private String EmployeeId;
	
	private HashMap<String, String> teachersData = new HashMap<>();
	
	Teacher(String name, String gender, int age){
		super(name, gender, age);
	}
	public void setEmployeeId(String EmployeeId) {
		this.EmployeeId = EmployeeId;
	}
	public String getEmployeeId() {
		return EmployeeId;
	}
	public void displayDetails() {
		System.out.println("Teacher details: Name - " + getName() + ", Gender - " + getGender() + ", age - " + getAge() + ", EmployeeId - " + getEmployeeId());
	}
	void enrollTeacher(String EmployeeId, String name) {
		teachersData.put(EmployeeId, name);
	}
	void searchTeacher(String EmployeeId) {
		boolean check = teachersData.containsKey(EmployeeId);
		if (check) {
			teachersData.get(EmployeeId);
		}
		else {
			System.out.println("Teacher data not found.");
		}
	}
	void removeTeacher(String EmployeeId) {
		teachersData.remove(EmployeeId);
	}
}
