package ru.netology.java.stats.services;
public class StatsService {
    public long sumOfSales(long[] sales) {
        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    public long averageOfSales(long[] sales) {
        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        long average = sum / sales.length;
        return average;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[maxMonth] - продажи в месяце maxMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }


    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int underAverageSale(long[] sales) {
        int monthsUnderAverage = 0;
        long average = averageOfSales(sales);
        for (long sale : sales) {
            if (sale < average) {
                    monthsUnderAverage++;
            }
        }
        return monthsUnderAverage;
    }

    public int overAverageSale(long[] sales) {
        int monthsOverAverage = 0;
        long average = averageOfSales(sales);
        for (long sale : sales) {
            if (sale > average) {
                monthsOverAverage++;
            }
        }
        return monthsOverAverage;
    }
}