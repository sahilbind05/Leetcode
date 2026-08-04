class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        int min = nums[0];
        int i =0;

        while(i<nums.length){
            if(min+i == nums[i]){
                i++;
            }else {
                ans.add(min+i);
                    min++;
            }
        }
        return ans ;
    }
}