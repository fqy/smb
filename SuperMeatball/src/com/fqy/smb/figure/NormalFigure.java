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
    private String sImagePath = "resource" + File.separator + "normalFigure.png";

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
        this.coordinate = new Coordinate();
        this.coordinate.setCoordinate(100, 400);
        try {
            setFigureImage(this.sImagePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        //System.out.println(this.coordinate.getX() + ";" + this.coordinate.getY());
        //g.drawImage(this.figureImage, this.coordinate.getX(), this.coordinate.getY(), 100, 150, this);
        g.drawLine(this.coordinate.getX(),this.coordinate.getY(),this.coordinate.getX()+100,this.coordinate.getY()+100);
        //g = null;
    }

    public void draw(){ }


}
