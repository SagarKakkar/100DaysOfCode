// Using HashMap - O(N) Complexity
class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> indMap = new HashMap<>();
        int reqNum;
        for(int i=0; i<nums.length; i++){
            reqNum=target-nums[i];
            if(indMap.containsKey(reqNum)){
                return new int[]{indMap.get(reqNum),i};
            }else{
                indMap.put(nums[i],i);
            }
        }
        return null;
    }
}