// 50%
 public int solution(int[] A) {
      Arrays.sort(A);
      int ini = A[0];
      int number = 0;
      if (A.length == 1){
          return 0;
      }
      for (int i = 1; i < A.length; i++){
          if (A[i] != ini+1){
              number = ini +1;
              return number;
          }else {
             ini = A[i]; 
          }
              
      }
      
      return number;
    }

//80%
import java.util.Arrays;
class Solution {
    

   public int solution(int[] A) {
      Arrays.sort(A);
      int number = 0;
      if (A.length <= 1){
          if(A.length == 1){
                return A[0];          
          
      }else{
          return 1;
      }
      }
      int ini = A[0];
      for (int i = 1; i < A.length; i++){
          if (A[i] != ini+1){
              number = ini +1;
              return number;
          }else {
             ini = A[i];
             if (i == A.length - 1){
                 if(A[0] == 1){
                     number = A[i] + 1;
                 }else{
                        number = A[0] -1;                 
             }
          }
              
      }
      
      
    }return number;
    }
}



//100%
import java.util.Arrays;
class Solution {
    

   public int solution(int[] A) {
      Arrays.sort(A);
      int number = 0;
      if (A.length <= 1){
          if(A.length == 1){
              if(A[0] != 1 ){
                return A[0] - 1;          
              }
                   else{
                      return A[0] + 1; 
                   }
      }else{
          return 1;
      }
      }
      int ini = A[0];
      for (int i = 1; i < A.length; i++){
          if (A[i] != ini+1){
              number = ini +1;
              return number;
          }else {
             ini = A[i];
             if (i == A.length - 1){
                 if(A[0] == 1){
                     number = A[i] + 1;
                 }else{
                        number = A[0] -1;                 
             }
          }
              
      }
      
      
    }return number;
    }
}
import java.util.Arrays;
 class Solution {
    
    public int solution(int[] A) {
     Arrays.sort(A);
    int number = 0;
      if (A.length <= 1){
          if(A.length == 1){
              if(A[0] != 1 ){
                return A[0] - 1;          
              }
                   else{
                      return A[0] + 1; 
                   }
      }else{
          return 1;
      }
      }
      
      if(A[0] > 1){
          return A[0] -1;
      }    
        int ini = A[0];
      for (int i = 1; i < A.length; i++){
          if (A[i] != ini+1){
              number = ini +1;
              return number;
          }else {
             ini = A[i];
             if (i == A.length - 1){
                 if(A[0] == 1){
                     number = A[i] + 1;
                 }else{
                        number = A[0] -1;                 
             }  
             }
        }

          
      }return number;
      }
 }
