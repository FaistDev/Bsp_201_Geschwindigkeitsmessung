
import java.awt.Component;
import java.time.format.DateTimeFormatter;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ben
 */
public class CellRenderer implements TableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        JLabel label = new JLabel();
        Measurement c = (Measurement) value;
        switch(column){
            case 0: label.setText(c.getDateTime().format(DateTimeFormatter.ofPattern("dd.MM.YYYY")));break;
            case 1: label.setText(c.getDateTime().format(DateTimeFormatter.ofPattern("HH:mm")));break;
            case 2: label.setText(c.getKennzeichen());break;
            case 3: label.setText(""+c.getGemessen());break;
            case 4: label.setText(""+c.getErlaubt());break;
            case 5: label.setText(""+c.getÜbertretung());break;
        }
        label.setOpaque(true);
        
        return label;
    }
    
}
