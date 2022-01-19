package com.CW1.CameronDavison.classData;
//Assignment encapsulation class for getters and setters
public class Assignment {
    //setting private variables
    private String assignmentName = "";
    private String moduleName = "";
    private String results = "";
    private String weekAssigned = "";
    private String feedback = "";
    private String students = "";
    //constructor setting private variables to local variables
    public Assignment(String assignmentName,String moduleName,String results,String weekAssigned,String feedback,String students){
        this.assignmentName = assignmentName;
        this.moduleName = moduleName;
        this.results = results;
        this.weekAssigned = weekAssigned;
        this.feedback = feedback;
        this.students = students;
    }
    //getters and setters getting and setting private variables so they can be publicly accessed
    public String getAssignmentName() {
        return assignmentName;
    }

    public void setAssignmentName(String assignmentName) {
        this.assignmentName = assignmentName;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getResults() {
        return results;
    }

    public void setResults(String results) {
        this.results = results;
    }

    public String getWeekAssigned() {
        return weekAssigned;
    }

    public void setWeekAssigned(String weekAssigned) {
        this.weekAssigned = weekAssigned;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public String getStudents() {
        return students;
    }

    public void setStudents(String students) {
        this.students = students;
    }

}
