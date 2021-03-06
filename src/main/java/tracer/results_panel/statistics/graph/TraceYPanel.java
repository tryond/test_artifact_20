//package results_panel.statistics.graph;
//
//import org.jfree.chart.ChartFactory;
//import org.jfree.chart.ChartPanel;
//import org.jfree.chart.JFreeChart;
//import org.jfree.chart.plot.PlotOrientation;
//import org.jfree.chart.plot.XYPlot;
//import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
//import org.jfree.chart.renderer.xy.XYSplineRenderer;
//import org.jfree.data.xy.XYDataset;
//import org.jfree.data.xy.XYSeries;
//import org.jfree.data.xy.XYSeriesCollection;
//import sequenced_tracer_panel.tracer_panel.Trace;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.geom.Ellipse2D;
//import java.util.ArrayList;
//
//import org.apache.commons.math3.stat.StatUtils;
//
//public class TraceYPanel extends JPanel {
//
//    private ArrayList<Trace>[] traceArr;
//
//    private Color[] colorList = new Color[]{
//            new Color(65, 148, 182),
//            new Color(166, 183, 118),
//            new Color(230, 201, 94),
//            new Color(26, 60, 84),
//            new Color(176, 58, 42),
//            new Color(225, 115, 55)
//    };
//
//
//    public TraceYPanel(ArrayList<Trace>[] traceArr)
//    {
//        super(new BorderLayout());
//
//        this.traceArr = traceArr;
//
//        JFreeChart xylineChart = ChartFactory.createXYLineChart(
//                null ,
//                "t" ,
//                "y" ,
//                createDataset() ,
//                PlotOrientation.VERTICAL ,
//                false , false , false);
//
//        ChartPanel chartPanel = new ChartPanel(xylineChart);
//
//        final XYPlot plot = xylineChart.getXYPlot( );
//
//        plot.setRenderer(createRenderer());
//
//        plot.setBackgroundPaint(Color.white);
//
//        org.jfree.chart.axis.NumberAxis rangeAxis = new org.jfree.chart.axis.NumberAxis("Y Position vs. Time");
////        rangeAxis.setRange(0.0, 10.0);
//        plot.setRangeAxis(rangeAxis);
//
//        this.add(chartPanel, BorderLayout.CENTER);
//    }
//
//    private XYDataset createDataset()
//    {
//        final XYSeriesCollection dataset = new XYSeriesCollection();
//
//        for (int r = 0; r < traceArr.length; ++r) {
//
//            XYSeries series = new XYSeries("Trace " + r);
//
//            Trace testTrace = traceArr[r].get(0);
//
//            // *****************
//
//
//            ArrayList<Point> pointList = testTrace.points;
//
//            double[] y_array = new double[pointList.size()];
//
//            for (int i = 0; i < pointList.size(); ++i) {
//                y_array[i] = (double) pointList.get(i).y;
//            }
//
//            double[] ny_array = StatUtils.normalize(y_array);
//
//            for (int i = 0; i < testTrace.points.size(); ++i) {
//
//                series.add(i, ny_array[i]);
//            }
//
//            // *****************
//
//
//
//            dataset.addSeries(series);
//        }
//
//        return dataset;
//    }
//
//    private XYLineAndShapeRenderer createRenderer()
//    {
//        XYSplineRenderer renderer = new XYSplineRenderer();
//
//        for (int r = 0; r < traceArr.length; ++r)
//        {
//            renderer.setSeriesPaint(r, colorList[r]);
//            renderer.setSeriesShape(r, new Ellipse2D.Double(-1, -1, 2, 2));
//        }
//
//        renderer.setPrecision(10);
//
//        return renderer;
//    }
//
//
//
//
//
//
//
//
//}
