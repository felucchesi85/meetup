package com.ideas.miproyecto.springboot.app.meetups.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LocaleController {

	
    
    //Faltan comentarios, de que hace cada metodo 
    @GetMapping("/locale")
    public String locale(HttpServletRequest request) {
        String ultimaUrl = request.getHeader("referer");

        return "redirect:".concat(ultimaUrl);
    }
}
