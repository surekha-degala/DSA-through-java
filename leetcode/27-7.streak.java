class Solution {
    public int countHillValley(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(nums[0]);
        for (int i =1; i<nums.length; i++) {
            if (nums[i]!= nums[i-1]) {
                list.add(nums[i]);
            }
        }
        int count =0;
        
        for (int i =1; i<list.size()-1;i++) {
            if (list.get(i)> list.get(i-1) && list.get(i) > list.get(i+1)){
                count++;   
            }
            if (list.get(i)< list.get(i +1) && list.get(i)< list.get(i-1)) {
                count++;
            }
        }
    return count;
}
} 


//optimal solution 
class Solution {
    public int countHillValley(int[] nums) {
        int count = 0;
        int n = nums.length;

        for (int i = 1; i < n - 1; i++) {
            // Skip if nums[i] is same as previous
            if (nums[i] == nums[i - 1]) continue;

            // Find the next different element after i
            int j = i + 1;
            while (j < n && nums[j] == nums[i]) j++;

            if (j == n) break; // No next distinct element

            // Check if it's a hill or valley
            if ((nums[i] > nums[i - 1] && nums[i] > nums[j]) ||
                (nums[i] < nums[i - 1] && nums[i] < nums[j])) {
                count++;
            }
        }

        return count;
    }
}
