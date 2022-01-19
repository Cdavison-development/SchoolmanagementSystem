package com.CW1.CameronDavison.database;

import com.CW1.CameronDavison.GUI_functionality.Actions;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class removeUser extends Actions {
    /*database.removeUser class where all of the functions for removing data from database from each class is stored. this data will be called
     * into the GUI_functionality.Frames class and the GUI_functionality.Actions class to give these functions functionality in the system all functions use
     * delete  keyword to remove data from the database*/
    public void removeStudent(String name) {
        Connection con = dbConnection.connect();
        PreparedStatement ps = null;
        try {
            //sql statement that will fetch the row stored in the table with the corresponding Name, uses delete function to remove data from system based on student name
            String sql = "delete from Students Where StudentName = ? ";
            ps = con.prepareStatement(sql);
            ps.setString(1, name); //parameter assigning name to parameter 1 (studentName)
            ps.executeUpdate();

            System.out.println("Data has been deleted");

        } catch (SQLException e) {
            System.out.println(e.toString()); //SQL exception that will print out relevant error message
        } finally {
            try {
                ps.close();
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
    }

    public void removeOtherPersons(String name) {
        Connection con = dbConnection.connect();
        PreparedStatement ps = null;
        try {
            //sql statement that will fetch the row stored in the table with the corresponding Name, uses delete function to remove data from system based on otherPersonsName
            String sql = "delete from OtherPersons Where otherPersonsName = ? ";
            ps = con.prepareStatement(sql);
            ps.setString(1, name);  //parameter assigning name to parameter 1 (otherPersonsName)
            ps.execute();

            System.out.println("Data has been deleted");

        } catch (SQLException e) {
            System.out.println(e.toString()); //SQL exception that will print out relevant error message
        } finally {
            try {
                ps.close();
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
    }
    public void removeAcademic(String name) {
        Connection con = dbConnection.connect();
        PreparedStatement ps = null;
        try {
            //sql statement that will fetch the row stored in the table with the corresponding Name, uses delete function to remove data from system based on Academicname
            String sql = "delete from Academics Where Academicname = ? ";
            ps = con.prepareStatement(sql);
            ps.setString(1, name); //parameter assigning name to parameter 1 (Academicname)
            ps.execute();

            System.out.println("Data has been deleted");

        } catch (SQLException e) {
            System.out.println(e.toString()); //SQL exception that will print out relevant error message
        } finally {
            try {
                ps.close();
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
    }
    public void removeModule(String moduleName) {
        Connection con = dbConnection.connect();
        PreparedStatement ps = null;
        try {
            //sql statement that will fetch the row stored in the table with the corresponding Name, uses delete function to remove data from system based on moduleName
            String sql = "delete from Modules Where moduleName = ? ";
            ps = con.prepareStatement(sql);
            ps.setString(1, moduleName); //parameter assigning name to parameter 1 (moduleName)
            ps.execute();

            System.out.println("Data has been deleted");

        } catch (SQLException e) {
            System.out.println(e.toString()); //SQL exception that will print out relevant error message
        } finally {
            try {
                ps.close();
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
    }
    public void removeTutor(String name) {
        Connection con = dbConnection.connect();
        PreparedStatement ps = null;
        try {
            //sql statement that will fetch the row stored in the table with the corresponding Name, uses delete function to remove data from system based on tutorName
            String sql = "delete from Tutors Where tutorName = ? ";
            ps = con.prepareStatement(sql);
            ps.setString(1, name); //parameter assigning name to parameter 1 (tutorName)
            ps.execute();

            System.out.println("Data has been deleted");

        } catch (SQLException e) {
            System.out.println(e.toString()); //SQL exception that will print out relevant error message
        } finally {
            try {
                ps.close();
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
    }
    public void removeAssignment(String name) {
        Connection con = dbConnection.connect();
        PreparedStatement ps = null;
        try {
            //sql statement that will fetch the row stored in the table with the corresponding Name, uses delete function to remove data from system based on assignmentName
            String sql = "delete from Assignments Where assignmentName = ? ";
            ps = con.prepareStatement(sql);
            ps.setString(1, name); //parameter assigning name to parameter 1 (assignmentName)
            ps.execute();

            System.out.println("Data has been deleted");

        } catch (SQLException e) {
            System.out.println(e.toString()); //SQL exception that will print out relevant error message
        } finally {
            try {
                ps.close();
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
    }
}