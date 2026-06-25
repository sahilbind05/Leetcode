class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int bestLand = Integer.MAX_VALUE;
        int bestWater = Integer.MAX_VALUE;
        int ans= Integer.MAX_VALUE;
        //for best land first
        for(int i=0;i<landStartTime.length;i++){
            bestLand=Math.min(bestLand,landStartTime[i]+landDuration[i]);
        } //water After land
        for(int i=0;i<waterStartTime.length;i++){
            int curr = Math.max(bestLand,waterStartTime[i])+waterDuration[i];
            ans=Math.min(ans,curr);
        }
        // Best water first
        for(int i=0; i<waterStartTime.length;i++){
            bestWater=Math.min(bestWater,waterStartTime[i]+waterDuration[i]);
        }// land after water
        for(int i=0;i<landStartTime.length;i++){
            int curr = Math.max(bestWater,landStartTime[i])+landDuration[i];
            ans=Math.min(ans,curr);
        }

    return ans;
    }
}