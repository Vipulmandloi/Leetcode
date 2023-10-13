class Solution {
    public int getSum(int a, int b) {
        if(b==0 || a==0) return a | b;
        return (int)(Math.log(Math.pow(2,a)*Math.pow(2,b))/Math.log(2));
        
    }
}