class Solution {
    public double distance(int x2, int x1, int y2, int y1) 
    { 
        return Math.sqrt(Math.pow(x2 - x1, 2) +  
                Math.pow(y2 - y1, 2)); 
    } 
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        double d[]=new double[6];
        d[0]=distance(p2[0],p1[0],p2[1],p1[1]);
        d[1]=distance(p3[0],p1[0],p3[1],p1[1]);
        d[2]=distance(p4[0],p1[0],p4[1],p1[1]);
        d[3]=distance(p3[0],p2[0],p3[1],p2[1]);
        d[4]=distance(p4[0],p2[0],p4[1],p2[1]);
        d[5]=distance(p4[0],p3[0],p4[1],p3[1]);
        Arrays.sort(d);
        double x=d[0];
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
}



   
        