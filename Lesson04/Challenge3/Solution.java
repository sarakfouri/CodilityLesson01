import java.util.Arrays;
class Solution {
    public int solution(int[] A) {
        Arrays.sort(A);
        int num = 1;
     for (int i = 0; i < A.length ; i++){
         if(num < A[i]){
             return num;
         }if(num == A[i]){
             num++;
         }
     }
       return num; 
        
    }
}
