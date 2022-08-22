package ru.netology.stats;

import org.jetbrains.annotations.NotNull;

public class StatsService {


    //сумма всех продаж
    public long sumSales(long sales[]) {
        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sales[i] + sum;
        }
        return sum;
    }


    //Средняя сумма продаж в месяц
    public long averageSales(long sales[]) {
        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        long averege = sum / sales.length;
        return averege;
    }


    //Номер месяца, в котором был пик продаж (осуществлены продажи на максимальную сумму)
    public int maxMonth(long sales[]) {
        int maxMonth = 0;
        int month = 0;

        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }


    //Номер месяца, в котором был минимум продаж (осуществлены продажи на минимальную сумму)
    public int minMonth(long sales[]) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }


    //Кол-во месяцев, в которых продажи были ниже среднего
    public int belowAverage(long sales[]) {
        long average = averageSales(sales);
        int monthBelow = 0;

        for (long sale : sales) {
            if (sale < average) {
                monthBelow = monthBelow + 1;
            }
        }
        return monthBelow;
    }


    //Кол-во месяцев, в которых продажи были выше среднего
    public int aboveAverage(long sales[]) {
        long average = averageSales(sales);
        int monthAbove = 0;

        for (long sale : sales) {
            if (sale > average) {
                monthAbove = monthAbove + 1;
            }
        }
        return monthAbove;
    }

}
