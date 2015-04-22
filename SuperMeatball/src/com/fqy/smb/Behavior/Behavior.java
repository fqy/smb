package com.fqy.smb.behavior;

import com.fqy.smb.figure.Figure;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by FQY on 2015/4/17.
 */
public class Behavior implements KeyListener{
    private Figure figure;
    private int curX, curY;
    private int iStep = 100;
    /**
     * Invoked when a key has been typed.
     * See the class description for {@link KeyEvent} for a definition of
     * a key typed event.
     *
     * @param e
     */
    @Override
    public void keyTyped(KeyEvent e) {
    }

    /**
     * Invoked when a key has been pressed.
     * See the class description for {@link KeyEvent} for a definition of
     * a key pressed event.
     *
     * @param e
     */
    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()){
            case KeyEvent.VK_UP:
                curY -= iStep;
                break;
            case KeyEvent.VK_RIGHT:
                curX += iStep;
                break;
            case KeyEvent.VK_DOWN:
                curY += iStep;
                break;
            case KeyEvent.VK_LEFT:
                curX -= iStep;
                break;
        }
        figure.setCoordinate(curX, curY);
        figure.repaint();
    }

    /**
     * Invoked when a key has been released.
     * See the class description for {@link KeyEvent} for a definition of
     * a key released event.
     *
     * @param e
     */
    @Override
    public void keyReleased(KeyEvent e) {

    }

    public void assocFigure(Figure figure){
        this.figure = figure;
        this.curX = figure.getCoordinate().getX();
        this.curY = figure.getCoordinate().getY();
    }
}
