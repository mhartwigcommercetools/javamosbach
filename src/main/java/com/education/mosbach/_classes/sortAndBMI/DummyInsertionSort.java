package com.education.mosbach._classes.sortAndBMI;

import com.education.mosbach.algorithms.sort.InsertionSort;

import java.util.ArrayList;

public class DummyInsertionSort {

    public static void main(String[] args) {

        InsertionSort insertionSort = new InsertionSort();
        ArrayList<Integer> myNumbers = new ArrayList<>();

        int[] temp = {3,8,2,6,7,8,1,12,0,-5,7};
        for (int i = 0; i < temp.length; i++)
            myNumbers.add(temp[i]);

        System.out.println("InsertionSort sortiert.");
        System.out.println("vorher ");
        for(int i= 0; i < myNumbers.size(); i++)
            System.out.print(myNumbers.get(i)+ " ");
        System.out.println();

        myNumbers = insertionSort.sort(myNumbers);

        System.out.println("nachher ");
        for(int i= 0; i < myNumbers.size(); i++)
            System.out.print(myNumbers.get(i)+ " ");
        System.out.println();





    }

}
