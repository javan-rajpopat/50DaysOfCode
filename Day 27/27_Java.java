class Solution {
    public String m(String str) {
        if (str != null && str.length() > 0) {
            str = str.substring(0, str.length() - 1);
        }
        return str;
    }
    public boolean backspaceCompare(String S, String T) {
        String v1 = new String();
        String v2 = new String();
        int i=0;
        char c;
        for(i=0;i<S.length();i++){
            c=S.charAt(i);
            if (c=='#'){
                if (v1.length()!=0){
                    v1=m(v1);
                }
            }else{
                v1+=c;
            }
        }
        for(i=0;i<T.length();i++){
            c=T.charAt(i);
            if (c=='#'){
                if (v2.length()!=0){
                    v2=m(v2);
                }
            }else{
                v2+=c;
            }
        }
        if (v1.equals(v2)){
            return true;
        }
        return false;
    }
}


       
        