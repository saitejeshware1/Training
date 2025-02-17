class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        int length = flowerbed.length;

        for (int i = 0; i < length; i++) {
            
            if (flowerbed[i] == 0) {
                // int prev = (i == 0) ? 0 : flowerbed[i - 1];
                // int next = (i == length - 1) ? 0 : flowerbed[i + 1];
                int prev;
                int next;
                if (i == 0) {
                    prev = 0;
                } else {
                    prev = flowerbed[i- 1];
                }

                if (i == length -1 ) {
                    next = 0;
                } else {
                    next = flowerbed[i + 1];
                }
                if (prev == 0 && next == 0) {
                    flowerbed[i] = 1;  // Place the flower
                    count++;
                    i++;  
                }
            }

            
            if (count >= n) {
                return true;
            }
        }

        
        return false;
    }
}