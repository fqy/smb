package com.fqy.smb.figure;

import com.fqy.smb.coordinate.Coordinate;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by FQY on 2015/4/14.
 */
public class NormalFigure extends Figure{
    private String sImagePath = "resource//normalFigure.png";

    /*@Override
    public void initFigure(Container parent) {
        this.parent = parent;
        this.coordinate = new Coordinate();
        figure = new JLabel();
        this.coordinate.setCoordinate(100, 100);
        figure.setIcon(new ImageIcon(sImagePath));
        this.draw();
    }*/

    public NormalFigure() throws IOException {
        super();
        this.coordinate = new Coordinate();
        this.coordinate.setCoordinate(100, 500);
        setFigureImage(this.sImagePath);
    }

    @Override
    public void paintComponent(Graphics g){
        g.drawImage(this.figureImage, this.coordinate.getX(), this.coordinate.getY(), 100, 150, null);
        g = null;
    }

    public void draw(){ }


}
