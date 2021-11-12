import javax.swing.*;
import java.awt.*;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

public class Options extends JFrame {

    private JFrame frame;
    private JPanel mainPanel;
    private JPanel panel;
    private JPanel mainButtonPanel;
    private JPanel ButtonPanel;
    private GridBagConstraints gbc;
    private Font myFont;
    private Dimension LabelDimensions;
    private Dimension TextAreaDimensions;
    private Dimension ComboBoxDimensions;
    private Dimension ListDimensions;
    private Dimension ButtonDimensions;
    private Dimension MainMenuButtonDimensions;
    private JLabel NamesText;
    private JLabel JobNameText;
    private JLabel EmploymentText;
    private JLabel OfficeLocationText;
    private JLabel AreaOfExpertiseText;
    private JLabel StudentsSupervisedText;
    private JLabel ModuleNameText;
    private JLabel ModuleCodeText;
    private JLabel ModuleLeaderText;
    private JLabel ModuleModeratorText;
    private JLabel ModulesChosenText;
    private JLabel PositionText;
    private JTextArea Names;
    private JTextArea JobName;
    private JTextArea ModuleName;
    private JTextArea ModuleCode;
    private JComboBox ModuleModerator;
    private JComboBox ModuleLeader;
    private JComboBox Employment;
    private JComboBox OfficeLocation;
    private JComboBox AreaOfExpertise;
    private JComboBox Position;
    private JList StudentsSupervised;
    private JList ModulesChosen;
    private JButton SubmitButton;
    private JButton RemoveStudents;
    private JButton ModifyStudents;
    private JButton AddStudents;
    private JButton RemoveTutors;
    private JButton ModifyTutors;
    private JButton AddTutors;
    private JButton RemoveAcademics;
    private JButton ModifyAcademics;
    private JButton AddAcademics;
    private JButton RemoveOtherPersons;
    private JButton ModifyOtherPersons;
    private JButton AddOtherPersons;
    private JButton RemoveModules;
    private JButton ModifyModules;
    private JButton AddModules;
    private JButton BackPage;
    private JButton NextPage;
    private JButton goToAcademic;
    private JButton goToModules;
    private JButton goToOtherPersons;
    private JButton goToStudents;
    private JButton goToTutors;
    private JButton TestButton;
    private JTextArea name1, name2, name3, name4, name5, name6, name7, name8, name9, name10;

    public Font getMyFont() {
        if (myFont == null) {
            myFont = new Font("Arial Black", Font.BOLD, 14);
        }
        return myFont;
    }

    public Dimension getLabelDimensions() {
        if (LabelDimensions == null) {
            LabelDimensions = new Dimension(200, 50);
        }
        return LabelDimensions;
    }

    public Dimension getTextAreaDimensions() {
        if (TextAreaDimensions == null) {
            TextAreaDimensions = new Dimension(200, 25);
        }
        return TextAreaDimensions;
    }

    public Dimension getComboBoxDimensions() {
        if (ComboBoxDimensions == null) {
            ComboBoxDimensions = new Dimension(200, 100);
        }
        return ComboBoxDimensions;
    }

    public Dimension getListDimensions() {
        if (ListDimensions == null) {
            ListDimensions = new Dimension(200, 200);
        }
        return ListDimensions;
    }

    public Dimension getButtonDimensions() {
        if (ButtonDimensions == null) {
            ButtonDimensions = new Dimension(150, 100);
        }
        return ButtonDimensions;
    }

    public Dimension getMainMenuButtonDimensions() {
        if (ButtonDimensions == null) {
            ButtonDimensions = new Dimension(500, 100);
        }
        return ButtonDimensions;
    }

    public JFrame getFrame() {

        frame = new JFrame();

        frame.setTitle("a new " + this.getClass().getCanonicalName() + " Appears! ");
        frame.pack();
        frame.setSize(600, 800);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);


