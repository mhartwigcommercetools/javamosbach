package com.education.mosbach.humanresources.staffManager;

import com.education.mosbach.humanresources.staff.Staff;

import java.util.List;

// TODO: Manager nicht korrekt als Singleton implementiert
public class CollectionStaffManagerImpl implements StaffManager {

    List<Staff> myStaffDatabase;

    @Override
    public void storeAllStaff(List<Staff> myStaffContainer) {

    }

    // TODO
    @Override
    public List<Staff> readStaff() {
        return null;
    }
}
