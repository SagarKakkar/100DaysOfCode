public class KthLargestElementInAnArray {
    public int findKthLargest(int[] nums, int k) {
        return nums[k+1 % nums.length];
    }
}
