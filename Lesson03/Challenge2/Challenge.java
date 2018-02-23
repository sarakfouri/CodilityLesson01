 //60%
 static public int solutionWorst(int X, int Y, int D){
	int count = 0;		
	int sum = X;
	
	do{
	sum += Y; 	
	count++;
	}while(sum < D);
	
	return count;
	
	
	
	}
 
 
 
 /100%
 public int solution(int X, int Y, int D) {
	       int count = 0;		
		int sum = X;
		if (X == Y){
		    return 0;
		}
		sum = Y-X;
		if (sum%D == 0){
		   count = sum/D; 
		}else {
		    count = (sum/D) + 1;
		}
		
		
		return count;
		
	       
	    }
