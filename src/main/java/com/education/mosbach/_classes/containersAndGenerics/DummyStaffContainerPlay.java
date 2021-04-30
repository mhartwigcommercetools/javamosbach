package com.education.mosbach._classes.containersAndGenerics;

import com.education.mosbach.humanresources.staff.Staff;
import com.education.mosbach.humanresources.staffManager.StaffContainer;
import com.education.mosbach.humanresources.staffimpl.StaffImpl;

import java.util.Iterator;

public class DummyStaffContainerPlay {

    public static void main(String[] args) {

        StaffContainer myStaffContainer = new StaffContainer();
        myStaffContainer.addStaff(new StaffImpl("Mueller", "Tim", "Berlin"));
        myStaffContainer.addStaff(new StaffImpl("Mueller", "Tom", "Berlin"));
        myStaffContainer.addStaff(new StaffImpl("Lustig", "Franz", "Hamburg"));
        myStaffContainer.addStaff(new StaffImpl("Wanstig", "Tim", "Muenchen"));

        System.out.println("Nutze printout im StaffContainer");
        myStaffContainer.printAllStaff();

        System.out.println("Durchlaufe Staff-Container selber.");
        Iterator it = myStaffContainer.iterator();
        while (it.hasNext()) {
            Staff s = (Staff) it.next();
            System.out.println("Staff: " + s.getFirstName() + " " + s.getName());
        }

        System.out.println("Durchlaufe Staff-Container selber, Version 2.");
        for (Object o : myStaffContainer) {
            Staff s = (Staff) o;
            System.out.println("Staff: " + s.getFirstName() + " " + s.getName());
        }

        System.out.println("Durchlaufe Staff-Container selber, Version 3.");
        myStaffContainer.forEach(o -> {
            // Integer i = (Integer) o;        // Totaler Unsinn, aber geht
            Staff s = (Staff) o;
            System.out.println("Staff: " + s.getFirstName() + " " + s.getName());
        });

        myStaffContainer.forEach(System.out::println);



    }
}
