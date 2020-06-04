/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo.casa.practica;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Fabian
 */
public class AbstractModeloTabla extends AbstractTableModel{
    private ArrayList<Celular> data;

    public AbstractModeloTabla() {
    }

    public AbstractModeloTabla(ArrayList<Celular> data) {
        this.data = data;
    }

    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public String getColumnName(int i) {
        String columnTitle = "";
        switch (i) {
            case 0:
                columnTitle = "Marca";
                break;
            case 1:
                columnTitle = "Compañia telefonica";
                break;
            case 2:
                columnTitle = "Sistema Operativo";
                break;
            case 3:
                columnTitle = "Pulgadas";
                break;
            case 4:
                columnTitle = "Precio";
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
                return String.class;
            case 2:
                return String.class;
            case 3:
                return Float.class;
            case 4:
                return Float.class;
            
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
        Celular tmp = data.get(i);
        switch (i1) {
            case 0:
                return tmp.getMarca();
            case 1:
                return tmp.getCompañiaTel();
            case 2:
                return tmp.getSistemaOp();
            case 3:
                return tmp.getPulgadas();
            case 4:
                return tmp.getPrecio();
            default:
                return null;
        }
    }

    @Override
    public void setValueAt(Object o, int i, int i1) {
        Celular t = data.get(i);
        switch (i1) {
            case 0:
                t.setMarca((String)o);
                break;
            case 1:
                t.setCompañiaTel((String)o);
                break;
            case 2:
                t.setSistemaOp((String)o);
                break;
            case 3:
                t.setPulgadas((Float)o);
                break;
            case 4:
                t.setPrecio(((Float)o));
                break;
            case 5:
                t.setPrecio((Float)o);
                break;
            default:
                throw new AssertionError();
        }
        data.set(i, t);
        this.fireTableCellUpdated(i, i1);
    }
    public void addCelular(Celular nuevoCelular){
        data.add(nuevoCelular);
        this.fireTableDataChanged();
    }

}
