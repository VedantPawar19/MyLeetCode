class Solution {
    public int reverse(int x) {
        long reverseNum = 0;
        while(x!=0){
            int rem = x % 10;
            reverseNum = reverseNum * 10 + rem;
            x = x/10;
        }
        if(reverseNum < Math.pow(2, 31)-1 && reverseNum > Math.pow(-2, 31)){
            return (int)reverseNum;
        }else{
            return 0;
        }

    }
}