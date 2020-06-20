package nz.co.pseudodaytrader.service;

/**
 * The pseudo-day trader service.
 *
 * @author Rey Vincent Babilonia
 */
public interface PseudoDayTraderService {

    /**
     * Returns the maximum profit between 2 stock prices. Assumes that stock prices are whole integers and not decimals.
     *
     * @param stockPrices the array of stock prices
     * @return the maximum profit between 2 stock prices
     */
    int getMaxProfit(int[] stockPrices);
}
