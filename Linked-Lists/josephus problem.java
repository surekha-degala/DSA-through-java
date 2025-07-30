class Solution {
    public int josephus(int n, int k) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        int curr = 0; 
        int index = 0;
        for (int i = 1; i<=n;i++) {
            res.add(i);
        }
        while (res.size() >1) {
            index = (curr + k -1) % res.size();
            curr = index;
            res.remove(index);
        }
        return res.get(0);
             
    }
}
