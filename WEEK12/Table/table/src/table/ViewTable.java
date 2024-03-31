 
package table;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ViewTable {    
   public static void main(String[] args) {
      Object columnNames[]={ "Column One","Column Two","Column Three"};
      DefaultTableModel dtm = new DefaultTableModel(0,0);
      dtm.setColumnIdentifiers(columnNames);
      for (int count = 1; count <= 30; count++) {
         dtm.addRow(new Object[] {
                     "Row-" + count + " Column-1", 
	"Row-" + count + " Column-2",
	"Row-" + count + " Column-3"
         }
         );
      }
      JTable table = new JTable(dtm)
      {
         public boolean isCellEditable(int arg0, int arg1) {
            return false;
         }
      };
      JScrollPane pane = new JScrollPane(table);
      JOptionPane.showMessageDialog(null, pane, "Table", JOptionPane.PLAIN_MESSAGE);
   }
}
