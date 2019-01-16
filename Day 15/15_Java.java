class Solution {
    public String customSortString(String S, String T) {
        HashMap<Character, Integer> dic = new HashMap<Character, Integer>();
        char list[] = new char[T.length()]; 
        int i,count=1;
        char c;
        for(i=0;i<S.length();i++){
            c=S.charAt(i);
            dic.put(c,count);
            count++;
        }
        count=0;
        for(i=0;i<T.length();i++){
            c=T.charAt(i);
            if (dic.containsKey(c)==false){
                dic.put(c,0);
            }
            list[count]=c;
            count++;
        }
        int j;
        char temp;
        for(i=0;i<list.length;i++){
            for(j=i+1;j<list.length;j++){
                if(dic.get(list[i])>dic.get(list[j])){
                    temp=list[i];
                    list[i]=list[j];
                    list[j]=temp;
                }
            }
        }
        String str="";
        for(i=0;i<list.length;i++){
            str+=list[i];
        }
        return str;
    }
}