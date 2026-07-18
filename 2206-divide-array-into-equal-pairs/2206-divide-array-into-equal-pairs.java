class Solution {
    public boolean divideArray(int[] nums) {
        Arrays.sort(nums);

        if(nums.length-1 % 2==0){
            return false;
        }
        else{
            int i=0;
            int j=1;
            while(j<nums.length){
            if(nums[i]!=nums[j]){
                return false;
            }
            else {
                i+=2;
                j+=2;
            }
        }
        }
        return true;
    }
}