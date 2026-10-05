class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        int res = 0;
        for(char ch : s.toCharArray()) {
            if(ch == '(') {
                stack.push(res);
                res = 0;
            }
            else {
                res = stack.pop()+Math.max(res*2,1);
            }
        }
        return res;
    }
}