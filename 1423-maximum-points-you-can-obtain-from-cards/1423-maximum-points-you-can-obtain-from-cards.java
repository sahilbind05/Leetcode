class Solution {
    public int maxScore(int[] arr, int k) {
        int total =0;
        for(int num : arr){
            total += num;
        }
        
        int n = arr.length-k;
        int currSum =0;
        for(int i =0; i<n ;i++){
            currSum+=arr[i];
        }
        int ans= currSum;

        for(int i=n; i<arr.length;i++){
            currSum +=arr[i];
            currSum -= arr[i-n];
            ans = Math.min(ans,currSum);
        }

        ans = total-ans;
        
        return ans;
    }
}