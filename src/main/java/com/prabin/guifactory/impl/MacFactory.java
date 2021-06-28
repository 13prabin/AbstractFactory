package com.prabin.guifactory.impl;

import com.prabin.button.Button;
import com.prabin.button.impl.MacButton;
import com.prabin.guifactory.GUIFactory;

public class MacFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }
}
