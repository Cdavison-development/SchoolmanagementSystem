package com.CW1.CameronDavison.GUI_functionality;

import com.CW1.CameronDavison.classData.*;
import com.CW1.CameronDavison.classData.Module;
import com.CW1.CameronDavison.database.dbConnection;
import com.CW1.CameronDavison.database.modifyUser;
import com.CW1.CameronDavison.database.newUser;
import com.CW1.CameronDavison.database.removeUser;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;


//stores all action listeners
public class Actions implements ActionListener {
    Options opt = new Options();
    Frames frm = new Frames();
    dbConnection con = new dbConnection();

    @Override
    public void actionPerformed(ActionEvent e) { //action listener constructor
        opt.getStudentPanel().setVisible(false);
    }

    /*
    all get(name)AC classes used for fetching the GUI data from frames class so the new frame appears
     */
    //calls students frame
    public ActionListener getStudentsAC() {
        ActionListener ac = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frm.addStudents();

            }
        };
        return ac;
    }
    //calls academics frame
    public ActionListener getAcademicAC() {
        ActionListener ac = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frm.addAcademic();
            }
        };
        return ac;
    }
    //calls modules frame
    public ActionListener getModulesAC() {
        ActionListener ac = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                frm.addModules();
            }
        };
        return ac;
    }
    //calls OtherPersons frame
    public ActionListener getOtherPersonsAC() {
        ActionListener ac = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frm.addOtherPersons();
            }
        };
        return ac;
    }
    //calls Tutors frame
    public ActionListener getTutorsAC() {
        ActionListener ac = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frm.addTutor();
            }
        };
        return ac;
    }
    //calls assignments frame
    public ActionListener getAssignmentsAC() {
        ActionListener ac = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frm.addAssignment();
            }
        };
        return ac;
    }
    //calls sets visibility of current frame
    public ActionListener getCloseStudents(JFrame jFrame) {
        ActionListener ac = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.setVisible(false);
                jFrame.dispose();
            }
        };
        return ac;
    }

    //calls classScores frame
    public ActionListener getClassScores() {
        ActionListener ac = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frm.getClassScoresFrame();
            }
        };
        return ac;
    }
