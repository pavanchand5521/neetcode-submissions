class Solution {
    public int characterReplacement(String s, int k) {

        int left = 0;
        int maxFreq =0;
        int maxLen =0;

        int count[] = new int[26];
        for(int right=0;right<s.length();right++){
            int index = s.charAt(right) - 'A';
            count[index]++;

            maxFreq = Math.max(maxFreq,count[index]);

            while((right - left + 1) - maxFreq > k){
                count[s.charAt(left) - 'A']--;
                left++;
            }

            maxLen = Math.max(maxLen,right - left +1);
        }
        return maxLen;
    }
}
