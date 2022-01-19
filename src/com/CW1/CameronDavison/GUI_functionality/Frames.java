package com.CW1.CameronDavison.GUI_functionality;

import javax.swing.*;

public class Frames {
    JFrame jFrame = null;
    Options opt = new Options();


    /*addTutor class that adds Jframe components to a panel and sets the x and y axis of where these components are
    * to be placed in GUI. makes use of GridBagConstraints as a layout manager which enables components to be laid out in
    * this fashion  */


        public void addTutor() {
            if(jFrame != null){
                jFrame.setVisible(true);
                return;
           }
/////////// first columns ///////////////////////
            opt.getGridBagConstraints().weightx = 0.5;
            opt.getGridBagConstraints().weighty = 0.5;
/// labels that will all be on left hand side of column///////
            opt.getGridBagConstraints().gridx = 0;
            opt.getGridBagConstraints().gridy = 0;
            opt.getPanel().add(opt.getNamesText(), opt.getGridBagConstraints());

            opt.getGridBagConstraints().gridx = 0;
            opt.getGridBagConstraints().gridy = 1;
            opt.getPanel().add(opt.getModuleNameText(), opt.getGridBagConstraints());

            opt.getGridBagConstraints().gridx = 0;
            opt.getGridBagConstraints().gridy = 2;
            opt.getPanel().add(opt.getOfficeLocationText(), opt.getGridBagConstraints());

            opt.getGridBagConstraints().gridx = 0;
            opt.getGridBagConstraints().gridy = 3;
            opt.getPanel().add(opt.getAreaOfExpertiseText(), opt.getGridBagConstraints());

            opt.getGridBagConstraints().gridx = 0;
            opt.getGridBagConstraints().gridy = 4;
            opt.getPanel().add(opt.getStudentsSupervisedText(), opt.getGridBagConstraints());


/////////// second column ////////////////////
// / Swing components that will be added to the system, all to be fit
// into the right side of the panel, other than the buttons that will be on the bottom of the screen///////
            opt.getGridBagConstraints().gridx = 1;
            opt.getGridBagConstraints().gridy = 0;
            JTextArea name = opt.getNames(); //setting a called method to a local variable
            opt.getPanel().add(name, opt.getGridBagConstraints());

            opt.getGridBagConstraints().gridx = 1;
            opt.getGridBagConstraints().gridy = 1;
            JList moduleName = opt.getModulesChosen(); //setting a called method to a local variable
            opt.getPanel().add(moduleName, opt.getGridBagConstraints());
            opt.getPanel().add(opt.getModulesScrollPane(), opt.getGridBagConstraints());


            opt.getGridBagConstraints().gridx = 1;
            opt.getGridBagConstraints().gridy = 2;
            JComboBox officeLocation = opt.getOfficeLocation(); //setting a called method to a local variable
            opt.getPanel().add(officeLocation, opt.getGridBagConstraints());

            opt.getGridBagConstraints().gridx = 1;
            opt.getGridBagConstraints().gridy = 3;
            JComboBox areaOfExpertise = opt.getAreaOfExpertise(); //setting a called method to a local variable
            opt.getPanel().add( areaOfExpertise, opt.getGridBagConstraints());

            opt.getGridBagConstraints().gridx = 1;
            opt.getGridBagConstraints().gridy = 4;
            JList studentsSupervised = opt.getStudentsSupervised(); //setting a called method to a local variable
            opt.getPanel().add(studentsSupervised, opt.getGridBagConstraints());
            opt.getPanel().add(opt.getStudentsScrollPane(), opt.getGridBagConstraints());

            opt.getGridBagConstraints().gridx = 1;
            opt.getGridBagConstraints().gridy = 5;
            JButton b = opt.getSubmitButton(); //setting a called method to a local variable
            Actions actions = new Actions();
            //sets local variable button to an action listener AddTutor class thus giving functionality to this button.
            b.addActionListener(actions.getTutorListener(name,moduleName,officeLocation,areaOfExpertise,studentsSupervised));
            opt.getPanel().add(opt.getSubmitButton(), opt.getGridBagConstraints());

            opt.getGridBagConstraints().gridx = 0;
            opt.getGridBagConstraints().gridy = 5;
            JButton r = opt.getRemoveTutors(); //setting a called method to a local variable
            //sets local variable button to an action listener RemoveTutor class thus giving functionality to this button.
            r.addActionListener(actions.getRemoveTutorListener(name));
            opt.getPanel().add(opt.getRemoveTutors(), opt.getGridBagConstraints());

            opt.getGridBagConstraints().gridx = 2;
            opt.getGridBagConstraints().gridy = 5;
            JButton v = opt.getViewProfile(); //setting a called method to a local variable
            //sets local variable button to an action listener ViewTutor class thus giving functionality to this button.
            v.addActionListener(actions.getViewTutorListener(name,moduleName,officeLocation,areaOfExpertise,studentsSupervised));
            opt.getPanel().add(opt.getViewProfile(), opt.getGridBagConstraints());

            opt.getGridBagConstraints().gridx = 1;
            opt.getGridBagConstraints().gridy = 6;
            JButton m = opt.getModifyButton(); //setting a called method to a local variable
            //sets local variable button to an action listener ModifyTutor class thus giving functionality to this button.
            m.addActionListener(actions.getModifyTutorListener(name,moduleName,officeLocation,areaOfExpertise,studentsSupervised));
            opt.getPanel().add(opt.getModifyButton(), opt.getGridBagConstraints());

            opt.getGridBagConstraints().gridx = 0;
            opt.getGridBagConstraints().gridy = 6;
            jFrame = opt.getFrame();
            opt.getPanel().add(opt.getClose(jFrame),opt.getGridBagConstraints());//adds panel with components on to the Frame

            opt.getGridBagConstraints().gridx = 2;
            opt.getGridBagConstraints().gridy = 6;
            JButton re = opt.getRefresh(jFrame);
            re.addActionListener(actions.getRefreshTutors(jFrame));
            opt.getPanel().add(opt.getRefresh(jFrame),opt.getGridBagConstraints());//adds panel with components on to the Frame


            jFrame.add(opt.getPanel());
        }

