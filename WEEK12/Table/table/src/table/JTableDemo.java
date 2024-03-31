 
package table;
 
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.TableColumnModel;
   
public class JTableDemo extends JFrame {
   private Object rows[][] = {
	{"001", "Chan Dara", "96"},
	{"002", "Hong Manith", "83"}, 
	{"003", "Seng MengLong", "85"},
	{"004", "Din Makara", "98"}
   };
   private Object columns[] = {"ID", "Name", "Score"};
   private JTable tbl = new JTable(rows, columns);
   public JTableDemo() {
      setTitle("JTable Demo");
      setSize(500, 300);
      setLayout(new BorderLayout());		
      JScrollPane scr = new JScrollPane();
      scr.setViewportView(tbl);
      tbl.getTableHeader().setReorderingAllowed(false);
      tbl.getTableHeader().setResizingAllowed(false);
      tbl.getTableHeader().setPreferredSize(new Dimension(0,20));
      
      TableColumnModel cm = tbl.getColumnModel();
         cm.getColumn(1).setPreferredWidth(300);
         cm.getColumn(2).setPreferredWidth(150);
		
            tbl.setRowHeight(50);
            tbl.setFont(new Font("Consolas", Font.ITALIC, 16));
            add(scr);		
            tbl.addMouseListener(new MouseAdapter() {
               public void mouseReleased(MouseEvent me) {
	int index = tbl.getSelectedRow();
	String id = tbl.getValueAt(index, 0).toString();
	String name = tbl.getValueAt(index, 1).toString();
	String score = tbl.getValueAt(index, 2).toString();
	JOptionPane.showMessageDialog(null, "ID: " + id + 
	"\nName: " + name + "\nScore: " + score);
               }
            });		
            setVisible(true);
            setLocationRelativeTo(null);
            //setDefaultCloseOperation(EXIT_ON_CLOSE);
      }
   public static void main(String[] args) throws Exception {
      UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
      new JTableDemo();
   }
}
