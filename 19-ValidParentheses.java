class Solution {
    //TC - O(N)
    //SC - O(N)
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        if(s.length()%2!=0) return false;
        for(int i=0; i<s.length(); ++i){
            char c = s.charAt(i);
            if(c=='(') stack.push(')');
            else if(c=='{') stack.push('}');
            else if(c=='[') stack.push(']');
            else {
                if(stack.isEmpty() || c!=stack.pop()) return false;
            }
        }
        return stack.isEmpty();
    }
}
