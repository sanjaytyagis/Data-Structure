package CollectionWorkspace;
import java.util.*;
/* Hard Question if sorted on Roll Number then Same List should be sorted on Name, 
two has same roll no then name should be in descending order 

The idea behind this is pretty simple.

->We have to compare the primary field.
Only when both primary fields are same, 

->then we have to return the comparison of the secondary field. 
(So if there are more fields, you can extend in similar fashion)

https://blog.devgenius.io/sorting-an-array-of-object-by-multiple-fields-in-java-and-javascript-e66f0366fc71
https://www.javaprogramto.com/2020/08/java-8-sorting-stream-on-multiple-fields.html
*/

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
			
			return person1.name.compareTo(person2.name);
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
	
			personList.add(new Person(3,"A",43.98));
			personList.add(new Person(1,"AB",44.98));
			personList.add(new Person(5,"ABC",45.98));
			personList.add(new Person(2,"ABCD",46.98));
			personList.add(new Person(4,"ABCDE",47.98));
	
			//Collections.sort(personList, new Name());
			Collections.sort(personList, new RollNo());
			
				for(Person results : personList) 
					System.out.println(results.rollNo+"    "+results.name+"      "+results.fees);
				
	}
}