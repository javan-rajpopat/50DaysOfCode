class Solution {
    public int[] shortestToChar(String S, char C) {
        List<Integer> ans = new ArrayList<>();
        List<Integer> check = new ArrayList<>();
        int[] output = new int[S.length()];
        int i,j,temp;
        char c;
        for(i=0,j=0;i<S.length();i++){
            c=S.charAt(i);
            if(c==C){
                check.add(i);
            }
        }
        for(i=0;i<S.length();i++){
            for(j=0;j<check.size();j++){
                ans.add(Math.abs(check.get(j)-i));
            }
            Collections.sort(ans);
            output[i]=ans.get(0);
            ans.clear();
        }
        return output;
    }
}