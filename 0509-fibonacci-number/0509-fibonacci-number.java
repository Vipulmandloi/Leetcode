class Solution {
    public int fib(int n) {
        int a = 1, b = 0;
        if(n<2){
            return n;
        }
        for(int i = 2; i<=n; i++){
            int c = a+b;
            b = a;
            a = c;
            
        }
        return a;
    }
}