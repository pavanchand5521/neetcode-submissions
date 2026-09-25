class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        HashSet<Integer> set = new HashSet<>();

        for(int right=0;right<nums.length;right++){
            if(set.contains(nums[right])){
                return true;
            }

            set.add(nums[right]);
            while(set.size()>k){
                set.remove(nums[right - k]);
            }
        }
        return false;
    }
}