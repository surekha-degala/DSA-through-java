class Solution {
    public String largestGoodInteger(String num) {
     String[] numbers={"999","888","777","666","555","444","333","222","111","000"};
     for(String i:numbers){
        if(num.contains(i)){
            return i;
        }
     }
     return "";

    }
}


class Solution {
    public String largestGoodInteger(String num) {
            String max = "";
        for (int i = 0; i<num.length() -2; i++) {
            char ch = num.charAt(i);
            char a = num.charAt(i);
            char b = num.charAt(i+1);
            char c = num.charAt(i+2);
            if (a == b && b == c) {
            String triple = "" + a +b +c;
            if (max.equals("") || triple.compareTo(max) >0) {
                max = triple;
            }
            }
        }
        return max;
    }
}
