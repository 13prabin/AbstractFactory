package com.prabin.abstract_factory;

import com.prabin.guifactory.GUIFactory;
import com.prabin.guifactory.impl.LinuxFactory;
import com.prabin.guifactory.impl.MacFactory;
import com.prabin.guifactory.impl.WindowFactory;

public class AbstractFactory {
   public GUIFactory getPlatform(String platform){
       switch (platform){
           case "Mac":
               return new MacFactory();
           case "Windows":
               return new WindowFactory();
           case "linux":
               return new LinuxFactory();
           default: throw new RuntimeException("invalid");
       }
   }
}
