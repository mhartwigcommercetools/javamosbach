package com.education.mosbach.humanresources.staff;

import java.util.Date;

public interface Staff {

    String getName();
    void setName(String name);

    String getFirstName();
    void setFirstName(String firstName);

    Date getBirthday();
    void setBirthday(Date birthday);

    String getCity();
    void setCity(String city);

}
