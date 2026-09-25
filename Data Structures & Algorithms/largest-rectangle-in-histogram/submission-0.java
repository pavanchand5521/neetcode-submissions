class Solution {
    public int largestRectangleArea(int[] heights) {

        Stack<Integer> stack = new Stack<>();

        int maxArea = 0;

        for(int i=0;i<=heights.length;i++){

            int currheight;

            if(i==heights.length){
                currheight = 0;// to take every bar we use imaginary value 0 
            }else{
                currheight = heights[i];
            }

            while(!stack.isEmpty() && heights[stack.peek()] > currheight){

                int height = heights[stack.pop()];

                int width;

                if(stack.isEmpty()){
                    width = i;
                }else{
                    width = i - stack.peek() -  1;
                }

                int area = height * width;
                maxArea = Math.max(maxArea,area);
            }

            stack.push(i);
        }

        return maxArea;
        
    }
}
