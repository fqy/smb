package com.fqy.smb.Main;

import com.fqy.smb.Behavior.Behavior;

import javax.swing.*;
import java.awt.*;

/**
 * Created by FQY on 2015/4/17.
 */
public class Window {
    private static Window ourInstance = new Window();
    private static JFrame mainWindow;
    private Behavior behavior;

    public static Window getInstance() {
        return ourInstance;
    }

    private Window() {
        mainWindow = new JFrame("SuperMeatBall");
        mainWindow.setLayout(null);
        mainWindow.setBounds(100, 100, 600, 400);
        mainWindow.setResizable(false);
        mainWindow.setVisible(true);
    }

    public Container getContainer(){
        return mainWindow;
    }

    //关联键盘监听事件
    public void assocBehavior(Behavior behavior){
        this.behavior = behavior;
        mainWindow.addKeyListener(behavior);
    }
}
