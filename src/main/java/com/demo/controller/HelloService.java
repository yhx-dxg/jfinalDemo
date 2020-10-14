package com.demo.controller;

import com.demo.common.entity.Hello;
import com.jfinal.plugin.activerecord.Page;

public class HelloService {
    private Hello dao= (Hello) new Hello().dao();

    public Page<Hello> paginate(int pageNumber, int pageSize) {
        return dao.paginate(pageNumber, pageSize, "select *", "from blog order by id asc");
    }
}
