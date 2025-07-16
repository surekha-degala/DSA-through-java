class Solution {
    public  int countNumbers(int n) {
        // code here
        int count =0; 
        for (int i =0; i<=n;i++) {
            if (countdivisors(i) == 9) {
                count++;
            }
        }
        
        return count;
    }
    
    private int countdivisors(int num) {
        int count = 0;
        for (int i =1; i<=Math.sqrt(num); i++) {
            if (num %i ==0) {
                if (num / i == i) {
                    count++;
                } else {
                    count +=2;
                }
            }
            
        }
        return count;
    }
}
