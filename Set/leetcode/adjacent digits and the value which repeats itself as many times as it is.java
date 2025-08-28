class Solution {
    public String findValidPair(String s) {
        HashMap<Character, Integer > map = new HashMap<>();
        for (int i = 0; i<s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
            
        }

        for(int i = 0; i<s.length()-1;i++) {
            char c1 = s.charAt(i);
            char c2 = s.charAt(i+1);
            if(c1 != c2 &&
             (c1-'0') == map.get(c1)
             && (c2-'0'==map.get(c2))) {
                return ""+c1+c2;
            }
        }
        return "";
    }
}
