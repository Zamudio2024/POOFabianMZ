/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo.gui.eventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JComboBox;

/**
 *
 * @author Fabian
 */
public class EventosItems implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent ae) {
        System.out.println("Clic action performed");
        JComboBox com =(JComboBox)ae.getSource();
        System.out.println("Seleccionado: "+ com.getSelectedItem());
    }


    
    
}
