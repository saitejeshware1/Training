import java.util.*;

class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if (k <= 0 || t < 0) return false;

        Map<Long, Long> bucketMap = new HashMap<>();
        long width = (long) t + 1;

        for (int i = 0; i < nums.length; i++) {
            long num = (long) nums[i];

            // Find the current bucket
            long bucketKey = getBucketKey(num, width);

            // Check if the current bucket has a number already
            if (bucketMap.containsKey(bucketKey)) {
                return true;
            }

            // Check the left adjacent bucket (bucketKey - 1)
            if (bucketMap.containsKey(bucketKey - 1) && num - bucketMap.get(bucketKey - 1) < width) {
                return true;
            }

            // Check the right adjacent bucket (bucketKey + 1)
            if (bucketMap.containsKey(bucketKey + 1) && bucketMap.get(bucketKey + 1) - num < width) {
                return true;
            }

            // Add current number to the bucket map
            bucketMap.put(bucketKey, num);

            // Remove the element that is out of the sliding window range
            if (i >= k) {
                long outOfWindowKey = getBucketKey((long) nums[i - k], width);
                bucketMap.remove(outOfWindowKey);
            }
        }

        return false;
    }

    // Helper method to handle bucket calculation with correct handling of negatives
    private long getBucketKey(long num, long width) {
        return num < 0 ? (num + 1) / width - 1 : num / width;
    }
}
