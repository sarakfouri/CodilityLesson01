public class Solution {
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
}
