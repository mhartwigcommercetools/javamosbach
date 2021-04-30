package com.education.mosbach.humanresources.staffManager;


import com.education.mosbach.humanresources.staff.Staff;

import java.util.List;

public interface StaffManager {

    void storeAllStaff(List<Staff> myStaffContainer);
    List<Staff> readStaff();

    // get Staff by Name, by ID
    // update Staff by Name, by ID

}
