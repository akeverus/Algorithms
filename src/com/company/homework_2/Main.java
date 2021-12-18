package com.company.homework_2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Notebook notebooks[] = new Notebook[10000];
        for (int i = 0; i < 10000; i++) {
            notebooks[i] = new Notebook(getRandomNumberWithStep(500, 2000, 50),
                    getRandomNumberWithStep(4, 24, 4),
                    Manufacturer.values()[getRandomNumber(0, 5)]);
        }

        Comparator<Notebook> ncomp = new NotebookPriceComparator().
                thenComparing(new NotebookRamComparator()).
                thenComparing(new NotebookManufacturerComparator());

        Arrays.sort(notebooks, ncomp);

        for (Notebook notebook :
                notebooks) {
            System.out.println(notebook);
        }


    }

    public static int getRandomNumberWithStep(int min, int max, int step) {
        Random random = new Random();
        int price = random.nextInt(max - min) + min;
        return (price - price % step + step);
    }

    public static int getRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }
}
