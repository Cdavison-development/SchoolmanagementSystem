package com.CW1.CameronDavison.classData;
//Student encapsulation class for getters and setters
public class Student {
    //setting private variables
    private String studentName = "";
    private String module = "";
    private String employmentStatus = "";
    //constructor setting private variables to local variables

    public Student(String studentName, String module, String employmentStatus) {
        this.studentName = studentName;
        this.module = module;
        this.employmentStatus = employmentStatus;
    }
    //getters and setters getting and setting private variables so they can be publicly accessed
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public String getEmploymentStatus() {
        return employmentStatus;
    }

    public void setEmploymentStatus(String employmentStatus) {
        this.employmentStatus = employmentStatus;
    }
}