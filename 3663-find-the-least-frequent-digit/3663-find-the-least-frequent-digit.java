class Solution {
    public int getLeastFrequentDigit(int n) {
        int [] freq = new int[10];
        int min = Integer.MAX_VALUE;
        int ans =0;

        while(n>0){
            int num = n%10;
            freq[num]++;
            n /= 10; 
        }

        for(int i=0; i<10; i++){
            if(freq[i]>0 && freq[i]<min){
                min = freq[i];
                ans =i;
            }
        }

        return ans;
    }
}