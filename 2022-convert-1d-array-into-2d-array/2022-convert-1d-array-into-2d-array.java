class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int [][] numArr= new int[m][n];

        if (m*n!=original.length){
            return new int[0][0];
        }
        
        int i = 0;
        while(i<m){
            int j = 0;
            while(j<n){
                numArr[i][j]= original[i*n+j];
                j++;
            }
            i++;
        }
       return numArr;     
    }
   
}