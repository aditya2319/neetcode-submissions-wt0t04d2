class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        for (String op: operations){
            if (op.equals("+")){
                int top = stack.pop(); //get the first element
                int newTop = top + stack.peek();
                stack.push(top);
                stack.push(newTop);
            }
            else if(op.equals("C")){ //remove the last added element
                stack.pop();
            }
            else if(op.equals("D")){ 
                 // get the top element
                int twice = 2 * stack.peek(); // double it
                
                stack.push(twice); // push back into the stack
            }
            else{
                stack.push(Integer.parseInt(op)); // parse it as a int and push it
            }
        }
        int sum =0;
        while(!stack.isEmpty()){
            sum += stack.pop(); //add every element that is being poped into the sum
        }
        return sum;
        
    }
}