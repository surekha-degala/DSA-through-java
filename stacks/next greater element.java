class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] arr = new int [nums1.length];
        for(int i =0 ; i<nums1.length;i++) {
        int indexOfCopy = -1;
            for (int j = 0 ; j<nums2.length; j++) {
                if (nums2[j]== nums1[i]) {
                    indexOfCopy = j;
                    break;
                }

            }
            int nge = -1;
            for (int k = indexOfCopy+1; k<nums2.length;k++) {
                if (nums2[k] > nums1[i]) {
                    nge = nums2[k];
                    break;
                }
            }
            arr[i] = nge;
        }
        return arr;
    }
}
