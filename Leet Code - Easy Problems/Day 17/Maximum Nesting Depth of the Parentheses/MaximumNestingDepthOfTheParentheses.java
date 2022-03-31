public class MaximumNestingDepthOfTheParentheses {
    public int maxDepth(String s) {
        int counter=0, max=0;
        for(int i=0; i< s.length(); i++){
            if(s.charAt(i) == '('){
                counter++;
            }else if(s.charAt(i) == ')'){
                counter--;
            }
            
            max = Math.max(count, max);
        }
        return max;
    }
}


/**
 * 
        if(s.length() == 0) {
            return 0;
        }
        Stack<Character> charStack = new Stack<>();
        int counter=0, max=0;
        for(char c : s.toCharArray()){
            if(c == '('){
                charStack.push(c);
                counter++;
            }else if(!charStack.isEmpty() && c == ')'){
                charStack.pop();
                counter--;
            }
            if(counter > max){
                max=counter;
            }
        }
        return max;
 */