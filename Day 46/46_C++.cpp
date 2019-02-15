class Solution {
public:
    int decToBinary(int n) 
    { 
        int binaryNum[1000]; 
        int i = 0,count=0;
        while (n > 0) { 
            binaryNum[i] = n % 2; 
            n = n / 2; 
            i++; 
        } 
        for (int j = i - 1; j >= 0; j--) {
            if (binaryNum[j]==1){
                count++;
            }
        }
        return count;
    } 
    vector<int> countBits(int num) {
        vector<int> ans;
        int count;
        for(int i=0;i<=num;i++){
            count = decToBinary(i);
            ans.push_back(count);
        }
        return ans;
    }
};

        