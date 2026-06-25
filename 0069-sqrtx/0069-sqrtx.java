class Solution {
    public int mySqrt(int x){
        if(x<2){
            return x;
        }
        int ans = 1;
        for(int i = 1; i<=x; i++){
            if(i <= x/i){
                ans = i;
            }
            else{
                break;
            }
        }
        return ans;
    }
}

