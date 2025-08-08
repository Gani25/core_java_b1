package day27.sets;

import java.util.Objects;

public class Student {

	private int rollNo;
	private String name;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}

	@Override
	public boolean equals(Object obj) {
		Student studentObj = (Student) obj;

		return Integer.compare(rollNo, studentObj.rollNo) == 0 && name.compareTo(studentObj.name) == 0;

	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(rollNo, name);
	}

}
