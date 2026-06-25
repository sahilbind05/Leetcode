class Solution {
    public void swap(int[]nums ,int i, int j){
        int temp = nums[i];
        nums[i]= nums[j];
        nums[j]= temp;
    }
    public void sortColors(int[] nums) {
        int str = 0;
        int mid = 0;
        int end = nums.length-1;
        while(mid<=end){
            if(nums[mid]==0){
                swap(nums,mid,str);
                str++;
                mid++;
            }
            
            else if(nums[mid]==2){
                swap(nums,end,mid);
                end--;
            }
            else{
                mid++;
            }
            
        }
        
}
}