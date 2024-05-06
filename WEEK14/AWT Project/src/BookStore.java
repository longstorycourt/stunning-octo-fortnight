import java.awt.Button;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class BookStore extends Frame {
    private Label lblTitle = new Label("Book Store: ");
    private Label lblB_ID = new Label("Book Store: ");
    private Label lblB_Qty = new Label("Book Store: ");
    private Label lblB_Price = new Label("Book Store: ");
    private Choice chcB_ID = new Choice();
    private TextField txtB_Qty = new TextField();
    private TextField txtB_Price = new TextField();
    private TextArea txtDisplay = new TextArea();
    private Button btnAdd = new Button("Add");
    private Button btnTotal = new Button("Total");
    private Button btnExit = new Button("Exit");

    public BookStore(){
        add(lblTitle);
        add(lblB_ID);
        add(lblB_Qty);
        add(lblB_Price);
        add(chcB_ID);
        add(txtB_Qty);
        add(txtB_Price);
        add(btnAdd);
        add(btnTotal);
        add(btnExit);
        add(txtDisplay);

        lblTitle.setAlignment(Label.CENTER);
        lblTitle.setBounds(5, 30, 500,20);
        lblB_ID.setBounds(130,60,70,20);
        lblB_Qty.setBounds(130,85,70,20);
        lblB_Price.setBounds(130,110,70,20);
        chcB_ID.setBounds(210,60,150,20);
        txtB_Qty.setBounds(210,85,150,20);
        txtB_Price.setBounds(210,85,150,20);
        btnAdd.setBounds(135,135,70, 30);
        btnTotal.setBounds(210,135,70,30);
        btnExit.setBounds(285,135,70,30);
        txtDisplay.setBounds(50,170,390,100);
        setTitle("Book Store");
        chcB_ID.add("B001");
        chcB_ID.add("B002");
        chcB_ID.add("B003");
        chcB_ID.add("B004");
        chcB_ID.add("B005");
        txtDisplay.append("B-ID\tB-Qty\tB-Price\tB-Total\n");

        setSize(500,300);
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        addWindowListener((WindowListener) new BookStore.Clo());
    }
    class Clo extends WindowAdapter{//adapter inner class
        public void windowClosing(WindowEvent ar){
            System.exit(0);
        }
    }
    public static void main(String[] args) {
            new BookStore();
    }

}
