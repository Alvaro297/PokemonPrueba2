package com.example.demo6;


import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class HelloApplication extends Application {

    public static ArrayList<Pokemon> PokemonArray=new ArrayList<Pokemon>();
    public static ArrayList<Pokemon> PokemonArrayEnemigo=new ArrayList<Pokemon>();
    public static ArrayList<Integer> ArrayAleatorio=new ArrayList<Integer>();
    public static int x;
    @Override
    public void start(Stage stage) {
        try {
            Pokemon pokemon1 = new Pokemon("Darkrai", 79, 296, new Image("https://images.wikidexcdn.net/mwuploads/wikidex/0/09/latest/20140110190043/Darkrai_XY.gif"),new Image("https://images.wikidexcdn.net/mwuploads/wikidex/d/d8/latest/20150321170743/Darkrai_espalda_G6.gif"), 196, new Image("https://www.pinclipart.com/picdir/middle/565-5650948_green-check-mark-clip-art.png"));
            PokemonArray.add(pokemon1);
            Pokemon pokemon2 = new Pokemon("Deoxys", 82, 211, new Image("https://static.wikia.nocookie.net/espokemon/images/4/47/Deoxys_NB.gif/revision/latest/scale-to-width-down/67?cb=20101101223550"),new Image("https://images.wikidexcdn.net/mwuploads/wikidex/c/c5/latest/20150713002848/Deoxys_ataque_espalda_G6.gif"), 211, new Image("https://www.pinclipart.com/picdir/middle/565-5650948_green-check-mark-clip-art.png"));
            PokemonArray.add(pokemon2);
            Pokemon pokemon3=new Pokemon("Garchomp",78,311,new Image("https://images.wikidexcdn.net/mwuploads/wikidex/e/e1/latest/20140814023848/Garchomp_XY.gif"),new Image("https://images.wikidexcdn.net/mwuploads/wikidex/b/bd/latest/20180510155212/Garchomp_espalda_G6.gif"),311,new Image("https://www.pinclipart.com/picdir/middle/565-5650948_green-check-mark-clip-art.png"),new Image("https://fsymbols.com/images/male.png"));
            PokemonArray.add(pokemon3);
            Pokemon pokemon4=new Pokemon("Gyarados",77,250,new Image("https://images.wikidexcdn.net/mwuploads/wikidex/a/a3/latest/20200103044247/Gyarados_EpEc.gif"),new Image("https://images.wikidexcdn.net/mwuploads/wikidex/7/72/latest/20150321173548/Gyarados_espalda_G6.gif"),230,new Image("https://www.pinclipart.com/picdir/middle/565-5650948_green-check-mark-clip-art.png"),new Image("https://fsymbols.com/images/male.png"));
            PokemonArray.add(pokemon4);
            Pokemon pokemon5=new Pokemon("Luxray",74,230,new Image("https://images.wikidexcdn.net/mwuploads/wikidex/a/a2/latest/20140814023029/Luxray_XY.gif"),new Image("https://images.wikidexcdn.net/mwuploads/wikidex/7/74/latest/20150321175124/Luxray_espalda_G6.gif"),230,new Image("https://www.pinclipart.com/picdir/middle/565-5650948_green-check-mark-clip-art.png"),new Image("https://fsymbols.com/images/male.png"));
            PokemonArray.add(pokemon5);
            Pokemon pokemon6=new Pokemon("Sylveon",76,245,new Image("https://images.wikidexcdn.net/mwuploads/wikidex/4/4d/latest/20150321173638/Sylveon_XY.gif"),new Image("https://images.wikidexcdn.net/mwuploads/wikidex/5/50/latest/20150321183307/Sylveon_espalda_G6.gif"),1,new Image("https://www.pinclipart.com/picdir/middle/565-5650948_green-check-mark-clip-art.png"),new Image("https://www.google.com/url?sa=i&url=https%3A%2F%2Fletrasdegremar.com%2Fsimbolos-e-historia%2Fel-simbolo-femenino%2F&psig=AOvVaw0MsPz78hKt_b2vqqXGiDaz&ust=1641906839163000&source=images&cd=vfe&ved=0CAsQjRxqFwoTCJj3u-Khp_UCFQAAAAAdAAAAABAD"));
            PokemonArray.add(pokemon6);

            Pokemon pokemon1E = new Pokemon("Reshiram", 70, 236, new Image("https://images.wikidexcdn.net/mwuploads/wikidex/f/f6/latest/20140111191253/Reshiram_XY.gif"), 56, new Image("https://www.pinclipart.com/picdir/middle/565-5650948_green-check-mark-clip-art.png"));
            PokemonArrayEnemigo.add(pokemon1E);
            Pokemon pokemon2E = new Pokemon("Zekrom", 68, 264, new Image("https://images.wikidexcdn.net/mwuploads/wikidex/0/0a/latest/20200308153421/Zekrom_EpEc.gif"), 255, new Image("https://www.pinclipart.com/picdir/middle/565-5650948_green-check-mark-clip-art.png"));
            PokemonArrayEnemigo.add(pokemon2E);
            Pokemon pokemon3E = new Pokemon("Lucario", 65, 187, new Image("https://images.wikidexcdn.net/mwuploads/wikidex/5/5d/latest/20200104005005/Lucario_EpEc.gif"), 185, new Image("https://www.pinclipart.com/picdir/middle/565-5650948_green-check-mark-clip-art.png"));
            PokemonArrayEnemigo.add(pokemon3E);
            x=new Random().nextInt(PokemonArrayEnemigo.size());
            ArrayAleatorio.add(x);
            stage.setResizable(false);
            AnchorPane root =  FXMLLoader.load(getClass().getResource("/hello-view.fxml"));
            Scene scene = new Scene(root,600,400);
            stage.setScene(scene);
            stage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
