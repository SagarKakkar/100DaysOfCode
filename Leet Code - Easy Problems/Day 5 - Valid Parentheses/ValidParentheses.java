class ValidParentheses {
    public boolean isValid(String s) {
        /*
        String length check that would return false if the string has an odd length. 
        This avoids extraneous calculations.
        */
        if(s.length() % 2 == 1){
            return false;
        }
        /* 
        The basic idea is to push the right parentheses ')', ']', or '}' into the stack each time 
        when we encounter left ones. And if a right bracket appears in the string, 
        we need check if the stack is empty and also whether the top element is the 
        same with that right bracket. If not, the string is not a valid one. At last, 
        we also need check if the stack is empty.
        */
        Stack<Character> newStack = new Stack<Character>();
        for(char c : s.toCharArray()){
            if(c == '('){
                newStack.push(')');
            }else if(c == '['){
                newStack.push(']');
            }else if(c == '{'){
                newStack.push('}');
            }else if(newStack.isEmpty() || newStack.pop() != c){
                return false;
            }
        }
        return newStack.isEmpty();        
    }
}