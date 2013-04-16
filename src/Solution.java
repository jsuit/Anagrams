import java.util.HashMap;
import java.util.Scanner;


public class Solution {

	public Solution() {
		// TODO Auto-generated constructor stub	
	}
	
	public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        HashMap<Character, Integer> letters = new HashMap<Character, Integer>();
        Scanner in = new Scanner(System.in);
        while(true){
        String str = in.nextLine();
        String str2 = in.nextLine();
        
        char [] c_array = str.toCharArray();
        
        for (char c : c_array) {
			if(letters.containsKey(c)){
				letters.put(c, letters.get(c)+1);
			}else{
				letters.put(c, 1);
			}
		}
        
        char [] c_array2 = str2.toCharArray();
        boolean trouble = false;
        for ( char c : c_array2) {
			if(!letters.containsKey(c)){
				System.out.println("Not anagrams!");
				 trouble = true;
				break;
			}else{
				Integer count = letters.get(c);
				if(count <= 0){
					trouble = true;
					System.out.println("Not anagrams!");
					break;
				}else{
					
					letters.put(c, count - 1);
				}
				
			}
		}
        	if(!trouble)
			for (Integer c : letters.values()) {
				if(c !=0){
					trouble = true;
					System.out.println("Not anagrams!");
					break;
				}
			}
			
			if(!trouble) System.out.println("Anagrams!");
        
        }
    }

}