    /*addAssignment class that adds Jframe components to a panel and sets the x and y axis of where these components are
     * to be placed in GUI. makes use of GridBagConstraints as a layout manager which enables components to be laid out in
     * this fashion  */

    public void addAssignment(){
        if(jFrame != null){
            jFrame.setVisible(true);
            return;
        }

/////////// first columns ///////////////////////
            opt.getGridBagConstraints().weightx = 0.5;
            opt.getGridBagConstraints().weighty = 0.5;

/// labels that will all be on left hand side of column///////
            opt.getGridBagConstraints().gridx = 0;
            opt.getGridBagConstraints().gridy = 0;
            opt.getPanel().add(opt.getNamesText(), opt.getGridBagConstraints());

            opt.getGridBagConstraints().gridx = 0;
            opt.getGridBagConstraints().gridy = 1;
            opt.getPanel().add(opt.getModuleNameText(), opt.getGridBagConstraints());

            opt.getGridBagConstraints().gridx = 0;
            opt.getGridBagConstraints().gridy = 2;
            opt.getPanel().add(opt.getResultsText(), opt.getGridBagConstraints());

            opt.getGridBagConstraints().gridx = 0;
            opt.getGridBagConstraints().gridy = 3;
            opt.getPanel().add(opt.getWeekAssignedText(), opt.getGridBagConstraints());

            opt.getGridBagConstraints().gridx = 0;
            opt.getGridBagConstraints().gridy = 4;
            opt.getPanel().add(opt.getFeedBackText(), opt.getGridBagConstraints());

            opt.getGridBagConstraints().gridx = 0;
            opt.getGridBagConstraints().gridy = 5;
            opt.getPanel().add(opt.getUsersText(), opt.getGridBagConstraints());



/////////// second column ////////////////////
        // / Swing components that will be added to the system, all to be fit
// into the right side of the panel, other than the buttons that will be on the bottom of the screen///////
            opt.getGridBagConstraints().gridx = 1;
            opt.getGridBagConstraints().gridy = 0;
            JTextArea names = opt.getNames(); //setting a called method to a local variable
            opt.getPanel().add(names, opt.getGridBagConstraints());

            opt.getGridBagConstraints().gridx = 1;
            opt.getGridBagConstraints().gridy = 1;
            JList moduleName = opt.getModulesChosen(); //setting a called method to a local variable
            opt.getPanel().add(moduleName, opt.getGridBagConstraints());
            opt.getPanel().add(opt.getModulesScrollPane(), opt.getGridBagConstraints());


            opt.getGridBagConstraints().gridx = 1;
            opt.getGridBagConstraints().gridy = 2;
            JTextArea results = opt.getResults(); //setting a called method to a local variable
            opt.getPanel().add(results, opt.getGridBagConstraints());

            opt.getGridBagConstraints().gridx = 1;
            opt.getGridBagConstraints().gridy = 3;
            JTextArea weekAssigned = opt.getWeekAssigned(); //setting a called method to a local variable
            opt.getPanel().add(weekAssigned, opt.getGridBagConstraints());

            opt.getGridBagConstraints().gridx = 1;
            opt.getGridBagConstraints().gridy = 4;
            JTextArea feedback = opt.getFeedback(); //setting a called method to a local variable
            opt.getPanel().add(feedback, opt.getGridBagConstraints());

            opt.getGridBagConstraints().gridx = 1;
            opt.getGridBagConstraints().gridy = 5;
            JList studentsSupervised = opt.getStudentsSupervised(); //setting a called method to a local variable
            opt.getPanel().add(studentsSupervised, opt.getGridBagConstraints());
            opt.getPanel().add(opt.getStudentsScrollPane(), opt.getGridBagConstraints()); //adding scrollpane object to list

            opt.getGridBagConstraints().gridx = 1;
            opt.getGridBagConstraints().gridy = 6;
            JButton b = opt.getSubmitButton(); //setting a called method to a local variable
            //sets local variable button to an action listener getAssignmentListener class thus giving functionality to this button.
            Actions actions = new Actions();
            b.addActionListener(actions.getAssignmentListener(names,moduleName,results,weekAssigned,feedback,studentsSupervised));
            opt.getPanel().add(opt.getSubmitButton(), opt.getGridBagConstraints());

            opt.getGridBagConstraints().gridx = 0;
            opt.getGridBagConstraints().gridy = 6;
            JButton r = opt.getRemoveAssignments(); //setting a called method to a local variable
            //sets local variable button to an action listener RemoveAssignment class thus giving functionality to this button.
            r.addActionListener(actions.getRemoveAssignmentListener(names));
            opt.getPanel().add(opt.getRemoveAssignments(), opt.getGridBagConstraints());

            opt.getGridBagConstraints().gridx = 2;
            opt.getGridBagConstraints().gridy = 6;
            JButton v = opt.getViewProfile(); //setting a called method to a local variable
            //sets local variable button to an action listener ViewAssignment class thus giving functionality to this button.
            v.addActionListener(actions.getViewAssignmentListener(names,moduleName,results,weekAssigned,feedback,studentsSupervised));
            opt.getPanel().add(opt.getViewProfile(), opt.getGridBagConstraints());

            opt.getGridBagConstraints().gridx = 2;
            opt.getGridBagConstraints().gridy = 7;
            JButton m = opt.getModifyButton(); //setting a called method to a local variable
        //sets local variable button to an action listener ModifyAssignment class thus giving functionality to this button.
            m.addActionListener(actions.getModifyAssignmentListener(names,moduleName,results,weekAssigned,feedback,studentsSupervised));
            opt.getPanel().add(opt.getModifyButton(), opt.getGridBagConstraints());

            opt.getGridBagConstraints().gridx = 0;
            opt.getGridBagConstraints().gridy = 7;
            jFrame = opt.getFrame();
            opt.getPanel().add(opt.getClose(jFrame),opt.getGridBagConstraints());
            jFrame.add(opt.getPanel()); //adds panel with components on to the Frame

            opt.getGridBagConstraints().gridx = 1;
            opt.getGridBagConstraints().gridy = 7;
            JButton re = opt.getRefresh(jFrame);
            re.addActionListener(actions.getRefreshAssignments(jFrame));
            opt.getPanel().add(opt.getRefresh(jFrame),opt.getGridBagConstraints());//adds panel with components on to the Frame
        }

