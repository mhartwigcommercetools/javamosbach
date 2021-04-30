package com.education.mosbach._classes.managers;

import com.education.mosbach.humanresources.staff.Staff;
import com.education.mosbach.humanresources.staffManager.PropertiesStaffManagerImpl;
import com.education.mosbach.humanresources.staffManager.StaffManager;

import java.util.List;

public class DummyStaffPropertiesManager {

    public static void main(String[] args) {

        StaffManager myManager = PropertiesStaffManagerImpl.getPropertiesStaffManager();

        /*
        List<Staff> myStaff = Arrays.asList(
                new StaffImpl("Mueller", "Mike", "Berlin"),
                new StaffImpl("Mueller", "Tom", "Hamburg"),
                new StaffImpl("Schmidt", "Andreas", "Berlin")
        );

        */

        List<Staff> myStaff = myManager.readStaff();
        myStaff.forEach(System.out::println);

        // myManager.storeAllStaff(myStaff);

    }

}
