package Java8Feature;
import java.util.*;
import java.util.stream.*;

public class StreamAPI {

	public static void main(String[] args) {
		
// ++++++++++++ Example1 +++++++++++++++++++++++++++++++++++
		List<Integer> names = Arrays.asList(1,2,3,4,5);
		
		// getDisctinct
		List<Integer> ans = names.stream().distinct().collect(Collectors.toList());
		
		// Sort in Ascending
		List<Integer> sortedAsc = names.stream().sorted().collect(Collectors.toList());
		
		// Sort in Descending
		List<Integer> sortedDesc = names.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        
		// Filter the Stream
        List<Integer> FilterExample = names.stream().filter(num -> num%2==0).sorted().collect(Collectors.toList());
        //FilterExample.forEach(System.out::println);
        
        // Map in the Stream
        List<Integer> MapExample = names.stream().map(num -> num*num).sorted().collect(Collectors.toList());
        //MapExample.forEach(System.out::println);
        
        // Reduce the Stream to get Sum
        int ReduceExampleSUM = names.stream().reduce(0, (element1, element2) -> element1 + element2);
        //System.out.println(ReduceExampleSUM);
        
        // Reduce the Stream to get Max Num
        Optional<Integer> ReduceExamplelongest = names.stream().reduce((word1, word2) -> word1 > word2 ? word1 : word2);
        ReduceExamplelongest.ifPresent(System.out::println);
        
        // Reduce the Stream to get Concatenate
        String[] array = { "Geeks", "for", "Geeks" };
        Optional<String> String_combine = Arrays.stream(array) .reduce((str1, str2) -> str1 + "-" + str2);
       
        
        if (String_combine.isPresent()) {
            System.out.println(String_combine.get());
        }
        
        // The peek() method returns a stream consisting of the elements of the stream after performing the provided action on each element
        List<Integer> getPeek = names.stream().filter(value -> value % 2 == 0).peek(value -> System.out.println("Filtered " + value))
                .map(value -> value * 10).collect(Collectors.toList());
        
        //The limit() method returns a stream with the stream elements limited to the provided size.
        List<Integer> getLimited = names.stream().limit(3).collect(Collectors.toList());
        
      //This skip() method returns a stream consisting of the stream after discarding the provided first n elements.
        List<Integer> getSkip = names.stream() .skip(2).collect(Collectors.toList());
        
        //The count() method returns the total number of elements in the stream.
        final long count = names.stream().count();
        
        //The toArray() method returns an array that contains the elements of the stream.
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
        System.out.println(Arrays.toString(stream.toArray()));

        
// ++++++++++++ Example2 +++++++++++++++++++++++++++++++++++
        HashMap<String,Integer> months = new HashMap<>();
        //Declaring a hash map and adding key-value pairs
        months.put("January",31);
        months.put("April",30);
        months.put("September",30);
        months.put("July",31);
        months.put("February",28);
        months.put("December",31);

        months.forEach((month,days)->{
            if(month == "September") { // if month has 31 days, printing month
                //System.out.println(30);
            }
        });
	}

}
