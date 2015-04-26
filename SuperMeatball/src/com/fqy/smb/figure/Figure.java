package com.fqy.smb.figure;

import com.fqy.smb.coordinate.Coordinate;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by fqy on 2015/4/20.
 */
public abstract class Figure extends JPanel{
    protected Coordinate coordinate = new Coordinate();
    //protected Container parent;
    protected int iFigureSpeed;
    protected int width, height;
    //protected String sImagePath;
    protected Image figureImage;

    //public abstract void initFigure(Container container);
    public void setFigureLocation(int X, int Y){
        this.coordinate.setCoordinate(X, Y);
    }
    public Coordinate getFigureLocation(){
        return this.coordinate;
    }

    public void setFigureSpeed(int iFigureSpeed){
        this.iFigureSpeed = iFigureSpeed;
    }
    public int getFigureSpeed(){
        return this.iFigureSpeed;
    }

    protected void setFigureImage(String sImagePath) throws IOException {
        this.figureImage = ImageIO.read(new File(sImagePath));
    }


    public void drawSelf(Graphics g){
        g.drawImage(this.figureImage, this.coordinate.getX(), this.coordinate.getY(), 100, 150, null);
    }

}
