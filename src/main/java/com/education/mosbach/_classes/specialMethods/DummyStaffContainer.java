package com.education.mosbach._classes.specialMethods;

import com.education.mosbach.humanresources.staff.Staff;
import com.education.mosbach.humanresources.staffManager.ConsoleStaffManagerImpl;
import com.education.mosbach.humanresources.staffManager.StaffManager;
import com.education.mosbach.humanresources.staffimpl.StaffImpl;

import java.util.Arrays;
import java.util.List;

public class DummyStaffContainer {

    public static void main(String[] args) {

        /*
        List<Staff> myStaff = new ArrayList<>();
        myStaff.add(
                new StaffImpl("Mueller", "Mike", "Berlin")
        );
        myStaff.add(
                new StaffImpl("Mueller", "Tom", "Hamburg")
        );
        myStaff.add(
                new StaffImpl("Schmidt", "Andreas", "Berlin")
        );

        for (Staff staff : myStaff)
            System.out.println(staff);
        */

        List<Staff> myStaff = Arrays.asList(
                new StaffImpl("Mueller", "Mike", "Berlin"),
                new StaffImpl("Mueller", "Tom", "Hamburg"),
                new StaffImpl("Schmidt", "Andreas", "Berlin")
        );
        myStaff.forEach(System.out::println);

        // Vergleich
        System.out.println("Mike und Tom " + myStaff.get(0).equals(myStaff.get(1)));
        System.out.println("Mike und Mike " + myStaff.get(0).equals(myStaff.get(0)));
        System.out.println("Mike und myStaff " + myStaff.get(0).equals(myStaff));
        System.out.println("Mike und null " + myStaff.get(0).equals(null));

        // HashCode
        myStaff.forEach(staff ->
                System.out.println(staff.toString() + " " + staff.hashCode())
        );

        // Ohne Singleton
        // final StaffManager staffManager1 = new ConsoleStaffManagerImpl();
        // staffManager1.storeAllStaff(myStaff);
        // final StaffManager staffManager2 = new ConsoleStaffManagerImpl();
        // staffManager2.storeAllStaff(myStaff);

        // Mit Singleton
        StaffManager staffManager1 = ConsoleStaffManagerImpl.getConsoleStaffManagerImpl();
        staffManager1.storeAllStaff(myStaff);
        StaffManager staffManager2 = ConsoleStaffManagerImpl.getConsoleStaffManagerImpl();
        staffManager2.storeAllStaff(myStaff);
        // staffManager1.equals(staffManager2);     MUSS der gleiche sein.

    }


}
