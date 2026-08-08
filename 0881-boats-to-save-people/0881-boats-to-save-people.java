class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);

        int ans =0;
        int i = 0; //lightest person
        int j =people.length-1; //haviest  person

        while(i<=j){ 
            if(people[i]+people[j] <= limit){
                i++;
            }
            j--;
            ans++;
        }

        return ans;
    }
}