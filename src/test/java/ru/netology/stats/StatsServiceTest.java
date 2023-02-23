package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldFindAllMonthSalesSum() {
        StatsService service = new StatsService();
        int[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSumSales = 180;
        int actualSumSales = service.allSalesMonthSum(months);

        Assertions.assertEquals(expectedSumSales, actualSumSales);
    }

    @Test
    public void shouldFindAllMonthSalesSumAverage() {
        StatsService service = new StatsService();
        int[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSalesSumAverage = 15;
        int actualSalesSumAverage = service.allSalesMonthSumAverage(months);

        Assertions.assertEquals(expectedSalesSumAverage, actualSalesSumAverage);
    }

    @Test
    public void shouldFindMinMonthSales() {
        StatsService service = new StatsService();
        int[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedNumMonthMin = 9;
        int actualNumMonthMin = service.minSalesMonth(months);

        Assertions.assertEquals(expectedNumMonthMin, actualNumMonthMin);
    }

    @Test
    public void shouldFindMaxMonthSales() {
        StatsService service = new StatsService();
        int[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedNumMonthMax = 8;
        int actualNumMonthMax = service.maxSalesMonths(months);

        Assertions.assertEquals(expectedNumMonthMax, actualNumMonthMax);
    }

    @Test
    public void shouldFindQuantityMonthSaleLowAverage() {
        StatsService service = new StatsService();
        int[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedQuantityMonthLowAverage = 5;
        int actualQuantityMonthLowAverage = service.quantityMonthSaleLowAverage(months);

        Assertions.assertEquals(expectedQuantityMonthLowAverage, actualQuantityMonthLowAverage);
    }

    @Test
    public void shouldFindQuantityMonthSaleHighAverage() {
        StatsService service = new StatsService();
        int[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedQuantityMonthHighAverage = 5;
        int actualQuantityMonthHighAverage = service.quantityMonthSaleHighAverage(months);

        Assertions.assertEquals(expectedQuantityMonthHighAverage, actualQuantityMonthHighAverage);
    }

    @Test
    public void shouldFindMaxMonthSalesVarTwo() {
        StatsService service = new StatsService();
        int[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int[] expectedNumMonthMaxVarTwo = {6, 8};
        int[] actualNumMonthMaxVarTwo = service.maxSalesMonthsVarTwo(months);

        Assertions.assertArrayEquals(expectedNumMonthMaxVarTwo, actualNumMonthMaxVarTwo);
    }

}
