package com.CW1.CameronDavison.classData;
//Tutors encapsulation class for getters and setters

public class Tutors {
    //setting private variables

    private String tutorName = "";
    private String moduleChosen = "";
    private String officeLocation = "";
    private String areaOfExpertise = "";
    private String studentsSupervised = "";
    //constructor setting private variables to local variables

    public Tutors(String tutorName,String moduleChosen, String officeLocation, String areaOfExpertise, String studentsSupervised){
        this.tutorName = tutorName;
        this.moduleChosen = moduleChosen;
        this.officeLocation = officeLocation;
        this.areaOfExpertise = areaOfExpertise;
        this.studentsSupervised = studentsSupervised;
    }
    //getters and setters getting and setting private variables so they can be publicly accessed

    public String getTutorName() {
        return tutorName;
    }

    public void setTutorName(String tutorName) {
        this.tutorName = tutorName;
    }

    public String getModuleChosen() {
        return moduleChosen;
    }

    public void setModuleChosen(String moduleChosen) {
        this.moduleChosen = moduleChosen;
    }

    public String getOfficeLocation() {
        return officeLocation;
    }

    public void setOfficeLocation(String officeLocation) {
        this.officeLocation = officeLocation;
    }

    public String getAreaOfExpertise() {
        return areaOfExpertise;
    }

    public void setAreaOfExpertise(String areaOfExpertise) {
        this.areaOfExpertise = areaOfExpertise;
    }

    public String getStudentsSupervised() {
        return studentsSupervised;
    }

    public void setStudentsSupervised(String studentsSupervised) {
        this.studentsSupervised = studentsSupervised;
    }





}
