class Solution {
public:
    string complexNumberMultiply(string a, string b) {
        string n12,n22,n11,n21;
        int i,flag=0;
        for(i=0;i<a.length();i++){
            if (a[i]=='i'){
                flag=1;
            }
            else if (a[i]!='+' && flag==0){
                n11+=a[i];
            }
            else if (a[i]!='+' && flag==1){
                n12+=a[i];
            }
            else if (a[i]=='+'){
                flag=1;
            }
        }
        flag=0;
        for(i=0;i<b.length();i++){
            if (b[i]=='i'){
                flag=1;
            }
            else if (b[i]!='+' && flag==0){
                n21+=b[i];
            }
            else if (b[i]!='+' && flag==1){
                n22+=b[i];
            }
            else if (b[i]=='+'){
                flag=1;
            }
        }
        int i11,i12,i21,i22;
        stringstream q(n11);
        q >> i11;
        stringstream w(n12);
        w >> i12;
        stringstream e(n21);
        e >> i21;
        stringstream r(n22);
        r >> i22;
        int n1,n2,n3,n4;
        n1=i11*i21;
        n2=i11*i22;
        n3=i12*i21;
        n4=i12*i22*-1;
        n2=n2+n3;
        n1=n1+n4;
        string output;
        output = to_string(n1)+'+'+to_string(n2)+'i';
        return output;
    }
};