class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet();

        for(int num1 :nums1){
            for(int num2:nums2){
                if(num1==num2){
                    if(!set.contains(num1)){
                        set.add(num1);
                    }
                }
            }
        }
        int[] res = new int[set.size()];
        int i = 0;

        for (int n : set) {
            res[i++] = n;
        }
        
        //return set.stream().mapToInt(Integer::intValue).toArray();
        return res;
    }
}