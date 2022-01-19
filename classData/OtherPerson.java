package com.CW1.CameronDavison.classData;
//OtherPerson encapsulation class for getters and setters

public class OtherPerson {
    //setting private variables

    private String otherPersonName = "";
    private String job = "";
    private String employmentStatus = "";
    //constructor setting private variables to local variables

    public OtherPerson(String otherPersonName, String job, String employmentStatus) {
        this.otherPersonName = otherPersonName;
        this.job = job;
        this.employmentStatus = employmentStatus;
    }
    //getters and setters getting and setting private variables so they can be publicly accessed

    public String getOtherPersonName() {
        return otherPersonName;
    }

    public void setOtherPersonName(String otherPersonName) {
        this.otherPersonName = otherPersonName;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getEmploymentStatus() {
        return employmentStatus;
    }

    public void setEmploymentStatus(String employmentStatus) {
        this.employmentStatus = employmentStatus;
    }

    }



