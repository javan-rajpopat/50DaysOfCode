class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> k = new ArrayList<>();
        List<Integer> s = new ArrayList<>();
        List<Integer> ss = new ArrayList<>();
        if (numRows==0){
            return k;
        }
        s.add(1);
        k.add(s);
        if (numRows==1){
            return k;
        }
        ss.add(1);
        ss.add(1);
        k.add(ss);
        if (numRows==2){
            return k;
        }
        int c;
        for(int count=2;count<numRows;count++){
            s = new ArrayList<>();
            s.add(1);
            for(c=1;c<count;c++){
                s.add(k.get(count-1).get(c-1)+k.get(count-1).get(c));
            }
            s.add(1);
            k.add(s);
        }
        return k;
    }
}


        