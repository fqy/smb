package com.fqy.smb.gameMap;

import com.fqy.smb.behavior.Behavior;
import com.fqy.smb.figure.Figure;
import com.fqy.smb.figure.NormalFigure;

import java.io.IOException;

/**
 * Created by fqy on 2015/4/19.
 */
public class GameMap1 extends GameMap {
    private final String IMAGEPATH = "resource//map1.jpg";
    public Figure normalFigure = new NormalFigure();

    public GameMap1(){
        super();
        //this.setLayout(null);
        //this.mainWindow.getLayeredPane().add(mapLabel, new Integer(Integer.MIN_VALUE));
        try {
            setMapImage(IMAGEPATH);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