    /*addAcademic class that adds Jframe components to a panel and sets the x and y axis of where these components are
     * to be placed in GUI. makes use of GridBagConstraints as a layout manager which enables components to be laid out in
     * this fashion  */
    public void addAcademic() {
        if(jFrame != null){
            jFrame.setVisible(true);
            return;
        }
        /////////// first columns ///////////////////////
        opt.getGridBagConstraints().weightx = 0.5;
        opt.getGridBagConstraints().weighty = 0.5;
/// labels that will all be on left hand side of column///////
        opt.getGridBagConstraints().gridx = 0;
        opt.getGridBagConstraints().gridy = 0;
        opt.getPanel().add(opt.getNamesText(), opt.getGridBagConstraints());

        opt.getGridBagConstraints().gridx = 0;
        opt.getGridBagConstraints().gridy = 1;
        opt.getPanel().add(opt.getModulesChosenText(), opt.getGridBagConstraints());

        opt.getGridBagConstraints().gridx = 0;
        opt.getGridBagConstraints().gridy = 2;
        opt.getPanel().add(opt.getPositionText(), opt.getGridBagConstraints());

        opt.getGridBagConstraints().gridx = 0;
        opt.getGridBagConstraints().gridy = 3;
        opt.getPanel().add(opt.getAreaOfExpertiseText(), opt.getGridBagConstraints());

        opt.getGridBagConstraints().gridx = 0;
        opt.getGridBagConstraints().gridy = 4;
        opt.getPanel().add(opt.getStudentsSupervisedText(), opt.getGridBagConstraints());


/////////// second column ////////////////////
        // / Swing components that will be added to the system, all to be fit
// into the right side of the panel, other than the buttons that will be on the bottom of the screen///////
        opt.getGridBagConstraints().gridx = 1;
        opt.getGridBagConstraints().gridy = 0;
        JTextArea names = opt.getNames();//setting a called method to a local variable
        opt.getPanel().add(names, opt.getGridBagConstraints());

        opt.getGridBagConstraints().gridx = 1;
        opt.getGridBagConstraints().gridy = 1;
        JList modulesChosen = opt.getModulesChosen();//setting a called method to a local variable
        opt.getPanel().add(modulesChosen, opt.getGridBagConstraints());
        opt.getPanel().add(opt.getModulesScrollPane(), opt.getGridBagConstraints());//adding scrollpane object to list

        opt.getGridBagConstraints().gridx = 1;
        opt.getGridBagConstraints().gridy = 2;
        JComboBox position = opt.getPosition();//setting a called method to a local variable
        opt.getPanel().add(position, opt.getGridBagConstraints());

        opt.getGridBagConstraints().gridx = 1;
        opt.getGridBagConstraints().gridy = 3;
        JComboBox areaOfExpertise = opt.getAreaOfExpertise();//setting a called method to a local variable
        opt.getPanel().add(areaOfExpertise, opt.getGridBagConstraints());

        opt.getGridBagConstraints().gridx = 1;
        opt.getGridBagConstraints().gridy = 4;
        JList studentsSupervised = opt.getStudentsSupervised();//setting a called method to a local variable

        opt.getPanel().add(studentsSupervised, opt.getGridBagConstraints());
        opt.getPanel().add(opt.getStudentsScrollPane(), opt.getGridBagConstraints()); // adding scrollPane object to students list


        opt.getGridBagConstraints().gridx = 1;
        opt.getGridBagConstraints().gridy = 5;
        JButton b = opt.getSubmitButton();//setting a called method to a local variable
        Actions actions = new Actions();
        //sets local variable button to an action listener AcademicListener class thus giving functionality to this button.
        b.addActionListener(actions.getAcademicListener(names, modulesChosen , position ,areaOfExpertise ,studentsSupervised));
        opt.getPanel().add(opt.getSubmitButton(), opt.getGridBagConstraints());

        opt.getGridBagConstraints().gridx = 0;
        opt.getGridBagConstraints().gridy = 5;
        JButton r = opt.getRemoveAcademics();//setting a called method to a local variable
        //sets local variable button to an action listener RemoveAcademic class thus giving functionality to this button.
        r.addActionListener(actions.getRemoveAcademicListener(names));
        opt.getPanel().add(opt.getRemoveAcademics(), opt.getGridBagConstraints());

        opt.getGridBagConstraints().gridx = 2;
        opt.getGridBagConstraints().gridy = 5;
        JButton v = opt.getViewProfile();//setting a called method to a local variable
        //sets local variable button to an action listener ViewTutor class thus giving functionality to this button.
        v.addActionListener(actions.getViewAcademicsListener(names,modulesChosen,position,areaOfExpertise,studentsSupervised));
        opt.getPanel().add(opt.getViewProfile(), opt.getGridBagConstraints());

        opt.getGridBagConstraints().gridx = 1;
        opt.getGridBagConstraints().gridy = 6;
        JButton m = opt.getModifyButton(); //setting a called method to a local variable
        //sets local variable button to an action listener ModifyAcademics class thus giving functionality to this button.
        m.addActionListener(actions.getModifyAcademicsListener(names,modulesChosen,position,areaOfExpertise,studentsSupervised));
        opt.getPanel().add(opt.getModifyButton(), opt.getGridBagConstraints());

        opt.getGridBagConstraints().gridx = 0;
        opt.getGridBagConstraints().gridy = 6;
        jFrame = opt.getFrame();
        opt.getPanel().add(opt.getClose(jFrame), opt.getGridBagConstraints());
        jFrame.add(opt.getPanel()); //adds panel with components on to the Frame

        opt.getGridBagConstraints().gridx = 2;
        opt.getGridBagConstraints().gridy = 6;
        JButton re = opt.getRefresh(jFrame);
        re.addActionListener(actions.getRefreshAcademics(jFrame));
        opt.getPanel().add(opt.getRefresh(jFrame),opt.getGridBagConstraints());//adds panel with components on to the Frame
    }

