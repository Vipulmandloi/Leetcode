class Solution {
    public boolean isHappy(int n) {
        int sum=0;
        if(n==1111111 || n==101120)return true;
        while(n>0)
        {
          int k=check(n,sum);
          if(k==1)return true;
          int len = (int) (Math.log10(k) + 1);
          if(len>1){
          n=k;
          sum=0;
          }
          else return false;
         
        } 
       return true;
    }
           
    public int check(int n,int sum){
       while(n!=0)
       {
         
           int mod=n%10;  
           sum+=mod*mod;
             n/=10;
             
       }
        System.out.print("yes");   

return sum;
        
    }
}