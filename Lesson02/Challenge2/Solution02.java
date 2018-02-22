
public class Solution{
public int[] solution(int[] A, int K) {
	int[] aux = new int[A.length];
    for (int i = 0; i < A.length; i++) {
        int rigthPosition = (K + 1) % A.length;
        aux[rigthPosition] = A[i];
    }
    return aux;
}
