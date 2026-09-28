class Solution {
    public int maxDepth(String s) {
        // Stack<Character> stack = new Stack<>();
        // int maxDepth = 0;

        // for(int i=0; i<s.length(); i++){
        //     char ch = s.charAt(i);
        //     if(ch == '('){
        //         stack.push(ch);
        //         maxDepth = Math.max(maxDepth, stack.size());
        //     }else if(ch == ')'){
        //         stack.pop();
        //     }
        // }
        // return maxDepth;

        int maxDepth = 0;
        int currentDepth = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                currentDepth++; // track open bracket
                maxDepth = Math.max(maxDepth, currentDepth); // it keep max open bracket
            } else if (ch == ')') {
                currentDepth--; // when ch is closing bracket decrease currentDepth
            }
        }
        
        return maxDepth;
    }
}