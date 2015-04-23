package com.fqy.smb.gameMap;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

/**
 * Created by fqy on 2015/4/19.
 */
public abstract class GameMap extends JPanel{
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

    public void drawSelf(Graphics g){
        g.drawImage(this.mapImage, 0, 0, 1000, 600, null);
    }
}
