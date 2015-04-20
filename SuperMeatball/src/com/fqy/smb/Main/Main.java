package com.fqy.smb.main;

import com.fqy.smb.behavior.Behavior;
import com.fqy.smb.figure.*;
import com.fqy.smb.map.Map;
import com.fqy.smb.map.Map1;

/**
 * Created by FQY on 2015/4/15.
 */
public class Main {
    public static void main(String[] args) {
        Window window = Window.getInstance();
        Map map = new Map1(window.getContainer());
        Figure normalFigure = new NormalFigure();
        normalFigure.initFigure(window.getContainer());
        Behavior behavior = new Behavior();
        behavior.assocFigure(normalFigure);
        window.assocBehavior(behavior);
    }
}
