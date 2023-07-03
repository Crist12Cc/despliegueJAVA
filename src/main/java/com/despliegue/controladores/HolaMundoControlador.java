package com.despliegue.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HolaMundoControlador {

    @RequestMapping("/")
    @ResponseBody
    String inicio(){
        return "Cristian Guillermo Comayagua Cordova--------CC17078";
    }
}
