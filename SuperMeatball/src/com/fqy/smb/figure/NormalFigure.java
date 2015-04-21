package com.fqy.smb.figure;

import com.fqy.smb.coordinate.Coordinate;

import javax.swing.*;
import java.awt.*;

/**
 * Created by FQY on 2015/4/14.
 */
public class NormalFigure extends Figure{
    private Coordinate coordinate;
    private Container parent;
    private String sImagePath = "resource//normalFigure.png";
    private int width, height;

    /*@Override
    public void initFigure(Container parent) {
        this.parent = parent;
        this.coordinate = new Coordinate();
        figure = new JLabel();
        this.coordinate.setCoordinate(100, 100);
        figure.setIcon(new ImageIcon(sImagePath));
        this.draw();
    }*/

    @Override
    public void setCoordinate(int X, int Y) {
        figure.setLocation(X, Y);
    }

    @Override
    public Coordinate getCoordinate() {
        return this.coordinate;
    }

    public void draw(){
        this.parent.add(figure);
        figure.setBounds(this.coordinate.getX(),this.coordinate.getY(),this.coordinate.getX(),this.coordinate.getY());
    }


}
