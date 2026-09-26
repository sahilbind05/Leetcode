class Solution {
    public int[] productExceptSelf(int[] nums) {
        int total =1;
        int zero  =0 ;
        for(int num : nums){
            if(num == 0){
                zero++;
            }else
            total *=num;
        }
        int [] ans = new int[nums.length];
        for(int i=0; i<nums.length;i++){
            if(zero >1){
                ans[i]=0;
            }
            else if(zero ==1){
                if(nums[i]== 0){
                    ans[i]=total;
                }else{
                    ans[i]=0;
                }
            }
           else {
            ans[i] = total / nums[i];
           }
        }

        return ans;
    }
}