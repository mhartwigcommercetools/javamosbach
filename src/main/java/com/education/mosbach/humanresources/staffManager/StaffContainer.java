package com.education.mosbach.humanresources.staffManager;

import com.education.mosbach.humanresources.staff.Staff;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class StaffContainer implements Iterable {

    List myStaffContainer = new ArrayList();

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
    public Iterator iterator() {
        return
                new Iterator() {

                    int actualPos = 0;

                    @Override
                    public boolean hasNext() {
                        return
                                actualPos < myStaffContainer.size();
                    }

                    @Override
                    public Object next() {
                        Object o = myStaffContainer.get(actualPos);             // evtl. code kürzen
                        actualPos++;
                        return o;
                    }
                };
    }
}
