class ValidParentheses {
    public boolean isValid(String s) {
        if(s.length() % 2 == 1){
            return false;
        }
        
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