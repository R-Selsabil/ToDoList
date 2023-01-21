package classes;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

public class Task extends JPanel {
    //constructor
    //an index number and a text field
    private JLabel index;
    private JTextField taskName;
    private JButton done;

    private boolean checked;
    Task()
    {
        this.setPreferredSize(new Dimension(40,20));
        this.setBackground(Color.decode("#FFFBAC"));
        this.setLayout(new BorderLayout());


        checked = false;

        index = new JLabel(""); // we will use a function

        index.setPreferredSize(new Dimension(20,20));
        index.setHorizontalAlignment(JLabel.CENTER);
        this.add(index,BorderLayout.WEST);

        taskName = new JTextField("Your task here");
        taskName.setBorder(BorderFactory.createEmptyBorder());
        taskName.setBackground(Color.decode("#FFD495"));

        this.add(taskName,BorderLayout.CENTER);

        done = new JButton("done");
        done.setPreferredSize(new Dimension(40,20));
        done.setBorder(BorderFactory.createEmptyBorder());
        done.setBackground(Color.decode("#D7E9B9"));

        this.add(done,BorderLayout.EAST);

    }

    public void changeIndex(int index)
    {
        this.index.setText(index+"");
        this.revalidate();
    }

    // recuperer l'etat du bouton done
    public JButton getDone()
    {
        return done;
    }


    public boolean getState()
    {
        return checked;
    }

    //changer l'etat de la tache dés qu'elle est terminée
    public void changeState()
    {
        this.setBackground(Color.decode("#D7E9B9"));
        taskName.setBackground(Color.decode("#D7E9B9"));
        checked = true;
    }
}
