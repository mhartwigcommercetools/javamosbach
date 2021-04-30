package com.education.mosbach.humanresources.staffimpl;

import com.education.mosbach.humanresources.staff.Staff;

import java.util.Date;

public class StaffImpl implements Staff {

    private String name = "";
    private String firstName = "";
    private String city = "";
    private Date birthday = new Date();

    public StaffImpl(String name, String firstName, String city) {
        setName(name);
        setFirstName(firstName);
        setCity(city);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        // TODO: Implement real checks for consistency!!!!
        // In all setters.
        if (name == null) return;
        if (name.length() < 3) return;
        this.name = name;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public Date getBirthday() {
        return birthday;
    }

    @Override
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String getCity() {
        return city;
    }

    @Override
    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return
            new StringBuilder("")
                .append(getFirstName())
                .append(" ")
                .append(getName())
                .append(" aus ")
                .append(getCity())
                .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (!(o instanceof Staff)) return false;
        Staff otherStaff = (Staff) o;
        if (
                getName().equalsIgnoreCase(otherStaff.getName())
                && getFirstName().equalsIgnoreCase(otherStaff.getFirstName())
                && getCity().equalsIgnoreCase(otherStaff.getCity())
        )
            return true;
        return false;
    }

    @Override
    public int hashCode() {
        return
                (getName() + getFirstName() + getCity())
                .length();
    }

    @Override
    public int compareTo(Object o) {

        // if o null return größer
        if (o == null) return 1;

        // if o andere Klasse return größer
        if (!(o instanceof Staff)) return 1;

        // if other staff
        Staff otherStaff = (Staff) o;
         if (getName().compareToIgnoreCase(otherStaff.getName()) != 0)
            return getName().compareToIgnoreCase(otherStaff.getName());

        return
                getFirstName().compareToIgnoreCase(otherStaff.getFirstName());
    }
}
