package awtlayout;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Choice;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DemoPanel1 extends Frame implements ActionListener {
    double total = 0;

    private Label lblTitle = new Label ("Book Store", 1);
    private Label lblB_ID = new Label ("Book ID: ");
    private Label lblB_Qty = new Label ("Book Qty: ");
    private Label lblB_Price = new Label ("Book Price: ");
    private Choice chcB_ID = new Choice();
    private TextField txtB_Qty = new TextField();
    private TextField txtB_Price = new TextField();
    private TextArea txtDisplay = new TextArea();
    private Button btnInsert = new Button("Insert");
    private Button btnTotal = new Button("Total");
    private Button btnExit = new Button("Exit");
    private Panel pnlcontent = new Panel(new BorderLayout());
    private Panel pnltext = new Panel(new GridLayout(3,2));
    private Panel pnlbutton = new Panel(new FlowLayout());
    private Panel pnldisplay = new Panel(new BorderLayout());

    public DemoPanel1(){
        setSize(400,320);
        setLayout(new BorderLayout());
        chcB_ID.add("B001");
        chcB_ID.add("B002");
        chcB_ID.add("B003");
        chcB_ID.add("B004");
        chcB_ID.add("B005");

        add(lblTitle, BorderLayout.NORTH);
        add(pnlcontent, BorderLayout.CENTER);
        pnlcontent.add(pnltext, BorderLayout.NORTH);
        pnlcontent.add(pnldisplay, BorderLayout.CENTER);
        pnltext.add(lblB_ID);
        pnltext.add(chcB_ID);
        pnltext.add(lblB_Qty);
        pnltext.add(txtB_Qty);
        pnltext.add(lblB_Price);
        pnltext.add(txtB_Price);

        btnExit.addActionListener(this);
        btnInsert.addActionListener(this);
        btnTotal.addActionListener((ActionListener)this);

        pnlbutton.add(btnInsert);
        pnlbutton.add(btnTotal);
        pnlbutton.add(btnExit);
        pnldisplay.add(pnlbutton, BorderLayout.NORTH);
        pnldisplay.add(txtDisplay, BorderLayout.CENTER);
        setBackground(Color.lightGray);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        double q, p ,t;
        if(ae.getSource()== btnInsert){
            q = Double.parseDouble(txtB_Qty.getText());
            p = Double.parseDouble(txtB_Price.getText());
            t = q * p;
            total += t;
            txtDisplay.append(chcB_ID.getSelectedItem() + "\t" + txtB_Qty.getText() + "\t" + txtB_Price.getText()+ "\t" +t + "\n");
        }
    if(ae.getActionCommand()=="Total")
        txtDisplay.append("\t\tTotal:\t"+total+"\n");
    if(ae.getSource()==btnExit)
        System.exit(0);
    }
    public static void main(String[] args) {
        new DemoPanel1();
    }
}
