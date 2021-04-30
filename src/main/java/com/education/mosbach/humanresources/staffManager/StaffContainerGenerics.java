package com.education.mosbach.humanresources.staffManager;

import com.education.mosbach.humanresources.staff.Staff;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StaffContainerGenerics implements Iterable<Staff> {

    List<Staff> myStaffContainer = new ArrayList<Staff>();

    public void addStaff(Staff staff) {
        myStaffContainer.add(staff);
    }

    public void printAllStaff() {
        System.out.println("Mein Personal: ");
        int actualPos = 0;
        while (actualPos < myStaffContainer.size()) {
            Staff s = (Staff) myStaffContainer.get(actualPos);
            System.out.println("Staff:" + s);
            actualPos++;
        }
    }

    // not thread-safe
    @Override
    public Iterator<Staff> iterator() {
        return
                new Iterator<Staff>() {

                    int actualPos = 0;

                    @Override
                    public boolean hasNext() {
                        return
                                actualPos < myStaffContainer.size();
                    }

                    @Override
                    public Staff next() {
                        Staff staff = myStaffContainer.get(actualPos);             // evtl. code kürzen
                        actualPos++;
                        return staff;
                    }
                };
    }
}
