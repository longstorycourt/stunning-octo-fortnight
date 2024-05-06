import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Student extends Frame {
    private Label lblId = new Label("StuID: ");
    private Label lblName = new Label("Stu Name: ");
    private Label lblGender = new Label("Gender: ");
    private Label lblScore = new Label("Score: ");

    private CheckboxGroup cbg = new CheckboxGroup();
    private Checkbox cb1 = new Checkbox("Male", cbg, true);
    private Checkbox cb2 = new Checkbox("Female", cbg, false);

    private Button btnInsert = new Button("Insert");
    private Button btnRemove = new Button("Remove");
    private Button btnSearch = new Button("Search");

    private TextField txtID = new TextField();
    private TextField txtName = new TextField();
    private TextField txtScore = new TextField();

    private TextArea txtDisplay = new TextArea();

    public Student(){
        super("Student's Information");
        lblId.setBounds(100, 60,80, 15);
        lblName.setBounds(100, 90,80, 15);
        lblGender.setBounds(100, 120,80, 15);
        lblScore.setBounds(100, 150,80, 15);

        txtID.setBounds(180, 60, 200, 20);
        txtName.setBounds(180, 90, 200, 20);
        txtScore.setBounds(180, 150, 200, 20);

        btnInsert.setBounds(390, 60, 100, 25);
        btnRemove.setBounds(390, 90, 100, 25);
        btnSearch.setBounds(390, 120, 100, 25);

        cb1.setBounds(180, 120,50, 20);
        cb2.setBounds(250, 120,50, 20);

        txtDisplay.setBounds(100, 180, 400,200);

        add(lblId);
        add(lblName);
        add(lblGender);
        add(lblScore);
        add(cb1);
        add(cb2);
        add(btnInsert);
        add(btnRemove);
        add(btnSearch);
        add(txtID);
        add(txtName);
        add(txtScore);
        add(txtDisplay);

        setSize(570,400);
        setLocationRelativeTo(null);
        setLayout(null);
        setVisible(true);
        setResizable(true);
        txtDisplay.setEditable(false);
     
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);;
            }
        });
    }
    public static void main(String[] args) {
        new Student();
    }

}
