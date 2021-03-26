package com.education.mosbach.algorithms.selection;

import java.util.ArrayList;

public class QuickSelect {

    public Integer select(ArrayList<Integer> unsorted, int place) {

        if (unsorted.size() == 1) return unsorted.get(0);

        // nullelementig, Unsinn, anders behandeln
        // if (unsorted.size() == 0) return -1;

        Integer pivot = unsorted.get(0);
        ArrayList<Integer> smaller = new ArrayList<>();
        ArrayList<Integer> larger = new ArrayList<>();
        for (int i = 1; i < unsorted.size(); i++) {
            if (unsorted.get(i) <= pivot) smaller.add(unsorted.get(i));
            if (unsorted.get(i) > pivot) larger.add(unsorted.get(i));
        }

        if (smaller.size() >= place) return select(smaller, place);
        if (smaller.size() + 1 == place) return pivot;
        return select(larger, place-(smaller.size()+1));

    }


}
