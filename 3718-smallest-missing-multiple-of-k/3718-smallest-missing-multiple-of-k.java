class Solution {
    public int missingMultiple(int[] nums, int k) {
        int multiple = k;
        while(true){
            boolean found=false;
            for(int num : nums){
                if(num==multiple){
                    multiple += k;
                    found=true;
                    break;
                }
            }
            if(found == false){
                return multiple;
            }
        }
        
    }
}