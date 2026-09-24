class Solution {
    public int smallestIndex(int[] nums) {
        
        for(int i=0; i<nums.length;i++){
            int temp = nums[i];
            int sum =0;
            while(temp>0){
                int k = temp%10;
                temp =temp/10;
                sum += k;
            }
            if(sum==i){
                return i;
            }else{
                sum =0;
            }

        }
        return -1;
    }
}