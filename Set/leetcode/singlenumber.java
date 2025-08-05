class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int n = nums.length;
        for(int i =0; i<n;i++) {
            if (set.contains(nums[i])) {
                set.remove(nums[i]);
            } else {
            set.add(nums[i]);
            }
        }
        if (!set.isEmpty()) {
    return set.iterator().next();
        }
        return -1;
    }
}

//using map
class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;        
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0 ; i<n;i++) {
            map.put(nums[i] , map.getOrDefault(nums[i], 0)+1);
        }
        for (int num : nums) {
            if (map.get(num) == 1) {
                return num;
            }
        }
        return -1;
    }
}

