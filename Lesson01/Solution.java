public class Solution {
	//88% 
	public int solution (int N){
String numbers = Integer.toBinaryString(N);
	int count = 0;
	int big = 0;
	// 
	for (int i = 0; i < numbers.length(); i++){
		
		if (numbers.charAt(i) == '0'){
			++count;
			
			}else{
				big = Math.max(big, count);
				count = 0;
			}
	}
	if (count != 0){
		if (count > big){
			return count;
		}
	}
	
	return  Math.max(big, count);

// the best 100 %
	
public int solution(int N){
	    	    String binaryNumbers = Integer.toBinaryString(N);
	    	    char [] numbers = binaryNumbers.toCharArray();
	    	    int count = 0;
	    	    int big = 0;
	    	    for (int i = 0; i < numbers.length; i++) {
	    	        if(numbers[i] == '1') {
	    	            if (count > big) { 
	    	            	big = count; 
	    	            	}
	    	            count = 0;
	    	        }else{
	    	        	count++; 
	    	        	}
	    	    }
	    	    return big;
	    	}
		
		
	}
		
		
		
		
