import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;

public class Frames {
    Options OPT = new Options();


    public void WindowPage() {
        Options OPT = new Options();
// Setting initial grid values to 0,0
        OPT.getGridBagConstraints().weightx = 0.5;
        OPT.getGridBagConstraints().weighty = 0.5;
///first column , Text Areas////
        OPT.getGridBagConstraints().gridx = 0;
        OPT.getGridBagConstraints().gridy = 0;
        OPT.getPanel().add(OPT.getName1(), OPT.getGridBagConstraints());

        OPT.getGridBagConstraints().gridx = 0;
        OPT.getGridBagConstraints().gridy = 1;
        OPT.getPanel().add(OPT.getName2(), OPT.getGridBagConstraints());

        OPT.getGridBagConstraints().gridx = 0;
        OPT.getGridBagConstraints().gridy = 2;
        OPT.getPanel().add(OPT.getName3(), OPT.getGridBagConstraints());

        OPT.getGridBagConstraints().gridx = 0;
        OPT.getGridBagConstraints().gridy = 3;
        OPT.getPanel().add(OPT.getName4(), OPT.getGridBagConstraints());

        OPT.getGridBagConstraints().gridx = 0;
        OPT.getGridBagConstraints().gridy = 4;
        OPT.getPanel().add(OPT.getName5(), OPT.getGridBagConstraints());

        OPT.getGridBagConstraints().gridx = 0;
        OPT.getGridBagConstraints().gridy = 5;
        OPT.getPanel().add(OPT.getName6(), OPT.getGridBagConstraints());

        OPT.getGridBagConstraints().gridx = 0;
        OPT.getGridBagConstraints().gridy = 6;
        OPT.getPanel().add(OPT.getName7(), OPT.getGridBagConstraints());

        OPT.getGridBagConstraints().gridx = 0;
        OPT.getGridBagConstraints().gridy = 7;
        OPT.getPanel().add(OPT.getName8(), OPT.getGridBagConstraints());

        OPT.getGridBagConstraints().gridx = 0;
        OPT.getGridBagConstraints().gridy = 8;
        OPT.getPanel().add(OPT.getName9(), OPT.getGridBagConstraints());

        OPT.getGridBagConstraints().gridx = 0;
        OPT.getGridBagConstraints().gridy = 9;
        OPT.getPanel().add(OPT.getName10(), OPT.getGridBagConstraints());

/// first row of buttons

        OPT.getGridBagConstraints().gridx = 0;
        OPT.getGridBagConstraints().gridy = 0;
        OPT.getButtonPanel().add(OPT.getTestButton(), OPT.getGridBagConstraints());


        if(OPT.getGoToStudents().getModel().isPressed()){
            OPT.getTestButton() = OPT.getAddStudents();
        }
        if(OPT.getGoToAcademic().getModel().isPressed()){
            container = OPT.getAddAcademics();
        }
        if(OPT.getGoToModules().getModel().isPressed()){
            container = OPT.getGoToModules();
        }
        if(OPT.getGoToOtherPersons().getModel().isPressed()){
            container = OPT.getAddOtherPersons();
        }
        if(OPT.getGoToTutors().getModel().isPressed()){
           container = OPT.getAddTutors();
        }
        OPT.getGridBagConstraints().gridx = 1;
        OPT.getGridBagConstraints().gridy = 0;
        OPT.getButtonPanel().add(OPT.getModifyStudents(), OPT.getGridBagConstraints());
        OPT.getGridBagConstraints().gridx = 2;
        OPT.getGridBagConstraints().gridy = 0;
        OPT.getButtonPanel().add(OPT.getRemoveStudents(), OPT.getGridBagConstraints());


        // 2nd row of buttons//
/*
        OPT.getGridBagConstraints().gridx = 0;
        OPT.getGridBagConstraints().gridy = 1;
        OPT.getButtonPanel().add(OPT.getAddAcademics(), OPT.getGridBagConstraints());
        OPT.getGridBagConstraints().gridx = 1;
        OPT.getGridBagConstraints().gridy = 1;
        OPT.getButtonPanel().add(OPT.getModifyStudents(), OPT.getGridBagConstraints());
        OPT.getGridBagConstraints().gridx = 2;
        OPT.getGridBagConstraints().gridy = 1;
        OPT.getButtonPanel().add(OPT.getRemoveStudents(), OPT.getGridBagConstraints());
        //3rd row of buttons//
        OPT.getGridBagConstraints().gridx = 0;
        OPT.getGridBagConstraints().gridy = 2;
        OPT.getButtonPanel().add(OPT.getAddModules(), OPT.getGridBagConstraints());
        OPT.getGridBagConstraints().gridx = 1;
        OPT.getGridBagConstraints().gridy = 2;
        OPT.getButtonPanel().add(OPT.getModifyStudents(), OPT.getGridBagConstraints());
        OPT.getGridBagConstraints().gridx = 2;
        OPT.getGridBagConstraints().gridy = 2;
        OPT.getButtonPanel().add(OPT.getRemoveStudents(), OPT.getGridBagConstraints());

        //3RD row of buttons///
        OPT.getGridBagConstraints().gridx = 0;
        OPT.getGridBagConstraints().gridy = 3;
        OPT.getButtonPanel().add(OPT.getAddOtherPersons(), OPT.getGridBagConstraints());
        OPT.getGridBagConstraints().gridx = 1;
        OPT.getGridBagConstraints().gridy = 3;
        OPT.getButtonPanel().add(OPT.getModifyStudents(), OPT.getGridBagConstraints());
        OPT.getGridBagConstraints().gridx = 2;
        OPT.getGridBagConstraints().gridy = 3;
        OPT.getButtonPanel().add(OPT.getRemoveStudents(), OPT.getGridBagConstraints());*/



        OPT.getGridBagConstraints().gridx = 0;
        OPT.getGridBagConstraints().gridy = 1;
        OPT.getButtonPanel().add(OPT.getBackPage(), OPT.getGridBagConstraints());
        OPT.getGridBagConstraints().gridx = 1;
        OPT.getGridBagConstraints().gridy = 1;
        OPT.getButtonPanel().add(OPT.getSubmitButton(), OPT.getGridBagConstraints());
        OPT.getGridBagConstraints().gridx = 2;
        OPT.getGridBagConstraints().gridy = 1;
        OPT.getButtonPanel().add(OPT.getNextPage(), OPT.getGridBagConstraints());


        OPT.getMainPanel().add(OPT.getPanel());
        OPT.getMainPanel().add(OPT.getButtonPanel());
        OPT.getFrame().add(OPT.getMainPanel());

    }

