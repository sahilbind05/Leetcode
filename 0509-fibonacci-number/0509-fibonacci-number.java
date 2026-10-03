class Solution {
    public int fib(int n) {
        if(n<=1){
            return n;
        }
        int fst =1;
        int sec =0;
        
        for(int i=2; i<=n; i++){
            int curr= fst+sec;

            sec=fst;
            fst=curr;
        }

        
        return fst;
    }
}