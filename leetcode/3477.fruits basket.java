class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int count = 0; 
        int n = fruits.length;
        for (int i = 0; i<n;i++)  {
            for (int j = 0; j<n;j++) {
                if (fruits[i] <= baskets[j] ) {
                    count++;
                    baskets[j] =0;
                    break;
                }
            }
        }
        return fruits.length - count;
    }
}

//class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n = fruits.length;
        boolean [] used = new boolean [n];
        int unplaced = 0;
        for (int i = 0; i<n;i++) {
            boolean placed = false;
            for (int j = 0; j <n;j++){
                if (!used[j] && baskets [j] >= fruits[i]) {
                    used[j]= true;
                    placed = true;
                    break;
                }
            }
            if(!placed) {
                unplaced++;
            }
        } 
        return unplaced;
    }
}