    public void addTutor() {


/////////// first columns ///////////////////////
        OPT.getGridBagConstraints().weightx = 0.5;
        OPT.getGridBagConstraints().weighty = 0.5;

        OPT.getGridBagConstraints().gridx = 0;
        OPT.getGridBagConstraints().gridy = 0;
        OPT.getPanel().add(OPT.getNamesText(), OPT.getGridBagConstraints());

        OPT.getGridBagConstraints().gridx = 0;
        OPT.getGridBagConstraints().gridy = 1;
        OPT.getPanel().add(OPT.getModuleNameText(), OPT.getGridBagConstraints());

        OPT.getGridBagConstraints().gridx = 0;
        OPT.getGridBagConstraints().gridy = 2;
        OPT.getPanel().add(OPT.getOfficeLocationText(), OPT.getGridBagConstraints());

        OPT.getGridBagConstraints().gridx = 0;
        OPT.getGridBagConstraints().gridy = 3;
        OPT.getPanel().add(OPT.getAreaOfExpertiseText(), OPT.getGridBagConstraints());

        OPT.getGridBagConstraints().gridx = 0;
        OPT.getGridBagConstraints().gridy = 4;
        OPT.getPanel().add(OPT.getStudentsSupervisedText(), OPT.getGridBagConstraints());


/////////// second column ////////////////////
        OPT.getGridBagConstraints().gridx = 1;
        OPT.getGridBagConstraints().gridy = 0;
        OPT.getPanel().add(OPT.getNames(), OPT.getGridBagConstraints());

        OPT.getGridBagConstraints().gridx = 1;
        OPT.getGridBagConstraints().gridy = 1;
        OPT.getPanel().add(OPT.getModuleName(), OPT.getGridBagConstraints());

        OPT.getGridBagConstraints().gridx = 1;
        OPT.getGridBagConstraints().gridy = 2;
        OPT.getPanel().add(OPT.getOfficeLocation(), OPT.getGridBagConstraints());

        OPT.getGridBagConstraints().gridx = 1;
        OPT.getGridBagConstraints().gridy = 3;
        OPT.getPanel().add(OPT.getAreaOfExpertise(), OPT.getGridBagConstraints());

        OPT.getGridBagConstraints().gridx = 1;
        OPT.getGridBagConstraints().gridy = 4;
        OPT.getPanel().add(OPT.getStudentsSupervised(), OPT.getGridBagConstraints());

        OPT.getGridBagConstraints().gridx = 1;
        OPT.getGridBagConstraints().gridy = 5;
        OPT.getPanel().add(OPT.getSubmitButton(), OPT.getGridBagConstraints());


        OPT.getMainPanel().add(OPT.getPanel());
        OPT.getFrame().add(OPT.getMainPanel());
    }

