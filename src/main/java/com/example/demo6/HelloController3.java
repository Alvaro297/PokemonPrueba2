package com.example.demo6;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;


import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Optional;
import java.util.Random;

public class HelloController3 {

    @FXML
    ImageView PokemonAliado;
    @FXML
    Label NombreAliado;
    @FXML
    Label LevelAliado;
    @FXML
    Label VidaAliada;
    @FXML
    ProgressBar BarraVidaAliada;
    @FXML
    Button Continuar;


    @FXML
    ProgressBar BarraVidaEnemigo;
    @FXML
    ImageView PokemonEnemigo;
    @FXML
    Label VidaEnemigo;
    @FXML
    Label LevelEnemigo;
    @FXML
    Label NombreEnemigo;
    @FXML
    Button IrPokemon;
    @FXML
    Button MovimientoMuyArriesgado;
    @FXML
    Button MovimientoArriesgado;
    @FXML
    Button MovimientoSeguro;
    @FXML
    Button Mochila;
    @FXML
    Button Cancelar;
    @FXML
    Button Bolsa;
    @FXML
    Button IrPrimeraPantalla;
    @FXML
    ImageView Movimientos;
    @FXML
    ImageView Pokemon6;
    private Pokemon pokemon2;
    private HelloController HelloController;
    private Bolsa bolsa;
    Random claseRandom = new Random();
    int danoAletorioEnemigo;
    int danoAletorioAliado;


    @FXML
    public void ponerPokemon(Pokemon pokemon) throws MalformedURLException {
        if (pokemon.getHp()<=0){
            Alerta(pokemon);
        }
            pokemon2 = pokemon;
            float hola = pokemon.getHp();
            float Vida1 = hola / pokemon.getHpMax();
            NombreAliado.setText(pokemon.getNombre());
            LevelAliado.setText("Lvl" + pokemon.getLevel());
            VidaAliada.setText("Ps");
            PokemonAliado.setImage(new Image(pokemon.getImagenDetras().toURI().toString()));
            BarraVidaAliada.setProgress(Vida1);
            if (Vida1 < 0.25) {
                BarraVidaAliada.setStyle("-fx-accent: red;");
            } else if (Vida1 < 0.5) {
                BarraVidaAliada.setStyle("-fx-accent: yellow;");
            } else
                BarraVidaAliada.setStyle("-fx-accent: green;");
            float holaEnemigo = HelloApplication.PokemonArrayEnemigo.get(HelloApplication.x).getHpRival();
            float Vida2 = holaEnemigo / HelloApplication.PokemonArrayEnemigo.get(HelloApplication.x).getHpMax();
            NombreEnemigo.setText(HelloApplication.PokemonArrayEnemigo.get(HelloApplication.x).getNombre());
            LevelEnemigo.setText("Lvl" + HelloApplication.PokemonArrayEnemigo.get(HelloApplication.x).getLevel());
            VidaEnemigo.setText((HelloApplication.PokemonArrayEnemigo.get(HelloApplication.x).getHpRival() + "/" + (HelloApplication.PokemonArrayEnemigo.get(HelloApplication.x).getHpMax())));
            PokemonEnemigo.setImage(new Image(HelloApplication.PokemonArrayEnemigo.get(HelloApplication.x).getImagen().toURI().toString()));
            BarraVidaEnemigo.setProgress(Vida2);
            if (Vida2 < 0.25) {
                BarraVidaEnemigo.setStyle("-fx-accent: red;");
            } else if (Vida2 < 0.5) {
                BarraVidaEnemigo.setStyle("-fx-accent: yellow;");
            } else {
                BarraVidaEnemigo.setStyle("-fx-accent: green;");
            }

    }
    @FXML
    public void ensenarMovimientos(){
        Pokemon6.setDisable(true);
        Pokemon6.setOpacity(0);
        IrPrimeraPantalla.setDisable(true);
        Mochila.setDisable(true);
        Movimientos.setOpacity(1);
        MovimientoMuyArriesgado.setOpacity(1);
        MovimientoSeguro.setOpacity(1);
        MovimientoArriesgado.setOpacity(1);
        Cancelar.setOpacity(1);
    }
    public void ataqueArriesgado() throws IOException {
        danoAletorioEnemigo =claseRandom.nextInt(15)+10;
        HelloApplication.PokemonArrayEnemigo.get(HelloApplication.x).setHpRival(HelloApplication.PokemonArrayEnemigo.get(HelloApplication.x).getHpRival()- danoAletorioEnemigo);
        HelloController.dmgEnemigo+= danoAletorioEnemigo;
        if ( HelloApplication.PokemonArrayEnemigo.get(HelloApplication.x).getHpRival()<=0) {
            Alerta(HelloApplication.PokemonArrayEnemigo.get(HelloApplication.x));
            control();
        }else{
            danoAletorioAliado =claseRandom.nextInt(15)+10;
            HelloController.dmgAliado+= danoAletorioAliado;
            pokemon2.setHp(pokemon2.getHp()- danoAletorioAliado);
        }
        ponerPokemon(pokemon2);

        this.HelloController.actualizarVidas();
    }

