class Solution {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        int d1=Math.abs(fx-sx);
        int d2=Math.abs(fy-sy);
        int d=Math.max(d1,d2);
        if(d==0&&t==1)
        return false;
        if(d<=t)
        return true;
        return false;
    }
}