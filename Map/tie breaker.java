// User function Template for Java

class Solution {
    public static String TieBreak(String arr[]) {
        // Your code here
        HashMap<String , Integer> map = new HashMap<>();
        for (String c: arr) {
            map.put(c,map.getOrDefault(c,0)+1);   
        }
        String w = "";
        int max =0;
        for(Map.Entry< String, Integer> e:map.entrySet()) {
            if (e.getValue()> max) {
                max = e.getValue();
                w = e.getKey();
            } else if (e.getValue() == max) {
                if (e.getKey().compareTo(w) <0) {
                    w = e.getKey();
                }
            }
        }
        return w;
        }
    }
