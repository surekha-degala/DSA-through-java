class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }else {
                set.add(num);
            }
        }
        return false;
    }
}
//using maps

class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i =0; i<n;i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        for (int num : nums) {
            if (map.get(num)>=2) {
                return true;
            }
        }
        return false;
     }
}

