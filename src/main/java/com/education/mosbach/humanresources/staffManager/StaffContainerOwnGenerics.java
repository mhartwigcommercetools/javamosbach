package com.education.mosbach.humanresources.staffManager;

import com.education.mosbach.humanresources.staff.Staff;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StaffContainerOwnGenerics<T extends Staff> implements Iterable<T> {

    List<T> myStaffContainer = new ArrayList<T>();

    public void addStaff(T staff) {
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
    public Iterator<T> iterator() {
        return
                new Iterator<T>() {

                    int actualPos = 0;

                    @Override
                    public boolean hasNext() {
                        return
                                actualPos < myStaffContainer.size();
                    }

                    @Override
                    public T next() {
                        T staff = myStaffContainer.get(actualPos);             // evtl. code kürzen
                        actualPos++;
                        return staff;
                    }
                };
    }
}
