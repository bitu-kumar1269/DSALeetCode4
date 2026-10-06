class Solution {
    public int minAddToMakeValid(String s) {
        int countOpen = 0;
        int addNeed = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '(') countOpen++;
            else {
                if(countOpen > 0){
                    countOpen--;
                }else{
                    addNeed++;
                }
            }
        }
        return addNeed + countOpen;

    }
}