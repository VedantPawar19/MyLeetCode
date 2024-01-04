class Solution {
    public int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        if(target==nums[0]){
            return 0;
        }else if(target<=nums[0]){
            return binarysearch(nums, target, pivot+1, nums.length-1); 
        }else{
            return binarysearch(nums, target, 0, pivot);
        }
    }
    
    int findPivot(int[] arr){
        int start = 0;
        int end = arr.length -1;

        while(start<end){
            int mid = start + (end-start)/2;
            if(arr[mid]>arr[mid+1]){
                return mid;
            }

            if(arr[mid] >= arr[0]){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }
    
    int binarysearch(int[] arr, int target, int start, int end){
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]>target){
                end = mid-1;
            }else if(arr[mid]<target){
                start = mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}