
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ben
 */
public class BL extends AbstractTableModel {

    private ArrayList<Measurement> measurements = new ArrayList<>(); 
    private static final String[] COLS = {"Datum","Uhrzeit","Kennzeichen","Gemessen","Erlaubt","Übertretung"};
    
    @Override
    public int getRowCount() {
        return measurements.size();
    }

    @Override
    public int getColumnCount() {
        return COLS.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Measurement m = measurements.get(rowIndex);
        return m;
    }

    @Override
    public String getColumnName(int column) {
        return COLS[column]; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
