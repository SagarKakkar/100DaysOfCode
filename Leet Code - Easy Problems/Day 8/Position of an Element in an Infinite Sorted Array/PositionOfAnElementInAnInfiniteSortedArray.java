public class PositionOfAnElementInAnInfiniteSortedArray {
    public static void main(String[] args){
        int[] arr = {};
        int target = 10;
        System.out.println(ans(arr, target));
    }

    static int ans(int[] arr, int target){
        //first find the range - start with chunk size 2
        int start=0;
        int end=1;

        //condition for the target to lie in range
        while(target > arr[end]){
            int newStart = end+1; // new start
            end = end + (end - start + 1) * 2; //double the size; end= previous_end + size_of_previous_chunk * 2
            start=newStart;
        }

        return binarySearch(arr, target, start, end);

    }

    static int binarySearch(int[] arr, int target, int start, int end){
        while(start<=end){
            int mid = start + (end - start) / 2;
            if(target > arr[mid]){
                start=mid+1;
            }else if(target < arr[mid]){
                end = mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
