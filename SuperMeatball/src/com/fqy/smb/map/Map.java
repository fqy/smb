package com.fqy.smb.map;

import javax.swing.*;

/**
 * Created by fqy on 2015/4/19.
 */
public abstract class Map {
    protected int width, height;
    protected JLabel mapLabel;
    protected JFrame mainWindow;
    //protected String sFilePath;

    public JLabel getMap(){
        return mapLabel;
    }

    /*public void setMainWindow(JFrame mainWindow){
        this.mainWindow = mainWindow;
    }*/
}
