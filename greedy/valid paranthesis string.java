class Solution {
    public boolean checkValidString(String s) {
        return isValid(s, 0 , 0);
    }

    boolean isValid(String s, int index, int count) {
        if (count <0) return false;
        if (index == s.length()) {
            return count ==0;

        }
        char ch = s.charAt(index);
        if (ch == '(') {
            return isValid(s, index+1, count+1);
        }
        if (ch == ')' ) {
            return isValid(s, index+1, count-1);
        }
        return isValid(s, index+1, count + 1) 
        || isValid(s, index+1, count -1 ) 
        || isValid(s, index+1, count); 
    }
}
// this will exceed the time limit
