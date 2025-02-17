class Solution {
    public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            // If the mid element is greater than the rightmost element,
            // the minimum is in the right half
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                // The minimum is in the left half (including mid)
                right = mid;
            }
        }
        
        return nums[left];
    }
}
