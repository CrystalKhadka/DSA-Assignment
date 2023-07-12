package Q1;

public class MinimumCostClothing {

    public static int minCost(int[][] price) {
        int[][] dp = new int[3][3];

        for (int j = 0; j < 3; j++) {
            dp[0][j] = price[0][j];
        }

        for (int i = 1; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                dp[i][j] = price[i][j] + Math.min(dp[i - 1][(j + 1) % 3], dp[i - 1][(j + 2) % 3]);
            }
        }

        int minCost = Integer.MAX_VALUE;
        for (int j = 0; j < 3; j++) {
            minCost = Math.min(minCost, dp[2][j]);
        }

        return minCost;
    }

    public static void main(String[] args) {
        int[][] price = {
                { 14, 4, 11 },
                { 11, 14, 3 },
                { 14, 2, 10 }
        };
        int result = minCost(price);
        System.out.println(result);
    }
}