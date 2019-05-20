/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package danetabelaryczne;

/**
 *
 * @author pieni
 */

import javax.swing.table.AbstractTableModel;

public class TableModel1 extends AbstractTableModel {

    IDataAccess data;

    public TableModel1(IDataAccess data) {
        this.data = data;
    }
    
    @Override
    public int getRowCount() {
        return data.Size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex) {
            case 0: return rowIndex + 1;
            case 1: return data.Get(rowIndex).getFirstName();
            case 2: return data.Get(rowIndex).getLastName();
            case 3: return data.Get(rowIndex).getSalary();
            default: return "";
        }
    }
    
    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0: return "Lp";
            case 1: return "Imie";
            case 2: return "Nazwisko";
            case 3: return "Placa";
            default: return "";
        }
    }
    
//    @Override
//    public boolean isCellEditable(int rowIndex, int columnIndex) {
//        return columnIndex != 0;
//    }
    
//    @Override
//    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
//        switch(columnIndex) {
//            case 1: data.Get(rowIndex).setFirstName((String)aValue); break;
//            case 2: data.Get(rowIndex).setLastName((String)aValue); break;
//            case 3: data.Get(rowIndex).setAge(Integer.parseInt((String)aValue)); break;
//        }
//    } 
    
    public void SetRow(int rowIndex, String FirstName, String LastName, int Salary) {
        data.Get(rowIndex).setFirstName(FirstName);
        data.Get(rowIndex).setLastName(LastName);
        data.Get(rowIndex).setSalary(Salary);
    }
}
