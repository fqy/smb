package com.fqy.smb.figure;

import com.fqy.smb.coordinate.Coordinate;

import javax.swing.*;

/**
 * Created by FQY on 2015/4/14.
 */
public class NormalFigure implements Figure{
    private Coordinate coordinate = new Coordinate();
    private JLabel jLabel;

    public NormalFigure() {
    }

    @Override
    public void initFigure() {
        this.coordinate.setCoordinate(100,100);
        jLabel = new JLabel();
        jLabel.setText("asdasdasds");
    }

    @Override
    public void setPosition() {

    }

    @Override
    public void getPosition() {

    }

    public void draw(JFrame jFrame){
        jFrame.add(jLabel);
        jLabel.setBounds(this.coordinate.getX(),this.coordinate.getY(),this.coordinate.getX(),this.coordinate.getY());
    }


}
