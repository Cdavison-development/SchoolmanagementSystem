package com.CW1.CameronDavison.database;

import com.CW1.CameronDavison.GUI_functionality.Frames;
import com.CW1.CameronDavison.GUI_functionality.Options;
import com.CW1.CameronDavison.classData.*;
import com.CW1.CameronDavison.classData.Module;

import javax.swing.*;
import java.sql.*;
import java.util.Vector;
//class used to store methods relating to database work
public class dbConnection {
    Frames frm = new Frames();
    Options opt = new Options();
    String SQLException;

   //list of vectors for to be stored in Jlists and JcomboBoxes
    private  Vector<String> modules = new Vector<String>();
    private  Vector<String> students = new Vector<String>();
    private  Vector<String> moduleModerator = new Vector<String>();
    private  Vector<String> moduleLeader = new Vector<String>();
    public  Vector<String> employmentStatus = new Vector<String>();
    public  Vector<String> classList = new Vector<String>();

    public Vector<String> setClassList(){
        return classList;
    }
/* getters for adding correct data into vectors and returning them for outside use*/
    //fetches module name function
    public Vector<String> getModuleNamesArray(){
        fetchModuleName();
        return modules;
    }

    //fetches student name function
    public Vector<String> getStudentNamesArray(){
        fetchStudentName();
        return students;
    }
    //fetches moduleleader function
    public Vector<String> getModuleLeaderArray(){
        fetchModuleLeader();
        return moduleLeader;
    }
    //fetches module moderator function
    public Vector<String> getModuleModeratorArray(){
        fetchModuleModerator();
        return moduleModerator;
    }

    //method for testing connection to database
    public static Connection connect() {
            Connection con = null;
            try {
                Class.forName("org.sqlite.JDBC");
                con = DriverManager.getConnection("jdbc:sqlite:School.db"); //finding the jdbc library
                //System.out.println("Connected");
            } catch (ClassNotFoundException | SQLException e) {
                System.out.println(e.toString());//SQL exception that will return an error message if an error arises
            }
            return con;
        }
    // method for calling names from Module table in database for use in bot comboBoxes and Jlists
    public void fetchModuleName() {
        Connection con = dbConnection.connect();
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            String sql = "SELECT * FROM Modules";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                modules.add(rs.getString("moduleName"));//SQL query used with database to call relevant data

            }
        } catch (SQLException e) {
            frm.getErrorMessageFrame(e.toString());
            System.out.println(e.toString());//SQL exception that will return an error message if an error arises
        } finally {
            try {
                rs.close();
                ps.close();
                con.close();
            } catch (SQLException e) {
                frm.getErrorMessageFrame(e.toString());
                System.out.println(e.toString());//SQL exception that will return an error message if an error arises
            }

        }
    }
// method for calling names from Student table in database for students Jlist

    public void fetchStudentName() {
        Connection con = dbConnection.connect();
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            String sql = "SELECT * FROM Students";////SQL query used with database to call relevant data
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                students.add(rs.getString("studentName"));



            }
        } catch (SQLException e) {
            frm.getErrorMessageFrame(e.toString());
            System.out.println(e.toString());//SQL exception that will return an error message if an error arises
        } finally {
            try {
                rs.close();
                ps.close();
                con.close();
            } catch (SQLException e) {
                frm.getErrorMessageFrame(e.toString());
                System.out.println(e.toString());//SQL exception that will return an error message if an error arises
            }
        }
    }
// method for calling names from academic table in database for module leader combobox

    public void fetchModuleLeader() {
        Connection con = dbConnection.connect();
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            String sql = "SELECT * FROM Academics";////SQL query used with database to call relevant data
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                moduleLeader.add(rs.getString("Academicname"));

            }
        } catch (SQLException e) {
            frm.getErrorMessageFrame(e.toString());
            System.out.println(e.toString());//SQL exception that will return an error message if an error arises
        } finally {
            try {
                rs.close();
                ps.close();
                con.close();
            } catch (SQLException e) {
                frm.getErrorMessageFrame(e.toString());
                System.out.println(e.toString());//SQL exception that will return an error message if an error arises
            }

        }
    }
    // method for calling names from tutors table in database for module moderator comboBox
    public void fetchModuleModerator() {
        Connection con = dbConnection.connect();
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            String sql = "SELECT * FROM Tutors";//SQL query used with database to call relevant data
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                moduleModerator.add(rs.getString("TutorName"));

            }
        } catch (SQLException e) {
            frm.getErrorMessageFrame(e.toString());
            System.out.println(e.toString());//SQL exception that will return an error message if an error arises
        } finally {
            try {
                rs.close();
                ps.close();
                con.close();
            } catch (SQLException e) {
                frm.getErrorMessageFrame(e.toString());
                System.out.println(e.toString());//SQL exception that will return an error message if an error arises
            }

        }
    }

