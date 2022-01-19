package com.CW1.CameronDavison.GUI_functionality;

import com.CW1.CameronDavison.database.dbConnection;

import javax.swing.*;
import java.awt.*;
import java.util.Vector;

public class Options extends JFrame {
// creating frame Swing attributes
    private JFrame frame;
    private JFrame studentFrame;
    private JFrame errorMessageFrame;
    // creating panel Swing attributes
    private JPanel mainPanel;
    private JPanel studentPanel;
    private JPanel panel;
    // creating GridBagConstraints Swing attributes
    private GridBagConstraints gbc;
    // creating Font Swing attributes
    private Font myFont;
    // creating Dimension Swing attributes
    private Dimension labelDimensions;
    private Dimension textAreaDimensions;
    private Dimension comboBoxDimensions;
    private Dimension listDimensions;
    private Dimension buttonDimensions;
    // creating JLabel Swing attributes
    private JLabel namesText;
    private JLabel jobNameText;
    private JLabel employmentText;
    private JLabel officeLocationText;
    private JLabel areaOfExpertiseText;
    private JLabel studentsSupervisedText;
    private JLabel moduleNameText;
    private JLabel moduleCodeText;
    private JLabel moduleLeaderText;
    private JLabel moduleModeratorText;
    private JLabel modulesChosenText;
    private JLabel positionText;
    private JLabel resultsText;
    private JLabel weekAssignedText;
    private JLabel feedBackText;
    private JLabel usersText;
    // creating JTextArea Swing attributes
    private JTextArea names;
    private JTextArea jobName;
    private JTextArea moduleName;
    private JTextArea moduleCode;
    private JTextArea results;
    private JTextArea weekAssigned;
    private JTextArea feedback;
    // creating JComboBox Swing attributes
    private JComboBox moduleModerator;
    private JComboBox moduleLeader;
    private JComboBox employment;
    private JComboBox officeLocation;
    private JComboBox areaOfExpertise;
    private JComboBox position;
    // creating JList Swing attributes
    private JList studentsSupervised;
    private JList modulesChosen;
    private JList classList;

    private JTextField errorMessage;

    // creating JButton Swing attributes
    private JButton submitButton;
    private JButton removeStudents;
    private JButton removeTutors;
    private JButton viewProfile;
    private JButton goToAcademic;
    private JButton goToModules;
    private JButton goToOtherPersons;
    private JButton goToStudents;
    private JButton goToTutors;
    private JButton goToAssignment;
    private JButton classListButton;
    private JButton viewClassMarks;
    private JButton viewStudentMarks;
    private JButton viewMinMark;
    private JButton viewMaxMarks;
    private JButton viewAVGMarks;
    private JButton modify;
    private JButton Close;
    private JButton refresh;
    // creating JScrollPane Swing attributes
    private JScrollPane studentsScrollPane;
    private JScrollPane modulesScrollPane;
    private JScrollPane classListScrollPane;

    /*Font object for calling the myFont attribute and setting necessary parameters
   as well as returning attribute so object is available for use elsewhere in system all object make
   use of lazy initialisation to increase efficiency and avoid wasteful computation
    */
    //setting myFont styling
    public Font getMyFont() {
        if (myFont == null) {
            myFont = new Font("Arial Black", Font.BOLD, 14);
        }
        return myFont;
    }
    /*Dimension object for calling the dimension attributes and setting necessary parameters
    as well as returning attribute so object is available for use elsewhere in system all object make
    use of lazy initialisation to increase efficiency and avoid wasteful computation
     */
    //setting dimensions of label items
    public Dimension getLabelDimensions() {
        if (labelDimensions == null) {
            labelDimensions = new Dimension(200, 50);
        }
        return labelDimensions;
    }
//setting dimension of TextArea items
    public Dimension getTextAreaDimensions() {
        if (textAreaDimensions == null) {
            textAreaDimensions = new Dimension(200, 25);
        }
        return textAreaDimensions;
    }
    //setting dimension of errorTextField textfield

