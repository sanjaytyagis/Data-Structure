package CollectionWorkspace;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
	 
	 public Student() {}
	 
	 int rollNo;
	 String name;
	 double fees;
	 
	 public Student(int rollNo, String name, double fees) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.fees = fees;
	}


	@Override
	public int compareTo(Student student) {
	
		//System.out.println(this.name+"  "+student.name);
		
		// this.name will always be less than student.name from List so It will always in ascending order
		
		if(this.rollNo > student.rollNo)
			return 1;
		else if(this.rollNo < student.rollNo )
			return -1;
		else
			return 0; 
		
		// return this.name.compareTo(student.name); sorting String in ascending order 
		// return student.name.compareTo(this.name); sorting String in descending order
			
	}
	
}

public class ComparablePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> studentList = new ArrayList<Student>();
		
		studentList.add(new Student(3,"Wanjay",43.98));
		studentList.add(new Student(1,"Vanjay",44.98));
		studentList.add(new Student(5,"Tanjay",45.98));
		studentList.add(new Student(2,"Uanjay",46.98));
		studentList.add(new Student(4,"Sanjay",47.98));
		
		Collections.sort(studentList);
		
		for(Student results : studentList) {
			System.out.println(results.rollNo);
		}
		
	}

}
