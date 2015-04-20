package com.fqy.smb.figure;

import com.fqy.smb.coordinate.Coordinate;

import javax.swing.*;
import java.awt.*;

/**
 * Created by fqy on 2015/4/20.
 */
public abstract class Figure extends JPanel{
    //public abstract void initFigure(Container container);
    public abstract void setCoordinate(int X, int Y);
    public abstract Coordinate getCoordinate();
}
