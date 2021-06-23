package com.proyectoIntegrador.proyecto_integrador.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ViewResolver;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

@Controller
public class PaginaController {

    @GetMapping("/")
    public String index(){
        return "home";
    }



    @GetMapping("/Mapa")
    public String mapa(){
        return "Mapa";
    }

    @GetMapping("/parquescentro")
    public String parquescentro(){
        return "parquescentro";
    }

    @GetMapping("/parquesnorte")
    public String parquesnorte(){
        return "parquesnorte";
    }

    @GetMapping("/parquessur")
    public String parquessur(){
        return "parquessur";
    }

    @Bean
    public ViewResolver viewResolver() {
        ClassLoaderTemplateResolver templateResolver = new ClassLoaderTemplateResolver();
        templateResolver.setTemplateMode("XHTML");
        templateResolver.setSuffix(".html");

        SpringTemplateEngine engine = new SpringTemplateEngine();
        engine.setTemplateResolver(templateResolver);

        ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
        viewResolver.setTemplateEngine(engine);
        return viewResolver;
    }
}