//method for reading all data from student table based on studentName input
    public Student readStudentProfile(String studentName) {
        Connection con = dbConnection.connect();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Student student = null;

        try {
            String sql = "Select * from Students where studentName = ? ";//SQL query used with database to call relevant data
            ps = con.prepareStatement(sql);
            ps.setString(1, studentName); //sets parameter its index so it can be accessed later
            rs = ps.executeQuery();
            student = new Student(rs.getString(2),rs.getString(3),rs.getString(4)); //setting each column to a columnIndex so it can be accessed later

            System.out.println("data has been viewed");
        } catch (SQLException e) {
            frm.getErrorMessageFrame(e.toString());
            System.out.println(e.toString());//SQL exception that will return an error message if an error arises
        } finally {
            try {
                rs.close();
                ps.close();
                con.close();

            } catch (SQLException e) {
                frm.getErrorMessageFrame(e.toString());
                System.out.println(e.toString());//SQL exception that will return an error message if an error arises
            }
        }
        return student;
    }
    //method for reading all data from Assignment table based on assignmentName input

    public Assignment readAssignmentProfile(String assignmentName) {
        Connection con = dbConnection.connect();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Assignment assignment = null;

        try {
            String sql = "Select * from Assignments where assignmentName = ? ";//SQL query used with database to call relevant data
            ps = con.prepareStatement(sql);

            ps.setString(1, assignmentName);//sets parameter its index so it can be accessed later
            rs = ps.executeQuery();

            //setting each column to a columnIndex so it can be accessed later
            assignment = new Assignment(rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7));

            System.out.println("data has been viewed");
        } catch (SQLException e) {
            frm.getErrorMessageFrame(e.toString());
            System.out.println(e.toString());//SQL exception that will return an error message if an error arises
        } finally {
            try {
                rs.close();
                ps.close();
                con.close();
            } catch (SQLException e) {
                frm.getErrorMessageFrame(e.toString());
                System.out.println(e.toString());//SQL exception that will return an error message if an error arises
            }
        }
        return assignment;
    }
//method for reading all data from tutors table based on tutorName input

    public Tutors readTutorProfile(String tutorName) {
        Connection con = dbConnection.connect();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Tutors tutors = null;


        try {
            String sql = "Select * from Tutors where tutorName = ? ";//SQL query used with database to call relevant data
            ps = con.prepareStatement(sql);

            ps.setString(1, tutorName); //sets parameter its index so it can be accessed later
            rs = ps.executeQuery();

            //setting each column to a columnIndex so it can be accessed later
            tutors = new Tutors(rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6));

            System.out.println("data has been viewed");
        } catch (SQLException e) {
            frm.getErrorMessageFrame(e.toString());
            System.out.println(e.toString());//SQL exception that will return an error message if an error arises
        } finally {
            try {
                rs.close();
                ps.close();
                con.close();
            } catch (SQLException e) {
                frm.getErrorMessageFrame(e.toString());
                System.out.println(e.toString());//SQL exception that will return an error message if an error arises
            }
        }
        return tutors;
    }
//method for reading all data from Academics table based on academicsName input

    public Academics readAcademicsProfile(String academicNames) {
        Connection con = dbConnection.connect();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Academics academics = null;

        try {
            String sql = "Select * from Academics where AcademicName = ? "; //SQL query used with database to call relevant data
            ps = con.prepareStatement(sql);

            ps.setString(1, academicNames); //sets parameter its index so it can be accessed later
            rs = ps.executeQuery();

            //setting each column to a columnIndex so it can be accessed later
            academics = new Academics(rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6));

            System.out.println("data has been viewed");
        } catch (SQLException e) {
            frm.getErrorMessageFrame(e.toString());
            System.out.println(e.toString());//SQL exception that will return an error message if an error arises
        } finally {
            try {
                rs.close();
                ps.close();
                con.close();
            } catch (SQLException e) {
                frm.getErrorMessageFrame(e.toString());
                System.out.println(e.toString());//SQL exception that will return an error message if an error arises
            }
        }
        return academics;
    }
