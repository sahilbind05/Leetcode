class Solution {
    public int maxArea(int[] height) {
        int i=0 ;
        int j=height.length-1;
        int maxWat=0;
        while(i<j){
            int w =j-i;
            int ht= Math.min(height[i],height[j]);
            int ans=ht*w;
            maxWat= Math.max(maxWat,ans);
            

            if (height[i]<height[j]){
                i++;
            }else {j--;
            }
        }
        return maxWat;
    
        }
        
    }
