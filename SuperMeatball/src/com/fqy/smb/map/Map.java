package com.fqy.smb.map;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by fqy on 2015/4/19.
 */
public abstract class Map extends JPanel{
    protected int width, height;
    protected Image mapImage;
    //protected JFrame mainWindow;
    //protected String sFilePath;

    protected void setMapImage(String sImagePath) throws IOException{
        this.mapImage = ImageIO.read(new File(sImagePath));
    }

    /*public JLabel getMap(){
        return mapLabel;
    }*/

    /*public void setMainWindow(JFrame mainWindow){
        this.mainWindow = mainWindow;
    }*/
}
