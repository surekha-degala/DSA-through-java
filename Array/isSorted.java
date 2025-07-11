class Solution {
    public boolean isSorted(ArrayList<Integer> nums) {
        //your code goes here
        for (int i =1; i<nums.size;i++) {
            if (nums[i]<nums[i-1] ) {
                return false;
            }
            
        }
        return true;
    }
}
