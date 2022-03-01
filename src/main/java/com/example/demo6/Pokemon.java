package com.example.demo6;

import javafx.scene.image.Image;

import java.io.File;

public class Pokemon {




    private File vivo;
    private File sexo;
    private int hp;
    private int hpRival;
    private File Imagen;
    private int hpMax;
    private int level;
    private String nombre;
    private final int MaxLevel=99;
    private String descripcion;
    private File evolucion;
    private File evolucion2;
    private Boolean Favorito;
    private File ImagenDetras;
    public Pokemon(String nombre, int level, int hpMax, File Imagen,File ImagenDetras, int hp, File vivo,String descripcion,Boolean Favorito){
        this.nombre=nombre;
        this.level=level;
        this.hpMax=hpMax;
        this.ImagenDetras=ImagenDetras;
        this.Imagen=Imagen;
        this.hp=hp;
        this.vivo=vivo;
        this.descripcion=descripcion;
        this.Favorito=Favorito;
    }
    public Pokemon(String nombre, int level, int hpMax, File Imagen,File ImagenDetras, int hp, File vivo,String descripcion,File evolucion,Boolean Favorito){
        this.nombre=nombre;
        this.level=level;
        this.hpMax=hpMax;
        this.ImagenDetras=ImagenDetras;
        this.Imagen=Imagen;
        this.hp=hp;
        this.vivo=vivo;
        this.descripcion=descripcion;
        this.evolucion=evolucion;
        this.Favorito=Favorito;
    }
    public Pokemon(String nombre, int level, int hpMax, File Imagen, int hpRival, File image){
        this.nombre=nombre;
        this.level=level;
        this.hpMax=hpMax;
        this.Imagen=Imagen;
        this.hpRival=hpRival;
        this.vivo=vivo;
    }
    public Pokemon(String nombre, int level, int hpMax, File Imagen,File ImagenDetras, int hp, File vivo, File sexo,String descripcion,File evolucion,Boolean Favorito){
        this.nombre=nombre;
        this.level=level;
        this.hpMax=hpMax;
        this.ImagenDetras=ImagenDetras;
        this.Imagen=Imagen;
        this.hp=hp;
        this.vivo=vivo;
        this.sexo=sexo;
        this.descripcion=descripcion;
        this.evolucion=evolucion;
        this.Favorito=Favorito;
    }
    public Pokemon(String nombre, int level, int hpMax, File Imagen,File ImagenDetras, int hp, File vivo, File sexo,String descripcion,File evolucion,File evolucion2,Boolean Favorito){
        this.nombre=nombre;
        this.level=level;
        this.hpMax=hpMax;
        this.ImagenDetras=ImagenDetras;
        this.Imagen=Imagen;
        this.hp=hp;
        this.vivo=vivo;
        this.sexo=sexo;
        this.descripcion=descripcion;
        this.evolucion=evolucion;
        this.evolucion2=evolucion2;
        this.Favorito=Favorito;
    }


    public File isVivo() {
        if (hp==0){
            return new File("src\\main\\java\\com\\example\\demo6\\fotos\\cross.jpg");
        }else {
            return vivo;
        }
    }

    public void setVivo(File vivo) {
        this.vivo = vivo;
    }
    public int getHp() {
        if (hp>hpMax){
            return hpMax;
        }else {
            return hp;
        }
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public File getImagen() {
        return Imagen;
    }

    public void setImagen(File imagen) {
        Imagen = imagen;
    }

    public int getHpMax() {
        return hpMax;
    }

    public void setHpMax(int hpMax) {
        this.hpMax = hpMax;
    }

    public int getLevel() {
        if(level>MaxLevel){
            return MaxLevel;
        }else {
            return level;
        }
    }

    public void setLevel(int level) {
        this.level=level;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public File getSexo() {
        return sexo;
    }

    public File getImagenDetras() {
        return ImagenDetras;
    }

    public void setImagenDetras(File imagenDetras) {
        ImagenDetras = imagenDetras;
    }

    public void setHpRival(int hpRival) {
        this.hpRival = hpRival;
    }

    public int getHpRival() {
        return hpRival;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public File getEvolucion() {
        return evolucion;
    }

    public void setEvolucion(File evolucion) {
        this.evolucion = evolucion;
    }

    public File getEvolucion2() {
        return evolucion2;
    }

    public void setEvolucion2(File evolucion2) {
        this.evolucion2 = evolucion2;
    }

    public Boolean getFavorito() {
        return Favorito;
    }

    public void setFavorito(Boolean favorito) {
        Favorito = favorito;
    }
}
