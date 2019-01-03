class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        Set<String> sett = new HashSet<String>();
        String[] lst = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        char[] alpha={'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        String code;
        for(int i=0;i<words.length;i++){
            code="";
            char[] chars = words[i].toCharArray();
            for(int j=0;j<chars.length;j++){
                for(int k=0;k<alpha.length;k++){
                    if(alpha[k]==chars[j]){
                        code+=lst[k];
                    }
                }   
            }
            sett.add(code);
        }
        int len = sett.size();
        return len;
    }
}