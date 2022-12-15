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
        Axis xAxis3 = new NumberAxis();
        Axis yAxis3 = new NumberAxis();
        LineChart lineChart1 = new LineChart(xAxis1, yAxis1);
        LineChart lineChart2 = new LineChart(xAxis2, yAxis2);
        LineChart lineChart3 = new LineChart(xAxis3, yAxis3);
        XYChart.Series series1 = new XYChart.Series();
        XYChart.Series series2 = new XYChart.Series();
        XYChart.Series series3 = new XYChart.Series();
        XYChart.Series series4 = new XYChart.Series();
        XYChart.Series series5 = new XYChart.Series();

        xAxis1.setLabel("Test Case Size");
        yAxis1.setLabel("Runtime(nanoseconds)");
        xAxis2.setLabel("Test Case Size");
        yAxis2.setLabel("Runtime(nanoseconds)");
        xAxis3.setLabel("Test Case Size");
        yAxis3.setLabel("Runtime(nanoseconds)");
        lineChart1.setTitle("Test Case Runtime");
        lineChart2.setTitle("Test Case Runtime");
        lineChart3.setTitle("Test Case Runtime");
        series1.setName("BruteForce Solution");
        series2.setName("DynamicProgramming Solution");
        series3.setName("Greedy Solution");
        series4.setName("DynamicProgramming Solution");
        series5.setName("Greedy Solution");

        series1.getData().add(new XYChart.Data(0, 0));
        series1.getData().add(new XYChart.Data(5, 10100));
        series1.getData().add(new XYChart.Data(10, 578400));
        series1.getData().add(new XYChart.Data(15, 611000));
        series1.getData().add(new XYChart.Data(20, 834900));
        series1.getData().add(new XYChart.Data(25, 6741600));

        series2.getData().add(new XYChart.Data(0, 0));
        series2.getData().add(new XYChart.Data(5, 4600));
        series2.getData().add(new XYChart.Data(10, 8100));
        series2.getData().add(new XYChart.Data(15, 8300));
        series2.getData().add(new XYChart.Data(20, 10700));
        series2.getData().add(new XYChart.Data(25, 27400));

        series3.getData().add(new XYChart.Data(0, 0));
        series3.getData().add(new XYChart.Data(5, 10200));
        series3.getData().add(new XYChart.Data(10, 44800));
        series3.getData().add(new XYChart.Data(15, 19400));
        series3.getData().add(new XYChart.Data(20, 20000));
        series3.getData().add(new XYChart.Data(25, 43100));

        series4.getData().add(new XYChart.Data(0, 0));
        series4.getData().add(new XYChart.Data(5, 10200));
        series4.getData().add(new XYChart.Data(10, 44800));
        series4.getData().add(new XYChart.Data(15, 19400));
        series4.getData().add(new XYChart.Data(20, 20000));
        series4.getData().add(new XYChart.Data(25, 43100));
        series4.getData().add(new XYChart.Data(50, 56300));
        series4.getData().add(new XYChart.Data(60, 176400));
        series4.getData().add(new XYChart.Data(70, 10000));
        series4.getData().add(new XYChart.Data(80, 12900));
        series4.getData().add(new XYChart.Data(100, 53100));
        series4.getData().add(new XYChart.Data(120, 188300));
        series4.getData().add(new XYChart.Data(140, 27400));
        series4.getData().add(new XYChart.Data(200, 50400));
        series4.getData().add(new XYChart.Data(350, 1050400));

        series5.getData().add(new XYChart.Data(0, 0));
        series5.getData().add(new XYChart.Data(5, 10200));
        series5.getData().add(new XYChart.Data(10, 44800));
        series5.getData().add(new XYChart.Data(15, 19400));
        series5.getData().add(new XYChart.Data(20, 20000));
        series5.getData().add(new XYChart.Data(25, 43100));
        series5.getData().add(new XYChart.Data(50, 46600));
        series5.getData().add(new XYChart.Data(60, 25600));
        series5.getData().add(new XYChart.Data(70, 36200));
        series5.getData().add(new XYChart.Data(80, 33800));
        series5.getData().add(new XYChart.Data(100, 44200));
        series5.getData().add(new XYChart.Data(120, 53400));
        series5.getData().add(new XYChart.Data(140, 57000));
        series5.getData().add(new XYChart.Data(200, 86600));
        series5.getData().add(new XYChart.Data(350, 160500));

        //lineChart1.getData().addAll(series1, series2, series3);
        //lineChart2.getData().addAll(series2, series3);
        lineChart3.getData().addAll(series4, series5);

        Scene scene = new Scene(lineChart3, 800, 600);
        primaryStage.setTitle("TestCase Runtime Plot");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) throws Exception {
        launch(args);
    }
}