//calls student scores frame
    public ActionListener getStudentScores() {
        ActionListener ac = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frm.getStudentScoresFrame();
            }
        };
        return ac;
    }

    /*class calls classMaxStatistics class from dbConnection class and creates action listener
    that will convert data from String to be available for printing in JText areas*/
    public ActionListener getClassMaxScore(JTextArea moduleName, JTextArea Results) {
        ActionListener ac = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dbConnection con = new dbConnection();
                String modName = moduleName.getText();
                String result = con.classMAXStatistics(modName);
                Results.setText(result);
            }
        };
        return ac;
    }
        /*class calls classMinStatistics class from dbConnection class and creates action listener
    that will convert data from String to be available for printing in JText areas*/

    public ActionListener getClassMinScore(JTextArea moduleName, JTextArea Results) {
        ActionListener ac = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dbConnection con = new dbConnection();
                String modName = moduleName.getText();
                String results = con.classMINStatistics(modName);
                Results.setText(results);
            }
        };
        return ac;
    }
        /*class calls classAVGStatistics class from dbConnection class and creates action listener
    that will convert data from String to be available for printing in JText areas*/

    public ActionListener getClassAvgScore(JTextArea moduleName, JTextArea Results) {
        ActionListener ac = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dbConnection con = new dbConnection();
                String modName = moduleName.getText();
                String result = con.classAVGStatistics(modName);
                con.classAVGStatistics(result);
                Results.setText(result);
            }
        };
        return ac;
    }
        /*class calls studentMaxStatistics class from dbConnection class and creates action listener
    that will convert data from String to be available for printing in JText areas*/

    public ActionListener getStudentMaxScore(JTextArea studentName, JTextArea Results) {
        ActionListener ac = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dbConnection con = new dbConnection();
                String stuName = studentName.getText();
                String result = con.studentMAXStatistics(stuName);
                Results.setText(result);
            }
        };
        return ac;
    }
        /*class calls studentMinStatistics class from dbConnection class and creates action listener
    that will convert data from String to be available for printing in JText areas*/

    public ActionListener getStudentMinScore(JTextArea studentName, JTextArea Results) {
        ActionListener ac = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dbConnection con = new dbConnection();
                String stuName = studentName.getText();
                String results = con.studentMINStatistics(stuName);
                Results.setText(results);
            }
        };
        return ac;
    }
        /*class calls studentAVGStatistics class from dbConnection class and creates action listener
    that will convert data from String to be available for printing in JText areas*/

    public ActionListener getStudentAvgScore(JTextArea studentName, JTextArea Results) {
        ActionListener ac = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dbConnection con = new dbConnection();
                String stuName = studentName.getText();
                String result = con.studentAVGStatistics(stuName);
                con.studentAVGStatistics(result);
                Results.setText(result);
            }
        };
        return ac;
    }

    /* opens classlist frame, calling method from frames class*/
    public ActionListener getClassListFrame() {
        ActionListener ac = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frm.getClassListFrame();
            }
        };
        return ac;
    }

    /*calls class readModuleClassName with parameter name and converts it to a string then clears the vector and sets selected value to setClassList vector
     * Then uses default list model to check through all students and return the ones who fit the parameter of being in the module , finally adding these
     * values to a vector and setting the Jlist equal to this new list created which stores the names of students depending on the classList*/
    public ActionListener getClassList(JTextArea moduleName, JList classList) {
        ActionListener ac = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dbConnection con = new dbConnection();
                String name = moduleName.getText();

                Vector<String> list = con.readModuleClassList(name);
                classList.clearSelection();
                classList.setSelectedValue(con.setClassList(), false);
                DefaultListModel model = new DefaultListModel();
                for (String s : list) {
                    model.addElement(s);
                }
                classList.setModel(model);
            }
        };
        return ac;
    }

    /* converts all parameters to String using get functions to make the data input available to be returned to the textfields in the GUI
     * then calls the newStudent function to push these parameters through this method so that it returns the correct output
     *  as this method connected to the student table in the database. uses a list to store multiple values, which are then added to
     * modules String using csv. results are then passed through a substring and set to length - 1 so that all variables can be accessed*/
    public ActionListener getStudentListener(JTextArea names, JList _module, JComboBox empl) {
        ActionListener ac = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = names.getText();
                List<String> mList = (List) _module.getSelectedValuesList();
                String module = "";
                for (String s : mList) {
                    module += s + ",";
                }
                module = module.substring(0, module.length() - 1);
                String employment = (String) empl.getSelectedItem();
                newUser nUser = new newUser();
                nUser.newStudent(name, module, employment);

            }
        };
        return ac;
    }

    /* converts the parameter to String using getText function to make the data input available to be returned to the textfields in the GUI
     * then calls the RemoveStudent function to push these parameters through this method so that it deletes the selected Item in the database as
     *  as well as all its following parameters. this method connected to the Student table in the database*/
    public ActionListener getRemoveStudentListener(JTextArea names) {
        ActionListener ac = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = names.getText();
                removeUser rUser = new removeUser();
                rUser.removeStudent(name);
            }
        };
        return ac;
    }

    /* converts all parameters to String through get functions so that the data will be returned in the proper format based off the data
     * input in the name textfield, then calls the readStudentprofile method and sets it equal to Student variable student, thus giving
     * us access to the Student class as well as setting the variables in the student class equal to the parameters in the readStudentProfile method
     * finally all parameters other than the name parameter are set to their corresponding parameter from the students class by making use of the
     * get methods, then returning all data.multiple csv values are read through splitting a string with commas and applying an integer which iterates for
     * each add function to the indicie list, finally setting the indicie to array through mapping the indicie stream to an integer and setting list variable to this value*/
    public ActionListener getViewStudentListener(JTextArea names, JList _module, JComboBox empl) {
        ActionListener ac = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dbConnection con = new dbConnection();
                String name = names.getText();
                Student student = con.readStudentProfile(name);
                if (student == null) {
                    return;
                }
                String[] moduleList = student.getModule().split(",");
                int count = 0;
                List<Integer> indices = new ArrayList();
                Vector<String> vector = con.getModuleNamesArray();
                for (String m : moduleList) {
                    count = 0;
                    for (String v : vector) {
                        if (m.equals(v)) {
                            indices.add(count);
                            break;
                        }
                        count += 1;
                    }
                }
                int[] ind = indices.stream().mapToInt(i->i).toArray();
                _module.setSelectedIndices(ind);
                empl.setSelectedItem(student.getEmploymentStatus());
            }
        };
        return ac;
    }

    /* converts all parameters to String through get functions so that the data will be returned in the proper format based off the data
    * input in the name textfield, then calls the ModifyStudent method so that the user can set the parameters inside the updateStudent class equal
    * to the newly created strings so that the data in the Jframe can be accessed and edited.uses a list to store multiple values, which are then added to
     modules and students Strings using csv. results are then passed through a substring and set to length - 1 so that all variables can be accessed*/
    public ActionListener getModifyStudentListener(JTextArea names, JList moduleChosen, JComboBox empl) {
        ActionListener ac = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String name = names.getText();
                List<String> mList = (List) moduleChosen.getSelectedValuesList();
                String moduleName = "";
                String employment = (String) empl.getSelectedItem();
                for (String s : mList) {
                    moduleName += s + ",";
                }
                moduleName = moduleName.substring(0, moduleName.length() - 1);

                modifyUser mUser = new modifyUser();
                mUser.updateStudent(moduleName, employment, name);


            }
        };
        return ac;
    }

    /* converts all parameters to String using get functions to make the data input available to be returned to the textfields in the GUI
     * then calls the newOtherPerson function to push these parameters through this method so that it returns the correct output
     *  as this method connected to the OtherPerson table in the database*/
    public ActionListener getOtherPersonListener(JTextArea names, JTextArea job, JComboBox empl) {
        ActionListener ac = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = names.getText();
                String jobs = job.getText();
                String employment = (String) empl.getSelectedItem();
                newUser nUser = new newUser();
                nUser.newOtherPersons(name, jobs, employment);

            }
        };
        return ac;
    }

    /* converts the parameter to String using getText function to make the data input available to be returned to the textfields in the GUI
     * then calls the RemoveOtherPerson function to push these parameters through this method so that it deletes the selected Item in the database as
     *  as well as all its following parameters. this method connected to the OtherPerson table in the database*/
    public ActionListener getRemoveOtherPersonListener(JTextArea names) {
        ActionListener ac = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = names.getText();
                removeUser rUser = new removeUser();
                rUser.removeOtherPersons(name);
            }
        };
        return ac;
    }

    /* converts all parameters to String through get functions so that the data will be returned in the proper format based off the data
     * input in the name textfield, then calls the readOtherPerson method and sets it equal to OtherPerson variable otherPerson, thus giving
     * us access to the OtherPerson class as well as setting the variables in the OtherPerson class equal to the parameters in the readOtherPerson method
     * finally all parameters other than the name parameter are set to their corresponding parameter from the OtherPerson class by making use of the
     * get methods, then returning all data.*/
    public ActionListener getViewOtherPersonListener(JTextArea names, JTextArea job, JComboBox empl) {
        ActionListener ac = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = names.getText();

                dbConnection con = new dbConnection();
                OtherPerson otherPerson = con.readOtherPersonProfile(name);
                if (otherPerson == null) {
                    return;
                }

                job.setText(otherPerson.getJob());
                empl.setSelectedItem(otherPerson.getEmploymentStatus());
            }
        };
        return ac;
    }
    /* converts all parameters to String through get functions so that the data will be returned in the proper format based off the data
     * input in the name textfield, then calls the ModifyOtherPerson method so that the user can set the parameters inside the updateOtherPerson class equal
     * to the newly created strings so that the data in the Jframe can be accessed and edited.*/

    public ActionListener getModifyOtherPersonListener(JTextArea names, JTextArea job, JComboBox empl) {
        ActionListener ac = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String name = names.getText();
                String jobs = job.getText();
                String employment = (String) empl.getSelectedItem();

                modifyUser mUser = new modifyUser();

                mUser.updateOtherPersons(name, jobs, employment);


            }
        };
        return ac;
    }

    /* converts all parameters to String using get functions to make the data input available to be returned to the textfields in the GUI
     * then calls the newModules function to push these parameters through this method so that it returns the correct output
     *  as this method connected to the Modules table in the database. */
    public ActionListener getModulesListener(JTextArea moduleName, JTextArea moduleCode, JComboBox moduleLeader, JComboBox moduleModerator) {
        ActionListener ac = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = moduleName.getText();
                String modCode = moduleCode.getText();
                String modLeader = (String) moduleLeader.getSelectedItem();
                String modModerator = (String) moduleModerator.getSelectedItem();
                newUser nUser = new newUser();
                nUser.newModule(name, modCode, modLeader, modModerator);


            }
        };
        return ac;
    }

    /* converts the parameter to String using getText function to make the data input available to be returned to the textfields in the GUI
     * then calls the RemoveModule function to push these parameters through this method so that it deletes the selected Item in the database as
     *  as well as all its following parameters. this method connected to the Module table in the database*/
    public ActionListener getRemoveModuleListener(JTextArea moduleName) {
        ActionListener ac = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = moduleName.getText();
                removeUser rUser = new removeUser();
                rUser.removeModule(name);
                opt.getRemoveStudents().revalidate();
            }
        };
        return ac;
    }

    /* converts all parameters to String through get functions so that the data will be returned in the proper format based off the data
     * input in the name textfield, then calls the readModule method and sets it equal to Module variable module, thus giving
     * us access to the Module class as well as setting the variables in the Module class equal to the parameters in the readModule method
     * finally all parameters other than the name parameter are set to their corresponding parameter from the Module class by making use of the
     * get methods, then returning all data.multiple csv values are read through splitting a string with commas and applying an integer which iterates for
      each add function to the indicie list, finally setting the indicie to array through mapping the indicie stream to an integer and setting list variable to this value*/
    public ActionListener getViewModuleListener(JTextArea names, JTextArea moduleCode, JComboBox moduleLeader, JComboBox moduleModerator) {
        ActionListener ac = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = names.getText();
                String modCode = moduleCode.getText();
                String modLeader = (String) moduleLeader.getSelectedItem();
                String modModerator = (String) moduleModerator.getSelectedItem();


                dbConnection con = new dbConnection();
                Module module = con.readModuleProfile(name, modCode, modLeader, modModerator);
                if (module == null) {
                    return;
                }
                moduleCode.setText(module.getModuleCode());
                moduleLeader.setSelectedItem(module.getModuleLeader());
                moduleModerator.setSelectedItem(module.getModuleModerator());

            }
        };
        return ac;
    }

    /* converts all parameters to String through get functions so that the data will be returned in the proper format based off the data
     * input in the name textfield, then calls the ModifyModules method so that the user can set the parameters inside the updateModules class equal
     * to the newly created strings so that the data in the Jframe can be accessed and edited.*/
    public ActionListener getModifyModulesListener(JTextArea names, JTextArea moduleCode, JComboBox moduleLeader, JComboBox moduleModerator) {
        ActionListener ac = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String name = names.getText();
                String modCode = moduleCode.getText();
                String modLeader = (String) moduleLeader.getSelectedItem();
                String modModerator = (String) moduleModerator.getSelectedItem();

                modifyUser mUser = new modifyUser();
                mUser.updateModule(name, modCode, modLeader, modModerator);
            }
        };
        return ac;
    }

    /* converts all parameters to String using get functions to make the data input available to be returned to the textfields in the GUI
      * then calls the newTutor function to push these parameters through this method so that it returns the correct output
      *  as this method connected to the Tutor table in the database uses a list to store multiple values, which are then added to
       modules and students Strings using csv. results are then passed through a substring and set to length - 1 so that all variables can be accessed*/
    public ActionListener getTutorListener(JTextArea names, JList moduleChosen, JComboBox officeLocation, JComboBox areaOfExpertise, JList studentsSupervised) {
        ActionListener ac = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //List testList = studentsSupervised.getSelectedValuesList();
                String name = names.getText();
                List<String> mList = (List) moduleChosen.getSelectedValuesList();
                String moduleName = "";
                String offLocation = (String) officeLocation.getSelectedItem();
                String Aoe = (String) areaOfExpertise.getSelectedItem();
                List<String> mList2  = (List) studentsSupervised.getSelectedValuesList();
                String stuSupervised = "";

                for (String s : mList) {
                    moduleName += s + ",";
                }
                moduleName = moduleName.substring(0, moduleName.length() - 1);

                for(String s : mList2){
                    stuSupervised += s + ",";
                }
                stuSupervised = stuSupervised.substring(0, stuSupervised.length() - 1);

                newUser nUser = new newUser();
                nUser.newTutors(name, moduleName, offLocation, Aoe, stuSupervised);
            }
        };
        return ac;
    }

    /* converts the parameter to String using getText function to make the data input available to be returned to the textfields in the GUI
     * then calls the RemoveTutor function to push these parameters through this method so that it deletes the selected Item in the database as
     *  as well as all its following parameters. this method connected to the Tutor table in the database*/
    public ActionListener getRemoveTutorListener(JTextArea names) {
        ActionListener ac = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = names.getText();
                removeUser rUser = new removeUser();
                rUser.removeTutor(name);
                opt.getRemoveStudents().revalidate();
            }
        };
        return ac;
    }

    /* converts all parameters to String through get functions so that the data will be returned in the proper format based off the data
     * input in the name textfield, then calls the readTutor method and sets it equal to Tutor variable tutor, thus giving
     * us access to the Tutor class as well as setting the variables in the Tutor class equal to the parameters in the readTutor method
     * finally all parameters other than the name parameter are set to their corresponding parameter from the Tutor class by making use of the
     * get methods, then returning all data.multiple csv values are read through splitting a string with commas and applying an integer which iterates for
      each add function to the indicie list, finally setting the indicie to array through mapping the indicie stream to an integer and setting list variable to this value*/
    public ActionListener getViewTutorListener(JTextArea names, JList moduleChosen, JComboBox officeLocation, JComboBox areaOfExpertise, JList studentsSupervised) {
        ActionListener ac = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = names.getText();

                Tutors tutor = con.readTutorProfile(name);
                if (tutor == null) {
                    return;
                }
                String[] moduleList = tutor.getModuleChosen().split(",");
                String[] studentList = tutor.getStudentsSupervised().split(",");
                int count = 0;
                int count2 = 0;
                List<Integer> indices = new ArrayList();
                List<Integer> indices2 = new ArrayList();
                Vector<String> modVector = con.getModuleNamesArray();
                Vector<String> stuVector = con.getStudentNamesArray();
                for (String m : moduleList) {
                    count = 0;
                    for (String v1 : modVector) {
                        if (m.equals(v1)) {
                            indices.add(count);
                            break;
                        }
                        count += 1;
                    }
                }
                for (String m : studentList) {
                    count2 = 0;
                    for (String v2 : stuVector) {
                        if (m.equals(v2)) {
                            indices2.add(count2);
                            break;
                        }
                        count2 += 1;
                    }
                }
                int[] ind = indices.stream().mapToInt(i->i).toArray();
                int[] ind2 = indices2.stream().mapToInt(i->i).toArray();

                moduleChosen.clearSelection();
                studentsSupervised.clearSelection();
                moduleChosen.setSelectedIndices(ind);
                officeLocation.setSelectedItem(tutor.getOfficeLocation());
                areaOfExpertise.setSelectedItem(tutor.getAreaOfExpertise());
                studentsSupervised.setSelectedIndices(ind2);
            }
        };
        return ac;
    }

    /* converts all parameters to String through get functions so that the data will be returned in the proper format based off the data
     * input in the name textfield, then calls the Modifytutor method so that the user can set the parameters inside the updatetutors class equal
     * to the newly created strings so that the data in the Jframe can be accessed and edited.uses a list to store multiple values, which are then added to
      modules and students Strings using csv. results are then passed through a substring and set to length - 1 so that all variables can be accessed*/
    public ActionListener getModifyTutorListener(JTextArea names, JList moduleChosen, JComboBox officeLocation, JComboBox areaOfExpertise, JList studentsSupervised) {
        ActionListener ac = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String name = names.getText();
                List<String> mList = (List) moduleChosen.getSelectedValuesList();
                String moduleName = "";
                String offLocation = (String) officeLocation.getSelectedItem();
                String Aoe = (String) areaOfExpertise.getSelectedItem();
                List<String> mList2  = (List) studentsSupervised.getSelectedValuesList();
                String stuSupervised = "";

                for (String s : mList) {
                    moduleName += s + ",";
                }
                for(String s : mList2){
                    stuSupervised += s + ",";
                }
                moduleName = moduleName.substring(0, moduleName.length() - 1);
                stuSupervised = stuSupervised.substring(0, stuSupervised.length() - 1);
                modifyUser mUser = new modifyUser();
                mUser.updateTutor(name, moduleName, offLocation, Aoe, stuSupervised);
            }
        };
        return ac;
    }

    /* converts all parameters to String using get functions to make the data input available to be returned to the textfields in the GUI
       * then calls the newAcademic function to push these parameters through this method so that it returns the correct output
       *  as this method connected to the Academic table in the database.uses a list to store multiple values, which are then added to
        modules and students Strings using csv. results are then passed through a substring and set to length - 1 so that all variables can be accessed*/
    public ActionListener getAcademicListener(JTextArea names, JList modulesChosen, JComboBox position, JComboBox areaOfExpertise, JList studentsSupervised) {
        ActionListener ac = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = names.getText();
                List<String> mList = (List) modulesChosen.getSelectedValuesList();
                String moduleName = "";
                String pos = (String) position.getSelectedItem();
                String Aoe = (String) areaOfExpertise.getSelectedItem();
                List<String> mList2  = (List) studentsSupervised.getSelectedValuesList();
                String stuSupervised = "";

                for (String s : mList) {
                    moduleName += s + ",";
                }
                for(String s : mList2){
                    stuSupervised += s + ",";
                }
                moduleName = moduleName.substring(0, moduleName.length() - 1);
                stuSupervised = stuSupervised.substring(0, stuSupervised.length() - 1);
                newUser nUser = new newUser();
                nUser.newAcademic(name, moduleName, pos, Aoe, stuSupervised);
            }
        };
        return ac;
    }

    /* converts the parameter to String using getText function to make the data input available to be returned to the textfields in the GUI
     * then calls the RemoveAcademic function to push these parameters through this method so that it deletes the selected Item in the database as
     *  as well as all its following parameters. this method connected to the Academic table in the database*/
    public ActionListener getRemoveAcademicListener(JTextArea names) {
        ActionListener ac = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = names.getText();
                removeUser rUser = new removeUser();
                rUser.removeAcademic(name);
                opt.getRemoveStudents().revalidate();
            }
        };
        return ac;
    }

    /* converts all parameters to String through get functions so that the data will be returned in the proper format based off the data
     * input in the name textfield, then calls the readAcademics method and sets it equal to Academics variable academics, thus giving
     * us access to the Academics class as well as setting the variables in the Academics class equal to the parameters in the readAcademics method
     * finally all parameters other than the name parameter are set to their corresponding parameter from the Academics class by making use of the
     * get methods, then returning all data.multiple csv values are read through splitting a string with commas and applying an integer which iterates for
      each add function to the indicie list, finally setting the indicie to array through mapping the indicie stream to an integer and setting list variable to this value*/
    public ActionListener getViewAcademicsListener(JTextArea names, JList modulesChosen, JComboBox position, JComboBox areaOfExpertise, JList studentsSupervised) {
        ActionListener ac = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = names.getText();

                Academics academics = con.readAcademicsProfile(name);
                if (academics == null) {
                    return;
                }
                String[] moduleList = academics.getModulesChosen().split(",");
                String[] studentList = academics.getStudentsSupervised().split(",");
                int count = 0;
                int count2 = 0;
                List<Integer> indices = new ArrayList();
                List<Integer> indices2 = new ArrayList();
                Vector<String> modVector = con.getModuleNamesArray();
                Vector<String> stuVector = con.getStudentNamesArray();
                for (String m : moduleList) {
                    count = 0;
                    for (String v1 : modVector) {
                        if (m.equals(v1)) {
                            indices.add(count);
                            break;
                        }
                        count += 1;
                    }
                }
                for (String m : studentList) {
                    count2 = 0;
                    for (String v2 : stuVector) {
                        if (m.equals(v2)) {
                            indices2.add(count2);
                            break;
                        }
                        count2 += 1;
                    }
                }
                int[] ind = indices.stream().mapToInt(i->i).toArray();
                int[] ind2 = indices2.stream().mapToInt(i->i).toArray();
                modulesChosen.clearSelection();
                studentsSupervised.clearSelection();
                modulesChosen.setSelectedIndices(ind);
                position.setSelectedItem(academics.getPosition());
                areaOfExpertise.setSelectedItem(academics.getAreaOfExpertise());
                studentsSupervised.setSelectedIndices(ind2);

            }
        };
        return ac;
    } /* converts all parameters to String through get functions so that the data will be returned in the proper format based off the data
     * input in the name textfield, then calls the ModifyAcademics method so that the user can set the parameters inside the updateAcademics class equal
     * to the newly created strings so that the data in the Jframe can be accessed and edited.uses a list to store multiple values, which are then added to
      modules and students Strings using csv. results are then passed through a substring and set to length - 1 so that all variables can be accessed*/

    public ActionListener getModifyAcademicsListener(JTextArea names, JList modulesChosen, JComboBox position, JComboBox areaOfExpertise, JList studentsSupervised) {
        ActionListener ac = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String name = names.getText();
                List<String> mList = (List) modulesChosen.getSelectedValuesList();
                String moduleName = "";
                String pos = (String) position.getSelectedItem();
                String Aoe = (String) areaOfExpertise.getSelectedItem();
                List<String> mList2  = (List) studentsSupervised.getSelectedValuesList();
                String stuSupervised = "";

                for (String s : mList) {
                    moduleName += s + ",";
                }
                moduleName = moduleName.substring(0, moduleName.length() - 1);

                for(String s : mList2){
                    stuSupervised += s + ",";
                }
                stuSupervised = stuSupervised.substring(0, stuSupervised.length() - 1);
                modifyUser mUser = new modifyUser();
                mUser.updateAcademic(name, moduleName, pos, Aoe, stuSupervised);


            }
        };
        return ac;
    }

    /* converts all parameters to String through get functions so that the data will be returned in the proper format based off the data
      * input in the name textfield, then calls the ModifyAcademics method so that the user can set the parameters inside the updateAcademics class equal
      * to the newly created strings so that the data in the Jframe can be accessed and edited.uses a list to store multiple values, which are then added to
       modules and students Strings using csv. results are then passed through a substring and set to length - 1 so that all variables can be accessed*/
    public ActionListener getAssignmentListener(JTextArea names, JList moduleChosen, JTextArea results, JTextArea weekAssigned, JTextArea feedback, JList studentsSupervised) {
        ActionListener ac = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = names.getText();
                List<String> mList = (List) moduleChosen.getSelectedValuesList();
                String moduleName = "";
                String result = results.getText();
                String weekAssignedString = weekAssigned.getText();
                String feedbackString = feedback.getText();
                List<String> mList2  = (List) studentsSupervised.getSelectedValuesList();
                String stuSupervised = "";
                for (String s : mList) {
                    moduleName += s + ",";
                }
                moduleName = moduleName.substring(0, moduleName.length() - 1);

                for(String s : mList2){
                    stuSupervised += s + ",";
                }
                stuSupervised = stuSupervised.substring(0, stuSupervised.length() - 1);

                newUser nUser = new newUser();
                nUser.newAssignment(name, moduleName, result, weekAssignedString, feedbackString, stuSupervised);

            }
        };
        return ac;
    }

    /* converts all parameters to String using get functions to make the data input available to be returned to the textfields in the GUI
     * then calls the newAssignment function to push these parameters through this method so that it returns the correct output
     *  as this method connected to the Assignment table in the database. uses a list to store multiple values, which are then added to
      modules and students Strings using csv. results are then passed through a substring and set to length - 1 so that all variables can be accessed*/
    public ActionListener getRemoveAssignmentListener(JTextArea names) {
        ActionListener ac = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = names.getText();
                removeUser rUser = new removeUser();
                rUser.removeAssignment(name);
                opt.getRemoveStudents().revalidate();
            }
        };
        return ac;
    }

    /* converts all parameters to String through get functions so that the data will be returned in the proper format based off the data
     * input in the name textfield, then calls the readAssignment method and sets it equal to Assignment variable assignment, thus giving
     * us access to the Assignment class as well as setting the variables in the Assignment class equal to the parameters in the readAssignment method
     * finally all parameters other than the name parameter are set to their corresponding parameter from the Assignment class by making use of the
     * get methods, then returning all data.multiple csv values are read through splitting a string with commas and applying an integer which iterates for
      each add function to the indicie list, finally setting the indicie to array through mapping the indicie stream to an integer and setting list variable to this value*/
    public ActionListener getViewAssignmentListener(JTextArea names, JList moduleName, JTextArea results, JTextArea weekAssigned, JTextArea feedback, JList students) {
        ActionListener ac = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = names.getText();

                dbConnection con = new dbConnection();
                Assignment assignment = con.readAssignmentProfile(name);
                if (assignment == null) {
                    return;
                }
                String[] moduleList = assignment.getModuleName().split(",");
                String[] studentList = assignment.getStudents().split(",");
                int count = 0;
                int count2 = 0;
                List<Integer> indices = new ArrayList();
                List<Integer> indices2 = new ArrayList();
                Vector<String> modVector = con.getModuleNamesArray();
                Vector<String> stuVector = con.getStudentNamesArray();
                for (String m : moduleList) {
                    count = 0;
                    for (String v1 : modVector) {
                        if (m.equals(v1)) {
                            indices.add(count);
                            break;
                        }
                        count += 1;
                    }
                }
                for (String m : studentList) {
                    count2 = 0;
                    for (String v2 : stuVector) {
                        if (m.equals(v2)) {
                            indices2.add(count2);
                            break;
                        }
                        count2 += 1;
                    }
                }
                int[] ind = indices.stream().mapToInt(i->i).toArray();
                int[] ind2 = indices2.stream().mapToInt(i->i).toArray();
                moduleName.clearSelection();
                students.clearSelection();
                moduleName.setSelectedIndices(ind);
                results.setText(assignment.getResults());
                weekAssigned.setText(assignment.getWeekAssigned());
                feedback.setText(assignment.getFeedback());
                students.setSelectedIndices(ind2);

            }
        };
        return ac;
    }

    /* converts all parameters to String through get functions so that the data will be returned in the proper format based off the data
     * input in the name textfield, then calls the ModifyAssignment method so that the user can set the parameters inside the updateAssignment class equal
     * to the newly created strings so that the data in the Jframe can be accessed and edited. uses a list to store multiple values, which are then added to
      modules and students Strings using csv. results are then passed through a substring and set to length - 1 so that all variables can be accessed*/
    public ActionListener getModifyAssignmentListener(JTextArea names, JList moduleChosen, JTextArea results, JTextArea weekAssigned, JTextArea feedback, JList studentsSupervised) {
        ActionListener ac = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String name = names.getText();
                List<String> mList = (List) moduleChosen.getSelectedValuesList();
                String moduleName = "";
                List<String> mList2  = (List) studentsSupervised.getSelectedValuesList();
                String stuSupervised = "";
                String result = results.getText();
                String wkAssigned = weekAssigned.getText();
                String fdback = feedback.getText();
                for (String s : mList) {
                    moduleName += s + ",";
                }
                moduleName = moduleName.substring(0, moduleName.length() - 1);

                for(String s : mList2){
                    stuSupervised += s + ",";
                }
                stuSupervised = stuSupervised.substring(0, stuSupervised.length() - 1);

                modifyUser mUser = new modifyUser();
                mUser.updateAssignment(name, moduleName, result, wkAssigned, fdback, stuSupervised);
            }
        };
        return ac;
    }
    /* refresh action listeners which will return an new page with updated values*/
    public ActionListener getRefreshAcademics(JFrame jFrame) {
        ActionListener ac = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.dispose();
                opt.getModuleModerator().validate();
                opt.getModuleLeader().validate();
                frm.addAcademic();
            }
        };
        return ac;
    }
    public ActionListener getRefreshAssignments(JFrame jFrame) {
        ActionListener ac = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.dispose();
                frm.addAssignment();
            }
        };
        return ac;
    }
    public ActionListener getRefreshModule(JFrame jFrame) {
        ActionListener ac = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.dispose();
                //comboBox1.repaint();
                //comboBox2.repaint();
                frm.addModules();
            }
        };
        return ac;
    }
    public ActionListener getRefreshOtherPerson(JFrame jFrame) {
        ActionListener ac = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.dispose();
                frm.addOtherPersons();
            }
        };
        return ac;
    }
    public ActionListener getRefreshStudents(JFrame jFrame) {
        ActionListener ac = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.dispose();
                frm.addStudents();
            }
        };
        return ac;
    }
    public ActionListener getRefreshTutors(JFrame jFrame) {
        ActionListener ac = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.dispose();
                frm.addTutor();
            }
        };
        return ac;
    }


}






















