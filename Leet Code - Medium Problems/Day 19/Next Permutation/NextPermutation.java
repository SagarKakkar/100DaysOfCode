public class NextPermutation {
    public void nextPermutation(int[] nums) {
        if(nums == null || nums.length <= 1){
            return;
        }

        int len = nums.length;
        int left = len - 2;
        /**
         * Scan from right to left, find the first number which is smaller than the right digit
         */
        while(left>=0 && nums[left]>=nums[left+1]){
            left--;
        }

        /**
         *  If the one exists, find a number which is larger than it from right to left.
         */
        if(left>=0){
            int right = len-1;
            while(right>=0 && nums[left] >= nums[right]) {
                right--;
            }
            /**
             * Swap them.
             */
            swap(nums,left,right);
        }

        /**
         * Reverse the right to make the numer smaller
         */
        reverse(nums, left+1);
    }

    public void swap(int[] nums, int left, int right){
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }

    public void reverse(int[] nums, int left){
        int right = nums.length - 1;
        while(left < right){
            swap(nums, left, right);
            left++;
            right--;
        }
    }
}


/**
 * Link:- (https://leetcode.com/problems/next-permutation/discuss/1908463/Java-Two-Pointers-Solution-with-Detailed-Explanation-or-Code-Commented)
 * Link:- (https://leetcode.com/problems/next-permutation/discuss/13994/Readable-code-without-confusing-ij-and-with-explanation)
 */
