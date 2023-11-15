class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
       int sz = arr.length;
       Arrays.sort(arr);
       long prevExpNum = 1;
       for(int indx = 1; indx < sz; indx++){
               long currExpNum = prevExpNum + 1;
               long actualNum = arr[indx];
               prevExpNum = Math.min(currExpNum, actualNum);
       }
       return (int)prevExpNum;
    }
}