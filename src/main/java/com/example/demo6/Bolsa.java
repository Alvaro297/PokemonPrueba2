package com.example.demo6;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Bolsa {
    @FXML
    HBox Objeto1;
    @FXML
    HBox Objeto2;
    @FXML
    HBox Objeto3;
    @FXML
    HBox Objeto4;
    @FXML
    Button Usar;
    @FXML
    ImageView ObjetoFinal;
    @FXML
    Label Nombre1;
    @FXML
    ImageView Imagen1;

    @FXML
    Label Nombre2;
    @FXML
    ImageView Imagen2;

    @FXML
    Label Nombre3;
    @FXML
    ImageView Imagen3;

    @FXML
    Label Nombre4;
    @FXML
    ImageView Imagen4;

    public static ArrayList<Objeto> ObjetoArray=new ArrayList<Objeto>();
    public Objeto objetofinal;
    private HelloController helloController;

    public void empezar(){
        Objeto objeto1=new Objeto("Poke Ball",new File("src\\main\\java\\com\\example\\demo6\\fotos\\Poke Ball.jpg"),0,false,true,1);
        ObjetoArray.add(objeto1);
        Objeto objeto2=new Objeto("Master Ball",new File("src\\main\\java\\com\\example\\demo6\\fotos\\MasterBall.jpg"),0,false,true,20);
        ObjetoArray.add(objeto2);
        Objeto objeto3=new Objeto("Max Revivir",new File("src\\main\\java\\com\\example\\demo6\\fotos\\Max Revivir.jpg"),100,true,false,0);
        ObjetoArray.add(objeto3);
        Objeto objeto4=new Objeto("Hiperpocion",new File("src\\main\\java\\com\\example\\demo6\\fotos\\Hiperpocion.png"),200,false,false,0);
        ObjetoArray.add(objeto4);
        this.Imagen1.setImage(new Image(ObjetoArray.get(0).getImagen().toURI().toString()));
        this.Nombre1.setText(ObjetoArray.get(0).getNombre());

        this.Imagen2.setImage(new Image(ObjetoArray.get(1).getImagen().toURI().toString()));
        this.Nombre2.setText(ObjetoArray.get(1).getNombre());

        this.Imagen3.setImage(new Image(ObjetoArray.get(2).getImagen().toURI().toString()));
        this.Nombre3.setText(ObjetoArray.get(2).getNombre());

        this.Imagen4.setImage(new Image(ObjetoArray.get(3).getImagen().toURI().toString()));
        this.Nombre4.setText(ObjetoArray.get(3).getNombre());
    }
    @FXML
    public void objeto1() {
        Desclickar();
        this.Objeto1.setStyle("-fx-background-color:#F59504");
        objeto(ObjetoArray.get(0));

    }
    @FXML
    public void objeto2() {
        Desclickar();
        this.Objeto2.setStyle("-fx-background-color:#F59504");
        objeto(ObjetoArray.get(1));
    }
    @FXML
    public void objeto3() {
        Desclickar();
        this.Objeto3.setStyle("-fx-background-color:#F59504");
        objeto(ObjetoArray.get(2));

    }
    @FXML
    public void objeto4() {
        Desclickar();
        this.Objeto4.setStyle("-fx-background-color:#F59504");
        objeto(ObjetoArray.get(3));

    }
    @FXML
    public void Usar() throws IOException {
        if(objetofinal.isCapturar()){
            Stage stage = new Stage();
            stage.setResizable(false);
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Combate2.fxml"));
            Scene scene = new Scene(loader.load(), 600, 500);
            stage.setScene(scene);
            stage.show();
            HelloController3 v = loader.getController();
            v.capturar(objetofinal);
            v.setSeleccionPokemonControllerObjeto(this);
        }else{
        Stage stage = new Stage();
        stage.setResizable(false);
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/hello-view.fxml"));
        Scene scene = new Scene(loader.load(), 600, 500);
        stage.setScene(scene);
        stage.show();
        HelloController v = loader.getController();
        if (objetofinal.isRevivir()){
          v.revivir(objetofinal);
        }else{
            v.curar(objetofinal);
        }
        v.setSeleccionPokemonController(this);
        }
    }

    public void Desclickar(){
        this.Usar.setDisable(false);
        this.Objeto1.setStyle("-fx-background-color:#E5BA7A");
        this.Objeto2.setStyle("-fx-background-color:#E5BA7A");
        this.Objeto3.setStyle("-fx-background-color:#E5BA7A");
        this.Objeto4.setStyle("-fx-background-color:#E5BA7A");
    }

    public void objeto(Objeto objeto){
        this.ObjetoFinal.setImage(new Image(objeto.getImagen().toURI().toString()));
        objetofinal=objeto;
    }




}
