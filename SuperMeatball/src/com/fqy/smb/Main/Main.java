package com.fqy.smb.Main;

import com.fqy.smb.Behavior.Behavior;
import com.fqy.smb.figure.NormalFigure;

/**
 * Created by FQY on 2015/4/15.
 */
public class Main {
    public static void main(String[] args) {
        Window window = Window.getInstance();
        NormalFigure normalFigure = new NormalFigure();
        normalFigure.initFigure(window.getContainer());
        Behavior behavior = new Behavior();
        behavior.assocFigure(normalFigure);
        window.assocBehavior(behavior);
    }
}
