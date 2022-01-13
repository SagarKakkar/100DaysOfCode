// Brute Force Approach - O(N^2) Complexity
class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] indices=new int[2];
        int len = nums.length;
        for(int i=0; i < len-1; i++){
            for(int j=1; j < len; j++){
                if(nums[i] + nums[j] == target){
                    indices[0]=i;
                    indices[1]=j;
                }
            }
        }
        return indices;
    }
}