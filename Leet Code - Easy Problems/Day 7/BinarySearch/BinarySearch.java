public class BinarySearch {
    public static void main(String[] args){
        int target = 36;
        int[] arr={2,4,6,9,11,12,14,20,36,48};
        boolean flag = binarySearch(arr,target);
        System.out.println(flag);
    }

    public static boolean binarySearch(int[] arr, int target){
        boolean flag=false;
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int middle=start+(end-start)/2;
            if(target==arr[middle]){
                return true;
            }else if(target > arr[middle]){
                start=middle+1;
            }else{
                end=middle-1;
            }
        }
        return flag;
    }
}
