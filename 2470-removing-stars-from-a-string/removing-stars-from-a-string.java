class Solution {
    public String removeStars(String s){ 
        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()){
            if(ch == '*'){
                stack.pop();
            }else{
                stack.push(ch);
            }
        }
        StringBuilder str = new StringBuilder();
        for(char ch: stack){
            str.append(ch);
        }
        return str.toString();
    }
}