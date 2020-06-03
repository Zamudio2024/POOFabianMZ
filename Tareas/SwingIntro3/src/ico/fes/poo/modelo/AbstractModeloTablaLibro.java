/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo.modelo;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Fabian
 */
public class AbstractModeloTablaLibro extends AbstractTableModel{
    private ArrayList<Libro> data;

    public AbstractModeloTablaLibro() {
    }

    public AbstractModeloTablaLibro(ArrayList<Libro> data) {
        this.data = data;
    }

    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public String getColumnName(int i) {
        String columnTitle = "";
        switch (i) {
            case 0:
                columnTitle = "Titulo";
                break;
            case 1:
                columnTitle = "Autor";
                break;
            case 2:
                columnTitle = "ISBN";
                break;
            case 3:
                columnTitle = "Editorial";
                break;
            case 4:
                columnTitle = "Edicion";
                break;
            case 5:
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
                return String.class;
            case 4:
                return Integer.class;
            case 5:
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
        Libro tmp = data.get(i);
        switch (i1) {
            case 0:
                return tmp.getTitulo();
            case 1:
                return tmp.getAutor();
            case 2:
                return tmp.getIsbn();
            case 3:
                return tmp.getEditorial();
            case 4:
                return tmp.getEdicion();
            case 5:
                return tmp.getPrecio();
            default:
                return null;
        }
    }

    @Override
    public void setValueAt(Object o, int i, int i1) {
        Libro t = data.get(i);
        switch (i1) {
            case 0:
                t.setTitulo((String)o);
                break;
            case 1:
                t.setAutor((String)o);
                break;
            case 2:
                t.setIsbn((String)o);
                break;
            case 3:
                t.setEditorial((String)o);
                break;
            case 4:
                t.setEdicion(((Integer)o));
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
    public void addLibro(Libro nuevoLibro){
        data.add(nuevoLibro);
        this.fireTableDataChanged();
    }
}

