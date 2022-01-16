public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        if(nums.length < 2){
            return false;
        }
        Set<Integer> numSet=new HashSet<Integer>();
        for(int n :nums){
            if(!numSet.add(n)){
                return true;
            }
        }
        return false;
    }
}

/*
1.  Using HashMap:-

        Map<Integer, Integer> count = new HashMap<>();
        for(int n : nums){
            if(count.containsKey(n)){
                count.put(n,count.get(n)+1);
            }else{
                count.put(n,1);
            }
        }
        for(Map.Entry<Integer, Integer> entry : count.entrySet()){
            if(entry.getValue() >= 2){
                return true;
            }
        }
        return false;
___________________________________________________________________________

2.  Sort the array

    Time Complexity: O(N log N)
    Space Complexity: O(Space used by sorting algorithm)

        if(nums.length < 2){
            return false;
        }

        Arrays.sort(nums);

        for(int i=1; i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                return true;
            }
        }
        return false;
___________________________________________________________________________    
3.  Comparing size of HashSet:-

        return (h.size()!=nums.length)? true:false;
___________________________________________________________________________
4.  Java 8 Streams:-
    
        return Arrays.stream(nums).distinct().count() < nums.length;

*/