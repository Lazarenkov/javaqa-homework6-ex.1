package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class StatsServiceTest {

    @Test
    public void shouldSumAllSales() {
        StatsService service = new StatsService();
        long sales[] = {1, 2, 3, 2, 5, 1};
        long expexted = 14;
        long actual = service.sumSales(sales);
        Assertions.assertEquals(expexted, actual);
    }

    @Test
    public void shouldReturnAverageSales() {
        StatsService service = new StatsService();
        long sales[] = {1, 2, 3, 2, 5, 1};
        long expexted = 2;
        long actual = service.averageSales(sales);
        Assertions.assertEquals(expexted, actual);
    }

    @Test
    public void shouldReturnMonthOfMinSales() {
        StatsService service = new StatsService();
        long sales[] = {1, 2, 3, 2, 5, 1};
        int expexted = 6;
        int actual = service.minMonth(sales);
        Assertions.assertEquals(expexted, actual);
    }

    @Test
    public void shouldReturnMonthOfMaxSales() {
        StatsService service = new StatsService();
        long sales[] = {1, 2, 3, 2, 5, 1};
        int expexted = 5;
        int actual = service.maxMonth(sales);
        Assertions.assertEquals(expexted, actual);
    }

    @Test
    public void shouldReturnMonthsOfBelowAverageSales() {
        StatsService service = new StatsService();
        long sales[] = {1, 2, 3, 2, 5, 1};
        int expexted = 2;
        int actual = service.belowAverage(sales);
        Assertions.assertEquals(expexted, actual);
    }

    @Test
    public void shouldReturnMonthsOfAboveAverageSales() {
        StatsService service = new StatsService();
        long sales[] = {1, 2, 3, 2, 5, 1};
        int expexted = 2;
        int actual = service.aboveAverage(sales);
        Assertions.assertEquals(expexted, actual);
    }
}