    public Dimension getErrorTextFieldDimensions() {
        if (textAreaDimensions == null) {
            textAreaDimensions = new Dimension(400, 100);
        }
        return textAreaDimensions;
    }

//setting dimension of comboBox items
    public Dimension getComboBoxDimensions() {
        if (comboBoxDimensions == null) {
            comboBoxDimensions = new Dimension(200, 40);
        }
        return comboBoxDimensions;
    }
//setting dimension of Jlist items
    public Dimension getListDimensions() {
        if (listDimensions == null) {
            listDimensions = new Dimension(200, 1000);
        }
        return listDimensions;
    }
//setting dimension of buttons
    public Dimension getButtonDimensions() {
        if (buttonDimensions == null) {
            buttonDimensions = new Dimension(150, 45);
        }
        return buttonDimensions;
    }
//setting dimension of mainMenu buttons
    public Dimension getMainMenuButtonDimensions() {
        if (buttonDimensions == null) {
            buttonDimensions = new Dimension(500, 100);
        }
        return buttonDimensions;
    }
    /*JScrollPane object for calling the scrollPane attributes and setting necessary parameters
        as well as returning attribute so object is available for use elsewhere in system all object make
        use of lazy initialisation to increase efficiency and avoid wasteful computation
         */
    //scrollpane for studentsSupervised Jlist
    public JScrollPane getStudentsScrollPane() {
        if (studentsScrollPane == null) {
            studentsScrollPane = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
            studentsScrollPane = new JScrollPane(studentsSupervised);
            studentsScrollPane.setPreferredSize((new Dimension(200, 100)));
        }
        return studentsScrollPane;
    }
//scrollpane for modulesChosen Jlist
    public JScrollPane getModulesScrollPane() {
        if (modulesScrollPane == null) {
            modulesScrollPane = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
            // modulesScrollPane = new JScrollPane(modulesChosen);
            modulesScrollPane.setViewportView(modulesChosen);
            modulesScrollPane.setPreferredSize((new Dimension(200, 120)));

        }
        return modulesScrollPane;
    }
    public JScrollPane getClassListScrollPane() {
        if (classListScrollPane == null) {
            classListScrollPane = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
            classListScrollPane = new JScrollPane(classList);
            classListScrollPane.setPreferredSize((new Dimension(200, 100)));

        }
        return classListScrollPane;
    }

    /*JFrame object for calling the JFrame attributes and setting necessary parameters
    as well as returning attribute so object is available for use elsewhere in system all object make
    use of lazy initialisation to increase efficiency and avoid wasteful computation
     */
    // used for calling frame and setting parameters

    public JFrame getFrame() {
        frame = new JFrame();
        frame.pack();
        frame.setSize(600, 700);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setVisible(true);

        return frame;
    }
    // used for calling studentFrame and setting parameters

    public JFrame getStudentFrame() {
        studentFrame = new JFrame();
        studentFrame.pack();
        studentFrame.setSize(600, 700);
        studentFrame.setLocationRelativeTo(null);
        studentFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        studentFrame.setVisible(true);

        return studentFrame;
    }
// used for calling errorMessageFrame and setting parameters
    public JFrame getErrorMessageFrame() {
        errorMessageFrame = new JFrame();
        errorMessageFrame.pack();
        errorMessageFrame.setSize(800, 400);
        errorMessageFrame.setLocationRelativeTo(null);
        errorMessageFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        errorMessageFrame.setVisible(true);

        return errorMessageFrame;
    }

    /*JPanel object for calling the JPanel attributes and setting necessary parameters
       as well as returning attribute so object is available for use elsewhere in system all object make
       use of lazy initialisation to increase efficiency and avoid wasteful computation
        */
    //used for storing items panel Panel
    public JPanel getPanel() {
        if (panel == null) {
            panel = new JPanel(new GridBagLayout());
            panel.setBackground(Color.cyan);

            panel.revalidate();
        }
        return panel;
    }
    //used for storing items studentPanel Panel

