package model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.Date;

public class Department {

    String departmentName;
    @Autowired
    @Qualifier("date")
    Date createdOn;

    public String getDepartmentName() {
        return departmentName;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentName='" + departmentName + '\'' +" created on ="+createdOn+
                '}';
    }

    @Autowired
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
