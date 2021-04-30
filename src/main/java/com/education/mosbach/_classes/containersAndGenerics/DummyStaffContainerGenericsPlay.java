package com.education.mosbach._classes.containersAndGenerics;

import com.education.mosbach.humanresources.staff.Staff;
import com.education.mosbach.humanresources.staffManager.StaffContainerGenerics;
import com.education.mosbach.humanresources.staffimpl.StaffImpl;

import java.util.Iterator;

public class DummyStaffContainerGenericsPlay {

    public static void main(String[] args) {

        StaffContainerGenerics myStaffContainer = new StaffContainerGenerics();
        myStaffContainer.addStaff(new StaffImpl("Mueller", "Tim", "Berlin"));
        myStaffContainer.addStaff(new StaffImpl("Mueller", "Tom", "Berlin"));
        myStaffContainer.addStaff(new StaffImpl("Lustig", "Franz", "Hamburg"));
        myStaffContainer.addStaff(new StaffImpl("Wanstig", "Tim", "Muenchen"));

        System.out.println("Nutze printout im StaffContainer");
        myStaffContainer.printAllStaff();

        System.out.println("Durchlaufe Staff-Container selber.");
        Iterator<Staff> it = myStaffContainer.iterator();
        while (it.hasNext()) {
            System.out.println("Staff: " + it.next().getName());
        }

        System.out.println("Durchlaufe Staff-Container selber, Version 2.");
        for (Staff staff : myStaffContainer) {
            System.out.println("Staff: " + staff.getFirstName() + " " + staff.getName());
        }

        System.out.println("Durchlaufe Staff-Container selber, Version 3.");
        myStaffContainer.forEach(staff -> {
            System.out.println("Staff: " + staff.getFirstName() + " " + staff.getName());
        });

        myStaffContainer.forEach(System.out::println);



    }
}
