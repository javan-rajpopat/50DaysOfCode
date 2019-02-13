class Solution {
    public int longestMountain(int[] A) {
        if (A.length<3){
            return 0;
        }
        int hp=0,m=0,temp,count;
        for(int i=0;i<A.length-2;i++){
            if (A[i]<A[i+1]){
                temp=i+1;
                count=1;
                while (temp<A.length-1){
                    if (A[temp]>=A[temp+1]){
                        hp=1;
                        if (A[temp]==A[temp+1]){
                            temp=A.length+5;
                            count=-1;
                            break;
                        }
                        temp+=1;
                        count+=1;
                        break;
                    }
                    else{
                        count+=1;
                    }
                    temp+=1;
                }
                while(temp<A.length-1){
                    if (A[temp]<=A[temp+1]){
                        count+=1;
                        break;
                    }
                    else{
                        count+=1;
                    }
                    temp+=1;
                }
                if (temp==A.length-1){
                    count+=1;
                }
                if (count>m && hp==1){
                    m=count;
                    hp=0;
                }
            }
        }
        return m;
    }
}