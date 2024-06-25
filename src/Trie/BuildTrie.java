package Trie;
/*
    Trie has 0(N) complexity for all the operations and 0(N) for Space Complexity
    Suppose the trie contains the following words: at, and, an, add
            root
             |
             a
            /|\
           t n d // at every level we have different node , not like all element in the array of node
                \
                 d
 */
import java.util.Arrays;

class Node {
    Node links[] = new Node[26]; 
    boolean flag = false; 
    
    public Node() {
        
    }
    
    boolean containsKey(char ch) {
        return (links[ch - 'a'] != null); 
    }
    Node get(char ch) {
        return links[ch-'a']; 
    }
    void put(char ch, Node node) {
        links[ch-'a'] = node; 
    }
    void setEnd() { // used for insert when string end then keep last node flag is true
        flag = true; 
    }
    boolean isEnd() { // used for search return the flag of last node
        return flag; 
    }
}

public class BuildTrie {

	 private static Node root; 

	    //Initialize your data structure here

	 BuildTrie() {
	        root = new Node(); 
	    }
	    //Inserts a word into the trie

	    public static void insert(String word) {
	        Node node = root;
	        
	        for(int i = 0;i<word.length();i++) {
	        	
	            if(!node.containsKey(word.charAt(i))) {
	                node.put(word.charAt(i), new Node()); 
	            }
	            node = node.get(word.charAt(i)); 
	        }
	        node.setEnd(); 
	    }
	    //Returns if the word is in the trie

	    public static boolean search(String word) {
	        Node node = root; 
	        
	        for(int i = 0;i<word.length();i++) {
	        	
	            if(!node.containsKey(word.charAt(i))) {
	                return false; 
	            }
	            node = node.get(word.charAt(i)); 
	        }
	        
	        return node.isEnd(); 
	    }

	    
	    //Returns if there is any word in the trie that starts with the given prefix

	    public static boolean startsWith(String prefix) {
	        Node node = root; 
	        
	        for(int i = 0;i<prefix.length();i++) {
	        	
	            if(!node.containsKey(prefix.charAt(i))) {
	                return false; 
	            }
	            node = node.get(prefix.charAt(i)); 
	        }
	        return true; 
	    }
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		Node obj = new Node();
		
		System.out.println(Arrays.toString(obj.links));
		
		int type[] = {1, 1, 2, 3, 2};
		
		String value[] = {"hello", "help", "help", "hel", "hel"};
		
		BuildTrie trie = new BuildTrie();
		
		for (int i = 0; i < n; i++) {
			
			if (type[i] == 1) {
				trie.insert(value[i]);
			}
			else if (type[i] == 2) {
				if (trie.search(value[i])) {
					System.out.println( "true" );
				}
				else {
					System.out.println("false");
				}
			}
			else {
				if (trie.startsWith(value[i])) {
					System.out.println("true" );
				}
				else {
					System.out.println("false");
				}
			}
		}
	}

}
