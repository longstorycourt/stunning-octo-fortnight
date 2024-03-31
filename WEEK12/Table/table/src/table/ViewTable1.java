 
package table;
 
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class ViewTable1 extends JFrame{  
 
   private JLabel lblTitle = new JLabel("LIST OF STUDENT",JLabel.CENTER);
   private BorderLayout bdl = new BorderLayout();
   private JTable tbl = new JTable(new DefaultTableModel(
         new Object[]{"ID", "Name", "Score"},15));
	
public ViewTable1() {
   setSize(500,400);
   setLayout(bdl);		
   JScrollPane scr = new JScrollPane();
   scr.setViewportView(tbl);
   tbl.getTableHeader().setReorderingAllowed(false);
   tbl.getTableHeader().setResizingAllowed(false);
   tbl.getTableHeader().setPreferredSize(new Dimension(1,30));
   TableColumnModel cm = tbl.getColumnModel();
   cm.getColumn(1).setPreferredWidth(300);
   cm.getColumn(2).setPreferredWidth(150);
   tbl.setRowHeight(30);	
   add(lblTitle, BorderLayout.NORTH);
   lblTitle.setFont(new Font("Monospace", Font.PLAIN, 20));		
   add(scr);				
   setLocationRelativeTo(null);
   //bdl.setHgap(20);
    bdl.setVgap(50);		 
   setVisible(true);
}
public static void main(String [] args) {
      new ViewTable1();
   }
}
