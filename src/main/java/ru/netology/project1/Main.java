package ru.netology.project1;

public class Main {
    public static void main(String[] args) {
        SalesManager salesManager = new SalesManager(new int[]{1,1, 2, 3, 4, 5});
        int max = salesManager.max();
        int average = salesManager.average();

        System.out.println(max);
        System.out.println(average);
    }
}
