package BinarySearchOn2dArray;
import java.util.*;

public class Search2DMatrix {
	
	public static boolean searchMatrix(ArrayList<ArrayList<Integer>> matrix, int target) {
        int n = matrix.size();
        //System.out.println(n);
        int m = matrix.get(0).size();

        //apply binary search:
        int low = 0, high = n * m - 1;
        
        while (low <= high) {
            int mid = (low + high) / 2;
            
            // To find row and column we need to divide 1D array index by column
            int row = mid / m, col = mid % m;
            
            if (matrix.get(row).get(col) == target) 
            	return true;
            else if
            (matrix.get(row).get(col) < target)
            	low = mid + 1;
            else
            	high = mid - 1;
        }
        return false;
    }
	
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1, 2, 3, 4)));
        matrix.add(new ArrayList<>(Arrays.asList(5, 6, 7, 8)));
        matrix.add(new ArrayList<>(Arrays.asList(9, 10, 11, 12)));

        boolean result = searchMatrix(matrix, 8);
        System.out.println(result ? "true" : "false");
       
	}
}
