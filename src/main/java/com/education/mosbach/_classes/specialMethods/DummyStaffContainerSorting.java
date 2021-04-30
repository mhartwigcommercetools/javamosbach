package com.education.mosbach._classes.specialMethods;

import com.education.mosbach.humanresources.staff.Staff;
import com.education.mosbach.humanresources.staffimpl.StaffImpl;

import java.util.ArrayList;
import java.util.Comparator;

public class DummyStaffContainerSorting {

    static class StaffComparator implements Comparator<Staff> {
        @Override
        public int compare(Staff o1, Staff o2) {
            return
                    o1.compareTo(o2);
        }
    }

    public static void main(String[] args) {

        ArrayList<Staff> myStaff = new ArrayList<>();
        myStaff.add(new StaffImpl("Mueller", "Mike", "Berlin"));
        myStaff.add(new StaffImpl("Mueller", "Tom", "Hamburg"));
        myStaff.add(new StaffImpl("Schmidt", "Andreas", "Berlin"));
        System.out.println("Unsortiert:");
        myStaff.forEach(System.out::println);

/*
        // Kopieren Sie den Code von InsertionSort
        ArrayList<Staff> sorted = new ArrayList<>();
        while (myStaff.size() > 0) {
            final Staff pickedElement = myStaff.remove(0);
            int positionInSorted = sorted.size() - 1;

            while (
                    (positionInSorted > -1)
                            &&
                            (sorted.get(positionInSorted).compareTo(pickedElement) > 0)
            )
                positionInSorted--;
            sorted.add(positionInSorted + 1, pickedElement);
        }
        myStaff = sorted;
*/

/*
        // Über eine eigene Comparatorklasse
        myStaff.sort(new StaffComparator());
*/

/*
        // Über comparable-Interface, dann machen wir es als Lambda
        myStaff.sort((staff1, staff2) -> staff1.compareTo(staff2));
        myStaff.sort((staff1, staff2) -> (-1) * staff1.compareTo(staff2));
*/

        // Über Methodenreferenzen unter Nutzung der Comparator-Klasse
        myStaff.sort(Comparator
                        .comparing(Staff::getName)
                        .thenComparing(Staff::getFirstName)
        );

        System.out.println("Sortiert:");
        myStaff.forEach(System.out::println);


    }


}
