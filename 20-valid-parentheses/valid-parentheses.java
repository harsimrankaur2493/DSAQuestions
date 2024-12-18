class Solution {
    public boolean isValid(String s) {
        Stack<Character> test = new Stack<>(); 
        for(char it: s.toCharArray()){
            if(it=='(' || it=='{' || it=='['){
                test.push(it);
            }else{
                if(test.isEmpty()){
                    return false;
                }
                char top = test.pop();
                if(top=='(' && it==')' || top=='[' && it==']' || top=='{' && it=='}'){
                    continue;
                }else{
                    return false;
                }
            }
        }

        return test.isEmpty();
    }
}