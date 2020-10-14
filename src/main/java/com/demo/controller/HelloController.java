package com.demo.controller;

import com.jfinal.aop.Before;
import com.jfinal.aop.Inject;
import com.jfinal.core.Controller;

@Before(BlogInterceptor.class)
public class HelloController extends Controller {
    @Inject
    HelloService service;

    private void index(){
        setAttr("hello", service.paginate(getParaToInt(0, 1), 10));
        render("hello.html");
    }
}
