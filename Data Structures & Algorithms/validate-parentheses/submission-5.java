class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        char[] sArray = s.toCharArray();
        for(char ch:sArray){
            if(ch=='[' || ch=='(' || ch=='{'){
                stack.push(ch);
            } else {
                if(stack.size()==0) return false; 
                if(ch==']' && stack.pop()!='[') return false;
                if(ch==')' && stack.pop()!='(') return false;
                if(ch=='}' && stack.pop()!='{') return false;
            }
        }
        return stack.isEmpty();
    }
}
