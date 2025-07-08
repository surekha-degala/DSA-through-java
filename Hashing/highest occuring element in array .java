class Solution {
    public int mostFrequentElement(int[] nums) {
        Map<Integer , Integer> fmap = new HashMap<>();
        for (int num : nums) {
            fmap.put(num , fmap.getOrDefault(num,0)+1);
        }
        int maxfreq = 0;
        int ans = Integer.MAX_VALUE;
        for(Map.Entry <Integer, Integer> entry : fmap.entrySet()) {
            int ele = entry.getKey();
            int count = entry.getValue();

            if (count > maxfreq) {
                maxfreq = count;
                ans = ele;
            }
            else if (count == maxfreq) {
                ans = Math.min(ele, ans);

            }

        }
        return ans;
    }
}