//method for reading all data from module table based on moduleName input

    public Module readModuleProfile(String moduleName, String moduleCode, String moduleLeader, String moduleModerator) {
        Connection con = dbConnection.connect();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Module module = null;

        try {
            String sql = "Select * from Modules where moduleName = ? "; //SQL query used with database to call relevant data
            ps = con.prepareStatement(sql);

            ps.setString(1, moduleName); //sets parameter its index so it can be accessed later
            rs = ps.executeQuery();

            //setting each column to a columnIndex so it can be accessed later
            module = new Module(rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));

            System.out.println("data has been viewed");
        } catch (SQLException e) {
            frm.getErrorMessageFrame(e.toString());
            System.out.println(e.toString());//SQL exception that will return an error message if an error arises
        } finally {
            try {
                rs.close();
                ps.close();
                con.close();
            } catch (SQLException e) {
                frm.getErrorMessageFrame(e.toString());
                System.out.println(e.toString());//SQL exception that will return an error message if an error arises
            }
        }
        return module;
    }
//method for reading all data from otherPersons table based on otherPersonName input

    public OtherPerson readOtherPersonProfile(String otherPersonName) {
        Connection con = dbConnection.connect();
        PreparedStatement ps = null;
        ResultSet rs = null;
        OtherPerson otherPerson = null;

        try {
            String sql = "Select * from otherPersons where otherPersonsName = ? "; ///SQL query used with database to call relevant data
            ps = con.prepareStatement(sql);

            ps.setString(1, otherPersonName); //sets parameter its index so it can be accessed later
            rs = ps.executeQuery();

            //setting each column to a columnIndex so it can be accessed later
            otherPerson = new OtherPerson(rs.getString(2),rs.getString(3),rs.getString(4));

            System.out.println("data has been viewed");
        } catch (SQLException e) {

                frm.getErrorMessageFrame(e.toString());
                System.out.println(e.toString());//SQL exception that will return an error message if an error arises
                System.out.println(SQLException);

        } finally {
            try {
                rs.close();
                ps.close();
                con.close();
            } catch (SQLException e) {
                frm.getErrorMessageFrame(e.toString());
                System.out.println(e.toString());//SQL exception that will return an error message if an error arises

            }
        }
        return otherPerson;
    }


//method for reading all data from student table based on studentName input, finding the modules assigned to each user and returning the values to a Jlist

    public Vector<String> readModuleClassList(String moduleName){
        Connection con = dbConnection.connect();
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            String sql = "Select studentName from Students where module = ? "; //SQL query used with database to call relevant data
            ps = con.prepareStatement(sql);
            ps.setString(1,moduleName); //sets parameter its index so it can be accessed later
            rs = ps.executeQuery();
            while(rs.next()){
                String studentName = rs.getString(1); //setting each column to a columnIndex so it can be accessed later
                setClassList().add(studentName);
            }
            System.out.println("classList printed");
            System.out.println(setClassList());

        } catch (SQLException e) {
            frm.getErrorMessageFrame(e.toString());
            System.out.println(e.toString());//SQL exception that will return an error message if an error arises

        } finally {
            try {
                rs.close();
                ps.close();
                con.close();
            } catch (SQLException e) {
                frm.getErrorMessageFrame(e.toString());
                System.out.println(e.toString());//SQL exception that will return an error message if an error arises
            }
        }
        return setClassList();
    }