    public void addAcademic() {
        /////////// first columns ///////////////////////
        OPT.getGridBagConstraints().weightx = 0.5;
        OPT.getGridBagConstraints().weighty = 0.5;

        OPT.getGridBagConstraints().gridx = 0;
        OPT.getGridBagConstraints().gridy = 0;
        OPT.getPanel().add(OPT.getNamesText(), OPT.getGridBagConstraints());

        OPT.getGridBagConstraints().gridx = 0;
        OPT.getGridBagConstraints().gridy = 1;
        OPT.getPanel().add(OPT.getModuleNameText(), OPT.getGridBagConstraints());

        OPT.getGridBagConstraints().gridx = 0;
        OPT.getGridBagConstraints().gridy = 2;
        OPT.getPanel().add(OPT.getPositionText(), OPT.getGridBagConstraints());

        OPT.getGridBagConstraints().gridx = 0;
        OPT.getGridBagConstraints().gridy = 3;
        OPT.getPanel().add(OPT.getAreaOfExpertiseText(), OPT.getGridBagConstraints());

        OPT.getGridBagConstraints().gridx = 0;
        OPT.getGridBagConstraints().gridy = 4;
        OPT.getPanel().add(OPT.getStudentsSupervisedText(), OPT.getGridBagConstraints());


/////////// second column ////////////////////
        OPT.getGridBagConstraints().gridx = 1;
        OPT.getGridBagConstraints().gridy = 0;
        OPT.getPanel().add(OPT.getNames(), OPT.getGridBagConstraints());

        OPT.getGridBagConstraints().gridx = 1;
        OPT.getGridBagConstraints().gridy = 1;
        OPT.getPanel().add(OPT.getModuleName(), OPT.getGridBagConstraints());

        OPT.getGridBagConstraints().gridx = 1;
        OPT.getGridBagConstraints().gridy = 2;
        OPT.getPanel().add(OPT.getPosition(), OPT.getGridBagConstraints());

        OPT.getGridBagConstraints().gridx = 1;
        OPT.getGridBagConstraints().gridy = 3;
        OPT.getPanel().add(OPT.getAreaOfExpertise(), OPT.getGridBagConstraints());

        OPT.getGridBagConstraints().gridx = 1;
        OPT.getGridBagConstraints().gridy = 4;
        OPT.getPanel().add(OPT.getStudentsSupervised(), OPT.getGridBagConstraints());

        OPT.getGridBagConstraints().gridx = 1;
        OPT.getGridBagConstraints().gridy = 5;
        OPT.getPanel().add(OPT.getSubmitButton(), OPT.getGridBagConstraints());


        OPT.getMainPanel().add(OPT.getPanel());
        OPT.getFrame().add(OPT.getMainPanel());
    }

