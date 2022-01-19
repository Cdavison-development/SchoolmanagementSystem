package com.CW1.CameronDavison.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*modify user class where all of the functions for modifying data from each class is stored this data will be called
 * into the GUI_functionality.Frames class and the GUI_functionality.Actions class to give these functions functionality in the system all functions use
 * UPDATE keyword to convert data from one String to another*/
public class modifyUser {
    Connection connection;

    public void updateStudent(String module , String employmentStatus, String studentName) {
        Connection con = dbConnection.connect();
        PreparedStatement ps = null;
        try {
            String sql = "UPDATE Students set module = ?, employmentStatus = ?  WHERE studentName = ?";   //sql statement that will fetch the row stored in the table with the corresponding Name
            ps = con.prepareStatement(sql);

            ps.setString(1, module);
            ps.setString(2, employmentStatus);
            ps.setString(3, studentName); //converts module and employment though the StudentName String
            ps.execute();
            System.out.println("data has been updated");
        } catch (SQLException e) {
            System.out.println(e.toString()); //SQL exception that will print out relevant error message
        }
    }
    public void updateAcademic(String academicNames,String modulesChosen,String position,String areaOfExpertise,String studentsSupervised ) {
        Connection con = dbConnection.connect();
        PreparedStatement ps = null;
        try {
            //sql statement that will fetch the row stored in the table with the corresponding Name
            String sql = "UPDATE Academics set modules = ?, position =?, areasOfExpertise = ? ,studentsSupervised = ?  WHERE Academicname = ?";
            ps = con.prepareStatement(sql);

            ps.setString(1, modulesChosen);
            ps.setString(2, position);
            ps.setString(3, areaOfExpertise);
            ps.setString(4, studentsSupervised);
            ps.setString(5, academicNames); //converts parameters though the academicNames String
            ps.execute();
            System.out.println("data has been updated");
        } catch (SQLException e) {
            System.out.println(e.toString()); //SQL exception that will print out relevant error message
        }
    }
    public void updateModule(String moduleName, String moduleCode, String moduleLeader, String moduleModerator) {
        Connection con = dbConnection.connect();
        PreparedStatement ps = null;
        try {
            //sql statement that will fetch the row stored in the table with the corresponding Name
            String sql = "UPDATE Modules set moduleCode = ? ,moduleLeader =? ,moduleModerator =? WHERE moduleName = ?";
            ps = con.prepareStatement(sql);

            ps.setString(1, moduleCode);
            ps.setString(2, moduleLeader);
            ps.setString(3, moduleModerator);
            ps.setString(4, moduleName); //converts parameters though the moduleName String
            ps.execute();
            System.out.println("data has been updated");
        } catch (SQLException e) {
            System.out.println(e.toString()); //SQL exception that will print out relevant error message
        }
    }
    public void updateTutor(String tutorName, String moduleChosen, String officeLocation , String areaOfExpertise , String studentsSupervised) {
        Connection con = dbConnection.connect();
        PreparedStatement ps = null;
        try {
            //sql statement that will fetch the row stored in the table with the corresponding Name
            String sql = "UPDATE Tutors set modules = ? ,officeLocation =? ,areasOfExpertise =? ,studentsSupervised =? WHERE tutorName = ?";
            ps = con.prepareStatement(sql);

            ps.setString(1, moduleChosen);
            ps.setString(2, officeLocation);
            ps.setString(3, areaOfExpertise);
            ps.setString(4, studentsSupervised);
            ps.setString(5, tutorName); //converts parameters though the tutorName String
            ps.execute();
            System.out.println("data has been updated");
        } catch (SQLException e) {
            System.out.println(e.toString()); //SQL exception that will print out relevant error message
        }
    }
    public void updateOtherPersons(String otherPersonName,String job,String employmentStatus) {
        Connection con = dbConnection.connect();
        PreparedStatement ps = null;
        try {
            //sql statement that will fetch the row stored in the table with the corresponding Name
            String sql = "UPDATE otherPersons set Job = ? ,employmentStatus =? WHERE otherPersonsName = ?";
            ps = con.prepareStatement(sql);

            ps.setString(1, job);
            ps.setString(2, employmentStatus);
            ps.setString(3, otherPersonName); //converts parameters though the otherPersonName String
            ps.execute();
            System.out.println("data has been updated");
        } catch (SQLException e) {
            System.out.println(e.toString()); //SQL exception that will print out relevant error message
        }
    }
    public void updateAssignment(String assignmentName, String moduleName, String results , String weekAssigned , String feedback, String students ) {
        Connection con = dbConnection.connect();
        PreparedStatement ps = null;
        try {
            //sql statement that will fetch the row stored in the table with the corresponding Name
            String sql = "UPDATE Assignments set moduleName = ? ,Results =?, weekAssigned =?, feedback =?,students =? WHERE assignmentName = ?";
            ps = con.prepareStatement(sql);

            ps.setString(1, moduleName);
            ps.setString(2, results);
            ps.setString(3, weekAssigned);
            ps.setString(4, feedback);
            ps.setString(5, students);
            ps.setString(6, assignmentName); //converts parameters though the assignmentName String
            ps.execute();
            System.out.println("data has been updated");
        } catch (SQLException e) {
            System.out.println(e.toString()); //SQL exception that will print out relevant error message
        }
    }

}
