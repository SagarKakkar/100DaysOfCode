class FindingNumbersWithEvenNumberOfDigits {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i = 0; i<nums.length; i++){
            int digitCount=0;
            int num = nums[i];
            while(num != 0){
                num = num / 10;
                digitCount++;
            }
            if(digitCount % 2 == 0){
                count++;
            }
        }
        return count;
    }
}

/*
1.  Using Math.log

        return (int)Math.log10(num) + 1;
____________________________________________________________________________________________________

2. Another approach by converting number to string:-

        int cnt = 0;
        for (int n : nums)
            cnt += 1 - Integer.toString(n).length() % 2;
        return cnt;
        ____________________________________________________________

        return Arrays.stream(nums).map(i -> 1 - Integer.toString(i).length() % 2).sum();
____________________________________________________________________________________________________
3.  Alternate Approach based on provided constraints:-

        int count=0;
        for(int i =0 ; i< nums.length; i++){
            if((nums[i]>9 && nums[i]<100) || (nums[i]>999 && nums[i]<10000) || nums[i]==100000){
                count++;
            }
        }
        return count;

*/