    public void control(){
        HelloApplication.x=new Random().nextInt(HelloApplication.PokemonArrayEnemigo.size());
        while (HelloApplication.ArrayAleatorio.contains(HelloApplication.x)){
            HelloApplication.x=new Random().nextInt(HelloApplication.PokemonArrayEnemigo.size());
        }
        HelloApplication.ArrayAleatorio.add(HelloApplication.x);
    }
    public void Alerta(Pokemon pokemon)  {
        //Esta es la alerta de tipo confirmation tambien vale de tipo NONE
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setHeaderText(null);
        alert.setTitle("Salir o no");
        alert.setContentText("El pokemon "+pokemon.getNombre()+" ha muerto");
        alert.setGraphic(new ImageView(new Image(pokemon.getImagen().toURI().toString())));
        Optional<ButtonType> action = alert.showAndWait();
        if (action.get() == ButtonType.OK) {
            continuarAhora();
        } else {
            salir();
        }
    }
    public void salir(){
        System.exit(0);
    }
    public void continuarAhora(){
        com.example.demo6.HelloController.stage =null;
        Stage stage = (Stage) this.Pokemon6.getScene().getWindow();
        stage.close();


    }

    public void setSeleccionPokemonController(HelloController helloControler){
        this.HelloController = helloControler;
    }

    public void ataqueMuyArriesgado() throws IOException {
        danoAletorioEnemigo =claseRandom.nextInt(50);
        HelloApplication.PokemonArrayEnemigo.get(HelloApplication.x).setHpRival(HelloApplication.PokemonArrayEnemigo.get(HelloApplication.x).getHpRival()- danoAletorioEnemigo);
        HelloController.dmgEnemigo+= danoAletorioEnemigo;
        if ( HelloApplication.PokemonArrayEnemigo.get(HelloApplication.x).getHpRival()<=0) {
            Alerta(HelloApplication.PokemonArrayEnemigo.get(HelloApplication.x));
            control();
        }else{
            danoAletorioAliado =claseRandom.nextInt(50);
            HelloController.dmgAliado+= danoAletorioAliado;
            pokemon2.setHp(pokemon2.getHp()- danoAletorioAliado);
        }
        ponerPokemon(pokemon2);

        this.HelloController.actualizarVidas();

    }

    public void ataqueSeguro() throws IOException {
        HelloApplication.PokemonArrayEnemigo.get(HelloApplication.x).setHpRival(HelloApplication.PokemonArrayEnemigo.get(HelloApplication.x).getHpRival()-20);
        HelloController.dmgEnemigo+=20;
        if ( HelloApplication.PokemonArrayEnemigo.get(HelloApplication.x).getHpRival()<=0) {
            Alerta(HelloApplication.PokemonArrayEnemigo.get(HelloApplication.x));
            control();
        }else{
            pokemon2.setHp(pokemon2.getHp()-20);
            HelloController.dmgAliado+=20;
        }
        ponerPokemon(pokemon2);


        this.HelloController.actualizarVidas();

    }

    public void cancelar(){
        Pokemon6.setDisable(false);
        Pokemon6.setOpacity(1);
        IrPrimeraPantalla.setDisable(false);
        Mochila.setDisable(false);
        Movimientos.setOpacity(0);
        MovimientoMuyArriesgado.setOpacity(0);
        MovimientoSeguro.setOpacity(0);
        MovimientoArriesgado.setOpacity(0);
        Cancelar.setOpacity(0);
    }

    public void recovery() throws IOException {
        HelloApplication.PokemonArrayEnemigo.get(HelloApplication.x).setHpRival(HelloApplication.PokemonArrayEnemigo.get(HelloApplication.x).getHpRival()+(claseRandom.nextInt(50)+25));
        if ( HelloApplication.PokemonArrayEnemigo.get(HelloApplication.x).getHpRival()<=0) {
            control();
        }else{
            pokemon2.setHp(pokemon2.getHp()+(claseRandom.nextInt(50)+25));
        }
        ponerPokemon(pokemon2);
        this.HelloController.actualizarVidas();
    }

    public void objetos() throws IOException {
        Stage stage = new Stage();
        stage.setResizable(false);
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Bolsa.fxml"));
        Scene scene = new Scene(loader.load(), 600, 500);
        stage.setScene(scene);
        stage.show();

        Bolsa v = loader.getController();

        v.empezar();
    }
    @FXML
    public void cambiarPs(){
        VidaAliada.setText((pokemon2.getHp() + "/" + (pokemon2.getHpMax())));
    }
    @FXML
    public void resetPs(){
        VidaAliada.setText("Ps");
    }


    public void setSeleccionPokemonControllerObjeto(Bolsa bolsa) {
    }

    public void capturar(Objeto objetofinal) {
    }
}