    public JPanel getStudentPanel() {
        if (studentPanel == null) {
            studentPanel = new JPanel(new GridBagLayout());
            studentPanel.setBackground(Color.cyan);
            studentPanel.revalidate();
        }
        return studentPanel;
    }
    /*GridBagConstraints object for calling the GridBagConstraints attribute and setting necessary parameters
   as well as returning attribute so object is available for use elsewhere in system all object make
   use of lazy initialisation to increase efficiency and avoid wasteful computation
    */
    public GridBagConstraints getGridBagConstraints() {
        if (gbc == null) {
            gbc = new GridBagConstraints();
        }
        return gbc;
    }

    /*JLabel objects for calling the JLabel attributes and setting necassary parameters
        as well as returning attribute so object is available for use elsewhere in system all object make
        use of lazy initialisation to increase efficiency and avoid wasteful computation. the attribute is set to a new object on call
         */
    //displays namesText Jlabel

    public JLabel getNamesText() {
        if (namesText == null) {
            namesText = new JLabel("Enter name");
            namesText.setPreferredSize(getLabelDimensions());
            namesText.setFont(getMyFont());
        }
        return namesText;
    }
    //displays employmentText Jlabel

    public JLabel getEmploymentText() {
        if (employmentText == null) {
            employmentText = new JLabel("Employment Status : ");
            employmentText.setPreferredSize(getLabelDimensions());
            employmentText.setFont(getMyFont());
        }
        return employmentText;
    }
    //displays officeLocationText Jlabel

    public JLabel getOfficeLocationText() {
        if (officeLocationText == null) {
            officeLocationText = new JLabel("Office location");
            officeLocationText.setPreferredSize(getLabelDimensions());
            officeLocationText.setFont(getMyFont());
        }
        return officeLocationText;
    }
    //displays areaOfExpertiseText Jlabel

    public JLabel getAreaOfExpertiseText() {
        if (areaOfExpertiseText == null) {
            areaOfExpertiseText = new JLabel("areas of expertise : ");
            areaOfExpertiseText.setPreferredSize(getLabelDimensions());
            areaOfExpertiseText.setFont(getMyFont());
        }
        return areaOfExpertiseText;
    }
    //displays studentsSupervisedText Jlabel

    public JLabel getStudentsSupervisedText() {
        if (studentsSupervisedText == null) {
            studentsSupervisedText = new JLabel("Students supervised : ");
            studentsSupervisedText.setPreferredSize(getLabelDimensions());
            studentsSupervisedText.setFont(getMyFont());
        }
        return studentsSupervisedText;
    }
    //displays moduleNameText Jlabel

    public JLabel getModuleNameText() {
        if (moduleNameText == null) {
            moduleNameText = new JLabel("Enter Module name");
            moduleNameText.setPreferredSize(getLabelDimensions());
            moduleNameText.setFont(getMyFont());
        }
        return moduleNameText;
    }
    //displays moduleCodeText Jlabel

    public JLabel getModuleCodeText() {
        if (moduleCodeText == null) {
            moduleCodeText = new JLabel("Enter Module Code");
            moduleCodeText.setPreferredSize(getLabelDimensions());
            moduleCodeText.setFont(getMyFont());
        }
        return moduleCodeText;
    }
    //displays moduleLeaderText Jlabel

    public JLabel getModuleLeaderText() {
        if (moduleLeaderText == null) {
            moduleLeaderText = new JLabel("Enter Module Leader");
            moduleLeaderText.setPreferredSize(getLabelDimensions());
            moduleLeaderText.setFont(getMyFont());
        }
        return moduleLeaderText;
    }
    //displays moduleModeratorText Jlabel

    public JLabel getModuleModeratorText() {
        if (moduleModeratorText == null) {
            moduleModeratorText = new JLabel("Enter Module Moderator");
            moduleModeratorText.setPreferredSize(getLabelDimensions());
            moduleModeratorText.setFont(getMyFont());
        }
        return moduleModeratorText;
    }
    //displays modulesChosenText Jlabel

    public JLabel getModulesChosenText() {
        if (modulesChosenText == null) {
            modulesChosenText = new JLabel("Enter module");
            modulesChosenText.setPreferredSize(getLabelDimensions());
            modulesChosenText.setFont(getMyFont());
        }
        return modulesChosenText;

    }
    //displays positionText Jlabel

