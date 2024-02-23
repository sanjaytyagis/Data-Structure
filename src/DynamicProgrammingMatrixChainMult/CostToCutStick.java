package DynamicProgrammingMatrixChainMult;
import java.util.*;

public class CostToCutStick {
	
	static int f(int i, int j, ArrayList<Integer> cuts) {
        // Base case
        if (i > j) {
            return 0;
        }

        int mini = Integer.MAX_VALUE;

        for (int ind = i; ind <= j; ind++) {
        	
 int ans = cuts.get(j + 1) - cuts.get(i - 1) + f(i,ind - 1,cuts) + f(ind + 1,j,cuts);

            mini = Math.min(mini, ans);
        }

        return mini;
    }
	
	public static void main(String[] args) {
		
		ArrayList<Integer> cuts = new ArrayList<>(Arrays.asList(3, 5, 1, 4));
        int c = cuts.size();
        int n = 7;
        cuts.add(n);
        cuts.add(0,0);
        System.out.println(cuts.toString());
        Collections.sort(cuts);
        System.out.println(f(1, c, cuts));
        
	}
}
