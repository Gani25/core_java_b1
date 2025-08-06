package day25;

public class Student implements Comparable<Student> {
	
	private int rollNo;
	
	private String name;
	
	private String department;
	
	private int percentage;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int rollNo, String name, String department, int percentage) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.department = department;
		this.percentage = percentage;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getPercentage() {
		return percentage;
	}

	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", department=" + department + ", percentage="
				+ percentage + "]";
	}

	@Override
	public int compareTo(Student o) {

//		return Integer.compare(rollNo, o.rollNo);
//		return rollNo - o.rollNo;
		return o.name.compareTo(name);
	}
	
	
	
	

}
