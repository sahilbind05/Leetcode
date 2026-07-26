class Solution {
    public int maximumProduct(int[] nums) {
    int max =Integer.MIN_VALUE;
    int secMax =Integer.MIN_VALUE;
    int lstMax =Integer.MIN_VALUE;

    int min1 =Integer.MAX_VALUE;
    int min2= Integer.MAX_VALUE;


    for (int temp : nums) {
        if(temp>max){
            lstMax = secMax;
            secMax =max;
            max =temp;
        }else if(temp<=max && temp >secMax){
            lstMax = secMax;
            secMax =temp;
        }else if (temp > lstMax) {
            lstMax = temp;
        }

        if (temp < min1) {
                min2 = min1;
                min1 = temp;
        } else if (temp < min2) {
                min2 = temp;
            }
        }
    
    int ans = Math.max(max*secMax*lstMax,max*min1*min2);
       return ans;
    }
}