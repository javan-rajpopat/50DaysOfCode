public class Solution {
    public String reverseWords(String s) {
        List<String> l = new ArrayList();
        String word="";
        char c;
        for(int w=0;w<s.length();w++){
            c=s.charAt(w);
            if (c!=' '){
                word+=c;
            }else{
                if (word!=""){
                    l.add(word);
                }
                word="";
            }
        }
        l.add(word);
        int size=l.size()-1;
        String ans="";
        while (size>=0){
            if (l.get(size)!=""){
                ans+=l.get(size);
                if (size!=0){
                    ans+=" ";
                }
            }
            size--;
        }
        return ans;
    }
}


