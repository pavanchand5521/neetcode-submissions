class Solution {
    public int calPoints(String[] operations) {

        Stack<Integer> stack = new Stack<>();

        for(String op:operations){
            if(op.equals("C")){
                stack.pop();
            }else if(op.equals("D")){
                int prev = stack.peek();
                stack.push(prev*2);
            }else if(op.equals("+")){
                int last = stack.pop();
                int secondLast = stack.peek();

                int sum = last + secondLast;
                stack.push(last);
                stack.push(sum);
            }else{
                int score = Integer.parseInt(op);
                stack.push(score);
            }
        }
        int total = 0;
        for(int score : stack){
            total +=score;
        }
        return total;
    }
}