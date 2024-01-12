class Solution {
    public int firstMissingPositive(int[] arr) {
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1; //correct position of element currently present at index i
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct]){
                swap(arr, i, correct);
            }else{
                i++;
            }
        
        }

        for (int index = 0; index < arr.length; index++) {
            if(arr[index] != index + 1){
                return index+1;
            }
        }
        return arr.length + 1;
    }

    
    void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}