public class FindSmallestLetterGreaterThanTarget {
    public char nextGreatestLetter(char[] letters, char target) {
        int start=0;
        int end=letters.length-1;
        
        while(start<=end){
            int mid=start+(end-start)/2;
            if(letters[mid]>target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        // When start=length of array, if(start==letters.length){return start=0;}
        return letters[start % letters.length]; // For wrap around condition
    }
}
