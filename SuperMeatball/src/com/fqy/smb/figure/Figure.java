package com.fqy.smb.figure;

import com.fqy.smb.coordinate.Coordinate;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by fqy on 2015/4/20.
 */
public abstract class Figure extends JPanel{
    protected Coordinate coordinate;
    protected Container parent;
    protected int width, height;
    //protected String sImagePath;
    protected Image figureImage;

    //public abstract void initFigure(Container container);
    //public abstract void setCoordinate(int X, int Y);
    protected void setFigureImage(String sImagePath) throws IOException {
        this.figureImage = ImageIO.read(new FileInputStream(sImagePath));
    }

    public Coordinate getCoordinate(){
        return this.coordinate;
    }
}
