package com.proyectoIntegrador.proyecto_integrador.model;

import org.springframework.web.bind.annotation.ModelAttribute;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class Encuesta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="Encuesta_id")
    private long id;
    @Column(name="pregunta1")
    private String P1;
    @Column(name="pregunta2")
    private String P2;
    @Column(name="CantParques")
    private int cantidad_Parques;
    @Column(name="preferencias")
    private String preferencias;


    public Encuesta(){}

    public Encuesta(long id, String p1, String p2, int cantidad_Parques,int intereses, String preferencias){
        super();
        this.id=id;
        this.P1=p1;
        this.P2=p2;
        this.cantidad_Parques=cantidad_Parques;
        this.preferencias=preferencias;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getP1() {
        return P1;
    }

    public void setP1(String p1) {
        P1 = p1;
    }

    public String getP2() {
        return P2;
    }

    public void setP2(String p2) {
        P2 = p2;
    }

    public int getCantidad_Parques() {
        return cantidad_Parques;
    }

    public void setCantidad_Parques(int cantidad_Parques) {
        this.cantidad_Parques = cantidad_Parques;
    }

    public String getPreferencias() {
        return preferencias;
    }

    public void setPreferencias(String preferencias) {
        this.preferencias = preferencias;
    }
}
