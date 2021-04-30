package com.education.mosbach._classes.sortAndBMI;

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


        System.out.println("BubbleSort verbessert sortiert.");
        System.out.println("vorher ");
        int[] myNumbers2 = {3,8,2,6,7,8,1,12,0,-5,7};
        for(int i= 0; i < myNumbers2.length; i++)
            System.out.print(myNumbers2[i]+ " ");
        System.out.println();

        myBubbleSort.sortImproved(myNumbers2);

        System.out.println("nachher ");
        for(int i= 0; i < myNumbers2.length; i++)
            System.out.print(myNumbers2[i]+ " ");
        System.out.println();




    }

}
