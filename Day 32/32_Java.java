class MedianFinder {
    List my = new ArrayList();
    /** initialize your data structure here. */
    public MedianFinder() {
        
    }
    
    public void addNum(int num) {
        my.add(num);
    }
    
    public double findMedian() {
        Collections.sort(my);
        int s;
        float m;
        float mean;
        if (my.size()%2==0){
            s=Math.round(my.size()/2); 
            m=(int)my.get(s-1);
            m+=(int)my.get(s);
            mean=m/2;
        }else{
            s=Math.round(my.size()/2);
            m=(int)my.get(s);
            mean=m;
        }
        return mean;
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */