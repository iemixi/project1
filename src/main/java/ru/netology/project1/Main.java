package ru.netology.project1;

public class Main {
    public static void main(String[] args) {
        SalesManager salesManager = new SalesManager(new long[]{1, 2, 3, 4});
        long max = salesManager.max();
        long average = salesManager.average();

        System.out.println(max);
        System.out.println(average);
    }
}
