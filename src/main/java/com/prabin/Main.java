package com.prabin;

import com.prabin.abstract_factory.AbstractFactory;
import com.prabin.button.Button;
import com.prabin.guifactory.GUIFactory;

public class Main {
    public static void main(String[] args) {
        String inputPlatform = "Mac";

        AbstractFactory factory = new AbstractFactory();
        GUIFactory platform = factory.getPlatform(inputPlatform);
        Button button = platform.createButton();
        button.paint();

    }
}
