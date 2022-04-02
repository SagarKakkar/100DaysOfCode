public class ValidPalindromeII {
    public boolean validPalindrome(String s) {
        
        //Time Complexity :- O(N)| Space Complexity :- O(1)
        
        int left=0;
        int right=s.length()-1;
        
        while(left <= right){
            if(s.charAt(left) == s.charAt(right)){
                left++;
                right--;
            }else return isPalindrome(s,left+1,right) || isPalindrome(s,left,right-1);
        }
        return true;
    }
    
    public boolean isPalindrome(String s, int left, int right){
        while(left <= right){
            if(s.charAt(left) == s.charAt(right)){
                left++;
                right--;
            }else return false;
        }
        return true;
    }
}


/**
 * 
 * Link:- (https://leetcode.com/problems/valid-palindrome-ii/discuss/1904942/JavaC%2B%2B-Awesome-Visuall-EXPLANATION)
 */