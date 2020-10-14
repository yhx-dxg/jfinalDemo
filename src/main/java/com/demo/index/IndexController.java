package com.demo.index;

import com.jfinal.config.JFinalConfig;
import com.jfinal.core.Controller;

public class IndexController extends Controller {
    public void index(){
        setAttr("msg","hello world!");
        renderTemplate("index.html");
    }
}
