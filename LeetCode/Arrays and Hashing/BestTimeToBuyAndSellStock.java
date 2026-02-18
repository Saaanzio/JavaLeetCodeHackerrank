
import java.util.HashMap;

public class BestTimeToBuyAndSellStock {
    public static int maxProfit(int[] prices) {
        int buy = 0, sell = 1, maxProfit = 0;
        while(sell < prices.length){
            if(prices[buy] < prices[sell]){
                int profit = prices[sell] - prices[buy];
                maxProfit = Math.max(profit, maxProfit);
            }
            else{
                //Comprar por um valor menor encontrado é melhor do que comprar por um valor maior
                buy = sell;
            }
            sell++;
        }
        return maxProfit;
    }
}
//public class BestTimeToBuyAndSellStock {
//    public static int maxProfit(int[] prices) {
//        int profit = 0;
//        for(int i = 0, j = prices.length - 1; i < prices.length - 1; j--){
//            if(prices[j] - prices[i] > profit){
//                profit = prices[j] - prices[i];
//            }
//            if(j <= i){
//                i++;
//                j = prices.length;
//            }
//        }
//        return profit;
//    }
//}
