import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.List;


public class Discount extends Frame {
    private Label lblId = new Label("ID: ");
    private Label lblName = new Label("Name: ");
    private Label lblPrice = new Label("Price: ");
    private Label lblDiscount = new Label("Discount: ");

    private TextField txtId = new TextField();
    private TextField txtName = new TextField();
    private TextField txtPrice = new TextField();

    private Button btnAdd = new Button ("Add");
    private Button btnClear = new Button ("Clear");
    private Button btnExit = new Button ("Exit");
    private Button btnDel = new Button ("Delete");

    private List Lst = new List(5, false);
    private CheckboxGroup cbg = new CheckboxGroup();
    private Checkbox ch5 = new Checkbox("%5",cbg, false);
    private Checkbox ch10 = new Checkbox("%10",cbg, false);
    //List: can be selected unlike textArea; doesnt comply with setBounds since if they Bounds is bigger relative to list. even if the list only allows for 5 rows, it will show more than 5 regardless

    public Discount(){
        setLayout(null);
        setVisible(true);
        setSize(400,400);
        lblId.setBounds(50,60,50,20);
        lblName.setBounds(50,100,50,20);
        lblPrice.setBounds(50,140,50,20);
        lblDiscount.setBounds(50,180,50,20);

        ch5.setBounds(120,180,50,20);
        ch10.setBounds(200,180,50,20);
        txtId.setBounds(120,60,150,20);
        txtName.setBounds(120,100,150,20);
        txtPrice.setBounds(120,140,150,20);

        btnAdd.setBounds(50,220,50,20);
        btnClear.setBounds(200,220,50,20);
        btnExit.setBounds(150,220,50,20);
        btnDel.setBounds(200,220,50,20);

        Lst.setBounds(50,250,200,80);
        add(lblId); add(lblName); add(lblPrice);
        add(lblDiscount); add(txtId); add(txtName);
        add(txtPrice); add(Lst); add(btnAdd);
        add(btnClear); add(btnExit); add(btnDel); add(ch5); add(ch10);

        
        btnAdd.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String item = "    ";
                item += txtId.getText();
                item +="    ";
                item += txtName.getText();
                item +="    ";
                item += txtPrice.getText();
                item +="    ";
                if(ch5.getState()==true)
                    item+=Double.parseDouble(txtPrice.getText())*(1-0.05);
                else if (ch10.getState()==true)
                    item+=Double.parseDouble(txtPrice.getText())*(1-0.10);
                else
                    item+=Double.parseDouble(txtPrice.getText());
                Lst.add(item);
            }});

        btnClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                txtId.setText("    ");
                txtName.setText("    ");
                txtPrice.setText("    ");
                // chF.setState(true);
                // chM.setState(true);
                // cbg.setSelectedCheckbox(null);
                ch10.setState(false);
                ch5.setState(false);
                txtId.requestFocus();
            }
        });

        btnExit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });
        
        btnDel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                Lst.remove(Lst.getSelectedIndex());
            }
        });
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    }    
    public static void main(String[] args) {
        new Discount();
    }
}
