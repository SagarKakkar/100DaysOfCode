class ValidPalindrome {
    public boolean isPalindrome(String s) {
        //O(n) time and O(1) space
        int start = 0;
        int end = s.length() - 1;
        while(start < end){
            while(start<=end && !Character.isLetterOrDigit(s.charAt(start))){
                start++;
            }
            while(start<=end && !Character.isLetterOrDigit(s.charAt(end))){
                end--;
            }
            if(Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}

/*
1. Using String in-built methods - 

        String actual = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        String rev = new StringBuffer(actual).reverse().toString();
        return actual.equals(rev);

2. My Solution

        String nsl = s.toLowerCase().replaceAll("[^a-z0-9]","");
        if(nsl.length()<2){
            return true;
        }
        String palindrome="";
        char[] nslArr= nsl.toCharArray();
        for(int i=nslArr.length-1;i>=0;i--){
            palindrome = palindrome + nslArr[i];
        }
        
        if(palindrome.equals(nsl)){
            return true;
        }
        return false;
    
*/