package com.fqy.smb.figure;

import com.fqy.smb.coordinate.Coordinate;

import javax.swing.*;
import java.awt.*;

/**
 * Created by FQY on 2015/4/14.
 */
public interface Figure {
    public void initFigure(Container container);
    public void setCoordinate(int X, int Y);
    public Coordinate getCoordinate();
}
