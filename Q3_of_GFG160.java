class Solution {
    public void reverseArray(int arr[]) {
        int right = arr.length-1;
        int left = 0;
        
        while(left<right){
            int temp = arr[left];
            arr[left]= arr[right];
            arr[right] = temp;
            
            left++;
            right--;
        }
    }
