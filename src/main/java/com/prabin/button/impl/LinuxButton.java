package com.prabin.button.impl;

import com.prabin.button.Button;

public class LinuxButton implements Button {
    @Override
    public void paint() {
        System.out.println("Render a button in a Linux style ");
    }
}
