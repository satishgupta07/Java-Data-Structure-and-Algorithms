package Day1_Arrays;

public class BestTimetoBuyandSellStock {
    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }

    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxPro = -1;
        for(int i=0; i<prices.length; i++) {
            minPrice = Math.min(prices[i], minPrice);
            maxPro = Math.max(maxPro, prices[i]-minPrice);
        }
        return maxPro;
    }
}
