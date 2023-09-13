package stringManupulation;

import java.util.ArrayList;
import java.util.Collections;

public class StudentDatabase {

	public static void main(String[] args) {
		Student s1 = new Student("Dibya", 149, 85);
		Student s2 = new Student("Nitya", 150, 75);
		Student s3 = new Student("Abhay", 153, 65);
		Student s4 = new Student("Viswa", 146, 95);
		
		ArrayList<Student> studentList = new ArrayList<Student>();
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);
		
		studentList.sort((a,b)->a.getSname().compareTo(b.getSname()));
		
		for(Student each :studentList) {
			System.out.println(each.getSname());
		}
		

	}

}
