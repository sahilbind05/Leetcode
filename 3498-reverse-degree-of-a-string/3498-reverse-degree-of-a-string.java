class Solution {
    public int reverseDegree(String s) {
        char [] arr = s.toCharArray();
        int ans =0;
        for(int i=0; i<arr.length; i++){
            ans+= ('z' - arr[i] +1)*(i+1);
        }
        return ans;
    }
}