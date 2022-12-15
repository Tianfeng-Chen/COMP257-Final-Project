package Util;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.*;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class RuntimePlot extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Axis xAxis1 = new NumberAxis();
        Axis yAxis1 = new NumberAxis();
        Axis xAxis2 = new NumberAxis();
        Axis yAxis2 = new NumberAxis();
        //LineChart lineChart1 = new LineChart(xAxis1, yAxis1);
        LineChart lineChart2 = new LineChart(xAxis2, yAxis2);
        XYChart.Series series1 = new XYChart.Series();
        XYChart.Series series2 = new XYChart.Series();
        XYChart.Series series3 = new XYChart.Series();

        xAxis1.setLabel("Test Case Size");
        yAxis1.setLabel("Runtime(nanoseconds)");
        xAxis2.setLabel("Test Case Size");
        yAxis2.setLabel("Runtime(nanoseconds)");
        //lineChart1.setTitle("Test Case Runtime");
        lineChart2.setTitle("Test Case Runtime");
        series1.setName("BruteForce Solution");
        series2.setName("DynamicProgramming Solution");
        series3.setName("Greedy Solution");

        series1.getData().add(new XYChart.Data(0, 0));
        series1.getData().add(new XYChart.Data(10, 10100));
        series1.getData().add(new XYChart.Data(15, 578400));
        series1.getData().add(new XYChart.Data(20, 611000));
        series1.getData().add(new XYChart.Data(25, 834900));
        series1.getData().add(new XYChart.Data(30, 6741600));

        series2.getData().add(new XYChart.Data(0, 0));
        series2.getData().add(new XYChart.Data(10, 4600));
        series2.getData().add(new XYChart.Data(15, 8100));
        series2.getData().add(new XYChart.Data(20, 8300));
        series2.getData().add(new XYChart.Data(25, 10700));
        series2.getData().add(new XYChart.Data(30, 27400));

        series3.getData().add(new XYChart.Data(0, 0));
        series3.getData().add(new XYChart.Data(10, 10200));
        series3.getData().add(new XYChart.Data(15, 44800));
        series3.getData().add(new XYChart.Data(20, 19400));
        series3.getData().add(new XYChart.Data(25, 20000));
        series3.getData().add(new XYChart.Data(30, 43100));


        //lineChart1.getData().addAll(series1, series2, series3);
        lineChart2.getData().addAll(series2, series3);

        Scene scene = new Scene(lineChart2, 800, 600);
        primaryStage.setTitle("TestCase Runtime Plot");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) throws Exception {
        launch(args);
    }
}
