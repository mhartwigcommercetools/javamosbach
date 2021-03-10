package com.education.mosbach.classes.classOne;

import com.education.mosbach.algorithms.sort.BubbleSort;

public class DummyBubbleSort {

    public static void main(String[] args) {
        BubbleSort myBubbleSort= new BubbleSort();
        int[] myNumbers = {3,8,2,6,7,8,1,12,0,-5,7};

        System.out.println("BubbleSort sortiert.");
        System.out.println("vorher ");
        for(int i= 0; i < myNumbers.length; i++)
            System.out.print(myNumbers[i]+ " ");
        System.out.println();

            myBubbleSort.sort(myNumbers);

        System.out.println("nachher ");
        for(int i= 0; i < myNumbers.length; i++)
            System.out.print(myNumbers[i]+ " ");
        System.out.println();

    }

}
