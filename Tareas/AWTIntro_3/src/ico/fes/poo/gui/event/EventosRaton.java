/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo.gui.event;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author Fabian
 */
public class EventosRaton implements MouseListener{

    @Override
    public void mouseClicked(MouseEvent me) {
        System.out.println("Click");
    }

    @Override
    public void mousePressed(MouseEvent me) {
        System.out.println("Presionado");
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        System.out.println("Liberado");
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        System.out.println("Entra al componente");
    }

    @Override
    public void mouseExited(MouseEvent me) {
        System.out.println("Sala del componente");
    }
    
    
}