        return frame;
    }

    public JPanel getMainPanel() {
        if (mainPanel == null) {
            mainPanel = new JPanel();
            mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        }
        return mainPanel;
    }

    public JPanel getPanel() {
        if (panel == null) {
            panel = new JPanel(new GridBagLayout());
            panel.setBackground(Color.cyan);
        }
        return panel;
    }

    public JPanel getMainButtonPanel() {
        if (mainButtonPanel == null) {
            mainButtonPanel = new JPanel();
            mainButtonPanel.setLayout(new BoxLayout(mainButtonPanel, BoxLayout.Y_AXIS));
        }
        return mainButtonPanel;
    }

    public JPanel getButtonPanel() {
        if (ButtonPanel == null) {
            ButtonPanel = new JPanel(new GridBagLayout());
            ButtonPanel.setBackground(Color.cyan);
        }
        return ButtonPanel;
    }

    public GridBagConstraints getGridBagConstraints() {
        if (gbc == null) {
            gbc = new GridBagConstraints();
        }
        return gbc;
    }

    public JLabel getNamesText() {
        if (NamesText == null) {
            NamesText = new JLabel("Enter name");
            NamesText.setPreferredSize(getLabelDimensions());
            NamesText.setFont(getMyFont());
        }
        return NamesText;
    }

    public JLabel getEmploymentText() {
        if (EmploymentText == null) {
            EmploymentText = new JLabel("Employment Status : ");
            EmploymentText.setPreferredSize(getLabelDimensions());
            EmploymentText.setFont(getMyFont());
        }
        return EmploymentText;
    }

    public JLabel getOfficeLocationText() {
        if (OfficeLocationText == null) {
            OfficeLocationText = new JLabel("Office location");
            OfficeLocationText.setPreferredSize(getLabelDimensions());
            OfficeLocationText.setFont(getMyFont());
        }
        return OfficeLocationText;
    }

    public JLabel getAreaOfExpertiseText() {
        if (AreaOfExpertiseText == null) {
            AreaOfExpertiseText = new JLabel("areas of expertise : ");
            AreaOfExpertiseText.setPreferredSize(getLabelDimensions());
            AreaOfExpertiseText.setFont(getMyFont());
        }
        return AreaOfExpertiseText;
    }

    public JLabel getStudentsSupervisedText() {
        if (StudentsSupervisedText == null) {
            StudentsSupervisedText = new JLabel("Students supervised : ");
            StudentsSupervisedText.setPreferredSize(getLabelDimensions());
            StudentsSupervisedText.setFont(getMyFont());
        }
        return StudentsSupervisedText;
    }

    public JLabel getModuleNameText() {
        if (ModuleNameText == null) {
            ModuleNameText = new JLabel("Enter Module name");
            ModuleNameText.setPreferredSize(getLabelDimensions());
            ModuleNameText.setFont(getMyFont());
        }
        return ModuleNameText;
    }

    public JLabel getModuleCodeText() {
        if (ModuleCodeText == null) {
            ModuleCodeText = new JLabel("Enter Module Code");
            ModuleCodeText.setPreferredSize(getLabelDimensions());
            ModuleCodeText.setFont(getMyFont());
        }
        return ModuleCodeText;
    }

    public JLabel getModuleLeaderText() {
        if (ModuleLeaderText == null) {
            ModuleLeaderText = new JLabel("Enter Module Leader");
            ModuleLeaderText.setPreferredSize(getLabelDimensions());
            ModuleLeaderText.setFont(getMyFont());
        }
        return ModuleLeaderText;
    }

    public JLabel getModuleModeratorText() {
        if (ModuleModeratorText == null) {
            ModuleModeratorText = new JLabel("Enter Module Moderator");
            ModuleModeratorText.setPreferredSize(getLabelDimensions());
            ModuleModeratorText.setFont(getMyFont());
        }
        return ModuleModeratorText;
    }

    public JLabel getModulesChosenText() {
        if (ModulesChosenText == null) {
            ModulesChosenText = new JLabel("Enter module");
            ModulesChosenText.setPreferredSize(getLabelDimensions());
            ModulesChosenText.setFont(getMyFont());
        }
        return ModulesChosenText;

    }

    public JLabel getPositionText() {
        if (PositionText == null) {
            PositionText = new JLabel("Enter position : ");
            PositionText.setPreferredSize(getLabelDimensions());
            PositionText.setFont(getMyFont());
        }
        return PositionText;
    }

    public JLabel getJobNameText() {
        if (JobNameText == null) {
            JobNameText = new JLabel("Enter Job");
            JobNameText.setPreferredSize(getLabelDimensions());
            JobNameText.setFont(getMyFont());
        }
        return JobNameText;
    }


    public JTextArea getNames() {
        if (Names == null) {
            Names = new JTextArea("");
            Names.setPreferredSize(getTextAreaDimensions());
        }
        return Names;
    }

    public JTextArea getModuleName() {
        if (ModuleName == null) {
            ModuleName = new JTextArea("");
            ModuleName.setPreferredSize(getTextAreaDimensions());
            ModuleName.setFont(getMyFont());
        }
        return ModuleName;
    }

    public JTextArea getModuleCode() {
        if (ModuleCode == null) {
            ModuleCode = new JTextArea("");
            ModuleCode.setPreferredSize(getTextAreaDimensions());
            ModuleCode.setFont(getMyFont());
        }
        return ModuleCode;
    }

    public JTextArea getJobName() {
        if (JobName == null) {
            JobName = new JTextArea("");
            JobName.setPreferredSize(getTextAreaDimensions());
            JobName.setFont(getMyFont());
        }
        return JobName;
    }

    public JComboBox getModuleModerator() {
        if (ModuleModerator == null) {
            ModuleModerator = new JComboBox();
            ModuleModerator.setPreferredSize(getComboBoxDimensions());
            ModuleModerator.setFont(getMyFont());
        }
        return ModuleModerator;
    }

    public JComboBox getModuleLeader() {
        if (ModuleLeader == null) {
            ModuleLeader = new JComboBox();
            ModuleLeader.setPreferredSize(getComboBoxDimensions());
            ModuleLeader.setFont(getMyFont());

        }
        return ModuleLeader;
    }

    public JComboBox getEmployment() {
        if (Employment == null) {
            Employment = new JComboBox();
            Employment.setPreferredSize(getComboBoxDimensions());
        }
        return Employment;
    }

    public JComboBox getOfficeLocation() {
        if (OfficeLocation == null) {
            OfficeLocation = new JComboBox();
            OfficeLocation.setPreferredSize(getComboBoxDimensions());
            OfficeLocation.setFont(getMyFont());
        }
        return OfficeLocation;
    }

    public JComboBox getAreaOfExpertise() {
        if (AreaOfExpertise == null) {
            AreaOfExpertise = new JComboBox();
            AreaOfExpertise.setPreferredSize(getComboBoxDimensions());
            AreaOfExpertise.setFont(getMyFont());
        }
        return AreaOfExpertise;
    }

    public JComboBox getPosition() {
        if (Position == null) {
            Position = new JComboBox();
            Position.setPreferredSize(getComboBoxDimensions());
            Position.setFont(getMyFont());
        }
        return Position;
    }

    public JList getStudentsSupervised() {
        if (StudentsSupervised == null) {
            StudentsSupervised = new JList();
            StudentsSupervised.setPreferredSize(getListDimensions());
        }
        return StudentsSupervised;
    }

    public JList getModulesChosen() {
        if (ModulesChosen == null) {
            ModulesChosen = new JList();
            ModulesChosen.setPreferredSize(getListDimensions());
            ModulesChosen.setFont(getMyFont());
        }
        return ModulesChosen;
    }

    public JButton getRemoveStudents() {
        if (RemoveStudents == null) {
            RemoveStudents = new JButton("remove");
            RemoveStudents.setPreferredSize(getButtonDimensions());
            RemoveStudents.setFont(getMyFont());
        }
        return RemoveStudents;
    }
    public JButton getTestButton() {
        if (TestButton == null) {
            TestButton = new JButton("remove");
            TestButton.setPreferredSize(getButtonDimensions());
            TestButton.setFont(getMyFont());
        }
        return TestButton;
    }

    public JButton getModifyStudents() {
        if (ModifyStudents == null) {
            ModifyStudents = new JButton("Modify");
            ModifyStudents.setPreferredSize(getButtonDimensions());
            ModifyStudents.setFont(getMyFont());
        }
        return ModifyStudents;
    }

    public JButton getSubmitButton() {
        if (SubmitButton == null) {
            SubmitButton = new JButton("Submit");
            SubmitButton.setPreferredSize(getButtonDimensions());
            SubmitButton.setFont(getMyFont());
        }
        return SubmitButton;
    }


    public JButton getAddStudents() {
        if (AddStudents == null) {
            AddStudents = new JButton("addNew");
            AddStudents.setPreferredSize(getButtonDimensions());
            AddStudents.setFont(getMyFont());
            Actions a = new Actions();
            AddStudents.addActionListener(a.getAddStudents());
        }
        return AddStudents;
    }
    public JButton getAddAcademics() {
        if (AddAcademics == null) {
            AddAcademics = new JButton("addNew");
            AddAcademics.setPreferredSize(getButtonDimensions());
            AddAcademics.setFont(getMyFont());
            Actions a = new Actions();
            AddAcademics.addActionListener(a.getAddStudents());
            if(AddAcademics.getModel().isPressed()){

            }
        }
        return AddStudents;
    }
    public JButton getAddModules() {
        if (AddModules == null) {
            AddModules = new JButton("addNew");
            AddModules.setPreferredSize(getButtonDimensions());
            AddModules.setFont(getMyFont());
            Actions a = new Actions();
            AddModules.addActionListener(a.getAddStudents());
        }
        return AddModules;
    }
    public JButton getAddOtherPersons() {
        if (AddOtherPersons == null) {
            AddOtherPersons = new JButton("addNew");
            AddOtherPersons.setPreferredSize(getButtonDimensions());
            AddOtherPersons.setFont(getMyFont());
            Actions a = new Actions();
            AddOtherPersons.addActionListener(a.getAddStudents());
        }
        return AddOtherPersons;
    }
    public JButton getAddTutors() {
        if (AddTutors == null) {
            AddTutors = new JButton("addNew");
            AddTutors.setPreferredSize(getButtonDimensions());
            AddTutors.setFont(getMyFont());
            Actions a = new Actions();
            AddTutors.addActionListener(a.getAddStudents());
        }
        return AddTutors ;
    }
    /* public void actionPerformed(ActionEvent event){
        Frames.WindowPage();
    }*/

    public JButton getBackPage() {
        if (BackPage == null) {
            BackPage = new JButton("Backpage");
            BackPage.setPreferredSize(getButtonDimensions());
            BackPage.setFont(getMyFont());
        }
        return BackPage;
    }

    public JButton getNextPage() {
        if (NextPage == null) {
            NextPage = new JButton("Nextpage");
            NextPage.setPreferredSize(getButtonDimensions());
            NextPage.setFont(getMyFont());

        }
        return NextPage;
    }

    public JButton getGoToAcademic() {
        if (goToAcademic == null) {
            goToAcademic = new JButton("ACADEMICS");
            goToAcademic.setPreferredSize(getMainMenuButtonDimensions());
            goToAcademic.setFont(getMyFont());
            Actions a = new Actions();
            goToAcademic.addActionListener(a.getAC());
        }
        return goToAcademic;
    }

    public JButton getGoToModules() {
        if (goToModules == null) {
            goToModules = new JButton("MODULES");
            goToModules.setPreferredSize(getMainMenuButtonDimensions());
            goToModules.setFont(getMyFont());
            Actions a = new Actions();
            goToModules.addActionListener(a.getAC());
        }
        return goToModules;
    }

    public JButton getGoToOtherPersons() {
        if (goToOtherPersons == null) {
            goToOtherPersons = new JButton("OTHER PERSONS");
            goToOtherPersons.setPreferredSize(getMainMenuButtonDimensions());
            goToOtherPersons.setFont(getMyFont());
            Actions a = new Actions();
            goToOtherPersons.addActionListener(a.getAC());
        }
        return goToOtherPersons;
    }

    public JButton getGoToStudents() {
        if (goToStudents == null) {
            goToStudents = new JButton("STUDENTS");
            goToStudents.setPreferredSize(getMainMenuButtonDimensions());
            goToStudents.setFont(getMyFont());
            Actions a = new Actions();
            goToStudents.addActionListener(a.getAC());
        }
        return goToStudents;
    }

    public JButton getGoToTutors() {
        if (goToTutors == null) {
            goToTutors = new JButton("TUTORS");
            goToTutors.setPreferredSize(getMainMenuButtonDimensions());
            goToTutors.setFont(getMyFont());
            Actions a = new Actions();
            goToTutors.addActionListener(a.getAC());
        }
        return goToTutors;
    }

    public JTextArea getName1() {
        if (name1 == null) {
            name1 = new JTextArea("");
            name1.setPreferredSize(getTextAreaDimensions());
            name1.setFont(getMyFont());
        }
        return name1;
    }

    public JTextArea getName2() {
        if (name2 == null) {
            name2 = new JTextArea("");
            name2.setPreferredSize(getTextAreaDimensions());
            name2.setFont(getMyFont());
        }
        return name2;
    }

    public JTextArea getName3() {
        if (name3 == null) {
            name3 = new JTextArea("");
            name3.setPreferredSize(getTextAreaDimensions());
            name3.setFont(getMyFont());
        }
        return name3;
    }

    public JTextArea getName4() {
        if (name4 == null) {
            name4 = new JTextArea("");
            name4.setPreferredSize(getTextAreaDimensions());
            name4.setFont(getMyFont());
        }
        return name4;
    }

    public JTextArea getName5() {
        if (name5 == null) {
            name5 = new JTextArea("");
            name5.setPreferredSize(getTextAreaDimensions());
            name5.setFont(getMyFont());
        }
        return name5;
    }

    public JTextArea getName6() {
        if (name6 == null) {
            name6 = new JTextArea("");
            name6.setPreferredSize(getTextAreaDimensions());
            name6.setFont(getMyFont());
        }
        return name6;
    }

    public JTextArea getName7() {
        if (name7 == null) {
            name7 = new JTextArea("");
            name7.setPreferredSize(getTextAreaDimensions());
            name7.setFont(getMyFont());
        }
        return name7;
    }

    public JTextArea getName8() {
        if (name8 == null) {
            name8 = new JTextArea("");
            name8.setPreferredSize(getTextAreaDimensions());
            name8.setFont(getMyFont());
        }
        return name8;
    }

    public JTextArea getName9() {
        if (name9 == null) {
            name9 = new JTextArea("");
            name9.setPreferredSize(getTextAreaDimensions());
            name9.setFont(getMyFont());
        }
        return name9;
    }

    public JTextArea getName10() {
        if (name10 == null) {
            name10 = new JTextArea("");
            name10.setPreferredSize(getTextAreaDimensions());
            name10.setFont(getMyFont());
        }
        return name10;
    }

    public void close() {
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }
    /*static void ButtonClicks(){
    Frames FRM = new Frames();
    Options OPT = new Options();
    OPT.getGoToAcademic().addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            //OPT.close();
            Frames.WindowPage();

        }
    });

                OPT.getGoToModules().addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Frames.WindowPage();
        }
    });
                OPT.getGoToStudents().addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Frames.WindowPage();
        }
    });
                OPT.getGoToOtherPersons().addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Frames.WindowPage();
        }
    });
                OPT.getGoToTutors().addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Frames.WindowPage();
        }
    });
}*/


}



    /*public void WindowPage(){
        Options OPT = new Options();


// Constraints for the layout

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
        OPT.getPanel().add( OPT.getName4(), OPT.getGridBagConstraints());

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
        OPT.getPanel().add( OPT.getName10(), OPT.getGridBagConstraints());

/// first row of buttons

        OPT.getGridBagConstraints().gridx = 0;
        OPT.getGridBagConstraints().gridy = 0;
        OPT.getButtonPanel().add(OPT.getAddStudents(),OPT.getGridBagConstraints());
        OPT.getGridBagConstraints().gridx = 1;
        OPT.getGridBagConstraints().gridy = 0;
        OPT.getButtonPanel().add(OPT.getModifyStudents(),OPT.getGridBagConstraints());
        OPT.getGridBagConstraints().gridx = 2;
        OPT.getGridBagConstraints().gridy = 0;
        OPT.getButtonPanel().add(OPT.getRemoveStudents(),OPT.getGridBagConstraints());

        //second row of buttons///

        OPT.getGridBagConstraints().gridx = 0;
        OPT.getGridBagConstraints().gridy = 1;
        OPT.getButtonPanel().add(OPT.getBackPage(),OPT.getGridBagConstraints());
        OPT.getGridBagConstraints().gridx = 1;
        OPT.getGridBagConstraints().gridy = 1;
        OPT.getButtonPanel().add(OPT.getSubmitButton(),OPT.getGridBagConstraints());
        OPT.getGridBagConstraints().gridx = 2;
        OPT.getGridBagConstraints().gridy = 1;
        OPT.getButtonPanel().add(OPT.getNextPage(),OPT.getGridBagConstraints());


        OPT.getMainPanel().add(OPT.getPanel());
        OPT.getMainPanel().add(OPT.getButtonPanel());
        OPT.getFrame().add(OPT.getMainPanel());



    }*/







