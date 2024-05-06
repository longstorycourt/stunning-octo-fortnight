import java.awt.Label;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.TextArea;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Button;

public class Product extends Frame {
    private Label lblTitle = new Label ("Discount Product");
    private Label lblCode = new Label ("Code:");
    private Label lblProduct = new Label ("Product:");
    private Label lblUnit = new Label ("Unit:");
    private Label lblPrice = new Label ("Price: ");
    private Label lblDiscount = new Label ("Discount: ");
    private TextField txtCode = new TextField();
    private TextField txtProduct = new TextField();
    private TextField txtUnit = new TextField();
    private TextField txtPrice = new TextField();

    private CheckboxGroup cbog  = new CheckboxGroup();
    private Checkbox cbo5 = new Checkbox("5%",cbog, true);
    private Checkbox cbo10 = new Checkbox("10%",cbog, false);
    private Checkbox cbo15 = new Checkbox("15%", cbog,false);
    private TextArea txtDisplay = new TextArea();
    private Button btnAdd = new Button("Add");
    private Button btnClear = new Button("Clear");
    private Button btnExit = new Button("Exit");

    public Product(){
        setTitle("Product Demo");
        setSize(400,420);
        setLocationRelativeTo(null);
        setLayout(null);
        lblTitle.setBounds(100,40,300,20);
        lblTitle.setFont(new Font("Consolas", Font.PLAIN, 20));
        add(lblTitle);
        lblCode.setBounds(20,70,70,20);
        add(lblCode);
        txtCode.setBounds(100,70,160,20);
        add(txtCode);
        lblProduct.setBounds(20,100,70,20);
        add(lblProduct);
        txtProduct.setBounds(100,100,160,20);
        add(txtProduct);
        lblUnit.setBounds(20,130,70,20);
        add(lblUnit);
        txtUnit.setBounds(100,130,160,20);
        add(txtUnit);
        lblPrice.setBounds(20,160,70,20);
        add(lblPrice);
        txtPrice.setBounds(100,160,160,20);
        add(txtPrice);
        lblDiscount.setBounds(20,190,70,20);
        add(lblDiscount);
        cbo5.setBounds(100,190,50,20);
        add(cbo5);
        cbo10.setBounds(150,190,50,20);
        add(cbo10);
        cbo15.setBounds(200,190,50,20);
        add(cbo15);
        btnAdd.setBounds(280, 70,80,20);
        add(btnAdd);
        btnClear.setBounds(280, 100,80,20);
        add(btnClear);
        btnExit.setBounds(280, 130,80,20);
        add(btnExit);
        txtDisplay.setBounds(10,240,385,110);
        add(txtDisplay);
        txtDisplay.append("Code\tName\t\tUnit\tPrice\tPay\tDiscount\n");

        setVisible(true);
        addWindowListener((WindowListener) new Product.Clo());
    }
    class Clo extends WindowAdapter{
        public void windowClosing(WindowEvent ar){
            System.exit(0);
        }
    }
    public static void main(String[] args) {
        new Product();
    }
}