    public JLabel getPositionText() {
        if (positionText == null) {
            positionText = new JLabel("Enter position : ");
            positionText.setPreferredSize(getLabelDimensions());
            positionText.setFont(getMyFont());
        }
        return positionText;
    }
    //displays jobNameText Jlabel

    public JLabel getJobNameText() {
        if (jobNameText == null) {
            jobNameText = new JLabel("Enter Job");
            jobNameText.setPreferredSize(getLabelDimensions());
            jobNameText.setFont(getMyFont());
        }
        return jobNameText;
    }
    //displays resultsText Jlabel

    public JLabel getResultsText() {
        if (resultsText == null) {
            resultsText = new JLabel("Enter results:");
            resultsText.setPreferredSize(getTextAreaDimensions());
            resultsText.setFont(getMyFont());
        }
        return resultsText;
    }
    //displays weekAssignedText Jlabel

    public JLabel getWeekAssignedText() {
        if (weekAssignedText == null) {
            weekAssignedText = new JLabel("week assigned:");
            weekAssignedText.setPreferredSize(getTextAreaDimensions());
            weekAssignedText.setFont(getMyFont());
        }
        return weekAssignedText;
    }
    //displays feedBackText Jlabel

    public JLabel getFeedBackText() {
        if (feedBackText == null) {
            feedBackText = new JLabel("enter feedback:");
            feedBackText.setPreferredSize(getTextAreaDimensions());
            feedBackText.setFont(getMyFont());
        }
        return feedBackText;
    }
    //displays usersText Jlabel

