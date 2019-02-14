class Solution {
    public String[] findWords(String[] words) {
        String word = "qwertyuiop";
        Set<Character> r1 = new HashSet<Character>();
        IntStream.range(0,word.length()).forEach(i -> r1.add(word.charAt(i)));
        String w = "asdfghjkl";
        Set<Character> r2 = new HashSet<Character>();
        IntStream.range(0,w.length()).forEach(i -> r2.add(w.charAt(i)));
        String ww = "zxcvbnm";
        Set<Character> r3 = new HashSet<Character>();
        IntStream.range(0,ww.length()).forEach(i -> r3.add(ww.charAt(i)));
        ArrayList<String> ans = new ArrayList<String>();
        int iter=0;
        Set<Character> temp = new HashSet<Character>();
        Set<Character> comp = new HashSet<Character>();
        String a;
        for(int i=0;i<words.length;i++){
            temp = new HashSet<Character>();
            comp = new HashSet<Character>();
            a=words[i];
            a=a.toLowerCase();
            for(int j=0;j<a.length();j++){
                temp.add(a.charAt(j));
            }
            comp = temp;
            comp = Stream.of(comp, r1) .flatMap(x -> x.stream()) .collect(Collectors.toSet());
            if(comp.size() == r1.size() && comp.containsAll(r1)){
                ans.add(words[i]);
                iter++;
            }
            comp = new HashSet<Character>();
            comp = temp;
            comp = Stream.of(comp, r2) .flatMap(x -> x.stream()) .collect(Collectors.toSet());
            if(comp.size() == r2.size() && comp.containsAll(r2)){
                ans.add(words[i]);
                iter++;
            }
            comp = new HashSet<Character>();
            comp = temp;
            comp = Stream.of(comp, r3) .flatMap(x -> x.stream()) .collect(Collectors.toSet());
            if(comp.size() == r3.size() && comp.containsAll(r3)){
                ans.add(words[i]);
                iter++;
            }
        }
        String[] an = new String[ans.size()];
        for(int k=0;k<ans.size();k++){
            an[k]=ans.get(k);
        }
        return an;
    }
}

