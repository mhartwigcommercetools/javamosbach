package com.education.mosbach.classes.classesFive;

import com.education.mosbach.algorithms.search.BinarySearch;
import com.education.mosbach.algorithms.search.LinearSearch;

public class DummyBinarySearch {

    public static void main(String[] args) {

        BinarySearch binarySearch = new BinarySearch();
        int[] A = {2,4,7,11,31,32,44,45,99,1912,2202,2202,2206};
        int exists = 11;
        int notExists = 23;

        System.out.println("Die Zahl " + exists + " ist im Array " +
                binarySearch.search(A, 0, A.length-1, exists));
        System.out.println("Die Zahl " + notExists + " ist im Array " +
                binarySearch.search(A, 0, A.length-1, notExists));


    }

}