    /*addModules class that adds Jframe components to a panel and sets the x and y axis of where these components are
     * to be placed in GUI. makes use of GridBagConstraints as a layout manager which enables components to be laid out in
     * this fashion  */
    public void addModules() {
        if(jFrame != null){
            jFrame.setVisible(true);
            return;
        }
        /////////// first columns ///////////////////////
        opt.getGridBagConstraints().weightx = 0.5;
        opt.getGridBagConstraints().weighty = 0.5;
/// labels that will all be on left hand side of column///////
        opt.getGridBagConstraints().gridx = 0;
        opt.getGridBagConstraints().gridy = 0;
        opt.getPanel().add(opt.getModuleNameText(), opt.getGridBagConstraints());

        opt.getGridBagConstraints().gridx = 0;
        opt.getGridBagConstraints().gridy = 1;
        opt.getPanel().add(opt.getModuleCodeText(), opt.getGridBagConstraints());

        opt.getGridBagConstraints().gridx = 0;
        opt.getGridBagConstraints().gridy = 2;
        opt.getPanel().add(opt.getModuleLeaderText(), opt.getGridBagConstraints());

        opt.getGridBagConstraints().gridx = 0;
        opt.getGridBagConstraints().gridy = 3;
        opt.getPanel().add(opt.getModuleModeratorText(), opt.getGridBagConstraints());

/////////// second column ////////////////////
        opt.getGridBagConstraints().gridx = 1;
        opt.getGridBagConstraints().gridy = 0;
        JTextArea moduleName = opt.getModuleName(); //setting a called method to a local variable
        opt.getPanel().add(moduleName, opt.getGridBagConstraints());

        opt.getGridBagConstraints().gridx = 1;
        opt.getGridBagConstraints().gridy = 1;
        JTextArea moduleCode = opt.getModuleCode(); //setting a called method to a local variable
        opt.getPanel().add(moduleCode, opt.getGridBagConstraints());

        opt.getGridBagConstraints().gridx = 1;
        opt.getGridBagConstraints().gridy = 2;
        JComboBox moduleLeader = opt.getModuleLeader(); //setting a called method to a local variable
        opt.getPanel().add(moduleLeader, opt.getGridBagConstraints());

        opt.getGridBagConstraints().gridx = 1;
        opt.getGridBagConstraints().gridy = 3;
        JComboBox moduleModerator = opt.getModuleModerator(); //setting a called method to a local variable
        opt.getPanel().add(moduleModerator, opt.getGridBagConstraints());

        opt.getGridBagConstraints().gridx = 1;
        opt.getGridBagConstraints().gridy = 4;
        JButton b = opt.getSubmitButton(); //setting a called method to a local variable
        Actions actions = new Actions();
        //sets local variable button to an action listener ModulesListener class thus giving functionality to this button.
        b.addActionListener(actions.getModulesListener(moduleName,moduleCode,moduleLeader,moduleModerator));
        opt.getPanel().add(opt.getSubmitButton(), opt.getGridBagConstraints());

        opt.getGridBagConstraints().gridx = 0;
        opt.getGridBagConstraints().gridy = 4;
        JButton r = opt.getRemoveModules(); //setting a called method to a local variable
        //sets local variable button to an action listener RemoveModule class thus giving functionality to this button.
        r.addActionListener(actions.getRemoveModuleListener(moduleName));
        opt.getPanel().add(opt.getRemoveModules(), opt.getGridBagConstraints());


        opt.getGridBagConstraints().gridx = 0;
        opt.getGridBagConstraints().gridy = 5;
        JButton v = opt.getViewProfile(); //setting a called method to a local variable
        //sets local variable button to an action listener ViewModule class thus giving functionality to this button.
        v.addActionListener(actions.getViewModuleListener(moduleName,moduleCode,moduleLeader,moduleModerator));
        opt.getPanel().add(opt.getViewProfile(), opt.getGridBagConstraints());

        opt.getGridBagConstraints().gridx = 1;
        opt.getGridBagConstraints().gridy = 6;
        opt.getPanel().add(opt.getClassListButton(), opt.getGridBagConstraints());

        opt.getGridBagConstraints().gridx = 2;
        opt.getGridBagConstraints().gridy = 5;
        JButton m = opt.getModifyButton(); //setting a called method to a local variable
        //sets local variable button to an action listener ModifyModules class thus giving functionality to this button.
        m.addActionListener(actions.getModifyModulesListener(moduleName,moduleCode,moduleLeader,moduleModerator));
        opt.getPanel().add(opt.getModifyButton(), opt.getGridBagConstraints());

        opt.getGridBagConstraints().gridx = 2;
        opt.getGridBagConstraints().gridy = 4;
        jFrame = opt.getFrame();
        opt.getPanel().add(opt.getClose(jFrame),opt.getGridBagConstraints());
        jFrame.add(opt.getPanel()); //adds panel with components on to the Frame

        opt.getGridBagConstraints().gridx = 1;
        opt.getGridBagConstraints().gridy = 5;
        JButton re = opt.getRefresh(jFrame);
        re.addActionListener(actions.getRefreshModule(jFrame));
        opt.getPanel().add(opt.getRefresh(jFrame),opt.getGridBagConstraints());//adds panel with components on to the Frame



    }
    /*addOtherPersons class that adds Jframe components to a panel and sets the x and y axis of where these components are
     * to be placed in GUI. makes use of GridBagConstraints as a layout manager which enables components to be laid out in
     * this fashion  */
    public void addOtherPersons() {

        if(jFrame != null){
            jFrame.setVisible(true);
            return;
        }
/////////// first columns ///////////////////////
        opt.getGridBagConstraints().weightx = 0.5;
        opt.getGridBagConstraints().weighty = 0.5;
/// labels that will all be on left hand side of column///////
        opt.getGridBagConstraints().gridx = 0;
        opt.getGridBagConstraints().gridy = 0;
        opt.getPanel().add(opt.getNamesText(), opt.getGridBagConstraints());

        opt.getGridBagConstraints().gridx = 0;
        opt.getGridBagConstraints().gridy = 1;
        opt.getPanel().add(opt.getJobNameText(), opt.getGridBagConstraints());

        opt.getGridBagConstraints().gridx = 0;
        opt.getGridBagConstraints().gridy = 2;
        opt.getPanel().add(opt.getEmploymentText(), opt.getGridBagConstraints());


/////////// second column ////////////////////
        opt.getGridBagConstraints().gridx = 1;
        opt.getGridBagConstraints().gridy = 0;
        JTextArea name = opt.getNames(); //setting a called method to a local variable
        opt.getPanel().add(name, opt.getGridBagConstraints());

        opt.getGridBagConstraints().gridx = 1;
        opt.getGridBagConstraints().gridy = 1;
        JTextArea job = opt.getJobName(); //setting a called method to a local variable
        opt.getPanel().add(job, opt.getGridBagConstraints());

        opt.getGridBagConstraints().gridx = 1;
        opt.getGridBagConstraints().gridy = 2;
        JComboBox empl = opt.getEmployment(); //setting a called method to a local variable
        opt.getPanel().add(empl, opt.getGridBagConstraints());

        opt.getGridBagConstraints().gridx = 1;
        opt.getGridBagConstraints().gridy = 3;
        JButton b = opt.getSubmitButton(); //setting a called method to a local variable
        Actions actions = new Actions();
        //sets local variable button to an action listener OtherPersonListener class thus giving functionality to this button.
        b.addActionListener(actions.getOtherPersonListener(name, job, empl));
        opt.getPanel().add(opt.getSubmitButton(), opt.getGridBagConstraints());

        opt.getGridBagConstraints().gridx = 0;
        opt.getGridBagConstraints().gridy = 3;
        JButton r = opt.getRemoveModules(); //setting a called method to a local variable
        //sets local variable button to an action listener RemoveOtherPerson class thus giving functionality to this button.
        r.addActionListener(actions.getRemoveOtherPersonListener(name));
        opt.getPanel().add(opt.getRemoveModules(), opt.getGridBagConstraints());

        opt.getGridBagConstraints().gridx = 2;
        opt.getGridBagConstraints().gridy = 3;
        JButton v = opt.getViewProfile(); //setting a called method to a local variable
        //sets local variable button to an action listener ViewOtherPerson class thus giving functionality to this button.
        v.addActionListener(actions.getViewOtherPersonListener(name,job,empl));
        opt.getPanel().add(opt.getViewProfile(), opt.getGridBagConstraints());

        opt.getGridBagConstraints().gridx = 0;
        opt.getGridBagConstraints().gridy = 4;
        JButton m = opt.getModifyButton(); //setting a called method to a local variable
        //sets local variable button to an action listener ModifyOtherPerson class thus giving functionality to this button.
        m.addActionListener(actions.getModifyOtherPersonListener(name,job,empl));
        opt.getPanel().add(opt.getModifyButton(), opt.getGridBagConstraints());

        opt.getGridBagConstraints().gridx = 1;
        opt.getGridBagConstraints().gridy = 4;
        jFrame = opt.getFrame();
        opt.getPanel().add(opt.getClose(jFrame), opt.getGridBagConstraints());
        jFrame.add(opt.getPanel()); //adds panel with components on to the Frame

        opt.getGridBagConstraints().gridx = 2;
        opt.getGridBagConstraints().gridy = 4;
        JButton re = opt.getRefresh(jFrame);
        re.addActionListener(actions.getRefreshOtherPerson(jFrame));
        opt.getPanel().add(opt.getRefresh(jFrame),opt.getGridBagConstraints());//adds panel with components on to the Frame


    }

