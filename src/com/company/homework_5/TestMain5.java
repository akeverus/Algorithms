package com.company.homework_5;

public class TestMain5 {

    static int[] values = new int[] {894, 260, 392, 281, 27};
    static int[] weights = new int[] {8, 6, 4, 0, 21};
    static int W = 30;

    public static void main(String[] args) {
        System.out.println(calculatePower(3, 15));
        System.out.println(knapsack(values.length - 1, W));
    }

    public static long calculatePower(long base, long powerRaised) {
        if (powerRaised != 0)
            return (base * calculatePower(base, powerRaised - 1));
        else
            return 1;
    }

    private static int knapsack(int i, int W) {
        if (i < 0) {
            return 0;
        }
        if (weights[i] > W) {
            return knapsack(i-1, W);
        } else {
            return Math.max(knapsack(i-1, W), knapsack(i-1, W - weights[i]) + values[i]);
        }
    }
}