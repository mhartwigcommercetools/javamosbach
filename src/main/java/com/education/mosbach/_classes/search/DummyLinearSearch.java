package com.education.mosbach._classes.search;

import com.education.mosbach.algorithms.search.LinearSearch;

public class DummyLinearSearch {

    public static void main(String[] args) {

        LinearSearch linearSearch = new LinearSearch();
        int[] A = {2,7,4,7,11,31};
        int exists = 11;
        int notExists = 23;

        System.out.println("Die Zahl " + exists + " ist im Array " +
                linearSearch.search(A, exists));
        System.out.println("Die Zahl " + notExists + " ist im Array " +
                linearSearch.search(A, notExists));


    }

}
