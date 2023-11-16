package ru.netology.stats;

public class StatsService {
    long sum(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;
        }
        return totalSale;
    }

    long average(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;
        }
        long averageSale = totalSale / 12;
        return averageSale;
    }

    int calcMonthMaximumSale(long[] sales) {
        int monthMaximumSale = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[monthMaximumSale]) {
                monthMaximumSale = i;
            }
        }

        return monthMaximumSale + 1;
    }

    int calcMonthMinimumSale(long[] sales) {
        int monthMinimumSale = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[monthMinimumSale]) {
                monthMinimumSale = i;
            }
        }
        return monthMinimumSale + 1;
    }

    int calcMonthsBelowAverage(long[] sales) {
        int counter = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale < averageSale) {
                counter++;
            }
        }
        return counter;
    }

    int calcMonthsAboveAverage(long[] sales) {
        int counter = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale > averageSale) {
                counter++;
            }
        }
        return counter;
    }
}