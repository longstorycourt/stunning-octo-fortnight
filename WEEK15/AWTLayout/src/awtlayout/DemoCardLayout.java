package awtlayout;

import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;

class Card extends JPanel implements ActionListener{
    JPanel fruits, animals;
    JPanel cardholder = new JPanel();
    CardLayout cl;
    public Card(){
        setLayout(new FlowLayout());
        cl = new CardLayout();
        cardholder.setLayout(cl);
        //Create the first class
        fruits = new JPanel();
        fruits.setLayout(new GridLayout(2,4));
        JButton apl = new JButton("Apple");
        JButton ban = new JButton("Banana");
        JButton grp = new JButton("Grape");
        JButton jac = new JButton("Jackfruit");
        JButton man = new JButton("Mango");
        JButton lem = new JButton("Lemon");
        JButton ora = new JButton("Orange");
        JButton coc = new JButton("Coconut");
        fruits.add(apl);
        fruits.add(ban);
        fruits.add(grp);
        fruits.add(jac);
        fruits.add(man);
        fruits.add(lem);
        fruits.add(ora);
        fruits.add(coc);
        //Create the second card
        animals = new JPanel();
        animals.setLayout(new GridLayout(2,4));
        JButton ele = new JButton("Elephant");
        JButton cow = new JButton("Cow");
        JButton lio = new JButton("Lion");
        JButton tig = new JButton("Tiger");
        JButton cam = new JButton("Camel");
        JButton dog = new JButton("Dog");
        JButton zeb = new JButton("Zebra");
        JButton rab = new JButton("Rabbit");
        animals.add(ele);
        animals.add(cow);
        animals.add(lio);
        animals.add(tig);
        animals.add(cam);
        animals.add(dog);
        animals.add(zeb);
        animals.add(rab);
        //add the two cards to the main panel
        cardholder.add(fruits, "Card1");
        cardholder.add(animals, "Card2");
        //add the main panel to panel
        add(cardholder);
        //show the second card as initial screen
        cl.show(cardholder, "Card1");
        //add a Next Card Button to the applet panel
        JButton nxt = new JButton("Next card");
        add(nxt);
        nxt.addActionListener((ActionListener) this);
    }
    public void actionPerformed(ActionEvent ae){
        cl.next(cardholder);
    }
}
public class DemoCardLayout extends JFrame {
    DemoCardLayout(String str){
        super(str);
        add(new Card());
        setSize(370,150);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });
    }
    public static void main(String[] args) throws Exception{
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        JFrame clfrm = new DemoCardLayout("CardLayout on JFrame");
        clfrm.setLocationRelativeTo(null);
        clfrm.setResizable(false);
        clfrm.setVisible(true);
    }
}
