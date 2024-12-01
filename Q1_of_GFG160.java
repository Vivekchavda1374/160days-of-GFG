class Solution {
    public int getSecondLargest(int[] arr) {
        
        int firstMax = -1;
        int secondMax = -1;
        
        for (int num : arr) {
            if (num > firstMax) {
                secondMax = firstMax;
                firstMax = num;
            } else if (num > secondMax && num != firstMax) {
               
                secondMax = num;
            }
        }
        return secondMax != -1 ? secondMax : -1;
    }
}
