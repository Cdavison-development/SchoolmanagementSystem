
import javax.swing.*;
import java.awt.*;

public class MainFrame{

    private static void CreateWindow(){

        JFrame frame = new JFrame("simple GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel textLabel = new JLabel("MAIN Menu", SwingConstants.CENTER);
        textLabel.setPreferredSize(new Dimension(300, 100));
        frame.getContentPane().add(textLabel, BorderLayout.CENTER);
        frame.getContentPane().add(textLabel, BorderLayout.NORTH);

        JButton Button1 = new JButton("Students");
        textLabel.setPreferredSize(new Dimension(300 , 100));
        frame.getContentPane().add(Button1, BorderLayout.CENTER);

        JButton Button2 = new JButton("tutors");
        textLabel.setPreferredSize(new Dimension(300 , 100));
        frame.getContentPane().add(Button2, BorderLayout.SOUTH);

        JButton Button3 = new JButton("academics");
        textLabel.setPreferredSize(new Dimension(300 , 100));
        frame.getContentPane().add(Button3);


        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {       CreateWindow();    } }

