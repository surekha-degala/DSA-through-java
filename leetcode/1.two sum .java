class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i =0; i<n;i++) { 
            for (int j =i+1; j<n ; j++) {
            if ( target - nums[i] == nums[j]){

            return new int [] {i,j};
            }
        }
    }
    return new int [] {};
}
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>(); // value → index
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)) {
                return new int[] {map.get(diff), i};
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }
}
