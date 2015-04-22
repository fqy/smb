package com.fqy.smb.main;

import com.fqy.smb.behavior.Behavior;
import com.fqy.smb.figure.Figure;
import com.fqy.smb.figure.NormalFigure;

import javax.swing.*;
import java.awt.*;

/**
 * Created by FQY on 2015/4/17.
 */
public class WinJframe extends JFrame{
    private static final String TITLE = "SuperMeatBall";
    private static WinJframe mainWin = new WinJframe(TITLE);
    private Behavior behavior;

    public static WinJframe getMainWin() {
        initWin();
        return mainWin;
    }

    private WinJframe(String title) {
        super(title);
    }

    private static void initWin(){
        //mainWin.setLayout(null);
        mainWin.setBounds(100, 100, 1000, 600);
        mainWin.setResizable(false);
        //ǿ��ת��Ϊjpanel����ʹ��͸����
        ((JPanel) mainWin.getContentPane()).setOpaque(false);
        mainWin.setVisible(true);
        mainWin.setDefaultCloseOperation(mainWin.EXIT_ON_CLOSE);
    }

    /*public JFrame getContainer(){
        return mainWindow;
    }*/

    //�������̼����¼�
    public void assocBehavior(Behavior behavior){
        this.behavior = behavior;
        mainWin.addKeyListener(behavior);
    }
}
