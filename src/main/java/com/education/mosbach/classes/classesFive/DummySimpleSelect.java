package com.education.mosbach.classes.classesFive;

import com.education.mosbach.algorithms.search.BinarySearch;
import com.education.mosbach.algorithms.selection.SimpleSelect;

public class DummySimpleSelect {

    public static void main(String[] args) {

        SimpleSelect simpleSelect = new SimpleSelect();
        int[] A = {1912,2202,2202,2206,2,4,7,11,31,32,44,45,99};

        System.out.println("Der Drittplazierte ist " +
                simpleSelect.select(A, 3));
        System.out.println("Der Fünftplazierte ist " +
                simpleSelect.select(A, 5));


    }

}