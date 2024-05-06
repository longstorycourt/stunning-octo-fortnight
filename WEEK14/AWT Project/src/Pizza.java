import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Pizza extends Frame {

    //class CHoice for selecting option 
    //choice.add("A"); // 

    //checkbox can choose multiple options
    //checkbox group; those checkbox once add into a checkbox group can only select one option

    private Label lblTitle = new Label("Pizza v1.0");
    private Label lblKind = new Label("Kind");
    private Choice chKind = new Choice();
    private CheckboxGroup cg= new CheckboxGroup();
    private Checkbox cbo1 = new Checkbox("Small", cg, true);
    private Checkbox cbo2 = new Checkbox("Medium", cg, false);
    private Checkbox cbo3 = new Checkbox("Large", cg, false);
    private Label lblPrice = new Label("Price: ");
    private TextField txtPrice = new TextField();
    private Label lblqty = new Label("Qty: ");
    private TextField txtqty = new TextField();
    private TextArea txtDisplay = new TextArea();
    private Button btnAdd = new Button ("Add");
    private Label lblTotal = new Label("Total: ");
    private TextField txtTotal = new TextField("0");

    int total = 0;
    
    public Pizza(){
        lblTitle.setBounds(250,20,100,50);
        add(lblTitle);
        lblKind.setBounds(100,100,100,30);
        chKind.add("Option A");
        chKind.add("Option B");
        chKind.add("Option C");
        chKind.add("Option D");
        chKind.setBounds(200,70,150,30);
        add(chKind);
        cbo1.setBounds(100,100,70,30);
        add(cbo1);
        cbo2.setBounds(200,100,70,30);
        add(cbo2);
        cbo3.setBounds(300,100,70,30);
        add(cbo3);
        lblPrice.setBounds(100,150,100,30);
        add(lblPrice);
        txtPrice.setBounds(200,150,150,30);
        add(txtPrice);
        lblqty.setBounds(100,200,100,30);
        add(lblqty);
        txtqty.setBounds(200,200,150,30);
        add(txtqty);
        txtDisplay.setBounds(200,200,150,30);
        add(txtDisplay);
        btnAdd.setBounds(100,400,60,30);
        add(btnAdd);
        lblTotal.setBounds(100,450,100,30);
        add(lblTotal);
        txtTotal.setBounds(200,450,150,30);
        add(lblTotal);

        setSize(550,550);
        setLocationRelativeTo(null);
        setLayout(null);
        setVisible(true);
        setResizable(false);
        txtDisplay.setEditable(false);
        txtTotal.setEditable(false);
        btnAdd.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                String txtService = "";
                txtDisplay.append(txtPrice.getText() + "\t"+ txtqty.getText()+ "\t" + chKind.getSelectedItem()+"\t");

                if(cbo1.getState()==true) txtService = "Small";
                if(cbo2.getState()==true) txtService = "Medium";
                if(cbo3.getState()==true) txtService = "Large";
                txtDisplay.append(txtService+"\n");
                total = Integer.parseInt(txtTotal.getText());
                total += Integer.parseInt(txtPrice.getText());
                txtTotal.setText(String.valueOf(total));
            }
        });
        addWindowListener(new WindowAdapter() {
             public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    }

    public static void main(String[] args){
        new Pizza();
    }
}
