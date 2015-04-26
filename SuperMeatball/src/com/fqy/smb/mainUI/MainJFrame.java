package com.fqy.smb.mainUI;

import javax.swing.*;

/**
 * Created by FQY on 2015/4/15.
 */
public class MainJFrame extends JFrame{
    public MainJFrame(String title){
        super(title);
        MainJPanel mainJPanel = MainJPanel.getMainJPanel();
        add(mainJPanel);
        //setLayout(null);
        setBounds(100, 100, 1000, 600);
        setResizable(false);
        //强制转换为jpanel，来使其透明化
        //((JPanel) getContentPane()).setOpaque(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new MainJFrame("SuperMeatBall");
    }
}
