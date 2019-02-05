class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> k = new ArrayList<>();
        List<Integer> s = new ArrayList<>();
        List<Integer> ss = new ArrayList<>();
        s.add(1);
        k.add(s);
        if (rowIndex==0){
            return s;
        }
        ss.add(1);
        ss.add(1);
        k.add(ss);
        if (rowIndex==1){
            return ss;
        }
        int c;
        for(int count=2;count<=rowIndex;count++){
            s = new ArrayList<>();
            s.add(1);
            for(c=1;c<count;c++){
                s.add(k.get(count-1).get(c-1)+k.get(count-1).get(c));
            }
            s.add(1);
            k.add(s);
        }
        return s;
    }
}

