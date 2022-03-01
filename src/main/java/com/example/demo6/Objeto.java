package com.example.demo6;

import java.io.File;

public class Objeto {
    private String nombre;
    private boolean Revivir;
    private File imagen;
    private int curacion;
    private boolean Capturar;
    private int porcentaje;

    public Objeto(String nombre, File imagen, int curacion,boolean Revivir,boolean Capturar,int porcentaje){
        this.nombre=nombre;
        this.Revivir=Revivir;
        this.imagen=imagen;
        this.curacion=curacion;
        this.Capturar=Capturar;
        this.porcentaje=porcentaje;
    }

    public boolean isRevivir() {
        return Revivir;
    }

    public void setRevivir(boolean revivir) {
        Revivir = revivir;
    }

    public File getImagen() {
        return imagen;
    }

    public void setImagen(File imagen) {
        this.imagen = imagen;
    }

    public int getCuracion() {
        return curacion;
    }

    public void setCuracion(int curacion) {
        this.curacion = curacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    public boolean isCapturar() {
        return Capturar;
    }

    public void setCapturar(boolean capturar) {
        Capturar = capturar;
    }
}
