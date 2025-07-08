class Solution {
    public List<List<Integer>> countFrequencies(int[] nums) {
        // Your code goes here
        HashMap<Integer, Integer> fmap = new HashMap<>();
        for (int num : nums ) {
            fmap.put(num , fmap.getOrDefault(num , 0) +1);
        }
        List <List<Integer>> end = new ArrayList<>();
       for( Map.Entry <Integer, Integer> entry : fmap.entrySet()) {
        List<Integer> res = new ArrayList<>();
        res.add(entry.getKey());
        res.add(entry.getValue());
        end.add(res);
       }
       return end;
    }
}
