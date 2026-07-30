class Solution {
    public String decodeString(String s) {
        Stack<Integer> count = new Stack<>();
        Stack<StringBuilder> stack = new Stack<>();

        StringBuilder str = new StringBuilder();
        int digit = 0;

        for(char ch: s.toCharArray()){
            if(Character.isDigit(ch)){
                digit= digit * 10 + (ch-'0');
            }
            else if(ch == '['){
                count.push(digit);
                stack.push(str);
                str = new StringBuilder();
                digit = 0;

            }
            else if(ch ==']'){
                int num = count.pop();
                StringBuilder newstr = stack.pop();

                while(num > 0){
                    newstr.append(str);
                    num--;
                }
                str = newstr;
            }
            else{
                str.append(ch);
            }
        }
        return str.toString();

    }
}