class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        //isme ek logic hai lgana hai A1+A2-common

        //A1 ka area
        int A1=(ax2-ax1)*(ay2-ay1);
        //A2 ka area
        int A2=(bx2-bx1)*(by2-by1);


        // ba bari hai common area ki ek common concept lagana hai

        //width ke x axis pehle left ka max aur right ka min

        //minus value aane ka mtlb no overlap usi ko handle kiya hai

        int w=Math.max(0,Math.min(ax2,bx2)-Math.max(ax1,bx1));
        int b=Math.max(0,Math.min(ay2,by2)-Math.max(ay1,by1));

        int common=w*b;

        return (A1+A2-common);
        
    }
}