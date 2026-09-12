class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int ans =0 ;


        for(int fruit :fruits){

            boolean placed = false;

            for(int j=0; j<baskets.length; j++){
                if(fruit<=baskets[j]){
                    baskets[j] =-1;
                    placed = true;
                    break;
                }
            }
            if(!placed){
                ans++;
            }
        }
        return ans;
    }
}