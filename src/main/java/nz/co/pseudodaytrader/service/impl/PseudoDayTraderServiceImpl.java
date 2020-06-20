package nz.co.pseudodaytrader.service.impl;

import nz.co.pseudodaytrader.service.PseudoDayTraderService;

import java.util.Arrays;

/**
 * The implementation of {@link PseudoDayTraderService}.
 *
 * @author Rey Vincent Babilonia
 */
public class PseudoDayTraderServiceImpl
        implements PseudoDayTraderService {

    @Override
    public int getMaxProfit(int[] stockPrices) {
        int maxProfit = 0;

        if (stockPrices == null) {
            return maxProfit;
        }

        for (int i = 0; i < stockPrices.length - 1; i++) {
            maxProfit = getMaxProfit(maxProfit, i, i + 1, stockPrices);
        }

        return maxProfit;
    }

    private int getMaxProfit(int max, int index, int secondaryIndex, int[] stockPrices) {
        if (secondaryIndex == stockPrices.length) {
            return max;
        }

        int difference = stockPrices[secondaryIndex] - stockPrices[index];
        if (difference > max) {
            max = difference;
        }

        return getMaxProfit(max, index, ++secondaryIndex, stockPrices);
    }
}
