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

//100%
import java.util.Arrays;

class Solution {
// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
//For example, for the input [3, 1] the solution returned a wrong answer (got 1 expected 0).
    public int solution(int[] A) {
     Arrays.sort(A);
     int number = 0;
     if (A.length <= 1){
         if(A[0] == 1 ){
             return 1;
         }
         return 0;
     }
     int init = A[0];
     if (A.length == 2 && A[0] != 1 ){
         return 0;
     }
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
