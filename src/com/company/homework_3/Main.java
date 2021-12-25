package com.company.homework_3;

import com.company.homework_4.LinkedList;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int n = 100;
        int[] massive = new int[n];
        for (int i = 0; i < n; i++) {
            if (i == 61) {
                i++;
            }
            massive[i] = i;
        }

        int total = (massive.length + 1) * massive.length / 2 - massive.length;
        System.out.println("missing number is: " + (total - Arrays.stream(massive).sum()));

    }

}
