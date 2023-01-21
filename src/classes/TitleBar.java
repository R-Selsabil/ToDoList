package classes;

import javax.swing.*;
import java.awt.*;

public class TitleBar extends JPanel {

    //constructor
    TitleBar(){
        //the bar size
        this.setPreferredSize(new Dimension(400,80));
        JLabel titleText = new JLabel("To Do List");
        titleText.setPreferredSize(new Dimension(200,80));
        this.setBackground(Color.decode("#FFFBAC"));


        //the bar title
        titleText.setFont(new Font("sans-serif",Font.BOLD,20));
        titleText.setHorizontalAlignment(JLabel.CENTER);
        this.add(titleText);



    }
}
