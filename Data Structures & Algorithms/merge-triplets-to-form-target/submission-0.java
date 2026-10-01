class Solution {
    public boolean mergeTriplets(int[][] triplets, int[] target) {

        int merged[] = {0,0,0};

        for(int[] t:triplets){

            if(t[0]>target[0] || t[1]>target[1] || t[2]>target[2]){
                continue;
            }    
    

        merged[0] = Math.max(merged[0],t[0]);
        merged[1] = Math.max(merged[1],t[1]);
        merged[2] = Math.max(merged[2],t[2]);

        }

        return merged[0] == target[0]
            && merged[1] == target[1]
            && merged[2] == target[2];
    }
}
