package com.theironyard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by chris on 9/28/16.
 */
@Controller
public class HerokuController {

    @RequestMapping(path = "/")
    public String home(){

        return "home";
    }

}
