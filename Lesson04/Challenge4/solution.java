//72%
import java.util.Arrays;
class Solution {
    public int solution(int[] A) {
       Arrays.sort(A);
       int num = A[0];
       for(int i = 1; i <A.length; i++){
          if(num != A[i]-1){
              return 0;
          }
          num = A[i];
       }return 1;
    }
}
//90%
import java.util.Arrays;
class Solution {
    public int solution(int[] A) {
       if(A.length == 1 & A[0] >=2 ){
           return 0;
       }
       Arrays.sort(A);
       
       int num = A[0];
       for(int i = 1; i <A.length; i++){
          if(num != A[i]-1){
              return 0;
          }
          num = A[i];
       }return 1;
    }
}
//100%
import java.util.Arrays;
class Solution {
    public int solution(int[] A) {
       if(A.length == 1 & A[0] >=2 ){
           return 0;
       }
       Arrays.sort(A);
       
       int num = A[0];
       if (A[0] > 1){
           return 0;
       }
       for(int i = 1; i <A.length; i++){
          if(num != A[i]-1){
              return 0;
          }
          num = A[i];
       }return 1;
    }
}
