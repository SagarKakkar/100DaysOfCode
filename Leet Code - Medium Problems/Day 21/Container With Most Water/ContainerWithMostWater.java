public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int  left=0;
        int right=height.length-1;
        int max=0;
        while(left<right){
            int w = right-left;
            int h = Math.min(height[left],height[right]);
            int a = w * h;
            max = Math.max(max,a);
            if(height[left] < height[right]) left++;
            else if(height[left] > height[right]) right--;
            else{
                left++;
                right--;
            }
        }
        return max;
    }
}


/**
 * 
 * Link:- (https://leetcode.com/problems/container-with-most-water/discuss/1915172/JavaC%2B%2B-Easiest-Explanations)
 * Link:- (https://leetcode.com/problems/container-with-most-water/discuss/1915231/Java-2-Approaches%3A-BF-and-Two-Pointers-with-Image-Explaination-or-Code-Commented)
 * 
 */