class Solution {
    public int mySqrt(int x) {

        int low = 0;
        int high = x;
        int ans = 0;

        if(x<2){
            return x;
        }

        while(low<=high){
            int mid = low + (high - low)/2;
            if(mid <= x/mid){
                ans = mid;
                low = mid +1;
            }else{
                high = mid -1;
            }
        }
        return ans;
    }
}