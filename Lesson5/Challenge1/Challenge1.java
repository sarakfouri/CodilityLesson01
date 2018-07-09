class Solution {
    public int solution(int[] A) {
    int  countE = 0;
    int countT =0;
    
    for (int i = 0; i < A.length; i++){
        if (A[i] == 0){
        countE++;
    }
     if (A[i] == 1){   
    countT = countT +  countE;
    }
   
    if (countT > 1000000000){
        return -1;
    }            
    
        
    }return countT;
    }
}
