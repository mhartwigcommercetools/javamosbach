package com.education.mosbach.sort.impl;

import com.education.mosbach.sort.api.IntArraySorter;

import java.util.ArrayList;

public class QuickSortImpl implements IntArraySorter {

        public ArrayList<Integer> qsort(ArrayList<Integer> unsorted) {

            if (unsorted.size() > 1) {
                final Integer pivot = unsorted.get(0);
                ArrayList<Integer> smaller = new ArrayList<>();
                ArrayList<Integer> larger = new ArrayList<>();
                for (int i = 1; i < unsorted.size(); i++) {
                    if (unsorted.get(i) <= pivot)
                        smaller.add(unsorted.get(i));
                    else
                        larger.add(unsorted.get(i));
                }

                ArrayList<Integer> sorted = new ArrayList<>();
                sorted.addAll(qsort(smaller));
                sorted.add(pivot);
                sorted.addAll(qsort(larger));
                return sorted;
            }
            return unsorted;
        }



      public int[] sort(int[] unsorted) {

          // in ArrayList umwandeln

          // qsort call

          // zurückwandeln

        return
                unsorted;
    }

}
