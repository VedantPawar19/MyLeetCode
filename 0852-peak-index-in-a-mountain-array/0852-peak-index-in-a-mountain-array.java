class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int mid = 0;
        int start = 0;
        int end = arr.length-1;

        while(start<end){
            mid = start + (end-start)/2;

            boolean IsAsc = arr[mid-1]<arr[mid] && arr[mid]<arr[mid+1];
            boolean IsEqual = arr[mid-1]<arr[mid] && arr[mid]>arr[mid+1];

            if(IsAsc){
                start = mid;
            }else if(IsEqual){
                return mid;
            }else{
                end = mid;
            }
        }

        return mid;
    }
}