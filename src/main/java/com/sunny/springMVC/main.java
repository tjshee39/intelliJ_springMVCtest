package com.sunny.springMVC;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class main {
    @RequestMapping(value="/")
    public String index(Model model){
        model.addAttribute("test", "테스트");
        return "index";
    }

    @RequestMapping(value="/json", produces = "application/json")
    @ResponseBody
    public Object json(){
        Map<String, String> m = new HashMap<>();
        m.put("test", "json test");
        return m;
    }

    @RequestMapping(value="/newBranch")
    public String getNewBranch() {
        System.out.println("==============================");
        System.out.println("main:: getNewBranch");

        return "newBranch";
    }
}