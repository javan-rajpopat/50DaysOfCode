class Solution {
public:
    int f(int N,int &s){
        if (N==1){
            s+=1;
        }else if(N==0){
            s+=0;
        }else{
            f(N-1,s);
            f(N-2,s);
        }
        return s;
    }
    int fib(int N) {
        int s=0;
        s=f(N,s);
        return s;
    }
};