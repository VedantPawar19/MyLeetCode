class Solution {
    public int largestAltitude(int[] gain) {
        int[] altitude = altitude(gain);
        int ans = max(altitude);
        return ans;
    }

    int[] altitude(int[] gain){
        int[] altitude = new int[gain.length + 1];
        altitude[0] = 0;
        for (int i = 0; i < gain.length; i++) {
            altitude[i+1] = altitude[i] + gain[i];
        }
        return altitude;
    }

    int max(int[] arr){
        int max = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}