/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

/**
 *
 * @author David
 */

 import javafx.application.Application;  
 import javafx.collections.FXCollections;  
 import javafx.collections.ObservableList;  
 import javafx.geometry.Side;  
 import javafx.scene.Group;  
 import javafx.scene.Scene;  
 import javafx.scene.chart.BarChart;  
 import javafx.scene.chart.CategoryAxis;  
 import javafx.scene.chart.NumberAxis;  
 import javafx.scene.chart.PieChart;  
 import javafx.scene.chart.XYChart;  
 import javafx.scene.control.Tab;  
 import javafx.scene.control.TabPane;  
 import javafx.scene.layout.BorderPane;  
 import javafx.stage.Stage;
              
 public class FXGraphsTabs extends Application{  
      /*  
       * Main method: calls launch method to launch FX GUI*/  

     /**  
      *
      * @param args
      */
  
      public  static void main(String args[]){  
           launch(args);  
      }  
      /*  
       * start method to show and initiate primary stage*/  
      @Override  
      public void start(Stage primaryStage) throws Exception {  
           init(primaryStage);  
           primaryStage.show();  
      }  
      /*  
       * init method to initialize the primary stage*/  
      private void init(Stage primaryStage) {  
           /* To Set the title of the stage */  
           primaryStage.setTitle("Graphs and Tabs");  
           /*  
            * Definition of new Group root to be set and displayed as scene*/  
           Group root = new Group();  
           primaryStage.setScene(new Scene(root));  
           /*  
            * Definition of BorderPane and TabPane*/  
           BorderPane borderPane = new BorderPane();  
           final TabPane tabPane = new TabPane();  
           /*To Set Preferred Dimensions*/  
           tabPane.setPrefSize(1366, 700);  
           tabPane.setSide(Side.TOP);  
           tabPane.setTabClosingPolicy(TabPane.TabClosingPolicy.UNAVAILABLE);  
           /*  
            * Definition of New Tab : PieTab*/  
           final Tab PieTab = new Tab();  
           setPieTab(PieTab);  
           /*  
            * Definition of New Tab : BarTab*/  
           final Tab BarTab = new Tab();  
           setBarTab(BarTab);  
           /*Addition of tabs to TabPane*/  
           tabPane.getTabs().addAll(PieTab,BarTab);  
           borderPane.setCenter(tabPane);  
           root.getChildren().add(borderPane);  
      }  
      /*  
       * Method to initialize BarTab*/  
      private void setBarTab(Tab barTab) {  
           String austria = "Austria";  
           String brazil = "Brazil";  
           String france = "France";  
           String italy = "Italy";  
           String usa = "USA";  
           final CategoryAxis xAxis = new CategoryAxis();  
           final NumberAxis yAxis = new NumberAxis();  
           final BarChart<String,Number> bc =   
                     new BarChart<String,Number>(xAxis,yAxis);  
           bc.setTitle("Bar Chart");  
           xAxis.setLabel("Country");      
           yAxis.setLabel("Statistics");  
           XYChart.Series series1 = new XYChart.Series();  
           series1.setName("2003");      
           series1.getData().add(new XYChart.Data(austria, 25601.34));  
           series1.getData().add(new XYChart.Data(brazil, 20148.82));  
           series1.getData().add(new XYChart.Data(france, 10000));  
           series1.getData().add(new XYChart.Data(italy, 35407.15));  
           series1.getData().add(new XYChart.Data(usa, 12000));     
           XYChart.Series series2 = new XYChart.Series();  
           series2.setName("2004");  
           series2.getData().add(new XYChart.Data(austria, 57401.85));  
           series2.getData().add(new XYChart.Data(brazil, 41941.19));  
           series2.getData().add(new XYChart.Data(france, 45263.37));  
           series2.getData().add(new XYChart.Data(italy, 117320.16));  
           series2.getData().add(new XYChart.Data(usa, 14845.27));   
           XYChart.Series series3 = new XYChart.Series();  
           series3.setName("2005");  
           series3.getData().add(new XYChart.Data(austria, 45000.65));  
           series3.getData().add(new XYChart.Data(brazil, 44835.76));  
           series3.getData().add(new XYChart.Data(france, 18722.18));  
           series3.getData().add(new XYChart.Data(italy, 17557.31));  
           series3.getData().add(new XYChart.Data(usa, 92633.68));   
           barTab.setText("Bar Chart Statistics");  
           bc.getData().addAll(series1,series2,series3);  
           barTab.setContent(bc);  
      }  
      /*  
       * Method to initialize PieTab*/  
      private void setPieTab(Tab pieTab) {  
           pieTab.setText("Pie Chart Statistics");  
           ObservableList<PieChart.Data> pieChartData =  
                     FXCollections.observableArrayList(  
                               new PieChart.Data("Female Members", 59),  
                               new PieChart.Data("Male Members", 95),  
                               new PieChart.Data("Female Non-Members", 2),  
                               new PieChart.Data("Male Non-Members", 7)); 
                             
           final PieChart chart = new PieChart(pieChartData);  
           chart.setTitle("Gender and Membership Status");  
           pieTab.setContent(chart);  
      }  
 }  

