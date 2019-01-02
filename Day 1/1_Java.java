class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int i=0;
        int lon=1;
        char chara;
        boolean a=false;
        int check=0;
        if(s.isEmpty()==true){
            return 0;
        }
        while(i<s.length()){
            chara = s.charAt(i);
            i++;
            a=set.add(chara);
            if(lon<set.size()){
                    lon=set.size();
                }
            if(a==false){
                check=check+1;
                i=check;
                set.clear();
            }
        }
        return lon;
    }
}
