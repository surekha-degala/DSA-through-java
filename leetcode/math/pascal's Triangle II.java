class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        long val = 1;
        for (int k = 0; k<=rowIndex;k++) {
            list.add((int)val);
            val = val * (rowIndex-k)/(k+1);
        }
        return list;
    }
}
