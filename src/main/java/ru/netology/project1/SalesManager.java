package ru.netology.project1;

public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public int min() {
        int min = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[min]) {
                min = i;
            }
        }

        return sales[min];
    }

    public int average() {
        int sum = 0;
        int amount = 0;

        int max = max();
        int min = min();

        for (int sale : sales) {
            if (sale != min && sale != max) {
                ++amount;
                sum += sale;
            }
        }

        return sum / amount;
    }
}