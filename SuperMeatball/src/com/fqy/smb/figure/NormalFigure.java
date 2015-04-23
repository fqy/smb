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
 * Created by FQY on 2015/4/14.
 */
public class NormalFigure extends Figure{
    private final String IMAGEPATH = "resource//normalFigure.png";

    /*@Override
    public void initFigure(Container parent) {
        this.parent = parent;
        this.coordinate = new Coordinate();
        figure = new JLabel();
        this.coordinate.setCoordinate(100, 100);
        figure.setIcon(new ImageIcon(sImagePath));
        this.draw();
    }*/

    public NormalFigure(){
        super();
        this.setDoubleBuffered(true);
        this.setOpaque(true);
        this.coordinate = new Coordinate();
        this.coordinate.setCoordinate(100, 400);
        try {
            setFigureImage(this.IMAGEPATH);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }






}
