class FindPeakElement {
    public int peakIndexInMountainArray(int[] arr) { // O(log(N)) solution
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            int mid=start + (end - start) / 2;
            if(arr[mid] > arr[mid+1]){ // Middle is in the descending part of array
                end=mid; //This may be the ans, but keep on checking on left side, that's why end != mid-1;
            }else if(arr[mid] < arr[mid+1]){ // Middle is in the ascending part of array
                start=mid + 1; //Because we know that mid+1 element is greater than mid element
            }
        }
        //In the end, start==end and will be pointing to the largest number
        return start;
    }
}


/*
1. O(n) Solution:-

    public int peakIndexInMountainArray(int[] arr) {
        int peak=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]){
                peak=i;
            }
        }
        return peak;
    }

*/