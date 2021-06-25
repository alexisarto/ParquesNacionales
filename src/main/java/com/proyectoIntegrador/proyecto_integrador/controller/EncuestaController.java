package com.proyectoIntegrador.proyecto_integrador.controller;

import com.proyectoIntegrador.proyecto_integrador.model.Encuesta;
import com.proyectoIntegrador.proyecto_integrador.repository.EncuestaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Controller
public class EncuestaController {

    private static List<Encuesta> encuestas = new ArrayList<Encuesta>();

    @Autowired
    EncuestaRepository repository;

    @ModelAttribute("encuesta")
    public Encuesta nuevaEncuesta(){
        return new Encuesta();
    };

    @GetMapping("/encuesta")
    public String encuesta(){
        return "encuesta";
    }

    @PostMapping("/encuesta")
    public String guardarEncuesta(Model modelo, Encuesta encuesta){
        repository.save(encuesta);
        encuestas.add(encuesta);
        modelo.addAttribute("cantidadEncuestas",repository.count());
        return this.actualizarModelo(modelo, nuevaEncuesta());
    }

    private String actualizarModelo(Model modelo, Encuesta encuesta){
        modelo.addAttribute("encuesta", encuesta);
        modelo.addAttribute("encuestas", repository.findAll());
        return "encuesta";
    }










}
