//63%

import java.util.Arrays;
class Solution {
    public int solution(int[] A) {
     Arrays.sort(A);
     int number = 0;
     if (A.length <= 1){
         return 0;
     }
     int init = A[0];
     for (int i = 1; i < A.length; i++){
         if (A[i] == (init+1)){
                number = 1; 
                init = A[i];
         }else{
             number = 0;
             return number;
         }
     }return number;
    }
}
//90%
import java.util.Arrays;
class Solution {
    public int solution(int[] A) {
     Arrays.sort(A);
     int number = 0;
     if (A.length <= 2){
         if(A[0] == 1){
             return 1;
         }
         return 0;
     }
     int init = A[0];
     for (int i = 1; i < A.length; i++){
         if (A[i] == (init+1)){
                number = 1; 
                init = A[i];
         }else{
             number = 0;
             return number;
         }
     }return number;
    }
}

//
