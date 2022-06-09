package ru.netology.java.stats.services;

 import org.junit.jupiter.api.Assertions;
 import org.junit.jupiter.api.Test;


public class StatsServiceTest {

    @Test // Сумму всех продаж
    public void shouldFindSumOfSales () {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.sumOfSales(sales);
        long expected = 180;
        Assertions.assertEquals(expected, actual);
    }

    @Test // Среднюю сумму продаж в месяц
    public void shouldFindAverageOfSales () {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.averageOfSales(sales);
        long expected = 15;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    // Номер месяца, в котором был пик продаж (осуществлены продажи на максимальную сумму)*
    public void shouldFindMonthOfMaxSales () {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.maxSales(sales);
        int expected = 8;
        Assertions.assertEquals(expected, actual);
    }

    @Test // Номер месяца, в котором был минимум продаж (осуществлены продажи на минимальную сумму)*
    public void shouldFindMonthOfMinSales () {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.minSales(sales);
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test // Кол-во месяцев, в которых продажи были ниже среднего (см. п.2)
    public void shouldFindNumberOfMonthsUnderAverageSale () {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.underAverageSale(sales);
        int expected = 5;
        Assertions.assertEquals(expected, actual);
    }

    @Test // Кол-во месяцев, в которых продажи были выше среднего (см. п.2)
    public void shouldFindNumberOfMonthsOverAverageSale () {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.overAverageSale(sales);
        int expected = 5;
        Assertions.assertEquals(expected, actual);
    }
}
