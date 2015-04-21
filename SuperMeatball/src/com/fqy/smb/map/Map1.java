package com.fqy.smb.map;

import javax.swing.*;

/**
 * Created by fqy on 2015/4/19.
 */
public class Map1 extends Map {
    private ImageIcon mapFile = new ImageIcon("resource//map1.jpg");

    public Map1(JFrame mainWindow){
        this.mainWindow = mainWindow;
        mapLabel = new JLabel(mapFile);
        this.mainWindow.getLayeredPane().add(mapLabel, new Integer(Integer.MIN_VALUE));
        mapLabel.setBounds(0, 0, 1000, 600);
    }
}
