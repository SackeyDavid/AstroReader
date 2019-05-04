/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import javafx.collections.ObservableList;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

/**
 *
 * @author David
 */
class ChartFactory {
//    private BarChart createBarChart(ChartData chartData) {
//    final CategoryAxis xAxis = new CategoryAxis();
//    final NumberAxis yAxis = new NumberAxis();
//
//    final BarChart<String, Number> bc =
//            new BarChart<String, Number>(xAxis, yAxis);
//
//    bc.setTitle("Chart Title");
//    xAxis.setLabel("XAxis Label Title");
//    yAxis.setLabel("YAxis Label Title");
//
//    // append Data
//    fillChartWithData(chartData, bc);
//
//    return bc;
//}
//
//    private void fillChartWithData(ChartData chartData, XYChart<String, Number> chart){
//    chartData.setBindings();
//
//    if (chartData.getSeriesSize() != 0)
//        fillChartWithDataSeriesNotEmpty(chartData, chart);
//    else
//        fillChartWithDataSeriesEmpty(chartData, chart);
//}
//
//// ChartSeries not empty, no PieChartData
//private void fillChartWithDataSeriesNotEmpty(ChartData chartData, XYChart<String, Number> chart) {
//    int count = 0;
//
//    for (String series : chartData.getSeries()) {
//        final int finalCount = count;
//
//        ObservableList<XYChart.Data<String, Number>> dataSet1 = EasyBind.map(chartData.getData(),
//                item -> new XYChart.Data<>(item.getName(), (Number) item.getValue(finalCount)));
//
//        XYChart.Series<String, Number> chartSeries = new XYChart.Series<>(series, dataSet1);
//
//        chart.getData().add(chartSeries);
//        count++;
//    }
//}
//
//// ChartSeries empty, PieChartData
//private void fillChartWithDataSeriesEmpty(ChartData chartData, XYChart<String, Number> chart) {
//   //for (Data data : chartData.getData()) {
//        ObservableList<XYChart.logEntry<String, Number>> dataSet1 = EasyBind.map(chartData.getlogEntry(),
//                item -> new XYChart.logEntry<>(item.getName(), (Number) item.getFirstValue()));
//
//        XYChart.Series<String, Number> chartSeries = new XYChart.Series<>(null, dataSet1);
//
//        chart.getData().add(chartSeries);
//   // }
//}
}
