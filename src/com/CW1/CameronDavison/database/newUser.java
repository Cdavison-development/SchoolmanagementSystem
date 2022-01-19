package com.CW1.CameronDavison.database;


import com.CW1.CameronDavison.GUI_functionality.Actions;
import com.CW1.CameronDavison.GUI_functionality.Options;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class newUser extends Actions {
    Connection connection;
    Options opt = new Options();

    /*new user class where all of the functions for adding data from each class is stored. this data will be called
     * into the GUI_functionality.Frames class and the GUI_functionality.Actions class to give these functions functionality in the system all functions use
     * INSERT  keyword to add data into the database*/
    public void newStudent(String studentName, String module, String employmentStatus) {
        Connection con = dbConnection.connect();
        PreparedStatement ps = null;
        try {
            //sql statement that will fetch the row stored in the table with the corresponding Name, sets the amount of values to be added aswell as what values are to be added
            String sql = "INSERT OR IGNORE INTO Students(studentName, module, employmentStatus) VALUES(?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, studentName); //all the parameters that are to be added
            ps.setString(2, String.valueOf(module));
            ps.setString(3, employmentStatus);

            ps.execute();

            System.out.println("Data has been inserted ");
        } catch (Exception e) {
            System.out.println(e.toString()); //SQL exception that will print out relevant error message
        }
    }

    public void newAcademic(String Academicname, String modules, String position, String areasOfExpertise,String studentsSupervised) {
        Connection con = dbConnection.connect();
        PreparedStatement ps = null;
        try {
            //sql statement that will fetch the row stored in the table with the corresponding Name, sets the amount of values to be added aswell as what values are to be added
            String sql = "INSERT OR IGNORE INTO Academics(Academicname ,modules , position ,areasOfExpertise ,studentsSupervised) VALUES(?,?,?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, Academicname); //all the parameters that are to be added
            ps.setString(2, modules);
            ps.setString(3, position);
            ps.setString(4, areasOfExpertise);
            ps.setString(5, studentsSupervised);
            ps.execute();
            System.out.println("Data has been inserted ");
        } catch (SQLException e) {
            System.out.println(e.toString()); //SQL exception that will print out relevant error message
        }

    }
    public void newModule(String moduleName, String moduleCode, String moduleLeader, String moduleModerator) {
        Connection con = dbConnection.connect();
        PreparedStatement ps = null;
        try {
            //sql statement that will fetch the row stored in the table with the corresponding Name, sets the amount of values to be added aswell as what values are to be added
            String sql = "INSERT OR IGNORE INTO Modules(moduleName,moduleCode,moduleLeader,moduleModerator) VALUES(?,?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, moduleName); //all the parameters that are to be added
            ps.setString(2, moduleCode);
            ps.setString(3, moduleLeader);
            ps.setString(4, moduleModerator);
            ps.execute();
            System.out.println("Data has been inserted ");
        } catch (SQLException e) {
            System.out.println(e.toString()); //SQL exception that will print out relevant error message
        }

    }
    public  void newTutors(String tutorName, String modules, String officeLocation, String areasOfExpertise, String studentsSupervised) {
        Connection con = dbConnection.connect();
        PreparedStatement ps = null;
        try {
            //sql statement that will fetch the row stored in the table with the corresponding Name, sets the amount of values to be added aswell as what values are to be added
            String sql = "INSERT OR IGNORE INTO Tutors(tutorName,modules,officeLocation,areasOfExpertise,studentsSupervised) VALUES(?,?,?,?,?)";
            ps = con.prepareStatement(sql);

            ps.setString(1, tutorName); //all the parameters that are to be added
            ps.setString(2, modules);
            ps.setString(3, officeLocation);
            ps.setString(4, areasOfExpertise);
            ps.setString(5, studentsSupervised);
            ps.execute();
            System.out.println("Data has been inserted ");
        } catch (SQLException e) {
            System.out.println(e.toString()); //SQL exception that will print out relevant error message
        }

    }
    public void newOtherPersons(String otherPersonsName, String job, String employmentStatus) {
        Connection con = dbConnection.connect();
        PreparedStatement ps = null;
        try {
            //sql statement that will fetch the row stored in the table with the corresponding Name, sets the amount of values to be added aswell as what values are to be added
            String sql = "INSERT OR IGNORE INTO otherPersons(otherPersonsName,job,employmentStatus) VALUES(?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, otherPersonsName); //all the parameters that are to be added
            ps.setString(2, job);
            ps.setString(3, employmentStatus);
            ps.execute();
            System.out.println("Data has been inserted ");
        } catch (SQLException e) {
            System.out.println(e.toString()); //SQL exception that will print out relevant error message
        }

    }
    public void newAssignment(String assignmentName,String moduleName, String results, String weekAssigned,String feedback,String students) {
        Connection con = dbConnection.connect();
        PreparedStatement ps = null;
        try {
            //sql statement that will fetch the row stored in the table with the corresponding Name, sets the amount of values to be added aswell as what values are to be added
            String sql = "INSERT OR IGNORE INTO Assignments(assignmentName,moduleName,results,weekAssigned,feedback,students) VALUES(?,?,?,?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setString(1,assignmentName); //all the parameters that are to be added
            ps.setString(2, moduleName);
            ps.setString(3, results);
            ps.setString(4, weekAssigned);
            ps.setString(5, feedback);
            ps.setString(6,students);
            ps.execute();
            System.out.println("Data has been inserted ");
        } catch (SQLException e) {
            System.out.println(e.toString()); //SQL exception that will print out relevant error message
        }

    }



}

