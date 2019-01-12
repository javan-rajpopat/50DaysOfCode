class Solution {
    public int repeatedNTimes(int[] A) {
        List list = new ArrayList();
        for(int i=0;i<A.length;i++){
            if (list.contains(A[i])){
                return A[i];
            }
            else{
                list.add(A[i]);
            }
        }
    return -1;
    }
}