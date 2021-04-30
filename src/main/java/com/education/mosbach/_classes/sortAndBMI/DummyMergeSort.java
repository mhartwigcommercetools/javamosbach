package com.education.mosbach._classes.sortAndBMI;

import com.education.mosbach.algorithms.sort.MergeSort;

import java.util.ArrayList;

public class DummyMergeSort {

    public static void main(String[] args) {

        MergeSort mergeSort = new MergeSort();
        ArrayList<Integer> myNumbers = new ArrayList<>();

        int[] temp = {3,8,2,6,7,8,1,12,0,-5,7};
        for (int i = 0; i < temp.length; i++)
            myNumbers.add(temp[i]);

        System.out.println("MergeSort sortiert.");
        System.out.println("vorher ");
        for(int i= 0; i < myNumbers.size(); i++)
            System.out.print(myNumbers.get(i)+ " ");
        System.out.println();

        myNumbers = mergeSort.sort(myNumbers);

        System.out.println("nachher ");
        for(int i= 0; i < myNumbers.size(); i++)
            System.out.print(myNumbers.get(i)+ " ");
        System.out.println();





    }

}
