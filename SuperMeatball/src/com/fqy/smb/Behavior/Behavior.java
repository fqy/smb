package com.fqy.smb.Behavior;

import com.fqy.smb.coordinate.Coordinate;
import com.fqy.smb.figure.Figure;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Collection;

/**
 * Created by FQY on 2015/4/17.
 */
public class Behavior implements KeyListener{
    private Figure figure;
    private int curX, curY;
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
                curY -= 10;
                break;
            case KeyEvent.VK_RIGHT:
                curX += 10;
                break;
            case KeyEvent.VK_DOWN:
                curY += 10;
                break;
            case KeyEvent.VK_LEFT:
                curX -= 10;
                break;
        }
        figure.setCoordinate(curX, curY);
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
