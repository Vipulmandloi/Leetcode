class Solution {
    public int strStr(String haystack, String needle) {
        int n2=needle.length();
        for(int i=0;i<=haystack.length()-n2;i++){
            if(haystack.substring(i,n2+i).equals(needle)){
                return i;
            }
        }
        return -1;
        
    }
}