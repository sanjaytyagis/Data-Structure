package Java8Feature;
import java.util.*;

public class OptionalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String message = null;
        
 //++++++++++++ Method1 TO Check ++++++++++++++++++++++++++++++++++++++++++
		
		//ofNullable() : if given object is null
        Optional<String> StringOptional = Optional.ofNullable(message);
        
        //isPresent() : if Optional is Non-empty
        if(StringOptional.isPresent()){
            System.out.println(message);
        }else{
        	System.out.println(StringOptional.orElse("Meesage Empty"));
        }
        
//++++++++++++ Method2 TO Check ++++++++++++++++++++++++++++++++++++++++++   
        
        // if Optional is non-empty print GoodMorning
        Optional<String> GoodMorning= Optional.of("Hello");
        
        Optional<String> GoodMorningEmpty = Optional.empty();
        
        GoodMorning.ifPresent(System.out::println);
        GoodMorning.ifPresent(value -> System.out.println(value)); 
        
        //orElse : assigning a value if the given Optional is Empty
        System.out.println(GoodMorningEmpty.orElse("Default"));
	}

}
