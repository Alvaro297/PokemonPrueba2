package com.example.demo6;

import javafx.scene.image.Image;

public class Pokemon {


    private Image vivo;
    private Image sexo;
    private int hp;
    private int hpRival;
    private Image Imagen;
    private int hpMax;
    private int level;
    private String nombre;
    private final int MaxLevel=99;
    private Image ImagenDetras;
    public Pokemon(String nombre, int level, int hpMax, Image Imagen,Image ImagenDetras, int hp, Image vivo){
        this.nombre=nombre;
        this.level=level;
        this.hpMax=hpMax;
        this.ImagenDetras=ImagenDetras;
        this.Imagen=Imagen;
        this.hp=hp;
        this.vivo=vivo;
    }
    public Pokemon(String nombre, int level, int hpMax, Image Imagen, int hpRival, Image vivo){
        this.nombre=nombre;
        this.level=level;
        this.hpMax=hpMax;
        this.Imagen=Imagen;
        this.hpRival=hpRival;
        this.vivo=vivo;
    }
    public Pokemon(String nombre, int level, int hpMax, Image Imagen,Image ImagenDetras, int hp, Image vivo, Image sexo){
        this.nombre=nombre;
        this.level=level;
        this.hpMax=hpMax;
        this.ImagenDetras=ImagenDetras;
        this.Imagen=Imagen;
        this.hp=hp;
        this.vivo=vivo;
        this.sexo=sexo;
    }
    public Image isVivo() {
        if (hp<=0){
            return new Image("https://dictionary.cambridge.org/es-LA/images/thumb/cross_noun_002_09265.jpg?version=5.0.203");
        }else {
            return vivo;
        }
    }

    public void setVivo(Image vivo) {
        this.vivo = vivo;
    }
    public int getHp() {
        if (hp<0){
            return 0;
        }else if(hp >hpMax){
            return hpMax;
        }else {
            return hp;
        }
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public Image getImagen() {
            return Imagen;
    }

    public void setImagen(Image imagen) {
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


    public Image getSexo() {
        return sexo;
    }

    public Image getImagenDetras() {
        return ImagenDetras;
    }

    public void setImagenDetras(Image imagenDetras) {
        ImagenDetras = imagenDetras;
    }

    public void setHpRival(int hpRival) {
        this.hpRival = hpRival;
    }

    public int getHpRival() {
        if (hpRival<0){
            return 0;
        }else if(hpRival >hpMax){
            return hpMax;
        }else {
            return hpRival;
        }
    }
}
