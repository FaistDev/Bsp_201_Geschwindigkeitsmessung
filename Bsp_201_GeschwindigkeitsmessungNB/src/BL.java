
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
    
    public void add(Measurement m){
        measurements.add(m);
        fireTableRowsInserted(measurements.size()-1, measurements.size()-1);
    }
    
    public void delete(int index){
        measurements.remove(index);
        fireTableDataChanged();
    }
    
    public double calcAvg(){
        double sum=0.0;
        for (Measurement m : measurements) {
            sum+=m.getÜbertretung();
        }
        return sum/measurements.size();
    }
    
    public void save(File f) throws Exception{
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
        for (Measurement s : measurements) {
            oos.writeObject(s);
        }
        oos.flush();
    }
    
    public void load(File f) throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
        Object s = null;
        measurements.clear();
        while ((s = ois.readObject()) != null) {
            try {
                add((Measurement) s);
            } catch (Exception e) {
                throw new Exception(e);
            }

        }
    }
}
