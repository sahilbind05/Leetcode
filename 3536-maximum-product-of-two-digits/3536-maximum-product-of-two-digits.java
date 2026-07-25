class Solution {
    public int maxProduct(int n) {
        int larg =-1;
        int secLarg =-1;

        while(n >0){
            int temp = n%10;

        if (temp >= larg) {
                secLarg = larg;
                larg = temp;
            } else if (temp >= secLarg && temp != larg) {
                secLarg = temp;
            }
            
            n = n/10;
        }

        return larg*secLarg;
    }
}