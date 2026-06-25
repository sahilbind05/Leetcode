class Solution {
    public int numberOfSpecialChars(String word) {
        int lower[] = new int[26];
        int upper[] = new int[26];
        Arrays.fill(lower, -1);
        Arrays.fill(upper, -1);
        for(int i=0; i<word.length(); i++){
    char ch = word.charAt(i);

    if(ch>='a' && ch<='z'){
            lower[ch-'a'] = i;
    }
    else{
        if(upper[ch-'A']==-1)
            upper[ch-'A'] = i;
    }
}
        int count=0;
        for(int j=0; j<26 ;j++){
            if(lower[j] != -1 && upper[j] != -1 &&upper[j]>lower[j]){
                count++;
            }                                
        }
        return count;
    }
}