    /*addStudents class that adds Jframe components to a panel and sets the x and y axis of where these components are
     * to be placed in GUI. makes use of GridBagConstraints as a layout manager which enables components to be laid out in
     * this fashion  */
    public void addStudents() {

        if(jFrame != null){
            jFrame.setVisible(true);
            return;
        }

        Actions actions = new Actions();
/////////// first columns ///////////////////////
        /// labels that will all be on left hand side of column///////
        opt.getGridBagConstraints().weightx = 0.5;
        opt.getGridBagConstraints().weighty = 0.5;

        opt.getGridBagConstraints().gridx = 0;
        opt.getGridBagConstraints().gridy = 0;
        opt.getStudentPanel().add(opt.getNamesText(), opt.getGridBagConstraints());

        opt.getGridBagConstraints().gridx = 0;
        opt.getGridBagConstraints().gridy = 1;
        opt.getStudentPanel().add(opt.getModulesChosenText(), opt.getGridBagConstraints());

        opt.getGridBagConstraints().gridx = 0;
        opt.getGridBagConstraints().gridy = 2;
        opt.getStudentPanel().add(opt.getEmploymentText(), opt.getGridBagConstraints());


/////////// second column ////////////////////
        /// Swing components that will be added to the system, all to be fit
// into the right side of the panel, other than the buttons that will be on the bottom of the screen///////
        opt.getGridBagConstraints().gridx = 1;
        opt.getGridBagConstraints().gridy = 0;
        JTextArea names = opt.getNames(); //setting a called method to a local variable
        opt.getStudentPanel().add(names, opt.getGridBagConstraints());

        opt.getGridBagConstraints().gridx = 1;
        opt.getGridBagConstraints().gridy = 1;
        JList module = opt.getModulesChosen(); //setting a called method to a local variable
        opt.getStudentPanel().add(module, opt.getGridBagConstraints());
        opt.getStudentPanel().add(opt.getModulesScrollPane(), opt.getGridBagConstraints());


        opt.getGridBagConstraints().gridx = 1;
        opt.getGridBagConstraints().gridy = 2;
        JComboBox empl = opt.getEmployment(); //setting a called method to a local variable
        opt.getStudentPanel().add(empl, opt.getGridBagConstraints());

        opt.getGridBagConstraints().gridx = 1;
        opt.getGridBagConstraints().gridy = 3;
        JButton b = opt.getSubmitButton(); //setting a called method to a local variable
        //sets local variable button to an action listener StudentListener class thus giving functionality to this button.
        b.addActionListener(actions.getStudentListener(names, module, empl));
        opt.getStudentPanel().add(opt.getSubmitButton(), opt.getGridBagConstraints());

        opt.getGridBagConstraints().gridx = 0;
        opt.getGridBagConstraints().gridy = 3;
        JButton r = opt.getRemoveStudents(); //setting a called method to a local variable
        //sets local variable button to an action listener RemoveStudent class thus giving functionality to this button.
        r.addActionListener(actions.getRemoveStudentListener(names));
        opt.getStudentPanel().add(opt.getRemoveStudents(), opt.getGridBagConstraints());


        opt.getGridBagConstraints().gridx = 0;
        opt.getGridBagConstraints().gridy = 4;
        JButton v = opt.getViewProfile(); //setting a called method to a local variable
        //sets local variable button to an action listener ViewStudent class thus giving functionality to this button.
        v.addActionListener(actions.getViewStudentListener(names,module,empl));
        opt.getStudentPanel().add(opt.getViewProfile(), opt.getGridBagConstraints());

        opt.getGridBagConstraints().gridx = 1;
        opt.getGridBagConstraints().gridy = 4;
        JButton m = opt.getModifyButton(); //setting a called method to a local variable
        //sets local variable button to an action listener ModifyStudent class thus giving functionality to this button.
        m.addActionListener(actions.getModifyStudentListener(names,module,empl));
        opt.getStudentPanel().add(opt.getModifyButton(), opt.getGridBagConstraints());

        opt.getGridBagConstraints().gridx = 0;
        opt.getGridBagConstraints().gridy = 5;
        opt.getStudentPanel().add(opt.getViewClassMarks(), opt.getGridBagConstraints());
        opt.getGridBagConstraints().gridx = 1;
        opt.getGridBagConstraints().gridy = 5;
        opt.getStudentPanel().add(opt.getViewStudentMarks(), opt.getGridBagConstraints());
        opt.getGridBagConstraints().gridx = 1;
        opt.getGridBagConstraints().gridy = 6;

        jFrame = opt.getStudentFrame();
        opt.getStudentPanel().add(opt.getClose(jFrame), opt.getGridBagConstraints());
        jFrame.add((opt.getStudentPanel())); //adds panel with components to frame

        opt.getGridBagConstraints().gridx = 0;
        opt.getGridBagConstraints().gridy = 6;
        JButton re = opt.getRefresh(jFrame);
        re.addActionListener(actions.getRefreshStudents(jFrame));
        opt.getStudentPanel().add(opt.getRefresh(jFrame),opt.getGridBagConstraints());//adds panel with components on to the Frame


    }
    /*this class stores the buttons that will open corresponding frame when clicked*/
    public void mainMenu(){
        opt.getGridBagConstraints().weightx = 0.5;
        opt.getGridBagConstraints().weighty = 0.5;

        opt.getGridBagConstraints().gridx = 0;
        opt.getGridBagConstraints().gridy = 0;
        opt.getPanel().add(opt.getGoToAcademic(), opt.getGridBagConstraints());

        opt.getGridBagConstraints().gridx = 0;
        opt.getGridBagConstraints().gridy = 1;
        opt.getPanel().add(opt.getGoToModules(), opt.getGridBagConstraints());

        opt.getGridBagConstraints().gridx = 0;
        opt.getGridBagConstraints().gridy = 2;
        opt.getPanel().add(opt.getGoToStudents(), opt.getGridBagConstraints());

        opt.getGridBagConstraints().gridx = 0;
        opt.getGridBagConstraints().gridy = 3;
        opt.getPanel().add(opt.getGoToTutors(), opt.getGridBagConstraints());

        opt.getGridBagConstraints().gridx = 0;
        opt.getGridBagConstraints().gridy = 4;
        opt.getPanel().add(opt.getGoToOtherPersons(), opt.getGridBagConstraints());

        opt.getGridBagConstraints().gridx = 0;
        opt.getGridBagConstraints().gridy = 5;
        opt.getPanel().add(opt.getGoToAssignment(), opt.getGridBagConstraints());


        opt.getFrame().add(opt.getPanel());

    }
/*this class is used for the class list function , storing the relevant components*/
    public void getClassListFrame() {

    Actions a = new Actions();
/////////// first columns ///////////////////////
        opt.getGridBagConstraints().weightx = 0.5;
        opt.getGridBagConstraints().weighty = 0.5;

        opt.getGridBagConstraints().gridx = 0;
        opt.getGridBagConstraints().gridy = 0;
        opt.getPanel().add(opt.getModuleNameText(), opt.getGridBagConstraints());




/////////// second column ////////////////////
        opt.getGridBagConstraints().gridx = 1;
        opt.getGridBagConstraints().gridy = 0;
        JTextArea moduleName = opt.getModuleName(); //setting a called method to a local variable
        opt.getPanel().add(moduleName, opt.getGridBagConstraints());

        opt.getGridBagConstraints().gridx = 1;
        opt.getGridBagConstraints().gridy = 1;
        JList classList = opt.getClassList(); //setting a called method to a local variable
        opt.getPanel().add(classList, opt.getGridBagConstraints());
        opt.getPanel().add(opt.getClassListScrollPane(), opt.getGridBagConstraints());//adds scrollpane object to classList

        opt.getGridBagConstraints().gridx = 1;
        opt.getGridBagConstraints().gridy = 2;
        JButton b = opt.getViewProfile();//setting a called method thus a local variable
        //sets local variable button to an action listener classList class thus giving functionality to this button.
        b.addActionListener(a.getClassList(moduleName,classList));
        opt.getPanel().add(b, opt.getGridBagConstraints());





        opt.getFrame().add(opt.getPanel()); //adds panel with components on to the Frame
    }
    /*getClassScoresFrame class that adds Jframe components to a panel and sets the x and y axis of where these components are
     * to be placed in GUI. makes use of GridBagConstraints as a layout manager which enables components to be laid out in
     * this fashion  makes use of ClassMarks function*/
    public void getClassScoresFrame() {

        Actions a = new Actions();
/////////// first columns ///////////////////////
        opt.getGridBagConstraints().weightx = 0.5;
        opt.getGridBagConstraints().weighty = 0.5;
/// labels that will all be on left hand side of column///////
        opt.getGridBagConstraints().gridx = 0;
        opt.getGridBagConstraints().gridy = 0;
        opt.getPanel().add(opt.getModuleNameText(), opt.getGridBagConstraints());

        opt.getGridBagConstraints().gridx = 0;
        opt.getGridBagConstraints().gridy = 1;
        opt.getPanel().add(opt.getResultsText(), opt.getGridBagConstraints());



/////////// second column ////////////////////
        // / Swing components that will be added to the system, all to be fit
// into the right side of the panel, other than the buttons that will be on the bottom of the screen///////
        opt.getGridBagConstraints().gridx = 1;
        opt.getGridBagConstraints().gridy = 0;
        JTextArea moduleName = opt.getModuleName(); //setting a called method to a local variable
        opt.getPanel().add(moduleName, opt.getGridBagConstraints());

        opt.getGridBagConstraints().gridx = 1;
        opt.getGridBagConstraints().gridy = 1;
        JTextArea results = opt.getResults(); //setting a called method to a local variable
        opt.getPanel().add(results, opt.getGridBagConstraints());


        opt.getGridBagConstraints().gridx = 0;
        opt.getGridBagConstraints().gridy = 2;
        JButton min = opt.getViewMinMark(); //setting a called method to a local variable
        //sets local variable button to an action listener getClassMinScore class thus giving functionality to this button.
        min.addActionListener(a.getClassMinScore(moduleName,results));
        opt.getPanel().add(min, opt.getGridBagConstraints());

        opt.getGridBagConstraints().gridx = 1;
        opt.getGridBagConstraints().gridy = 2;
        JButton max = opt.getViewMaxMarks(); //setting a called method to a local variable
        //sets local variable button to an action listener getClassMaxScore class thus giving functionality to this button.
        max.addActionListener(a.getClassMaxScore(moduleName,results));
        opt.getPanel().add(max, opt.getGridBagConstraints());

        opt.getGridBagConstraints().gridx = 3;
        opt.getGridBagConstraints().gridy = 2;
        JButton avg = opt.getViewAVGMarks(); //setting a called method to a local variable
        //sets local variable button to an action listener getClassAvgScore class thus giving functionality to this button.
        avg.addActionListener(a.getClassAvgScore(moduleName,results));
        opt.getPanel().add(avg, opt.getGridBagConstraints());


        opt.getFrame().add(opt.getPanel()); //adds panel with components on to the Frame
    }