    public void addModules() {
        OPT.getGridBagConstraints().weightx = 0.5;
        OPT.getGridBagConstraints().weighty = 0.5;

        OPT.getGridBagConstraints().gridx = 0;
        OPT.getGridBagConstraints().gridy = 0;
        OPT.getPanel().add(OPT.getModuleNameText(), OPT.getGridBagConstraints());

        OPT.getGridBagConstraints().gridx = 0;
        OPT.getGridBagConstraints().gridy = 1;
        OPT.getPanel().add(OPT.getModuleCodeText(), OPT.getGridBagConstraints());

        OPT.getGridBagConstraints().gridx = 0;
        OPT.getGridBagConstraints().gridy = 2;
        OPT.getPanel().add(OPT.getModuleLeaderText(), OPT.getGridBagConstraints());

        OPT.getGridBagConstraints().gridx = 0;
        OPT.getGridBagConstraints().gridy = 3;
        OPT.getPanel().add(OPT.getModuleModeratorText(), OPT.getGridBagConstraints());

/////////// second column ////////////////////
        OPT.getGridBagConstraints().gridx = 1;
        OPT.getGridBagConstraints().gridy = 0;
        OPT.getPanel().add(OPT.getModuleName(), OPT.getGridBagConstraints());

        OPT.getGridBagConstraints().gridx = 1;
        OPT.getGridBagConstraints().gridy = 1;
        OPT.getPanel().add(OPT.getModuleCode(), OPT.getGridBagConstraints());

        OPT.getGridBagConstraints().gridx = 1;
        OPT.getGridBagConstraints().gridy = 2;
        OPT.getPanel().add(OPT.getModuleLeader(), OPT.getGridBagConstraints());

        OPT.getGridBagConstraints().gridx = 1;
        OPT.getGridBagConstraints().gridy = 3;
        OPT.getPanel().add(OPT.getModuleModerator(), OPT.getGridBagConstraints());

        OPT.getGridBagConstraints().gridx = 1;
        OPT.getGridBagConstraints().gridy = 4;
        OPT.getPanel().add(OPT.getSubmitButton(), OPT.getGridBagConstraints());

        OPT.getMainPanel().add(OPT.getPanel());
        OPT.getFrame().add(OPT.getMainPanel());

    }

    public void addOtherPersons() {

/////////// first columns ///////////////////////
        OPT.getGridBagConstraints().weightx = 0.5;
        OPT.getGridBagConstraints().weighty = 0.5;

        OPT.getGridBagConstraints().gridx = 0;
        OPT.getGridBagConstraints().gridy = 0;
        OPT.getPanel().add(OPT.getNamesText(), OPT.getGridBagConstraints());

        OPT.getGridBagConstraints().gridx = 0;
        OPT.getGridBagConstraints().gridy = 1;
        OPT.getPanel().add(OPT.getJobNameText(), OPT.getGridBagConstraints());

        OPT.getGridBagConstraints().gridx = 0;
        OPT.getGridBagConstraints().gridy = 2;
        OPT.getPanel().add(OPT.getEmploymentText(), OPT.getGridBagConstraints());


/////////// second column ////////////////////
        OPT.getGridBagConstraints().gridx = 1;
        OPT.getGridBagConstraints().gridy = 0;
        OPT.getPanel().add(OPT.getNames(), OPT.getGridBagConstraints());

        OPT.getGridBagConstraints().gridx = 1;
        OPT.getGridBagConstraints().gridy = 1;
        OPT.getPanel().add(OPT.getJobName(), OPT.getGridBagConstraints());

        OPT.getGridBagConstraints().gridx = 1;
        OPT.getGridBagConstraints().gridy = 2;
        OPT.getPanel().add(OPT.getEmployment(), OPT.getGridBagConstraints());

        OPT.getGridBagConstraints().gridx = 1;
        OPT.getGridBagConstraints().gridy = 3;
        OPT.getPanel().add(OPT.getSubmitButton(), OPT.getGridBagConstraints());


        OPT.getMainPanel().add(OPT.getPanel());
        OPT.getFrame().add(OPT.getMainPanel());


    }

