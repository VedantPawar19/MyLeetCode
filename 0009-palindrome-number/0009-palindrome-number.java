class Solution {
    public boolean isPalindrome(int x) {
        return x < 0? false : reverse(x) == x;
    }
    
    int reverse(int num){
        int ans = 0;
        while(num != 0){
            int rem = num % 10;
            ans = ans * 10 + rem;
            num /= 10;
        }
        return ans;
    }
}