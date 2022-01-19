package com.CW1.CameronDavison.classData;
//academics encapsulation class for getters and setters
public class Academics {
    //setting private variables
    private String names = "";
    private String modulesChosen = "";
    private String position = "";
    private String areaOfExpertise = "";
    private String studentsSupervised = "";
    //constructor setting private variables to local variables
    public Academics(String names,String modulesChosen,String position,String areaOfExpertise,String studentsSupervised ){
        this.names = names;
        this.modulesChosen = modulesChosen;
        this.position = position;
        this.areaOfExpertise = areaOfExpertise;
        this.studentsSupervised = studentsSupervised;
    }

    //getters and setters getting and setting private variables so they can be publicly accessed
    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getModulesChosen() {
        return modulesChosen;
    }

    public void setModulesChosen(String modulesChosen) {
        this.modulesChosen = modulesChosen;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
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
