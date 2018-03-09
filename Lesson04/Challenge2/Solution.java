class Solution {
    public int solution(int X, int[] A){
    int[] aux = new int[X + 1];

        int result = 0;
        for (int i = 0; i < A.length; i++) {
            if (aux[A[i]] == 0) {
                result = i;
            }
            aux[A[i]]++;
        }

        for (int i = 1; i < X + 1; i++) {
            if (aux[i] == 0) {
                return -1;
            }
        }

        return result;
    }
}
