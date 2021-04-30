package com.education.mosbach.humanresources.staffManager;

import com.education.mosbach.humanresources.staff.Staff;
import com.education.mosbach.humanresources.staffimpl.StaffImpl;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class PropertiesStaffManagerImpl implements StaffManager{

    String fileName = "src/main/resources/staff.properties";

    static PropertiesStaffManagerImpl propertiesStaffManager =
            new PropertiesStaffManagerImpl();

    private PropertiesStaffManagerImpl() {}

    public static PropertiesStaffManagerImpl getPropertiesStaffManager() {
        return propertiesStaffManager;
    }

    @Override
    public void storeAllStaff(List<Staff> myStaffContainer) {
        Properties properties = new Properties();
        var ref = new Object() {
            int i = 1;
        };
        myStaffContainer.forEach(
                staff -> {
                    properties.setProperty("Staff." + ref.i + ".Name", staff.getName());
                    properties.setProperty("Staff." + ref.i + ".FirstName", staff.getFirstName());
                    properties.setProperty("Staff." + ref.i + ".City", staff.getCity());
                    ref.i++;
                }
        );
        try {
            properties.store(new FileOutputStream(fileName), null);
        } catch (IOException e) {
            System.out.println("Cannot write to file " + e.getMessage());
        }
    }

    @Override
    public List<Staff> readStaff() {

        Properties properties = new Properties();
        List<Staff> myStaff = new ArrayList<>();

        try {
            properties.load(new FileInputStream(fileName));
            int i = 1;
            while (properties.containsKey("Staff." + i + ".Name")) {
                myStaff.add(
                        new StaffImpl(
                                properties.getProperty("Staff." + i + ".Name"),
                                properties.getProperty("Staff." + i + ".FirstName"),
                                properties.getProperty("Staff." + i + ".City")
                        )
                );
                i++;
            }
        } catch (IOException e) {
            System.out.println("Cannot read from file " + e.getMessage());
        }

        return myStaff;
    }
}