//method for reading Results data from Assignments table based on ModuleName input so that the user can find the lowest Mark for a Class

    public String classMINStatistics(String moduleName){
        Connection con = dbConnection.connect();
        PreparedStatement ps = null;
        ResultSet rs = null;
        String results = ""; // empty value so data can be added later
        try {
            String sql = "Select MIN(Results) From Assignments Where moduleName = ? "; //SQL query used with database to call relevant data
            ps = con.prepareStatement(sql);
            ps.setString(1,moduleName); //sets parameter its index so it can be accessed later
            rs = ps.executeQuery();

            results = rs.getString(1); //setting each column to a columnIndex so it can be accessed later
            System.out.println(results);
        } catch (SQLException e) {
            frm.getErrorMessageFrame(e.toString());
            System.out.println(e.toString());//SQL exception that will return an error message if an error arises
        } finally {
            try {
                rs.close();
                ps.close();
                con.close();
            } catch (SQLException e) {
                frm.getErrorMessageFrame(e.toString());
                System.out.println(e.toString());//SQL exception that will return an error message if an error arises
            }
        }
        return results;
    }
    //method for reading Results data from Assignments table based on ModuleName input so that the user can find the highest Mark for a Class
    public String classMAXStatistics(String moduleName){
        Connection con = dbConnection.connect();
        PreparedStatement ps = null;
        ResultSet rs = null;
        String results = ""; // empty value so data can be added later
        try {
            String sql = "Select MAX(Results) From Assignments Where moduleName = ? "; //SQL query used with database to call relevant data
            ps = con.prepareStatement(sql);
            ps.setString(1,moduleName); //sets parameter its index so it can be accessed later
            rs = ps.executeQuery();

            results = rs.getString(1); //setting each column to a columnIndex so it can be accessed later
            System.out.println(results);

        } catch (SQLException e) {
            frm.getErrorMessageFrame(e.toString());
            System.out.println(e.toString());//SQL exception that will return an error message if an error arises
        } finally {
            try {
                rs.close();
                ps.close();
                con.close();
            } catch (SQLException e) {
                frm.getErrorMessageFrame(e.toString());
                System.out.println(e.toString());//SQL exception that will return an error message if an error arises
            }
        }
        return results;
    }
    //method for reading Results data from Assignments table based on ModuleName input so that the user can find the average Mark for a Class
    public String classAVGStatistics(String moduleName){
        Connection con = dbConnection.connect();
        PreparedStatement ps = null;
        ResultSet rs = null;
        String results = ""; // empty value so data can be added later
        try {
            String sql = "Select AVG(Results) From Assignments Where moduleName = ? "; //SQL query used with database to call relevant data
            ps = con.prepareStatement(sql);
            ps.setString(1,moduleName); //sets parameter its index so it can be accessed later
            rs = ps.executeQuery();

            results = rs.getString(1); //setting each column to a columnIndex so it can be accessed later
            System.out.println(results);

        } catch (SQLException e) {
            frm.getErrorMessageFrame(e.toString());
            System.out.println(e.toString());//SQL exception that will return an error message if an error arises
        } finally {
            try {
                rs.close();
                ps.close();
                con.close();
            } catch (SQLException e) {
                frm.getErrorMessageFrame(e.toString());
                System.out.println(e.toString());//SQL exception that will return an error message if an error arises
            }
        }
        return results;
    }
    //method for reading Results data from Assignments table based on studentName input so that the user can find the lowest Mark for a student
    public String studentMINStatistics(String studentName){
        Connection con = dbConnection.connect();
        PreparedStatement ps = null;
        ResultSet rs = null;
        String results = ""; // empty value so data can be added later
        try {
            String sql = "Select MIN(Results) From Assignments Where students = ? "; //SQL query used with database to call relevant data
            ps = con.prepareStatement(sql);
            ps.setString(1,studentName); //sets parameter its index so it can be accessed later
            rs = ps.executeQuery();

            results = rs.getString(1); //setting each column to a columnIndex so it can be accessed later
            System.out.println(results);
        } catch (SQLException e) {
            System.out.println(e.toString()); //SQL exception that will return an error message if an error arises
        } finally {
            try {
                rs.close();
                ps.close();
                con.close();
            } catch (SQLException e) {
                frm.getErrorMessageFrame(e.toString());
                System.out.println(e.toString());//SQL exception that will return an error message if an error arises
            }
        }
        return results;
    }
    //method for reading Results data from Assignments table based on studentName input so that the user can find the highest Mark for a student

    public String studentMAXStatistics(String studentName){
        Connection con = dbConnection.connect();
        PreparedStatement ps = null;
        ResultSet rs = null;
        String results = ""; // empty value so data can be added later
        try {
            String sql = "Select MAX(Results) From Assignments Where students = ? "; //SQL query used with database to call relevant data
            ps = con.prepareStatement(sql);
            ps.setString(1,studentName); //sets parameter its index so it can be accessed later
            rs = ps.executeQuery();

            results = rs.getString(1); //setting each column to a columnIndex so it can be accessed later
            System.out.println(results);

        } catch (SQLException e) {
            System.out.println(e.toString()); //SQL exception that will return an error message if an error arises
        } finally {
            try {
                rs.close();
                ps.close();
                con.close();
            } catch (SQLException e) {
                frm.getErrorMessageFrame(e.toString());
                System.out.println(e.toString());//SQL exception that will return an error message if an error arises
            }
        }
        return results;
    }
    //method for reading Results data from Assignments table based on studentName input so that the user can find the average Mark for a student

    public String studentAVGStatistics(String studentName){
        Connection con = dbConnection.connect();
        PreparedStatement ps = null;
        ResultSet rs = null;
        String results = ""; // empty value so data can be added later
        try {
            String sql = "Select AVG(Results) From Assignments Where students = ? "; //SQL query used with database to call relevant data
            ps = con.prepareStatement(sql);
            ps.setString(1,studentName); //sets parameter its index so it can be accessed later
            rs = ps.executeQuery();

            results = rs.getString(1); //setting each column to a columnIndex so it can be accessed later
            System.out.println(results);

        } catch (SQLException e) {
            System.out.println(e.toString()); //SQL exception that will return an error message if an error arises
        } finally {
            try {
                rs.close();
                ps.close();
                con.close();
            } catch (SQLException e) {
                frm.getErrorMessageFrame(e.toString());
                System.out.println(e.toString());//SQL exception that will return an error message if an error arises
            }
        }
        return results;
    }


    }





