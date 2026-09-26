class Solution {
    public int shipWithinDays(int[] weights, int days) {

        int low =0;
        int high =0;
        for(int weight:weights){
            low = Math.max(low, weight);
            high += weight;
        }
        int ans = high;

        while(low<=high){
            int capacity = low + (high - low)/2;

            int requriedDays = 1;
            int currWeight = 0;

            for(int weight:weights){
                if(currWeight + weight > capacity){
                    requriedDays++;
                    currWeight = 0;
                }

                currWeight += weight;
            }

            if(requriedDays <= days){
                ans = capacity;
                high = capacity -1;
            }else{
                low = capacity +1;
            }
        }
        return ans;
    }
}