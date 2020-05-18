/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo.gui.eventos;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author Fabian
 */
public class EventosRaton implements MouseListener{

    @Override
    public void mouseClicked(MouseEvent me) {
        System.out.println("Evento clicked");
    }

    @Override
    public void mousePressed(MouseEvent me) {
        System.out.println("Evento Pressed");
        System.out.println("Coordenada X = "+ me.getX());
        System.out.println("Coordenada Y = "+ me.getY());
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        System.out.println("Evento Released");
        System.out.println("Coordenada XX = "+ me.getX());
        System.out.println("Coordenada YY = "+ me.getY());
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        System.out.println("Evento Entered");
    }

    @Override
    public void mouseExited(MouseEvent me) {
        System.out.println("Evento Exited");
    }
    
    
    
}
