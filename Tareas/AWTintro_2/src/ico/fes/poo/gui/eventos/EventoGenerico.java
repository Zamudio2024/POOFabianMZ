/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo.gui.eventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Fabian
 */
public class EventoGenerico implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Un evento sucedio");
        System.out.println(e.getSource());
        System.out.println(e.toString());
    }
    
    
}
