class Solution {
    public int[] transformArray(int[] nums) {
        int[] arr = new int[nums.length];

        int i =0;
        int j=nums.length-1;
        int k=0;

        while(i<nums.length){
            if(nums[i]%2==0){
                arr[k]=0;
                k++;
                i++;
            }else{
                arr[j]=1;
                i++;
                j--;
            }
        }
        return arr;
    }
}