//100%
public int solution(int[] A) {
       int sum1 = A[0];
       int sum2 = 0;
       int p = 1;
       int difference = 0;
       int secondDifference = 0;
       for (int i = p ; i < A.length; i++){
          sum2 += A[i]; 
       }
        difference = Math.abs(sum1 - sum2);
    
        for ( ; p < A.length -1 ; p++){
                sum1 += A[p];   
                sum2 -= A[p];
            secondDifference = Math.abs(sum1 - sum2);
            if (secondDifference < difference){
                difference = secondDifference;
            }
        }
        return difference;
    }
}
