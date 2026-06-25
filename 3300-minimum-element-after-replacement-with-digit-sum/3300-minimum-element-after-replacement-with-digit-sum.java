class Solution {
    public int minElement(int[] nums) {
        
        int ans = Integer.MAX_VALUE;

        for(int num:nums){
            int sum = getSumDigit(num);
            ans = Math.min(sum,ans);
        }
        return ans;
    }
    public int getSumDigit(int num){
        int sum = 0;
        while(num>0){
            sum += num%10;
            num=num/10;
        }
        return sum;
    }
}