package com.fqy.smb.exe;

import com.fqy.smb.figure.NormalFigure;

import javax.swing.*;

/**
 * Created by FQY on 2015/4/15.
 */
public class Main {
    public static void main(String[] args) {
        JFrame test = new JFrame("≤‚ ‘");
        test.setLayout(null);
        test.setBounds(100,100,1200,800);
        NormalFigure normalFigure = new NormalFigure();
        normalFigure.initFigure();
        normalFigure.draw(test);
        test.setVisible(true);
    }
}
