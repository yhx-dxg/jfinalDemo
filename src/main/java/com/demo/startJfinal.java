package com.demo;

import com.jfinal.core.JFinal;

public class startJfinal {
    public static void main(String[] args) {
        JFinal.start("src/main/webapp",8081,"/");
    }
}
