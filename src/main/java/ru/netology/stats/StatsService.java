package ru.netology.stats;

public class StatsService {

    public int allSalesMonthSum(int[] sales) {
        int salesAllMonth = 0;
        for (int sum : sales) {
            salesAllMonth += sum;
        }
        return salesAllMonth;
    }

    public int allSalesMonthSumAverage(int[] sales) {
        int salesAllMonth = allSalesMonthSum(sales);

        int salesAllMonthAverage = salesAllMonth / sales.length;

        return salesAllMonthAverage;
    }

    public int minSalesMonth(int[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int maxSalesMonths(int[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int quantityMonthSaleLowAverage(int[] sales) {
        int salesAllMonthAverage = allSalesMonthSumAverage(sales);
        int quantityMonth = 0;
        for (int saleEachMonth : sales) {
            if (saleEachMonth < salesAllMonthAverage) {
                quantityMonth++;
            }
        }
        return quantityMonth;

    }

    public int quantityMonthSaleHighAverage(int[] sales) {
        int salesAllMonthAverage = allSalesMonthSumAverage(sales);
        int quantityMonth = 0;
        for (int saleEachMonth : sales) {
            if (saleEachMonth > salesAllMonthAverage) {
                quantityMonth++;
            }
        }
        return quantityMonth;
    }

    public int[] maxSalesMonthsVarTwo(int[] sales) {
        int maxSumMonth = sales[0];
        int quantityMonth = 1;

        for (int i = 1; i < sales.length; i++) {
            if (sales[i] > maxSumMonth) {
                maxSumMonth = sales[i];
                quantityMonth = 1;
            } else if (sales[i] == maxSumMonth) {
                quantityMonth++;
            }
        }

        int[] resMaxSumMonth = new int[quantityMonth];
        int resNumberMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] == maxSumMonth) {
                resMaxSumMonth[resNumberMonth] = i + 1;
                resNumberMonth++;
            }
        }
        return resMaxSumMonth;
    }
}
