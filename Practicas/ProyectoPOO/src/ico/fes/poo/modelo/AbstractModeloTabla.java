/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo.modelo;

import ico.fes.poo.casa.Casa;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Fabian
 */
public class AbstractModeloTabla extends AbstractTableModel{
    private ArrayList<Casa> data;

    public AbstractModeloTabla() {
    }

    public AbstractModeloTabla(ArrayList<Casa> data) {
        this.data = data;
    }

    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public String getColumnName(int i) {
        String columnTitle = "";
        switch (i) {
            case 0:
                columnTitle = "Material";
                break;
            case 1:
                columnTitle = "Num. de cuartos";
                break;
            case 2:
                columnTitle = "Num. de patios";
                break;
            case 3:
                columnTitle = "Num. de plantas";
                break;

            default:
                columnTitle = "ND";
        }
        return columnTitle;
    }

    @Override
    public Class<?> getColumnClass(int i) {
        switch (i) {
            case 0:
                return String.class;
            case 1:
                return Integer.class;
            case 2:
                return Integer.class;
            case 3:
                return Integer.class;
            
            default:
                return String.class;
        }
    }

    @Override
    public boolean isCellEditable(int i, int i1) {
        return true;
    }

    @Override
    public Object getValueAt(int i, int i1) {
        Casa tmp = data.get(i);
        switch (i1) {
            case 0:
                return tmp.getMaterial();
            case 1:
                return tmp.getNumCuartos();
            case 2:
                return tmp.getNumPatios();
            case 3:
                return tmp.getNumPlantas();

            default:
                return null;
        }
    }

    @Override
    public void setValueAt(Object o, int i, int i1) {
        Casa t = data.get(i);
        switch (i1) {
            case 0:
                t.setMaterial((String)o);
                break;
            case 1:
                t.setNumCuartos((Integer)o);
                break;
            case 2:
                t.setNumPatios((Integer)o);
                break;
            case 3:
                t.setNumPlantas((Integer)o);
                break;

            default:
                throw new AssertionError();
        }
        data.set(i, t);
        this.fireTableCellUpdated(i, i1);
    }
    public void addCasa(Casa nuevaCasa){
        data.add(nuevaCasa);
        this.fireTableDataChanged();
    }
    
}
