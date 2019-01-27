class Solution {
public:
    float distance(int x2, int x1, int y2, int y1) 
    { 
    return sqrt(pow(x2 - x1, 2) +  
                pow(y2 - y1, 2)); 
    } 
    bool validSquare(vector<int>& p1, vector<int>& p2, vector<int>& p3, vector<int>& p4) {
        vector<float> d;
        d.push_back(distance(p2[0],p1[0],p2[1],p1[1]));
        d.push_back(distance(p3[0],p1[0],p3[1],p1[1]));
        d.push_back(distance(p4[0],p1[0],p4[1],p1[1]));
        d.push_back(distance(p3[0],p2[0],p3[1],p2[1]));
        d.push_back(distance(p4[0],p2[0],p4[1],p2[1]));
        d.push_back(distance(p4[0],p3[0],p4[1],p3[1]));
        sort(d.begin(), d.end()); 
        float x=d[0];
        if (x==0){
            return false;
        }
        for(int y=1;y<4;y++){
            if (x!=d[y]){
                return false;
            }
        }
        return true;
    }
};

    