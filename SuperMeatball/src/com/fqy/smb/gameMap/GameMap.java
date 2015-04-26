package com.fqy.smb.gameMap;

import com.fqy.smb.coordinate.Coordinate;

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
    protected Coordinate coordinate = new Coordinate();
    protected Image mapImage;
    //protected JFrame mainWindow;
    //protected String sFilePath;

    protected void setMapImage(String sImagePath) throws IOException{
        this.mapImage = ImageIO.read(new File(sImagePath));
    }

    public void setMapLocation(int X, int Y){
        this.coordinate.setCoordinate(X, Y);
    }
    public Coordinate getMapLocation(){
        return this.coordinate;
    }


    public void drawSelf(Graphics g){
        g.drawImage(mapImage, coordinate.getX(), coordinate.getY(), width, height, null);
        /*if (width-coordinate.getX() < width){
            g.drawImage(mapImage, width-coordinate.getX(), coordinate.getY(), coordinate.getX(), height, null);
        }*/
    }
}
