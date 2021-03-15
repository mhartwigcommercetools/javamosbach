package com.education.mosbach.classes.classesThree;

import com.education.mosbach.algorithms.sort.BubbleSort;
import com.education.mosbach.algorithms.sort.SelectionSort;

public class DummySelectionSort {

    public static void main(String[] args) {
        SelectionSort mySelectionSort= new SelectionSort();
        int[] myNumbers = {3,8,2,6,7,8,1,12,0,-5,7};

        System.out.println("SelectionSort sortiert.");
        System.out.println("vorher ");
        for(int i= 0; i < myNumbers.length; i++)
            System.out.print(myNumbers[i]+ " ");
        System.out.println();

            mySelectionSort.sort(myNumbers);

        System.out.println("nachher ");
        for(int i= 0; i < myNumbers.length; i++)
            System.out.print(myNumbers[i]+ " ");
        System.out.println();


    }

}
