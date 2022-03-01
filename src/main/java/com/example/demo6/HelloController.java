package com.example.demo6;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {

    public static int cont;
    public static int cont2;
    public static int cont3;
    public static int cont4;
    public static int cont5;
    public static int cont6;
    public static int dmgEnemigo;
    public static int dmgAliado;
    @FXML
    ImageView Pokemon1;
    @FXML
    Label Nombre1;
    @FXML
    Label Level1;
    @FXML
    ProgressBar BarraVida1;
    @FXML
    Label VidaMaxima1;
    @FXML
    BorderPane BorderPokemon1;
    @FXML
    ImageView EstaVivo1;


    @FXML
    ImageView Pokemon2;
    @FXML
    Label Nombre2;
    @FXML
    Label Level2;
    @FXML
    ProgressBar BarraVida2;
    @FXML
    Label VidaMaxima2;
    @FXML
    BorderPane BorderPokemon2;
    @FXML
    ImageView EstaVivo2;
    @FXML
    ImageView Favorito2;

    @FXML
    ImageView Pokemon3;
    @FXML
    Label Nombre3;
    @FXML
    Label Level3;
    @FXML
    ProgressBar BarraVida3;
    @FXML
    Label VidaMaxima3;
    @FXML
    BorderPane BorderPokemon3;
    @FXML
    ImageView EstaVivo3;
    @FXML
    ImageView Sexo3;
    @FXML
    ImageView Favorito3;

    @FXML
    ImageView Pokemon4;
    @FXML
    Label Nombre4;
    @FXML
    Label Level4;
    @FXML
    ProgressBar BarraVida4;
    @FXML
    Label VidaMaxima4;
    @FXML
    BorderPane BorderPokemon4;
    @FXML
    ImageView EstaVivo4;
    @FXML
    ImageView Sexo4;
    @FXML
    ImageView Favorito4;

    @FXML
    ImageView Pokemon5;
    @FXML
    Label Nombre5;
    @FXML
    Label Level5;
    @FXML
    ProgressBar BarraVida5;
    @FXML
    Label VidaMaxima5;
    @FXML
    BorderPane BorderPokemon5;
    @FXML
    ImageView EstaVivo5;
    @FXML
    ImageView Sexo5;
    @FXML
    ImageView Favorito5;

    @FXML
    ImageView Pokemon6;
    @FXML
    Label Nombre6;
    @FXML
    Label Level6;
    @FXML
    ProgressBar BarraVida6;
    @FXML
    Label VidaMaxima6;
    @FXML
    BorderPane BorderPokemon6;
    @FXML
    ImageView EstaVivo6;
    @FXML
    ImageView Sexo6;
    @FXML
    ImageView Favorito6;

    @FXML
    Button objetofin;


    @FXML
    Button Completado;
    @FXML
    Button Graficos;
    int x=0;
    public static Stage stage=null;
    public static Stage stage2=null;
    public Objeto objetoprueba;
    private Bolsa Bolsa;

    @FXML
    //Aqui he puesto en el disable de cada pokemon si no se puede tocar no puede poner al pokemon en el campo de batalla
    public void initialize() {
        Completado.setDisable(true);
        objetofin.setVisible(false);
        float hola=HelloApplication.PokemonArray.get(0).getHp();
        float Vida1=hola/HelloApplication.PokemonArray.get(0).getHpMax();
        this.Nombre1.setText(HelloApplication.PokemonArray.get(0).getNombre());
        this.Level1.setText("Lvl"+ HelloApplication.PokemonArray.get(0).getLevel());
        this.VidaMaxima1.setText((HelloApplication.PokemonArray.get(0).getHp() +"/"+(HelloApplication.PokemonArray.get(0).getHpMax())));
        this.Pokemon1.setImage(new Image(HelloApplication.PokemonArray.get(0).getImagen().toURI().toString()));
        this.EstaVivo1.setImage(new Image(HelloApplication.PokemonArray.get(0).isVivo().toURI().toString()));
        BarraVida1.setProgress(Vida1);
        if (Vida1<0.25){
            BarraVida1.setStyle("-fx-accent: red;");
        }else if (Vida1<0.5){
            BarraVida1.setStyle("-fx-accent: yellow;");
        }else{
            BarraVida1.setStyle("-fx-accent: green;");
        }
        if (HelloApplication.PokemonArray.get(0).getHp()==0){
            Pokemon1.setDisable(true);
            Pokemon1.setOpacity(0.5);
        }


        float hola2=HelloApplication.PokemonArray.get(1).getHp();
        float Vida2=hola2/HelloApplication.PokemonArray.get(1).getHpMax();
        this.Nombre2.setText(HelloApplication.PokemonArray.get(1).getNombre());
        this.Level2.setText("Lvl"+ HelloApplication.PokemonArray.get(1).getLevel());
        this.VidaMaxima2.setText((HelloApplication.PokemonArray.get(1).getHp() +"/"+(HelloApplication.PokemonArray.get(1).getHpMax())));
        this.Pokemon2.setImage(new Image(HelloApplication.PokemonArray.get(1).getImagen().toURI().toString()));
        this.EstaVivo2.setImage(new Image(HelloApplication.PokemonArray.get(1).isVivo().toURI().toString()));
        BarraVida2.setProgress(Vida2);
        if (Vida2<0.25){
            BarraVida2.setStyle("-fx-accent: red;");
        }else if (Vida2<0.5){
            BarraVida2.setStyle("-fx-accent: yellow;");
        }else{
            BarraVida2.setStyle("-fx-accent: green;");
        }
        if (HelloApplication.PokemonArray.get(1).getHp()==0){
            Pokemon2.setDisable(true);
            Pokemon2.setOpacity(0.5);
        }
        Favorito2.setVisible(HelloApplication.PokemonArray.get(1).getFavorito());

        float hola3=HelloApplication.PokemonArray.get(2).getHp();
        float Vida3=hola3/HelloApplication.PokemonArray.get(2).getHpMax();
        this.Nombre3.setText(HelloApplication.PokemonArray.get(2).getNombre());
        this.Level3.setText("Lvl"+ HelloApplication.PokemonArray.get(2).getLevel());
        this.VidaMaxima3.setText((HelloApplication.PokemonArray.get(2).getHp() +"/"+(HelloApplication.PokemonArray.get(2).getHpMax())));
        this.Pokemon3.setImage(new Image(HelloApplication.PokemonArray.get(2).getImagen().toURI().toString()));
        this.EstaVivo3.setImage(new Image(HelloApplication.PokemonArray.get(2).isVivo().toURI().toString()));
        this.Sexo3.setImage(new Image(HelloApplication.PokemonArray.get(2).getSexo().toURI().toString()));
        BarraVida3.setProgress(Vida3);
        if (Vida3<0.25){
            BarraVida3.setStyle("-fx-accent: red;");
        }else if (Vida3<0.5){
            BarraVida3.setStyle("-fx-accent: yellow;");
        }else{
            BarraVida3.setStyle("-fx-accent: green;");
        }
        if (HelloApplication.PokemonArray.get(2).getHp()==0){
            Pokemon3.setDisable(true);
            Pokemon3.setOpacity(0.5);
        }else {
            Pokemon3.setDisable(false);

        }
        Favorito3.setVisible(HelloApplication.PokemonArray.get(2).getFavorito());

        float hola4=HelloApplication.PokemonArray.get(3).getHp();
        float Vida4=hola4/HelloApplication.PokemonArray.get(3).getHpMax();
        this.Nombre4.setText(HelloApplication.PokemonArray.get(3).getNombre());
        this.Level4.setText("Lvl"+ HelloApplication.PokemonArray.get(3).getLevel());
        this.VidaMaxima4.setText((HelloApplication.PokemonArray.get(3).getHp() +"/"+(HelloApplication.PokemonArray.get(4).getHpMax())));
        this.Pokemon4.setImage(new Image(HelloApplication.PokemonArray.get(3).getImagen().toURI().toString()));
        this.EstaVivo4.setImage(new Image(HelloApplication.PokemonArray.get(3).isVivo().toURI().toString()));
        this.Sexo4.setImage(new Image(HelloApplication.PokemonArray.get(3).getSexo().toURI().toString()));
        BarraVida4.setProgress(Vida4);
        if (Vida4<0.25){
            BarraVida4.setStyle("-fx-accent: red;");
        }else if (Vida4<0.5){
            BarraVida4.setStyle("-fx-accent: yellow;");
        }else{
            BarraVida4.setStyle("-fx-accent: green;");
        }
        if (HelloApplication.PokemonArray.get(3).getHp()==0){
            Pokemon4.setDisable(true);
            Pokemon4.setOpacity(0.5);
        }
        Favorito4.setVisible(HelloApplication.PokemonArray.get(3).getFavorito());

        float hola5=HelloApplication.PokemonArray.get(4).getHp();
        float Vida5=hola5/HelloApplication.PokemonArray.get(4).getHpMax();
        this.Nombre5.setText(HelloApplication.PokemonArray.get(4).getNombre());
        this.Level5.setText("Lvl"+ HelloApplication.PokemonArray.get(4).getLevel());
        this.VidaMaxima5.setText((HelloApplication.PokemonArray.get(4).getHp() +"/"+(HelloApplication.PokemonArray.get(4).getHpMax())));
        this.Pokemon5.setImage(new Image(HelloApplication.PokemonArray.get(4).getImagen().toURI().toString()));
        this.EstaVivo5.setImage(new Image(HelloApplication.PokemonArray.get(4).isVivo().toURI().toString()));
        this.Sexo5.setImage(new Image(HelloApplication.PokemonArray.get(4).getSexo().toURI().toString()));
        BarraVida5.setProgress(Vida5);
        if (Vida5<0.25){
            BarraVida5.setStyle("-fx-accent: red;");
        }else if (Vida5<0.5){
            BarraVida5.setStyle("-fx-accent: yellow;");
        }else{
            BarraVida5.setStyle("-fx-accent: green;");
        }
        if (HelloApplication.PokemonArray.get(4).getHp()==0){
            Pokemon5.setDisable(true);
            Pokemon5.setOpacity(0.5);
        }
        Favorito5.setVisible(HelloApplication.PokemonArray.get(4).getFavorito());

        float hola6=HelloApplication.PokemonArray.get(5).getHp();
        float Vida6=hola6/HelloApplication.PokemonArray.get(5).getHpMax();
        this.Nombre6.setText(HelloApplication.PokemonArray.get(5).getNombre());
        this.Level6.setText("Lvl"+ HelloApplication.PokemonArray.get(5).getLevel());
        this.VidaMaxima6.setText((HelloApplication.PokemonArray.get(5).getHp() +"/"+(HelloApplication.PokemonArray.get(5).getHpMax())));
        this.Pokemon6.setImage(new Image(HelloApplication.PokemonArray.get(5).getImagen().toURI().toString()));
        this.EstaVivo6.setImage(new Image(HelloApplication.PokemonArray.get(5).isVivo().toURI().toString()));
        this.Sexo6.setImage(new Image(HelloApplication.PokemonArray.get(5).getSexo().toURI().toString()));
        BarraVida6.setProgress(Vida6);
        if (Vida6<0){
            BarraVida6.setProgress(0);
        } else if (Vida6<0.25){
            BarraVida6.setStyle("-fx-accent: red;");
        }else if (Vida6<0.5){
            BarraVida6.setStyle("-fx-accent: yellow;");
        }else{
            BarraVida6.setStyle("-fx-accent: green;");
        }
        if (HelloApplication.PokemonArray.get(5).getHp()==0){
            Pokemon6.setDisable(true);
            Pokemon6.setOpacity(0.5);
        }else{
            Pokemon6.setDisable(false);
            Pokemon6.setOpacity(1);
        }
        Favorito6.setVisible(HelloApplication.PokemonArray.get(5).getFavorito());

    }
    @FXML
    public void clickPokemon1() {
        desclickar();
        Nombre1.setStyle("-fx-text-fill:blue");
        Level1.setStyle("-fx-text-fill:blue");
        BorderPokemon1.setStyle("-fx-border-color: ffff00;");
        x=0;
    }
    @FXML
    public void clickPokemon2() {
        desclickar();
        Nombre2.setStyle("-fx-text-fill:blue");
        Level2.setStyle("-fx-text-fill:blue");
        BorderPokemon2.setStyle("-fx-border-color: ffff00;");
        x=1;
    }
    @FXML
    public void clickPokemon3() {
        desclickar();
        Nombre3.setStyle("-fx-text-fill:blue");
        Level3.setStyle("-fx-text-fill:blue");
        BorderPokemon3.setStyle("-fx-border-color: ffff00;");
        x=2;
    }
    @FXML
    public void clickPokemon4() {
        desclickar();
        Nombre4.setStyle("-fx-text-fill:blue");
        Level4.setStyle("-fx-text-fill:blue");
        BorderPokemon4.setStyle("-fx-border-color: ffff00;");
        x=3;
    }
    @FXML
    public void clickPokemon5() {
        desclickar();
        Nombre5.setStyle("-fx-text-fill:blue");
        Level5.setStyle("-fx-text-fill:blue");
        BorderPokemon5.setStyle("-fx-border-color: ffff00;");
        x=4;
    }
    @FXML
    public void clickPokemon6() {
        desclickar();
        Nombre6.setStyle("-fx-text-fill:blue");
        Level6.setStyle("-fx-text-fill:blue");
        BorderPokemon6.setStyle("-fx-border-color: ffff00;");
        x=5;
    }
    @FXML
    public void combate() throws IOException {
        if (stage == null) {
            stage = new Stage();
            stage.setResizable(false);
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Combate2.fxml"));
            Scene scene = new Scene(loader.load(), 600, 500);
            stage.setScene(scene);
            stage.show();

            HelloController3 v = loader.getController();
            switch (x) {
                case 0 -> cont += 1;
                case 1 -> cont2 += 1;
                case 2 -> cont3 += 1;
                case 3 -> cont4 += 1;
                case 4 -> cont5 += 1;
                case 5 -> cont6 += 1;
            }
            v.ponerPokemon(HelloApplication.PokemonArray.get(x));
            v.setSeleccionPokemonController(this);
        }
    }
    public void desclickar(){
        BorderPokemon1.setStyle("-fx-background-color:#8A1D87");
        Nombre1.setStyle("-fx-text-fill:white");
        Level1.setStyle("-fx-text-fill:white");


        BorderPokemon2.setStyle("-fx-background-color:#8A1D87");
        Nombre2.setStyle("-fx-text-fill:white");
        Level2.setStyle("-fx-text-fill:white");


        BorderPokemon3.setStyle("-fx-background-color:#8A1D87");
        Nombre3.setStyle("-fx-text-fill:white");
        Level3.setStyle("-fx-text-fill:white");

        BorderPokemon4.setStyle("-fx-background-color:#8A1D87");
        Nombre4.setStyle("-fx-text-fill:white");
        Level4.setStyle("-fx-text-fill:white");


        BorderPokemon5.setStyle("-fx-background-color:#8A1D87");
        Nombre5.setStyle("-fx-text-fill:white");
        Level5.setStyle("-fx-text-fill:white");

        BorderPokemon6.setStyle("-fx-background-color:#8A1D87");
        Nombre6.setStyle("-fx-text-fill:white");
        Level6.setStyle("-fx-text-fill:white");

        Completado.setDisable(false);
    }
    @FXML
    public void graficos() throws IOException {
        stage2=new Stage();
        stage2.setResizable(false);
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Graficos.fxml"));
        Scene scene = new Scene(loader.load(), 600, 500);
        stage2.setScene(scene);
        stage2.show();
        HelloControllerGraf g=loader.getController();
        g.actualizarDatos();
    }
    @FXML
    public void pokedex() throws IOException {
        stage2 = new Stage();
        stage2.setResizable(false);
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Pokedex.fxml"));
        Scene scene = new Scene(loader.load(), 600, 500);
        stage2.setScene(scene);
        stage2.show();

        Pokedex v=loader.getController();
        v.mostrarPokemon(HelloApplication.PokemonArray.get(x));
        v.setSeleccionPokemonController(this);

    }

    public void actualizarVidas(){
        initialize();
    }

    public void revivir(Objeto objeto){
        objetoprueba=objeto;
        objetofin.setDisable(false);
        objetofin.setVisible(true);
        Pokemon1.setDisable(HelloApplication.PokemonArray.get(0).getHp() != 0);
        Pokemon2.setDisable(HelloApplication.PokemonArray.get(1).getHp() != 0);
        Pokemon3.setDisable(HelloApplication.PokemonArray.get(2).getHp() != 0);
        Pokemon4.setDisable(HelloApplication.PokemonArray.get(3).getHp() != 0);
        Pokemon5.setDisable(HelloApplication.PokemonArray.get(4).getHp() != 0);
        Pokemon6.setDisable(HelloApplication.PokemonArray.get(5).getHp() != 0);
    }

    @FXML
    public void usarobjeto(){
        if (objetoprueba.isRevivir()){
            HelloApplication.PokemonArray.get(x).setHp(HelloApplication.PokemonArray.get(x).getHp()+HelloApplication.PokemonArray.get(x).getHpMax());
        }else {
            HelloApplication.PokemonArray.get(x).setHp(HelloApplication.PokemonArray.get(x).getHp()+objetoprueba.getCuracion());
        }
        Stage stage = (Stage) this.objetofin.getScene().getWindow();
        stage.close();
    }

    public void setSeleccionPokemonController(Bolsa bolsa) {
        this.Bolsa=bolsa;
    }

    public void curar(Objeto objeto2) {
        objetoprueba=objeto2;
        objetofin.setDisable(false);
        objetofin.setVisible(true);
    }

}