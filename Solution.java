public class Solution {
public int solution(int N){
	// converts Integer to binary and transforms into a String
	String m = Integer.toBinaryString(N);
	// test if the variable transform into a binary/string
	System.out.println(m);
	char[] numbers = m.toCharArray();
	// initializes the two variables to count the repeated zero sequences
	int count = 0;
	int big = 0;
	// 
	for (int i = 0; i < numbers.length; i++){
		
		if (numbers[i]=='0'){
			++count;
			
			}else{
				big = Math.max(big, count);
			
			}
	}
	if (count != 0){
		if (count > big){
			return count;
		}
	}
	
	return big;
}
}
