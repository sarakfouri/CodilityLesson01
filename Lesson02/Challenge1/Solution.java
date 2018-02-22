// this is 66%
import java.util.Arrays;

class Solution {
    public int solution(int[] A) {
      	if (A.length == 1){
      	    return A[0];
      	}
      	Arrays.sort(A);
			    for (int i =0; i <A.length; i += 2){
			        if (A[i] != A[i + 1]){
			            return A[i];
			        } 
			    }
			     return 0;   
    }
}

// this is 100 %
class Solution {
    public int solution(int[] A) {
    int result = 0;
    for (int x : A) result ^= x;
    return result;
	    
}
	/*
	This uses the fact, that x ^ x == 0 for any x and the associativity of ^. 
	This means that any pair of equal values cancels out,
	what remains is the single unpaired value (in case of multiple unpaired values,
	 the result makes no sense; such a case can't be detected).
	 https://stackoverflow.com/questions/43058889/how-to-improve-the-code-to-return-the-unpaired-element
	*/
}
