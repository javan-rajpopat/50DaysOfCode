import java.util.Vector;
class Solution {
    public int[] diStringMatch(String S) {
        Vector lst = new Vector() ;
        for(int i=0;i<=S.length()+1;i++){
            lst.add(i);
        }
        Vector ans = new Vector();
        char c;
        int n;
        for(int j=0;j<=S.length();j++){
            c=S.charAt(j); 
            if (c=='I'){
                ans.add(lst.firstElement());
                lst.remove(0);
            }else{
                ans.add(lst.lastElement());
                n=lst.size();
                lst.remove(n);
            }
        }
        ans.add(lst.firstElement());
        return ans;
    }
}