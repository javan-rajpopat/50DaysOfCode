class Solution {
    public int smallestRangeI(int[] A, int K) {
        Arrays.sort(A);
        int t1=A[0];
        int t2=A[A.length-1];
        if ((t1+K)>=(t2-K)){
            return 0;
        }
        return Math.abs((t1+K)-(t2-K));   
    }
}