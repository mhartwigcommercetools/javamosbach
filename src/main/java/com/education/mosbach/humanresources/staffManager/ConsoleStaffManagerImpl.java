package com.education.mosbach.humanresources.staffManager;

import com.education.mosbach.humanresources.staff.Staff;

import java.util.List;

public class ConsoleStaffManagerImpl implements StaffManager {

    private static ConsoleStaffManagerImpl consoleStaffManager =
            new ConsoleStaffManagerImpl();

    private ConsoleStaffManagerImpl() { }

    public static ConsoleStaffManagerImpl getConsoleStaffManagerImpl() {
        return
                consoleStaffManager;
    }

    @Override
    public void storeAllStaff(List<Staff> myStaffContainer) {
        myStaffContainer.forEach(System.out::println);
    }
}
