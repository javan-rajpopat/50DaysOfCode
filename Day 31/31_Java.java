class Solution {
    public String shiftingLetters(String S, int[] shifts) {
        String ans="";
        int i,j;
        long[] shift = new long[shifts.length];
        char[] s = new char[shifts.length];
        for(i=0;i<shifts.length;i++){
            for(j=i;j<shifts.length;j++){
                shift[i]+=shifts[j];
            }
            s[i]=S.charAt(i);
        }
        for(i=0;i<shift.length;i++){
            //System.out.println((int)s[i]);
            s[i]=(char)(((((int)s[i]-97)+(shift[i]%26))%26)+97);
            //System.out.println(s[i]);
        }
        for(i=0;i<s.length;i++){
            ans+=s[i];
        }
        return ans;
    }
}


