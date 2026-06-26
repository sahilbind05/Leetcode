class Solution {
    public int digitFrequencyScore(int n) {
        int ans = 0;
        
        while(n!=0){
            int temp = n%10;
            n=n/10;
            ans = ans + temp;
        }
        return ans;
    }
}