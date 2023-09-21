package CollectionWorkspace;
import java.util.*;

class Person{
	 
	 public Person() {}
	 
	 int rollNo;
	 String name;
	 double fees;
	 
	 public Person(int rollNo, String name, double fees) {
		 
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.fees = fees;
	}
}
	 
class Name implements Comparator<Person>{

		@Override
		public int compare(Person person1, Person person2){
			
			return person2.name.compareTo(person1.name);
		}
		 
}
	 
class RollNo implements Comparator<Person>{

	public int compare(Person person1, Person person2) {
			
		 return person1.rollNo - person2.rollNo; // Ascending Order
		
		//return person2.rollNo - person1.rollNo; // Descending Order 
		
		/*if(person1.rollNo > person2.rollNo)
			return 1;
		else if(person1.rollNo < person2.rollNo)
			return -1;
		else
			return 0; */
	}
			 
}

public class ComparatorPractice{
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			List<Person> personList = new ArrayList<Person>();
	
			personList.add(new Person(3,"Wanjay",43.98));
			personList.add(new Person(1,"Vanjay",44.98));
			personList.add(new Person(5,"Tanjay",45.98));
			personList.add(new Person(2,"Uanjay",46.98));
			personList.add(new Person(4,"Sanjay",47.98));
	
			//Collections.sort(personList, new RollNo());
			Collections.sort(personList, new Name());
	
				for(Person results : personList) {
					System.out.println(results.rollNo+" "+results.name+" "+results.fees);
				}
	}
}