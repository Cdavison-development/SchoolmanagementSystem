import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Actions{ //extends JFrame {

// Bringing user to pages From Main menu////////

    // static class Action extends Options implements ActionListener {
        Options OPT = new Options();
        Frames frm = new Frames();


        public void actionPerformed(ActionEvent event){
            frm.WindowPage();
        }



        /*public Action() {
            OPT.getGoToAcademic().addActionListener(new Action() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    OPT.close();
                    FRM.WindowPage();

                }
            });
        }


*/


        public ActionListener getAC()
        {
            ActionListener ac = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    OPT.close();
                    frm.WindowPage();
                }
            };
            return ac;
        }



    public ActionListener getAddAcademic()
    {
        ActionListener ac = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frm.addAcademic();
            }
        };
        return ac;
    }
    public ActionListener getAddModule()
    {
        ActionListener ac = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frm.addModules();
            }
        };
        return ac;
    }
    public ActionListener getAddStudents()
    {
        ActionListener ac = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frm.addStudents();
            }
        };
        return ac;
    }
    public ActionListener getAddOtherPersons()
    {
        ActionListener ac = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frm.addOtherPersons();
            }
        };
        return ac;
    }
    public ActionListener getAddTutor()
    {
        ActionListener ac = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frm.addTutor();
            }
        };
        return ac;
    }























       /*public void ButtonClicks()  {
            Frames frm = new Frames();
            Options OPT = new Options();


                OPT.getGoToAcademic().addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        OPT.close();
                        frm.WindowPage();

                    }
                });

                OPT.getGoToModules().addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frm.WindowPage();
                    }
                });
                OPT.getGoToStudents().addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frm.WindowPage();
                    }
                });
                OPT.getGoToOtherPersons().addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frm.WindowPage();
                    }
                });
                OPT.getGoToTutors().addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frm.WindowPage();
                    }
                });
            }

        *//*@Override
        public void actionPerformed(ActionEvent e) {

        }*//*
    //}*/
    }
