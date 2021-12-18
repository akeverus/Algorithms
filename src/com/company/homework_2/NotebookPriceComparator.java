package com.company.homework_2;

import java.util.Comparator;

public class NotebookPriceComparator implements Comparator<Notebook> {
    @Override
    public int compare(Notebook o1, Notebook o2){
        return Integer.compare(o1.getPrice(), o2.getPrice());
    }
}
