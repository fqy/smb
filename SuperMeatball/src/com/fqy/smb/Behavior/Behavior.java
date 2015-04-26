package com.fqy.smb.behavior;

import com.fqy.smb.figure.Figure;
import com.fqy.smb.gameMap.GameMap;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by FQY on 2015/4/17.
 */
public class Behavior implements KeyListener{
    private GameMap gameMap;
    private JPanel jPanel;
    private int curX, curY;
    private int iFigureSpeed = 10;
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
                //curY -= iStep;
                break;
            case KeyEvent.VK_RIGHT:
                curX -= iFigureSpeed;
                break;
            case KeyEvent.VK_DOWN:
                //curY += iStep;
                break;
            case KeyEvent.VK_LEFT:
                curX += iFigureSpeed;
                break;
        }
        gameMap.setMapLocation(curX, curY);
        jPanel.repaint();
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

    public void assocFigure(JPanel jPanel,GameMap gameMap){
        this.jPanel = jPanel;
        this.gameMap = gameMap;
        this.curX = gameMap.getMapLocation().getX();
        this.curY = gameMap.getMapLocation().getY();
    }
}
