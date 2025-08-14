class Solution {
    public int coinChange(int[] coins, int amount) {
        List<Integer> list = new ArrayList<>();
        int n = coins.length;

        // loop from largest to smallest
        for (int i = n - 1; i >= 0; i--) {
            while (amount >= coins[i]) {
                amount -= coins[i];
                list.add(coins[i]);
            }
        }

        // print the coins used
        for (int coin : list) {
            System.out.println(coin);
        }

        return list.size(); // total number of coins used
    }
}
