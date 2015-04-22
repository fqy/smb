package com.fqy.smb.main;

import com.fqy.smb.behavior.Behavior;
import com.fqy.smb.figure.*;
import com.fqy.smb.map.Map;
import com.fqy.smb.map.Map1;

import javax.swing.*;
import java.awt.*;
import java.io.File;

/**
 * Created by FQY on 2015/4/15.
 */
public class Main {
    public static void main(String[] args) {
        WinJframe mainWin = WinJframe.getMainWin();
        //Map map1 = new Map1();
        Figure normalFigure = new NormalFigure();
        Behavior behavior = new Behavior();
        behavior.assocFigure(normalFigure);
        mainWin.assocBehavior(behavior);
        //map1.setBounds(0,0,100,100);
        //mainWin.getLayeredPane().add(map1, new Integer(Integer.MIN_VALUE));
        mainWin.add(normalFigure);

    }
}
