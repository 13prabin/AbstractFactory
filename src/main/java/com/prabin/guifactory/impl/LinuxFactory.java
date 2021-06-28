package com.prabin.guifactory.impl;

import com.prabin.button.Button;
import com.prabin.button.impl.LinuxButton;
import com.prabin.guifactory.GUIFactory;

public class LinuxFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new LinuxButton();
    }
}
