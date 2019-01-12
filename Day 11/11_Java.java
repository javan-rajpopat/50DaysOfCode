class Solution {
    public String complexNumberMultiply(String a, String b) {
        String n12,n22,n11,n21;
        n11="";
        n12="";
        n22="";
        n21="";
        int i,flag=0;
        char aa,bb;
        for(i=0;i<a.length();i++){
            aa=a.charAt(i);
            if (aa=='i'){
                flag=1;
            }
            else if (aa!='+' && flag==0){
                n11+=aa;
            }
            else if (aa!='+' && flag==1){
                n12+=aa;
            }
            else if (aa=='+'){
                flag=1;
            }
        }
        flag=0;
        for(i=0;i<b.length();i++){
            bb=b.charAt(i);
            if (bb=='i'){
                flag=1;
            }
            else if (bb!='+' && flag==0){
                n21+=bb;
            }
            else if (bb!='+' && flag==1){
                n22+=bb;
            }
            else if (bb=='+'){
                flag=1;
            }
        }
        int i11,i12,i21,i22;
        i11=Integer.parseInt(n11);
        i12=Integer.parseInt(n12);
        i21=Integer.parseInt(n21);
        i22=Integer.parseInt(n22);
        int n1,n2,n3,n4;
        n1=i11*i21;
        n2=i11*i22;
        n3=i12*i21;
        n4=i12*i22*-1;
        n2=n2+n3;
        n1=n1+n4;
        String output;
        output = Integer.toString(n1)+'+'+Integer.toString(n2)+'i';
        return output;
    }
}