    public void addStudents() {

/////////// first columns ///////////////////////
        OPT.getGridBagConstraints().weightx = 0.5;
        OPT.getGridBagConstraints().weighty = 0.5;

        OPT.getGridBagConstraints().gridx = 0;
        OPT.getGridBagConstraints().gridy = 0;
        OPT.getPanel().add(OPT.getNamesText(), OPT.getGridBagConstraints());

        OPT.getGridBagConstraints().gridx = 0;
        OPT.getGridBagConstraints().gridy = 1;
        OPT.getPanel().add(OPT.getModulesChosenText(), OPT.getGridBagConstraints());

        OPT.getGridBagConstraints().gridx = 0;
        OPT.getGridBagConstraints().gridy = 2;
        OPT.getPanel().add(OPT.getEmploymentText(), OPT.getGridBagConstraints());


/////////// second column ////////////////////
        OPT.getGridBagConstraints().gridx = 1;
        OPT.getGridBagConstraints().gridy = 0;
        OPT.getPanel().add(OPT.getNames(), OPT.getGridBagConstraints());

        OPT.getGridBagConstraints().gridx = 1;
        OPT.getGridBagConstraints().gridy = 1;
        OPT.getPanel().add(OPT.getModulesChosen(), OPT.getGridBagConstraints());

        OPT.getGridBagConstraints().gridx = 1;
        OPT.getGridBagConstraints().gridy = 2;
        OPT.getPanel().add(OPT.getEmployment(), OPT.getGridBagConstraints());

        OPT.getGridBagConstraints().gridx = 1;
        OPT.getGridBagConstraints().gridy = 3;
        OPT.getPanel().add(OPT.getSubmitButton(), OPT.getGridBagConstraints());


        OPT.getMainPanel().add(OPT.getPanel());
        OPT.getFrame().add(OPT.getMainPanel());

    }
    public void MainMenu(){
        OPT.getGridBagConstraints().weightx = 0.5;
        OPT.getGridBagConstraints().weighty = 0.5;

        OPT.getGridBagConstraints().gridx = 0;
        OPT.getGridBagConstraints().gridy = 0;
        OPT.getPanel().add(OPT.getGoToAcademic(), OPT.getGridBagConstraints());
        //Actions a = new Actions();
        //OPT.getGoToAcademic().addActionListener(a.getAC());

        OPT.getGridBagConstraints().gridx = 0;
        OPT.getGridBagConstraints().gridy = 1;
        OPT.getPanel().add(OPT.getGoToModules(), OPT.getGridBagConstraints());

        OPT.getGridBagConstraints().gridx = 0;
        OPT.getGridBagConstraints().gridy = 2;
        OPT.getPanel().add(OPT.getGoToStudents(), OPT.getGridBagConstraints());

        OPT.getGridBagConstraints().gridx = 0;
        OPT.getGridBagConstraints().gridy = 3;
        OPT.getPanel().add(OPT.getGoToTutors(), OPT.getGridBagConstraints());

        OPT.getGridBagConstraints().gridx = 0;
        OPT.getGridBagConstraints().gridy = 4;
        OPT.getPanel().add(OPT.getGoToOtherPersons(), OPT.getGridBagConstraints());


        OPT.getMainPanel().add(OPT.getPanel());
        OPT.getFrame().add(OPT.getMainPanel());

    }

}


