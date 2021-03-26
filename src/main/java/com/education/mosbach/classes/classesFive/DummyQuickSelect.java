package com.education.mosbach.classes.classesFive;

import com.education.mosbach.algorithms.selection.QuickSelect;
import com.education.mosbach.algorithms.selection.SimpleSelect;

import java.util.ArrayList;

public class DummyQuickSelect {

    public static void main(String[] args) {

        QuickSelect quickSelect = new QuickSelect();

        ArrayList<Integer> myNumbers = new ArrayList<>();
        int[] temp = {3,8,2,6,7,8,1,12,0,-5,7};
        for (int i = 0; i < temp.length; i++)
            myNumbers.add(temp[i]);

        System.out.println("Der Drittplazierte ist " +
                quickSelect.select(myNumbers, 3));
        System.out.println("Der Fünftplazierte ist " +
                 quickSelect.select(myNumbers, 5));


    }

}
