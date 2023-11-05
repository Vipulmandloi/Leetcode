class Solution {
    public int getWinner(int[] arr, int k) {
        int current = arr[0]; // Initialize with the first element
        int count = 0;

        for (int i = 1; i < arr.length ; i++) {
            if (current > arr[i]) {
                count++;
            } else {
                current = arr[i];
                count = 1;
            }
            
            if (count == k) return current;           
        }
        return current;
    }
}