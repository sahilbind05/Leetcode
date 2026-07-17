class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int sml = nums[0];
        int lar = nums[nums.length-1];
        int i =nums[0];
        int ans =0;
        while(i>0){
            if(sml%i == 0 && lar%i==0){
                ans = i ;
                break;
            }else{
                i--;
            }
        }
       return ans;
    }
}