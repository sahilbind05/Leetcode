class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int [] min = new int[n];

        min[n-1]=nums[n-1];

        // Smaalest value from every idx
        for(int i = n-2; i>=0; i--){
            min[i]= Math.min(min[i+1],nums[i]);
        }

        int max = 0;

        //largest values
        for(int j =0; j<n; j++){
            max = Math.max(max,nums[j]);
            
            int temp = max-min[j];

            if(temp <= k){
                return j;
            }
        }

        return -1;
    }
}