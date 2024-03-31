package table;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class OutputTable {
    private int id;
    private String name;
    private String author;
    private int year;
    private int quantity;
    private float price;
    public OutputTable(){
        this.id = 0;
        this.name ="Java";
        this.author = "Sok San";
        this.year = 3;
        this.quantity = 0;
        this.price = (float) 0.0;
    }
    public OutputTable(int id, String name, String author, int year, int quantity, float price){
        this.id = id;
        this.name =name;
        this.author = author;
        this.year = year;
        this.quantity = quantity;
        this.price = price;
    }
    public void input(){
        JTextField[] txt = new JTextField[6];
        for(int i =0; i<txt.length; i++)
            txt[i] = new JTextField();
        Object []message = {
            "Enter ID: ", txt[0],
            "Enter Name: ", txt[1],
            "Enter Author: ", txt[2],
            "Enter Year: ", txt[3],
            "Enter Quantity: ", txt[4],
            "Enter Price: ", txt[5]
        };
        int option = JOptionPane.showConfirmDialog(null, message, "Please input all information of book", JOptionPane.OK_CANCEL_OPTION);
        if(option==JOptionPane.OK_OPTION){
            id =Integer.parseInt(txt[0].getText());
            name = txt[1].getText();
            author = txt[2].getText();
            year = Integer.parseInt(txt[3].getText());
            quantity = Integer.parseInt(txt[4].getText());
            price = Float.parseFloat(txt[5].getText());
        }
    }
    public String toString(){
        return (id + "\t\t" + name + "\t\t" + author + "\t\t" + year + "\t\t" + quantity + "\t\t" + price + "\n");
    }
    public static String header (){
        return ("ID\t\tName\t\tAuthor\t\tYear\t\tQuantity\t\tPrice\n");
    }
    public static void display(OutputTable...book){
        JTextArea tar;
        String s = header();
        if (book.length==0){
            JOptionPane.showMessageDialog(null, "Don't have data passed in it.");
            return;
        }
        else{
            for (int i=0; i<book.length; i++){
                s += book[i].toString();
            }
        }
        tar = new JTextArea(s, 10,20);
        tar.setEditable(false);
        JOptionPane.showMessageDialog(null,tar,"Display all data of books", JOptionPane.PLAIN_MESSAGE);
    }
    public static void main(String[] args) {
        int n= Integer.parseInt(JOptionPane.showInputDialog("How many number do you get?"));
        OutputTable[] book = new OutputTable[n];
        if (book.length==0){
            JOptionPane.showMessageDialog(null, "Don't have data to input.");
        }
        for(int i=0; i<book.length; i++){
            book[i]=new OutputTable();
            book[i].input();
        }
        display(book);
    }
}
