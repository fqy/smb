package com.fqy.smb.map;

import com.fqy.smb.behavior.Behavior;
import com.fqy.smb.figure.Figure;
import com.fqy.smb.figure.NormalFigure;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

/**
 * Created by fqy on 2015/4/19.
 */
public class Map1 extends Map {
    private String sImagePath = "resource//map1.jpg";
    public Figure normalFigure = new NormalFigure();
    private Behavior behavior = new Behavior();

    public Map1(){
        super();
        this.setLayout(null);
        this.addKeyListener(behavior);
        behavior.assocFigure(this, normalFigure);
        //this.mainWindow.getLayeredPane().add(mapLabel, new Integer(Integer.MIN_VALUE));
        try {
            setMapImage(sImagePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(this.mapImage, 0, 0, 1000, 600, this);
        normalFigure.draw(g, this);
        //g = null;
    }
}
