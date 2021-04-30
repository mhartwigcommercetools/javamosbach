package com.education.mosbach.humanresources.staff;

import java.util.Date;

public interface Staff extends Comparable {

    String getName();
    void setName(String name);

    String getFirstName();
    void setFirstName(String firstName);

    Date getBirthday();
    void setBirthday(Date birthday);

    String getCity();
    void setCity(String city);

}
