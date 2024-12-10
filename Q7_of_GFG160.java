public class MaximumProductSubarray {
    
    public static int maxProduct(int[] arr) {
        // Initialize the variables
        int maxProduct = arr[0];
        int currentMax = arr[0];
        int currentMin = arr[0];
        
        // Loop through the array
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < 0) {
                // Swap the current max and min when encountering a negative number
                int temp = currentMax;
                currentMax = currentMin;
                currentMin = temp;
            }
            
            // Update the current max and current min
            currentMax = Math.max(arr[i], arr[i] * currentMax);
            currentMin = Math.min(arr[i], arr[i] * currentMin);
            
            // Update the global max product result
            maxProduct = Math.max(maxProduct, currentMax);
        }
        
        return maxProduct;
    }
    
    
