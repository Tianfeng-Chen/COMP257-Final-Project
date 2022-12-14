package Util;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.*;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RuntimePlot extends Application {
    private List<String> yAxisValues1 = new ArrayList<>();
    private List<String> yAxisValues2 = new ArrayList<>();
    private List<String> yAxisValues3 = new ArrayList<>();
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Test Result Plot");
        Axis xAxis = new NumberAxis();
        Axis yAxis = new NumberAxis();
        xAxis.setLabel("Test Case Size");
        yAxis.setLabel("Runtime(nanoseconds)");
        LineChart<String, Integer> lineChart = new LineChart<String, Integer>(xAxis, yAxis);
        lineChart.setTitle("Test Case Runtime");
        XYChart.Series series1 = new XYChart.Series();
        XYChart.Series series2 = new XYChart.Series();
        XYChart.Series series3 = new XYChart.Series();
        series1.setName("BruteForce Solution");
        series2.setName("DynamicProgramming Solution");
        series3.setName("Greedy Solution");

        List<Integer> preSetXValues = Arrays.asList(10, 25, 50, 75, 90);
        for (int i = 0; i < preSetXValues.size(); i++) {
            //series1.getData().add(new XYChart.Data(preSetXValues.get(i), yAxisValues1.get(i)));
            series1.getData().add(new XYChart.Data(preSetXValues.get(i), i + 100));
            //series2.getData().add(new XYChart.Data(preSetXValues.get(i), yAxisValues2.get(i)));
            series2.getData().add(new XYChart.Data(preSetXValues.get(i), i + 100));
            //series3.getData().add(new XYChart.Data(preSetXValues.get(i), yAxisValues3.get(i)));
            series3.getData().add(new XYChart.Data(preSetXValues.get(i), i + 100));
        }

        Scene scene = new Scene(lineChart, 800, 600);
        lineChart.getData().addAll(series1, series2, series3);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void addValueToYAxis(Type type, String value) {
        switch (type) {
            case BruteForce: yAxisValues1.add(value);
            case DynamicProgramming: yAxisValues2.add(value);
            case Greedy: yAxisValues3.add(value);
        }
    }

    public static void main(String[] args) {
        launch(args);
    }

    public enum Type {
        BruteForce,
        DynamicProgramming,
        Greedy
    }
}
