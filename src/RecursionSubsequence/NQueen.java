package RecursionSubsequence;
import java.util.*;
/*
 * Every row should have 1 queen
 * Every col should have 1 queen
 * No Two queen can attack each other
 */
public class NQueen {

	// this function can be optimised via hashing
    static boolean validate(char[][] board, int row, int col) {
        int duprow = row;
        int dupcol = col;
        
        // left upper Diagonal check
        while (row >= 0 && col >= 0) {
            if (board[row][col] == 'Q') return false;
            row--;
            col--;
        }
        
        // reset row & col to actual value because of decreasing
        row = duprow;
        col = dupcol;
        
        // left row wise check
        while (col >= 0) {
            if (board[row][col] == 'Q') return false;
            col--;
        }
        
        // reset row & col to actual value because of decreasing
        row = duprow;
        col = dupcol;
        // left lower Diagonal check
        while (col >= 0 && row < board.length) {
            if (board[row][col] == 'Q') return false;
            col--;
            row++;
        }
        return true;
    }
    
	static List < String > construct(char[][] board) {
        List < String > res = new LinkedList < String > ();
        
        for (int i = 0; i < board.length; i++) {
            String s = new String(board[i]);
            res.add(s);
        }
        return res;
    }
	// placing Queen row wise in every column
	static void dfs(int col, char[][] board, List < List < String >> res) {
        if (col == board.length) {
            res.add(construct(board));
            return;
        }

        for (int row = 0; row < board.length; row++) {
            if (validate(board, row, col)) {
                board[row][col] = 'Q'; // place the queen at index where safe to place
                dfs(col + 1, board, res); // to place the queen in next column
          board[row][col] = '.'; // because everyTime in row would place So to place in next row we need to remove from prev row
            }
        }
    }
	
	public static List < List < String >> solveNQueens(int n) {
        char[][] board = new char[n][n];
        
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                board[i][j] = '.'; // adding default character in board so that Queen character can be different
        
        List < List < String >> res = new ArrayList < List < String >> ();
        dfs(0, board, res);
        return res;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 4;
        List < List < String >> queen = solveNQueens(N);
        int i = 1;
        for (List < String > it: queen) {
            System.out.println("Arrangement " + i);
            for (String s: it) {
                System.out.println(s);
            }
            System.out.println();
            i += 1;
        }
	}

}
