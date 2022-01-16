public class OrderAgnosticBinarySearch {
    public static void main(String[] args){
        int target = 36;
        int[] arr={2,4,6,9,11,12,14,20,36,48};
        boolean flag = orderAgnosticBS(arr,target);
        System.out.println(flag);
    }

    static boolean orderAgnosticBS(int[] arr, int target){
        boolean flag=false;
        int start=0;
        int end=arr.length-1;

        // find whether the array is sorted in ascending or descending
        boolean isAsc=arr[start]<arr[end];

        while(start<=end){
            int middle=start+(end-start)/2;
            if(target==arr[middle]){
                return true;
            }
            if(isAsc){
                if(target > arr[middle]){
                    start=middle+1;
                }else if(target < arr[middle]){
                    end=middle-1;
                }
            }
            else {
                if(target < arr[middle]){
                    start=middle+1;
                }else if(target > arr[middle]){
                    end=middle-1;
                }
            }
        }
        return flag;
    }
}
