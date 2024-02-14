import java.util.*;
import javax.swing.*;
import javax.swing.JFrame;

public class SnakeGame extends JFrame{
    SnakeGame(){
        super("Snake Game");
        add(new Board());
        pack(); //refresh frame to see changes
        //setSize(300,300);
        setResizable(false);
        setLocationRelativeTo(null);
        //setLocation(700,300);
    }
    public static void main(String[] args) {
        new SnakeGame().setVisible(true); //frame;
    }
}