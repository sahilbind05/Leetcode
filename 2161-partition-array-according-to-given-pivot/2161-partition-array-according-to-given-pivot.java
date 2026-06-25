class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] ans = new int[nums.length];
        int left = 0;
        int right = nums.length-1;

        for(int i=0; i<nums.length; i++){
            if(nums[i]<pivot){
                ans[left]= nums[i];
                left++;
            }
        }
        for (int i=nums.length-1; i>=0; i--){
            if(nums[i]>pivot){
            ans[right]= nums[i];
            right--;
            }
        }


        while(left<=right){
            ans[left]=pivot;
            left++;
        }
        return ans;
    }
}