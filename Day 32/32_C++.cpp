class MedianFinder {
    vector<int> a;
    public:
    /** initialize your data structure here. */
    MedianFinder() {
    }
    
    void addNum(int num) {
        a.push_back(num);
    }
    
    double findMedian() {
        float s;
        int temp;
        sort(a.begin(),a.end());
        if (a.size()%2==0){
            temp=a.size()/2;
            temp-=1;
            s=a[temp]+a[temp+1];
            s=s/2;
        }else{
            temp=a.size()/2;
            s=a[temp];
        }
        return s;
    }
};

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */