package com.education.mosbach._classes.select;

import com.education.mosbach.algorithms.selection.SimpleSelect;

public class DummySimpleSelect {

    public static void main(String[] args) {

        SimpleSelect simpleSelect = new SimpleSelect();
        int[] A = {1912,2202,2202,2206,2,4,7,11,31,32,44,45,99};

        System.out.println("Der Drittplazierte ist " +
                simpleSelect.select(A, 3));
        System.out.println("Der Fuenftplazierte ist " +
                simpleSelect.select(A, 5));


    }

}
