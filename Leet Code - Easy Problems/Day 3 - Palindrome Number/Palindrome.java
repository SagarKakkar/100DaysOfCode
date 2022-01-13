// For example, 121 is a palindrome while 123 is not.
class Palindrome {
    public boolean isPalindrome(int x) {
        int original = x;
        int sum = 0;
        while(x>0){
            sum = sum * 10 + x % 10;
            x = x / 10;
        }
        
        return sum == original;
    }
}