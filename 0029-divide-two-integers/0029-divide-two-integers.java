class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend== Integer.MIN_VALUE && divisor == -1){
            return Integer.MAX_VALUE;
        }
        boolean isNegetive = (dividend<0)^(divisor<0);
        
        long div = Math.abs((long)dividend) ;
        long dvs = Math.abs((long)divisor);

        int result = 0;
        while(div >= dvs){
            long temp = dvs ;
            int mul = 1;

            while(div >= (temp << 1)){
                temp <<= 1;
                mul <<= 1;
            }
            div -= temp;
            result += mul;
        }
        return isNegetive ? - result : result ;
    } 
}