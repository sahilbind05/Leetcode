class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        
        int i =nums.length-1;
        int cnt =1;

        while(i>0){
            if (nums[i] != nums[i - 1]) {
                cnt++;

                if (cnt == 3) {
                    return nums[i - 1];
                }
            }
        i--;    
        }
        return nums[nums.length - 1];
    }
}