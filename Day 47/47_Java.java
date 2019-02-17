class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<String>();
        for(int x=1;x<=n;x++){
            if (x%5==0 || x%3==0){
                if (x%5==0 && x%3==0)
                    ans.add("FizzBuzz");
                else if(x%5==0)
                ans.add("Buzz");
                else
                ans.add("Fizz");
            }
            else
                ans.add(Integer.toString(x));
        }
        return ans;
    }
}