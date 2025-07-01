class Solution {
    public ArrayList<Integer> frequencyCount(int[] arr) {
        // code here
        // List<Integer> res = new ArrayList<>();
        HashMap<Integer, Integer> fmap = new HashMap<>();
        // List<Integer> li = new ArrayList<>();
        
        for ( int num : arr) {
            fmap.put(num, fmap.getOrDefault(num, 0)+1);
        }
                LinkedHashSet<Integer> li = new LinkedHashSet<>();
                for ( int num : arr) {
                    li.add(num);
                }
                
                List<Integer> res = new ArrayList<>();
                for ( int ele : li) {
                    res.add(fmap.get(ele));
                }
        return new ArrayList<>(res);
    }
}
