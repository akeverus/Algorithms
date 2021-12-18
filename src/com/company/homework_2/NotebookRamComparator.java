package com.company.homework_2;

import java.util.Comparator;

public class NotebookRamComparator implements Comparator<Notebook> {
    @Override
    public int compare(Notebook o1, Notebook o2){
        return Integer.compare(o1.getRam(), o2.getRam());
    }
}
