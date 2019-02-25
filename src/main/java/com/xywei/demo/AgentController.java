package com.xywei.demo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.io.Serializable;

@RestController
public class AgentController implements Serializable {


    @RequestMapping(value = "login")
    public String login(HttpSession session) {
        System.out.println("===============登录成功===============");
        User user = new User();
        user.setName("xywei");
        session.setAttribute("admin", user);
        return "ok";
    }

    @RequestMapping(value = "logout")
    public String logout(HttpSession session) {
        System.out.println("============退出系统=============");
        System.out.println(session.getId());
        session.removeAttribute("admin");
        session.invalidate();
        return "ok";
    }

    @RequestMapping(value = "get")
    public String get(HttpSession session) {
        User user = (User) session.getAttribute("admin");
        return user.getName();
    }
}
