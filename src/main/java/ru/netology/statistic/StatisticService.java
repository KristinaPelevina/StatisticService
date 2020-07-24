package ru.netology.statistic;

public class StatisticService {
    public int calculateSum(int[] sumSales) {
        int sum = 0;
        for (int sumsale : sumSales) {
            sum += sumsale;
        }
        return sum;
    }

    public int calculateAverage(int[] averageSales) {
        int sum = calculateSum(averageSales);
        int average = sum / averageSales.length;
        return average;
    }

    public int calculatePeakSales(int[] peakSales) {
        int peakMonth = 0;
        int peakSale = peakSales[0];
        for (int max = 0; max < peakSales.length; max++) {
            if (peakSale <= peakSales[max]) {
                peakSale = peakSales[max];
                peakMonth = max + 1;
            }
        }
        return peakMonth;
    }

    public int calculateMinSales(int[] minSales) {
        int minMonth = 0;
        int minSale = minSales[0];
        for (int min = 0; min < minSales.length; min++) {
            if (minSale >= minSales[min]) {
                minSale = minSales[min];
                minMonth = min + 1;
            }
        }
        return minMonth;
    }


    public int calcilateBelowAverage(int[] belowAverageSales) {
        int average = calculateAverage(belowAverageSales);
        int sumBelowAverage = 0;
        for (int belowAverageSale : belowAverageSales) {
            if (belowAverageSale < average) {
                sumBelowAverage++;
            }
        }
        return sumBelowAverage;
    }

    public int calculateAboveAverage(int[] overAverageSales) {
        int average = calculateAverage(overAverageSales);
        int sumOverAverage = 0;
        for (int overAverageSale : overAverageSales) {
            if (overAverageSale > average) {
                sumOverAverage++;
            }
        }
        return sumOverAverage;

    }
}

