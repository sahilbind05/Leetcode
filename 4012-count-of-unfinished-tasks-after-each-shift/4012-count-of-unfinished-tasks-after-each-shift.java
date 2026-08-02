class Solution {
    public int[] countTasks(int[] tasks, int[] shifts) {
        int n = tasks.length;
        int []ans = new int[shifts.length];

        long[]pre = new long[n+1];

        for(int i =0; i<n;i++){
            pre[i+1] = pre[i]+tasks[i];
        }
        long total = pre[n];
        long done=0;

        for(int i =0; i<shifts.length;i++){
            done += shifts[i];
            if(done>=total){
                ans[i]=0;
                done=0;
                continue;
            }
            int low =0;
            int high=n;
            while(low<high){
                int mid =low+(high-low)/2;
                if(pre[mid]<= done){
                    low = mid+1;
                }else
                    high =mid;
            }
            ans[i] =n-(low-1);
        }
        return ans;
    }
}