class Solution {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;  // go right
            } else {
                right = mid - 1; // go left
            }
        }
        
        return -1; // not found
    }
}

//recursive approach
class Solution {
    public int search(int[] nums, int target) {
        return bs(nums, target, 0, nums.length-1);
    }

    private int bs(int [] nums, int target, int left, int right) {
        if (left > right ) return -1;

        int mid = left + (right - left)/2; 
        if (nums[mid]== target ) return mid;
        else if (nums[mid] < target) {
            return bs(nums, target,  left +1, right);
        } else {
            return bs( nums,  target,  left,  right -1 );
        }
    }
}
