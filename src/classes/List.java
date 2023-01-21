package classes;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;

public class List extends JPanel {
    // it sends jpanel, we're gonna use a grid layout
    List()
    {
        //10 rows and one column
        GridLayout layout = new GridLayout(10,1);
        //set a vertical gap
        layout.setVgap(5);
        this.setLayout(layout);
        //this.setBackground(Color.blue);
        this.setBackground(Color.decode("#FFFBAC"));
    }

    //a function to set the task index

    public void updateNumbers()
    {
        Component[] listItems = this.getComponents();
        for(int i = 0;i<listItems.length;i++)
        {
            if(listItems[i] instanceof Task)
            {
                ((Task)listItems[i]).changeIndex(i+1);
            }
        }
    }

    public void removeCompletedTasks()
    {

        for(Component c : getComponents())
        {
            if(c instanceof Task)
            {
                if(((Task)c).getState())
                {
                    remove(c);
                    updateNumbers();
                }
            }
        }

    }
}
