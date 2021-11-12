import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class dsa {

    public dsa() {

    }

    public static void main(String[] args) {
        Frames frm = new Frames();
        EventQueue.invokeLater( new Runnable() {
            @Override
            public void run() {
                frm.MainMenu();
            }
        });

        }
}

