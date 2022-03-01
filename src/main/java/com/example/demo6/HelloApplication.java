package com.example.demo6;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.File;
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
            Pokemon pokemon1 = new Pokemon("Darkrai", 79, 296, new File("src\\main\\java\\com\\example\\demo6\\fotos\\Darkrai_XY.gif"),new File("src\\main\\java\\com\\example\\demo6\\fotos\\Darkrai_espalda_G6.gif"), 196, new File("src\\main\\java\\com\\example\\demo6\\fotos\\greenCheck.png.png"),"Es el puto Darkrai que mas quieres si prefieres a Creselia una de dos eres Frances o tus padres no te han querido en tu puta vida",false);
            PokemonArray.add(pokemon1);
            Pokemon pokemon2 = new Pokemon("Deoxys", 82, 211, new File("src\\main\\java\\com\\example\\demo6\\fotos\\Deoxys_NB.gif"),new File("src\\main\\java\\com\\example\\demo6\\fotos\\Deoxys_ataque_espalda_G6.gif"), 211, new File("src\\main\\java\\com\\example\\demo6\\fotos\\greenCheck.png.png"),"Deoxys en Forma Ataque te mete una hostia y te deja volando. Pega mas que la chancla de tu madre.No voy a hacer las variaciones",false);
            PokemonArray.add(pokemon2);
            Pokemon pokemon3=new Pokemon("Garchomp",78,311,new File("src\\main\\java\\com\\example\\demo6\\fotos\\Garchomp_XY.gif"),new File("src\\main\\java\\com\\example\\demo6\\fotos\\Garchomp_espalda_G6.gif"),311,new File("src\\main\\java\\com\\example\\demo6\\fotos\\greenCheck.png"),new File("src\\main\\java\\com\\example\\demo6\\fotos\\male.webp"),"Corre mas que Usaint Bolt con diarrea el hijo de puta ademas de como sea el de Cinthia te va meter una hostia que no quieres otra",new File("src\\main\\java\\com\\example\\demo6\\fotos\\Gabite_XY_hembra.gif"),new File("src\\main\\java\\com\\example\\demo6\\fotos\\Gible_XY.gif"),false);
            PokemonArray.add(pokemon3);
            Pokemon pokemon4=new Pokemon("Gyarados",77,250,new File("src\\main\\java\\com\\example\\demo6\\fotos\\Gyarados_EpEc.gif"),new File("src\\main\\java\\com\\example\\demo6\\fotos\\Gyarados_espalda_G6.gif"),230,new File("src\\main\\java\\com\\example\\demo6\\fotos\\greenCheck.png"),new File("src\\main\\java\\com\\example\\demo6\\fotos\\male.webp"),"Que esperar de la evolucion del mejor pokemon de la historia",new File("src\\main\\java\\com\\example\\demo6\\fotos\\Magidios.jpg"),false);
            PokemonArray.add(pokemon4);
            Pokemon pokemon5=new Pokemon("Luxray",74,230,new File("src\\main\\java\\com\\example\\demo6\\fotos\\Luxray_XY.gif"),new File("src\\main\\java\\com\\example\\demo6\\fotos\\Luxray_espalda_G6.gif"),230,new File("src\\main\\java\\com\\example\\demo6\\fotos\\greenCheck.png"),new File("src\\main\\java\\com\\example\\demo6\\fotos\\male.webp"),"Luxray>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Jolteon",new File("src\\main\\java\\com\\example\\demo6\\fotos\\Luxio_XY.gif"),new File("src\\main\\java\\com\\example\\demo6\\fotos\\Shinx_XY.gif"),false);
            PokemonArray.add(pokemon5);
            Pokemon pokemon6=new Pokemon("Sylveon",76,245,new File("src\\main\\java\\com\\example\\demo6\\fotos\\Sylveon_XY.gif"),new File("src\\main\\java\\com\\example\\demo6\\fotos\\Sylveon_espalda_G6.gif"),20,new File("src\\main\\java\\com\\example\\demo6\\fotos\\greenCheck.png"),new File("src\\main\\java\\com\\example\\demo6\\fotos\\female.png"),"Solo voy a poner a Eevee no os flipeis",new File("src\\main\\java\\com\\example\\demo6\\fotos\\Eevee_EpEc_hembra.gif"),false);
            PokemonArray.add(pokemon6);

            Pokemon pokemon1E = new Pokemon("Reshiram", 70, 236, new File("src\\main\\java\\com\\example\\demo6\\fotos\\Reshiram_XY.gif"), 56, new File("src\\main\\java\\com\\example\\demo6\\fotos\\greenCheck.png"));
            PokemonArrayEnemigo.add(pokemon1E);
            Pokemon pokemon2E = new Pokemon("Zekrom", 68, 264, new File("src\\main\\java\\com\\example\\demo6\\fotos\\Zekrom_XY.gif"), 255, new File("src\\main\\java\\com\\example\\demo6\\fotos\\greenCheck.png"));
            PokemonArrayEnemigo.add(pokemon2E);
            Pokemon pokemon3E = new Pokemon("Lucario", 65, 187, new File("src\\main\\java\\com\\example\\demo6\\fotos\\Lucario_XY.gif"), 185, new File("src\\main\\java\\com\\example\\demo6\\fotos\\greenCheck.png"));
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
