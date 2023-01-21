package classes;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;


public class Footer extends JPanel {
    private JButton addTask;
    private JButton clear;
    Border emptyBorder = BorderFactory.createEmptyBorder();

    //constructor
    Footer()
    {
        this.setPreferredSize(new Dimension(400,60));
        this.setBackground(Color.decode("#FFFBAC"));

        addTask = new JButton("Add Task");
        addTask.setBorder(emptyBorder);
        addTask.setFont(new Font("sans-serif",Font.PLAIN,20));
        addTask.setBackground(Color.decode("#FFFBAC"));

        this.add(addTask);

        this.add(Box.createHorizontalStrut(20));
        clear = new JButton("Clear completed Tasks");
        clear.setBorder(emptyBorder);
        clear.setFont(new Font("sans-serif",Font.PLAIN,20));
        clear.setBackground(Color.decode("#FFFBAC"));

        this.add(clear);
    }
    public JButton getAddTask()
    {
        return addTask;
    }
    public JButton getClear()
    {
        return clear;
    }
}
