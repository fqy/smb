package com.fqy.smb.mainUI;

import com.fqy.smb.behavior.Behavior;
import com.fqy.smb.figure.Figure;
import com.fqy.smb.figure.NormalFigure;
import com.fqy.smb.gameMap.GameMap;
import com.fqy.smb.gameMap.GameMap1;

import javax.swing.*;
import java.awt.*;

/**
 * Created by FQY on 2015/4/17.
 */
public class MainJPanel extends JPanel{
    private static MainJPanel mainJPanel = new MainJPanel();
    private static Behavior behavior;
    private static Figure figure;
    private static GameMap gameMap;

    public static MainJPanel getMainJPanel() {
        init();
        return mainJPanel;
    }

    public MainJPanel(){
        figure = new NormalFigure();
        gameMap = new GameMap1();
        behavior = new Behavior();
        add(gameMap);
        add(figure);
        //获取鼠标焦点，从而可以让jpanel监听事件
        setFocusable(true);
        addKeyListener(behavior);
    }
    private static void init(){
        behavior.assocFigure(mainJPanel, gameMap);
    }

    /*//关联键盘监听事件
    public void assocBehavior(Behavior behavior){
        this.behavior = behavior;
        addKeyListener(behavior);
    }*/

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        gameMap.drawSelf(g);
        figure.drawSelf(g);
    }
}
