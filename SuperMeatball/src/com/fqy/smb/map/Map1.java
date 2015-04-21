package com.fqy.smb.map;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

/**
 * Created by fqy on 2015/4/19.
 */
public class Map1 extends Map {
    private String sImagePath = "resource//map1.jpg";

    public Map1(){
        super();
        //this.mainWindow.getLayeredPane().add(mapLabel, new Integer(Integer.MIN_VALUE));
        try {
            setMapImage(sImagePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void paintComponents(Graphics g){
        g.drawImage(this.mapImage, 0, 0, 1000, 600, null);
        g = null;
    }
}
