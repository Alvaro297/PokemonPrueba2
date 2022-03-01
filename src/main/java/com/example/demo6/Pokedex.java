package com.example.demo6;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Pokedex {

    @FXML
    Label Descripcion;
    @FXML
    Label Nombre;
    @FXML
    ImageView Pokemon;
    @FXML
    ImageView Evolucion1;
    @FXML
    ImageView Evolucion2;
    @FXML
    ImageView Evolucion3;
    @FXML
    ImageView estrella;
    Pokemon pokemon2;
    private HelloController helloController;

    public void mostrarPokemon(Pokemon pokemon){
        pokemon2=pokemon;
        Nombre.setText(pokemon.getNombre());
        Pokemon.setImage(new Image(pokemon.getImagen().toURI().toString()));
        Descripcion.setText(pokemon.getDescripcion());
        if (pokemon.getEvolucion()!=null && pokemon.getEvolucion2()!=null){
            Evolucion2.setImage(new Image(pokemon.getEvolucion().toURI().toString()));
            Evolucion1.setImage(new Image(pokemon.getEvolucion2().toURI().toString()));
            Evolucion3.setImage(new Image(pokemon.getImagen().toURI().toString()));
        }else if (pokemon.getEvolucion()!=null){
            Evolucion2.setImage(new Image(pokemon.getImagen().toURI().toString()));
            Evolucion1.setImage(new Image(pokemon.getEvolucion().toURI().toString()));
        }else {
            Evolucion2.setImage(new Image(pokemon.getImagen().toURI().toString()));
        }
    }

    public void favorito(){
        if (estrella.isVisible()){
            estrella.setVisible(false);
            pokemon2.setFavorito(false);
            helloController.initialize();
        }else{
            estrella.setVisible(true);
            pokemon2.setFavorito(true);
            helloController.initialize();
        }
    }

    public void setSeleccionPokemonController(HelloController helloControler){
        this.helloController = helloControler;
    }

}