    /*getStudentScoresFrame class that adds Jframe components to a panel and sets the x and y axis of where these components are
     * to be placed in GUI. makes use of GridBagConstraints as a layout manager which enables components to be laid out in
     * this fashion  makes use of ClassMarks function*/
    public void getStudentScoresFrame() {

        Actions a = new Actions();
/////////// first columns ///////////////////////
/// labels that will all be on left hand side of column///////
        opt.getGridBagConstraints().weightx = 0.5;
        opt.getGridBagConstraints().weighty = 0.5;

        opt.getGridBagConstraints().gridx = 0;
        opt.getGridBagConstraints().gridy = 0;
        opt.getPanel().add(opt.getNamesText(), opt.getGridBagConstraints());

        opt.getGridBagConstraints().gridx = 0;
        opt.getGridBagConstraints().gridy = 1;
        opt.getPanel().add(opt.getResultsText(), opt.getGridBagConstraints());



/////////// second column ////////////////////
        // / Swing components that will be added to the system, all to be fit
// into the right side of the panel, other than the buttons that will be on the bottom of the screen///////
        opt.getGridBagConstraints().gridx = 1;
        opt.getGridBagConstraints().gridy = 0;
        JTextArea names = opt.getNames(); //setting a called method to a local variable
        opt.getPanel().add(names, opt.getGridBagConstraints());

        opt.getGridBagConstraints().gridx = 1;
        opt.getGridBagConstraints().gridy = 1;
        JTextArea results = opt.getResults(); //setting a called method to a local variable
        opt.getPanel().add(results, opt.getGridBagConstraints());


        opt.getGridBagConstraints().gridx = 0;
        opt.getGridBagConstraints().gridy = 2;
        JButton min = opt.getViewMinMark(); //setting a called method to a local variable
        //sets local variable button to an action listener getStudentMinScore class thus giving functionality to this button.
        min.addActionListener(a.getStudentMinScore(names,results));
        opt.getPanel().add(min, opt.getGridBagConstraints());

        opt.getGridBagConstraints().gridx = 1;
        opt.getGridBagConstraints().gridy = 2;
        JButton max = opt.getViewMaxMarks(); //setting a called method to a local variable
        //sets local variable button to an action listenergetStudentMaxScore class thus giving functionality to this button.
        max.addActionListener(a.getStudentMaxScore(names,results));
        opt.getPanel().add(max, opt.getGridBagConstraints());

        opt.getGridBagConstraints().gridx = 3;
        opt.getGridBagConstraints().gridy = 2;
        JButton avg = opt.getViewAVGMarks(); //setting a called method to a local variable
        //sets local variable button to an action listener getStudentAvgScore class thus giving functionality to this button.
        avg.addActionListener(a.getStudentAvgScore(names,results));
        opt.getPanel().add(avg, opt.getGridBagConstraints());

        opt.getFrame().add(opt.getPanel());
    }
    public void getErrorMessageFrame(String error){
/////////// first columns ///////////////////////
/// labels that will all be on left hand side of column///////
        opt.getGridBagConstraints().weightx = 0.5;
        opt.getGridBagConstraints().weighty = 0.5;

        opt.getGridBagConstraints().gridx = 0;
        opt.getGridBagConstraints().gridy = 0;
        opt.getPanel().add(opt.getErrorMessage(), opt.getGridBagConstraints());
        opt.getErrorMessage().setText(error); //setting text inside errormessage text field to the text stored in the error string
        opt.getGridBagConstraints().gridx = 0;
        opt.getGridBagConstraints().gridy = 1;
        jFrame = opt.getErrorMessageFrame(); //setting getErrorFrame to local frame variable
        opt.getPanel().add(opt.getClose(jFrame), opt.getGridBagConstraints());// close button function
        jFrame.add((opt.getPanel()));

    }

}


