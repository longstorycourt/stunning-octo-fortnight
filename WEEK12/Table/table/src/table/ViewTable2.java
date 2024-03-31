 
package table;
 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

public class ViewTable2 {
 
   public static void main(String[] args) throws Exception {
   UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
    
   final JTextField txtName = new JTextField();
   final JTextField txtGender = new JTextField();
   final JTextField txtAge = new JTextField();		
   JButton btnAdd = new JButton("Add");
	
   Object columnNames[] = {"Id", "Name", "Gender", "Age"};
   final DefaultTableModel dtm = new DefaultTableModel(0, 0);
   dtm.setColumnIdentifiers(columnNames);
   final JTable table = new JTable(dtm){
   public boolean isCellEditable(int row, int col) {
      if(col == 2) {
         return true;
      } else {
            return false;
         }
      }
   };
   table.getColumnModel().getColumn(1).setPreferredWidth(100); // column width
   table.setRowHeight(20); // row height
   JScrollPane pane = new JScrollPane(table);
   Object message = new Object[] {
           "Enter Name",txtName,
            "Enter Gender",txtGender,
            "Enter Age",txtAge,
            btnAdd,pane
   };
   btnAdd.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
         dtm.addRow(new Object[] {
         table.getRowCount() +1,        
         txtName.getText(),
         txtGender.getText(),
         txtAge.getText()
         });
      }
   });
   JOptionPane.showMessageDialog(null, message, "Table", JOptionPane.PLAIN_MESSAGE);
   }
}
