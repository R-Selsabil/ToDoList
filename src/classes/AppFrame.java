package classes;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AppFrame extends JFrame {
    private Footer btnPanel;
    private  TitleBar title;
    private List list;


    private JButton addTask;
    private JButton clear;


    //constructor
    AppFrame()
    {
        //size of the app screen
        this.setSize(400,700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        title = new TitleBar();
        list = new List();
        btnPanel = new Footer();

        //to add the frame to the screen

        this.add(title, BorderLayout.NORTH);
        this.add(btnPanel,BorderLayout.SOUTH);
        this.add(list,BorderLayout.CENTER);

        addTask = btnPanel.getAddTask();
        clear = btnPanel.getClear();

        addListeners();
    }

    //listeners du bouton ad task
    public void addListeners(){
        addTask.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e){
                Task task = new Task();
                list.add(task);
                list.updateNumbers();

                //done bouton
                task.getDone().addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent e) {
                        task.changeState();
                        revalidate();
                    }

                });
                revalidate();
            }
        });

        clear.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                list.removeCompletedTasks();
                repaint();
            }
        });
    }
}
