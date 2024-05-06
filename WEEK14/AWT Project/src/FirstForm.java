import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FirstForm extends Frame{
    public FirstForm(){
        //super("First Form"); //same function as setTitle("");
        setTitle("First Form");
        setSize(250,250); //size in pixels
        setLocationRelativeTo(null); //null be in the center of screen; default is on the left
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
        new FirstForm();
    }

}