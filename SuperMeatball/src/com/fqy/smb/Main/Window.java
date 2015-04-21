package com.fqy.smb.main;

import com.fqy.smb.behavior.Behavior;

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
        mainWindow.setBounds(100, 100, 1000, 600);
        mainWindow.setResizable(false);
        //ǿ��ת��Ϊjpanel����ʹ��͸����
        ((JPanel) mainWindow.getContentPane()).setOpaque(false);
        mainWindow.setVisible(true);
    }

    public JFrame getContainer(){
        return mainWindow;
    }

    //�������̼����¼�
    public void assocBehavior(Behavior behavior){
        this.behavior = behavior;
        mainWindow.addKeyListener(behavior);
    }
}
