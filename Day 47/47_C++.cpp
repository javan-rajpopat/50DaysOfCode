class Solution {
public:
    vector<string> fizzBuzz(int n) {
        vector<string> ans;
        for(int x=1;x<=n;x++){
            if (x%5==0 || x%3==0){
                if (x%5==0 && x%3==0)
                    ans.push_back("FizzBuzz");
                else if(x%5==0)
                ans.push_back("Buzz");
                else
                ans.push_back("Fizz");
            }
            else
                ans.push_back(to_string(x));
        }
        return ans;
    }
};


