package com.example.demo6;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.chart.*;
import javafx.scene.control.Tooltip;

public class HelloControllerGraf {

    @FXML
    private PieChart pieChart;
    @FXML
    private BarChart barChart;

    @FXML
    private CategoryAxis EjeX;

    @FXML
    private NumberAxis EjeY;
    private static int Pokemon;
    private static int pokemonEnemigo;


    public void initialize() {
        ObservableList<PieChart.Data> pieChartData =
                FXCollections.observableArrayList(
                        new PieChart.Data("Mi Pokemon", Pokemon),
                        new PieChart.Data("Pokemon Rival", pokemonEnemigo));
        pieChart.setData(pieChartData);
        pieChart.getData().forEach(this::Tooltip);

        barChart.setTitle("NVeces seleccionado un Pokemon");
        EjeY.setLabel("N_Veces");


    }
    @FXML
    public void actualizarPieChart(int danoPokemonAmigo, int danoPokemonRival) {
        Pokemon = danoPokemonAmigo;
        pokemonEnemigo = danoPokemonRival;
        initialize();
    }

    public void Tooltip(PieChart.Data d) {
        String msg = String.format("%s : %s", d.getName(), d.getPieValue());
        Tooltip tt = new Tooltip(msg);
        tt.setStyle("-fx-background-color: gray; -fx-text-fill: whitesmoke;");
        Tooltip.install(d.getNode(), tt);
    }

    @FXML
    public void actualizarDatos() {
        XYChart.Series pokemon1 = new XYChart.Series<>();
        pokemon1.setName(HelloApplication.PokemonArray.get(0).getNombre());
        pokemon1.getData().add(new XYChart.Data("", HelloController.cont));
        barChart.getData().addAll(pokemon1);

        XYChart.Series pokemon2 = new XYChart.Series<>();
        pokemon2.setName(HelloApplication.PokemonArray.get(1).getNombre());
        pokemon2.getData().add(new XYChart.Data("", HelloController.cont2));
        barChart.getData().addAll(pokemon2);

        XYChart.Series pokemon3 = new XYChart.Series<>();
        pokemon3.setName(HelloApplication.PokemonArray.get(2).getNombre());
        pokemon3.getData().add(new XYChart.Data("", HelloController.cont3));
        barChart.getData().addAll(pokemon3);

        XYChart.Series pokemon4 = new XYChart.Series<>();
        pokemon4.setName(HelloApplication.PokemonArray.get(3).getNombre());
        pokemon4.getData().add(new XYChart.Data("", HelloController.cont4));
        barChart.getData().addAll(pokemon4);

        XYChart.Series pokemon5 = new XYChart.Series<>();
        pokemon5.setName(HelloApplication.PokemonArray.get(4).getNombre());
        pokemon5.getData().add(new XYChart.Data("", HelloController.cont5));
        barChart.getData().addAll(pokemon5);

        XYChart.Series pokemon6 = new XYChart.Series<>();
        pokemon6.setName(HelloApplication.PokemonArray.get(5).getNombre());
        pokemon6.getData().add(new XYChart.Data("", HelloController.cont6));
        barChart.getData().addAll(pokemon6);
        initialize();
    }
}
