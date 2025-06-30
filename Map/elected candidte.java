// User function Template for Java

class Solution {
    public static String electionWinner(String arr[]) {
        // Your code her
        HashMap<String, Integer> vc = new HashMap<>();
        for ( String c : arr) {
            vc.put(c, vc.getOrDefault(c,0)+1);
        }
        String w = "";
        int max =0;
        for(Map.Entry<String, Integer> e : vc.entrySet()) {
            if (e.getValue() > max) {
                max = e.getValue();
                w = e.getKey();
            }
        }
        return w;
        }
    }
