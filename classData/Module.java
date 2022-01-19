package com.CW1.CameronDavison.classData;
//Module encapsulation class for getters and setters
public class Module {
    //setting private variables
    private String moduleName = "";
    private String moduleCode = "";
    private String moduleLeader = "";
    private String moduleModerator = "";
    //constructor setting private variables to local variables
    public Module(String moduleName, String moduleCode, String moduleLeader, String moduleModerator) {
        this.moduleName = moduleName;
        this.moduleCode = moduleCode;
        this.moduleLeader = moduleLeader;
        this.moduleModerator = moduleModerator;
    }
    //getters and setters getting and setting private variables so they can be publicly accessed
    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getModuleCode() {
        return moduleCode;
    }

    public void setModuleCode(String moduleCode) {
        this.moduleCode = moduleCode;
    }

    public String getModuleLeader() {
        return moduleLeader;
    }

    public void setModuleLeader(String moduleLeader) {
        this.moduleLeader = moduleLeader;
    }

    public String getModuleModerator() {
        return moduleModerator;
    }

    public void setModuleModerator(String moduleModerator) {
        this.moduleModerator = moduleModerator;
    }
}

