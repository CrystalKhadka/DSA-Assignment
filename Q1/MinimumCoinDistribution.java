package Q1;

public class MinimumCoinDistribution {
    public static int minCoins(int[] rating) {
        int n = rating.length;
        int[] coins = new int[n];

        // Initialize coins array with count one
        for (int i = 0; i < n; i++) {
            coins[i] = 1;
        }

        // Assign more coins to rider with higher ratings from left to right
        for (int i = 1; i < n; i++) {
            if (rating[i] > rating[i - 1]) {
                coins[i] = coins[i - 1] + 1;
            }
        }

        // Assign more coins to rider with higher ratings from right to left
        for (int i = n - 2; i >= 0; i--) {
            if (rating[i] > rating[i + 1] && coins[i] <= coins[i + 1]) {
                coins[i] = coins[i + 1] + 1;
            }
        }

        // Calculate minimum number of coins required
        int minCoin = 0;
        for (int i = 0; i < n; i++) {
            minCoin += coins[i];
        }
        return minCoin;

    }

    public static void main(String[] args) {
        int[] ratings = { 1, 0, 2 };
        int result = minCoins(ratings);

        System.out.println(result);
    }

}
