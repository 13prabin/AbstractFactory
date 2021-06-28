package com.prabin.guifactory.impl;

import com.prabin.button.Button;
import com.prabin.button.impl.WindowButton;
import com.prabin.guifactory.GUIFactory;

public class WindowFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowButton();
    }
}
