package com.seth.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by GBASKI-CODDED on 07/08/2016.
 */

@Controller
public class SethController {


    @RequestMapping("/")
    public String inde()
    {
        return "index";
    }
}
