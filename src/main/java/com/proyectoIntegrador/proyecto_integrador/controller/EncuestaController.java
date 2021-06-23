package com.proyectoIntegrador.proyecto_integrador.controller;

import com.proyectoIntegrador.proyecto_integrador.model.Encuesta;
import com.proyectoIntegrador.proyecto_integrador.repository.EncuestaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Date;
import java.util.List;


@Controller
public class EncuestaController {


    @Autowired
    EncuestaRepository repository;


    @GetMapping("/getAPISysdate")
    public String getAPISysdate(){
        return new Date().toString();
    }

    @ModelAttribute("encuesta")
    public Encuesta nuevaEncuesta(){
        return new Encuesta();
    };

    @GetMapping("/encuesta")
    public String encuesta(){
        return "encuesta";
    }

    @GetMapping("/guardarEncuesta")
    public String guardarEncuesta(Model modelo, Encuesta encuesta){
        repository.save(encuesta);
        return this.actualizarModelo(modelo, nuevaEncuesta());
    }
//
//    @PostMapping("/mostrarencuesta")
//    public String mostrarResultados(@ModelAttribute Encuesta encuesta, Model model){
//
//        model.addAttribute("encuesta", encuesta);
//        return "home";
//    }
//
    private String actualizarModelo(Model modelo, Encuesta encuesta){
        modelo.addAttribute("encuesta", encuesta);
        modelo.addAttribute("encuestas", repository.findAll());
        return "encuesta";
    }

}