    public JLabel getUsersText() {
        if (usersText == null) {
            usersText = new JLabel("Choose Students");
            usersText.setPreferredSize(getTextAreaDimensions());
            usersText.setFont(getMyFont());
        }
        return usersText;
    }
    /*JTextArea object for calling the JTextArea attributes and setting necessary parameters
     as well as returning attribute so object is available for use elsewhere in system all object make
     use of lazy initialisation to increase efficiency and avoid wasteful computation. the attribute is set to a new object on call
      */
    //stores and returns getNames
    public JTextArea getNames() {
        if (names == null) {
            names = new JTextArea("");
            names.setPreferredSize(getTextAreaDimensions());
        }
        return names;
    }
    //stores and returns ModuleName
    public JTextArea getModuleName() {
        if (moduleName == null) {
            moduleName = new JTextArea("");
            moduleName.setPreferredSize(getTextAreaDimensions());
            moduleName.setFont(getMyFont());
        }
        return moduleName;
    }
    //stores and returns moduleCode
    public JTextArea getModuleCode() {
        if (moduleCode == null) {
            moduleCode = new JTextArea("");
            moduleCode.setPreferredSize(getTextAreaDimensions());
            moduleCode.setFont(getMyFont());
        }
        return moduleCode;
    }
    //stores and returns Results
    public JTextArea getResults() {
        if (results == null) {
            results = new JTextArea("");
            results.setPreferredSize(getTextAreaDimensions());
            results.setFont(getMyFont());
        }
        return results;
    }
    //stores and returns WeekAssigned
    public JTextArea getWeekAssigned() {
        if (weekAssigned == null) {
            weekAssigned = new JTextArea("");
            weekAssigned.setPreferredSize(getTextAreaDimensions());
            weekAssigned.setFont(getMyFont());
        }
        return weekAssigned;
    }
    //stores and returns Feedback
    public JTextArea getFeedback() {
        if (feedback == null) {
            feedback = new JTextArea("");
            feedback.setPreferredSize(getTextAreaDimensions());
            feedback.setFont(getMyFont());
        }
        return feedback;
    }
    //stores and returns jobName
    public JTextArea getJobName() {
        if (jobName == null) {
            jobName = new JTextArea("");
            jobName.setPreferredSize(getTextAreaDimensions());
            jobName.setFont(getMyFont());
        }
        return jobName;
    }
//stores and returns error message
    public JTextField getErrorMessage(){
        if(errorMessage == null){
            errorMessage = new JTextField();
            errorMessage.setPreferredSize(getErrorTextFieldDimensions());

        }
        return errorMessage;
    }
    /*JComboBox objects for calling the JComboBox attributes and setting necessary parameters
    as well as returning attribute so object is available for use elsewhere in system all object make
    use of lazy initialisation to increase efficiency and avoid wasteful computation. the attribute is set to a new object on call
     */
    //allows user to choose from array of items to be stored in moduleModerator combobox
    public JComboBox getModuleModerator() {
        if (moduleModerator == null) {
            dbConnection con = new dbConnection();
            moduleModerator = new JComboBox(con.getModuleModeratorArray());
            moduleModerator.setPreferredSize(getComboBoxDimensions());
            moduleModerator.setFont(getMyFont());
        }
        return moduleModerator;
    }
//allows user to choose from array of items to be stored in moduleLeader combobox
    public JComboBox getModuleLeader() {
        if (moduleLeader == null) {
            dbConnection con = new dbConnection();
            moduleLeader = new JComboBox(con.getModuleLeaderArray());
            moduleLeader.setPreferredSize(getComboBoxDimensions());
            moduleLeader.setFont(getMyFont());

        }
        return moduleLeader;
    }
//allows user to choose from array of items to be stored in employment combobox
    public JComboBox getEmployment() {
        if (employment == null) {
            String[] employmentTypesArray = {"Part time", "Full time"};
            employment = new JComboBox(employmentTypesArray);
            employment.setPreferredSize(getComboBoxDimensions());
        }
        return employment;
    }
//allows user to choose from array of items to be stored in OfficeLocation combobox
    public JComboBox getOfficeLocation() {
        if (officeLocation == null) {
            String[] OfficeLocationArray = {"Main office", " Tech hub", "Law and psychology building", "Drama Building", "Sports Centre"};
            officeLocation = new JComboBox(OfficeLocationArray);
            officeLocation.setPreferredSize(getComboBoxDimensions());
            officeLocation.setFont(getMyFont());
        }
        return officeLocation;
    }
//allows user to choose from array of items to be stored in AreaOfExpertise combobox
    public JComboBox getAreaOfExpertise() {
        if (areaOfExpertise == null) {
            String[] areaOfExpertiseArray = {"Technology", "Law", "Psychology", "Drama", "Sports"};
            areaOfExpertise = new JComboBox(areaOfExpertiseArray);
            areaOfExpertise.setPreferredSize(getComboBoxDimensions());
            areaOfExpertise.setFont(getMyFont());
        }
        return areaOfExpertise;
    }
//allows user to choose from array of items to be stored in position combobox
    public JComboBox getPosition() {
        if (position == null) {
            String[] PositionArray = {"Head of Department", "deputy Head of dept", "Teacher", "Leader of Module", "deputy Leader of module"};
            position = new JComboBox(PositionArray);
            position.setPreferredSize(getComboBoxDimensions());
            position.setFont(getMyFont());
        }
        return position;
    }
    /*JList object for calling the JList attributes and setting necessary parameters
   as well as returning attribute so object is available for use elsewhere in system all object make
   use of lazy initialisation to increase efficiency and avoid wasteful computation. the attribute is set to a new object on call
    */
    //allows user to view students list
    public JList getStudentsSupervised() {
        if (studentsSupervised == null) {
            dbConnection con = new dbConnection();
            studentsSupervised = new JList((Vector) con.getStudentNamesArray());
            studentsSupervised.setPreferredSize(getListDimensions());
            studentsSupervised.ensureIndexIsVisible(studentsSupervised.getSelectedIndex());
            studentsSupervised.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
            studentsSupervised.setFont(getMyFont());
            studentsSupervised.revalidate();
        }
        return studentsSupervised;
    }
//allows user to view modules list
    public JList getModulesChosen() {
        if (modulesChosen == null) {
            dbConnection con = new dbConnection();
            modulesChosen = new JList(con.getModuleNamesArray());
            modulesChosen.setPreferredSize(getListDimensions());
            modulesChosen.ensureIndexIsVisible(modulesChosen.getSelectedIndex());
            modulesChosen.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
            modulesChosen.setFont(getMyFont());
        }
        return modulesChosen;
    }
//allows user to view class list
    public JList getClassList() {
        if (classList == null) {
            dbConnection con = new dbConnection();
            classList = new JList(con.setClassList());
            classList.setPreferredSize(getListDimensions());
            classList.ensureIndexIsVisible(classList.getSelectedIndex());
            classList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
            classList.setFont(getMyFont());
        }
        return classList;
    }
    /*JButton object for calling the JButton attributes and setting necessary parameters
    as well as returning attribute so object is available for use elsewhere in system all object make
    use of lazy initialisation to increase efficiency and avoid wasteful computation. the attribute is set to a new object on call
     */
    //allows user to remove data
    public JButton getRemoveStudents() {
        if (removeStudents == null) {
            removeStudents = new JButton("remove");
            removeStudents.setPreferredSize(getButtonDimensions());
            removeStudents.setFont(getMyFont());

        }
        return removeStudents;
    }
    //allows user to modify data
    public JButton getModifyButton() {
        if (modify == null) {
            modify = new JButton("modify");
            modify.setPreferredSize(getButtonDimensions());
            modify.setFont(getMyFont());
            modify.revalidate();
        }
        return modify;
    }
//allows user to add data
    public JButton getSubmitButton() {
        if (submitButton == null) {
            submitButton = new JButton("add");
            submitButton.setPreferredSize(getButtonDimensions());
            submitButton.setFont(getMyFont());
            submitButton.revalidate();
        }
        return submitButton;
    }
//allows user to view profile
    public JButton getViewProfile() {
        if (viewProfile == null) {
            viewProfile = new JButton("view");
            viewProfile.setPreferredSize(getButtonDimensions());
            viewProfile.setFont(getMyFont());
        }
        return viewProfile;
    }
    public JButton getRefresh(JFrame jFrame) {
        if (refresh == null) {
            refresh = new JButton("refresh items");
            refresh.setPreferredSize(getButtonDimensions());
            refresh.setFont(getMyFont());
        }
        return refresh;
    }
    //opens classMarks frame
    public JButton getViewClassMarks() {
        if (viewClassMarks == null) {
            viewClassMarks = new JButton(" Class Marks ");
            viewClassMarks.setPreferredSize(getButtonDimensions());
            viewClassMarks.setFont(getMyFont());
            Actions a = new Actions();
            viewClassMarks.addActionListener(a.getClassScores());

        }
        return viewClassMarks;
    }
    //opens student marks frame
    public JButton getViewStudentMarks() {
        if (viewStudentMarks == null) {
            viewStudentMarks = new JButton(" Student Marks ");
            viewStudentMarks.setPreferredSize(getButtonDimensions());
            viewStudentMarks.setFont(getMyFont());
            Actions a = new Actions();
            viewStudentMarks.addActionListener(a.getStudentScores());

        }
        return viewStudentMarks;
    }
    //returns Min marks in class and student marks frame
    public JButton getViewMinMark() {
        if (viewMinMark == null) {
            viewMinMark = new JButton(" MIN MARK ");
            viewMinMark.setPreferredSize(getButtonDimensions());
            viewMinMark.setFont(getMyFont());

        }
        return viewMinMark;
    }
    //returns Max marks in class and student marks frame
    public JButton getViewMaxMarks() {
        if (viewMaxMarks == null) {
            viewMaxMarks = new JButton(" MAX MARK ");
            viewMaxMarks.setPreferredSize(getButtonDimensions());
            viewMaxMarks.setFont(getMyFont());

        }
        return viewMaxMarks;
    }
    //returns Avg marks in class and student marks frame
    public JButton getViewAVGMarks() {
        if (viewAVGMarks == null) {
            viewAVGMarks = new JButton(" AVG MARKS ");
            viewAVGMarks.setPreferredSize(getButtonDimensions());
            viewAVGMarks.setFont(getMyFont());

        }
        return viewAVGMarks;
    }
//removes item in academics frame
    public JButton getRemoveAcademics() {
        if (removeTutors == null) {
            removeTutors = new JButton("remove");
            removeTutors.setPreferredSize(getButtonDimensions());
            removeTutors.setFont(getMyFont());
        }
        return removeTutors;
    }
//removes item in modules frame
    public JButton getRemoveModules() {
        if (removeTutors == null) {
            removeTutors = new JButton("remove");
            removeTutors.setPreferredSize(getButtonDimensions());
            removeTutors.setFont(getMyFont());
        }
        return removeTutors;
    }
//removes item in tutors frame
    public JButton getRemoveTutors() {
        if (removeTutors == null) {
            removeTutors = new JButton("remove");
            removeTutors.setPreferredSize(getButtonDimensions());
            removeTutors.setFont(getMyFont());
        }
        return removeTutors;
    }
//removes item in assignment frame
    public JButton getRemoveAssignments() {
        if (removeTutors == null) {
            removeTutors = new JButton("remove");
            removeTutors.setPreferredSize(getButtonDimensions());
            removeTutors.setFont(getMyFont());
        }
        return removeTutors;
    }
    //opens classlist frame
    public JButton getClassListButton() {
        if (classListButton == null) {
            classListButton = new JButton("ClassList");
            classListButton.setPreferredSize(getButtonDimensions());
            classListButton.setFont(getMyFont());
            Actions a = new Actions();
            classListButton.addActionListener(a.getClassListFrame());
        }
        return classListButton;
    }
//opens academic frame
    public JButton getGoToAcademic() {
        if (goToAcademic == null) {
            goToAcademic = new JButton("ACADEMICS");
            goToAcademic.setPreferredSize(getMainMenuButtonDimensions());
            goToAcademic.setFont(getMyFont());
            Actions a = new Actions();
            goToAcademic.addActionListener(a.getAcademicAC());
        }
        return goToAcademic;
    }
//opens modules frame
    public JButton getGoToModules() {
        if (goToModules == null) {
            goToModules = new JButton("MODULES");
            goToModules.setPreferredSize(getMainMenuButtonDimensions());
            goToModules.setFont(getMyFont());
            Actions a = new Actions();
            goToModules.addActionListener(a.getModulesAC());
        }
        return goToModules;
    }
// opens Otherpersons frame
    public JButton getGoToOtherPersons() {
        if (goToOtherPersons == null) {
            goToOtherPersons = new JButton("OTHER PERSONS");
            goToOtherPersons.setPreferredSize(getMainMenuButtonDimensions());
            goToOtherPersons.setFont(getMyFont());
            Actions a = new Actions();
            goToOtherPersons.addActionListener(a.getOtherPersonsAC());
        }
        return goToOtherPersons;
    }
//opens students frame
    public JButton getGoToStudents() {
        if (goToStudents == null) {
            goToStudents = new JButton("STUDENTS");
            goToStudents.setPreferredSize(getMainMenuButtonDimensions());
            goToStudents.setFont(getMyFont());
            Actions a = new Actions();
            goToStudents.addActionListener(a.getStudentsAC());
        }
        return goToStudents;
    }
// opens tutors frame
    public JButton getGoToTutors() {
        if (goToTutors == null) {
            goToTutors = new JButton("TUTORS");
            goToTutors.setPreferredSize(getMainMenuButtonDimensions());
            goToTutors.setFont(getMyFont());
            Actions a = new Actions();
            goToTutors.addActionListener(a.getTutorsAC());
        }
        return goToTutors;
    }
// opens assignment frame
    public JButton getGoToAssignment() {
        if (goToAssignment == null) {
            goToAssignment = new JButton("Assignments");
            goToAssignment.setPreferredSize(getMainMenuButtonDimensions());
            goToAssignment.setFont(getMyFont());
            Actions a = new Actions();
            goToAssignment.addActionListener(a.getAssignmentsAC());
        }
        return goToAssignment;
    }
    //closes current frame
    public JButton getClose(JFrame jFrame) {
        if (Close == null) {
            Close = new JButton("close page");
            Close.setPreferredSize(getButtonDimensions());
            Close.setFont(getMyFont());
            Actions a = new Actions();
            Close.addActionListener(a.getCloseStudents(jFrame));
        }
        return Close;
    }
}







