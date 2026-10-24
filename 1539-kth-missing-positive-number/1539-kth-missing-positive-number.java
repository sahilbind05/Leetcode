class Solution {
    public int findKthPositive(int[] arr, int k) {
        int i=0;
        int j=1;
        int ans =1;
        while(i<arr.length || k>=1){
            if(i<arr.length && j==arr[i]){
                j++;
                i++;
            }else {
                j++;
                k--;
            }
            if(k==1){
                ans=j;
            }
        }
        return ans;
    }
}