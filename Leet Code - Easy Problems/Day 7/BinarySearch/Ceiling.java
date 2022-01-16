public class Ceiling {
    public static void main(String[] args){
        int target = 15;
        int[] arr={2,3,5,9,14,12,14,16,18};
        int ans = ceiling(arr,target);
        System.out.println(ans);
    }

    //return the index: smallest number >= target
    public static int ceiling(int[] arr, int target){
        int start=0;
        int end=arr.length-1;

        //If the target is greater than the greatest number in array
        if(target > arr[end]){
            return -1;
        }
        
        while(start<=end){
            int middle=start+(end-start)/2;
            if(target==arr[middle]){
                return middle;
            }else if(target > arr[middle]){
                start=middle+1;
            }else{
                end=middle-1;
            }
        }
        return start;
    }
}
