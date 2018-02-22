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
