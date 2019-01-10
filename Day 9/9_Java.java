class Solution {
    public int numJewelsInStones(String J, String S) {
        int i=0;
        int j=0;
        int count=0;
        char s,k;
        for(i=0;i<S.length();i++){
            s=S.charAt(i);
            for(j=0;j<J.length();j++){
                k=J.charAt(j);
                if(s==k){
                    count++;
                }
            }
        }
        return count;
    }
}