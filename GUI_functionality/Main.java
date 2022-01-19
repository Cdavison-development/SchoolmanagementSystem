package com.CW1.CameronDavison.GUI_functionality;


import java.awt.*;

public class Main {
    // Main class that will run the Main menu frame, from which the user can navigate the entire system
    public static void main(String[] args) {
        Frames frm = new Frames();
        EventQueue.invokeLater( new Runnable() {
            @Override
            public void run() {
                frm.mainMenu();
            }
        });

    }

    /* TODO
    Make only components update not entire Frame
    return SQLerrors when duplicate tables are chosen as well as removing tables that arent there ect...
     */
}

