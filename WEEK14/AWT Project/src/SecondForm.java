import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class SecondForm extends Frame{
    private Label L1 = new Label("Input A: ");
    private Label L2 = new Label("Input B: ");
    private Label L3 = new Label("Sum: ");

    private TextField txt1 = new TextField();
    private TextField txt2 = new TextField();
    private TextField txt3 = new TextField();
    private Button btns = new Button ("Sum");
    private Button btne = new Button ("Exit");

    public SecondForm(){
        //super("Caculator");
        L1.setBounds(50,60, 50, 20);
        L2.setBounds(50,100, 50, 20);
        L3.setBounds(50,140, 50, 20);
        
        txt1.setBounds(110, 60, 80, 20);
        txt2.setBounds(110, 100, 80, 20);
        txt3.setBounds(110, 140, 80, 20);
        btns.setBounds(50, 180, 50,20);
        btne.setBounds(130, 180, 50,20);
        add(L1);
        add(L2);
        add(L3);
        add(txt1);
        add(txt2);
        add(txt3);
        add(btns);
        add(btne);
        btne.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent ae) {
                System.exit(0);
            }
        });

        setSize(250,300); //size in pixels
        setTitle("Calculator");
        setLocationRelativeTo(null); //null be in the center of screen; default is on the left
        setBackground(Color.lightGray);
        setForeground(Color.BLACK);
        setLayout(null);
        setResizable(true);
        addWindowListener((WindowListener) new Clo());
        setVisible(true);
    }
    class Clo extends WindowAdapter{ //adapter inner class
        public void windowClosing(WindowEvent ar){
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new SecondForm();
    }
    
}
