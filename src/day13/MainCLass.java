package day13;

import java.util.Scanner;

public class MainCLass {
	public static void main(String[] args) {
		Student s1 = new Student();

		s1.setName("Abdul Gani");
		s1.setRollNo(10);
		s1.setPercent(85.55);

		Student s2 = new Student();

		s2.setName("Rohit Jadhav");
		s2.setRollNo(2);
		s2.setPercent(78.33);
		Student s3 = new Student();

		s3.setName("Mihir Mubiker");
		s3.setRollNo(3);
		s3.setPercent(105.25);
		
		Student[] students = new Student[3];
		
		students[0] = s1;
		students[1] = s2;
		students[2] = s3;
		
		int rollNo;
		System.out.println("Enter roll no of student to be searched: ");
		Scanner sc = new Scanner(System.in);
		rollNo = sc.nextInt();
		
		Response<Object> response =  new Response<>();
		boolean isFound = false;
		for(Student student: students) {
			if(student.getRollNo() == rollNo) {
				response.setStatusCode("200");
				response.setMessage(student);
				isFound = true;
				break;
			}
		}
		if(isFound == false) {
			response.setStatusCode("404");
			String msg = String.format("Student with roll no =  %d not found!!1", rollNo);
			response.setMessage(msg);
		}
		
		System.out.println(response);
		
	}

}
