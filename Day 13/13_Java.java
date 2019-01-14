public class Example {
    public static int s=0;
}
class Solution {
    public int f(int N){
        if (N==1){
            Example.s+=1;
        }else if(N==0){
            Example.s+=0;
        }else{
            f(N-1);
            f(N-2);
        }
        return Example.s;
    }
    public int fib(int N) {
            Example.s=f(N);
            return Example.s;
    }
}