package com.prabin.button.impl;

import com.prabin.button.Button;

public class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("Render a button in a macos style");
    }
}
