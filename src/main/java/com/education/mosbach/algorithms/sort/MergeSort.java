package com.education.mosbach.algorithms.sort;

import org.checkerframework.checker.units.qual.A;

import java.util.ArrayList;

public class MergeSort {

    public ArrayList<Integer> sort(ArrayList<Integer> unsorted) {

        if (unsorted.size() < 2) return unsorted;

        int middlePos = unsorted.size() / 2;
        ArrayList<Integer> l = new ArrayList<>();
        ArrayList<Integer> r = new ArrayList<>();
        for (int i = 0; i < middlePos; i++)
            l.add(unsorted.get(i));
        for (int i = middlePos; i < unsorted.size(); i++)
            r.add(unsorted.get(i));

        ArrayList<Integer> lS = sort(l);
        ArrayList<Integer> rS = sort(r);
        ArrayList<Integer> sorted = new ArrayList<>();

        while ((lS.size() + rS.size()) > 0) {
            if ((lS.size() > 0) && (rS.size() > 0)) {
                if (lS.get(0) <= rS.get(0)) sorted.add(lS.remove(0));
                else sorted.add(rS.remove(0));
            }
            else {
                if (lS.size() == 0) sorted.add(rS.remove(0));
                else sorted.add(lS.remove(0));
            }
        }

        return sorted;
    }


}
