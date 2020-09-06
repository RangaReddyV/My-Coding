package LetCo.AugCha;

import java.util.ArrayList;

public class BestTimeToSellBuyAndSellStock {


    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int firsDayPrice = prices[0];
        for (int dayPrice =1; dayPrice < prices.length ; dayPrice++){
            if (firsDayPrice < prices[dayPrice])
                maxProfit = Math.max(maxProfit , prices[dayPrice] - firsDayPrice);
            else
                firsDayPrice = prices[dayPrice];
        }
        return  maxProfit;
    }

    public int maxProfit2(int[] prices){
        if (prices.length == 0) return  0;
        int maxProfit =0;
        int localMaxProfit = 0 ;
        int dayMin1 = Integer.MAX_VALUE;
        int dayMin2 = Integer.MAX_VALUE;
        for (int dayPrice =0; dayPrice < prices.length ; dayPrice++){
            dayMin1 = Math.min(dayMin1 , prices[dayPrice]);
            localMaxProfit = Math.max(localMaxProfit, prices[dayPrice]-dayMin1);
            dayMin2 = Math.min(dayMin2, prices[dayPrice] - localMaxProfit);
            maxProfit = Math.max(maxProfit, prices[dayPrice]-dayMin2);
        }
        return  maxProfit;
    }

    public static void main(String[] args) {
        BestTimeToSellBuyAndSellStock bestTimeToSellBuyAndSellStock = new BestTimeToSellBuyAndSellStock();
        System.out.println(bestTimeToSellBuyAndSellStock.maxProfit2(new int [] {7,1,5,3,6,4}));
        System.out.println(bestTimeToSellBuyAndSellStock.maxProfit2(new int [] {7,6,4,3,1}));
        System.out.println(bestTimeToSellBuyAndSellStock.maxProfit2(new int [] {1,2,3,4,5}));
    }
}
