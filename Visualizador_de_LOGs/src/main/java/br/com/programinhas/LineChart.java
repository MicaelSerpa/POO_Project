package br.com.programinhas;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JFrame;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.block.BlockBorder;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class LineChart extends JFrame {

    public LineChart(double[] vetor1, double[] vetor2, double[] vetor3) {




    XYDataset dataset = createDataset(vetor1, vetor2, vetor3);
    
        JFreeChart chart = createChart(dataset);

        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        chartPanel.setBackground(Color.WHITE);
        add(chartPanel);

        pack();
        setTitle("Visualizador de LOGs");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private JFreeChart createChart(XYDataset dataset) {

        JFreeChart chart = ChartFactory.createXYLineChart(
                "Comem pão com salame",
                "Tempo (Segundos)",
                "Distância Percorrida (metros)",
                dataset,
                PlotOrientation.VERTICAL,
                true,
                true,
                false);

        XYPlot plot = chart.getXYPlot();

        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        renderer.setSeriesPaint(0, Color.RED);
        renderer.setSeriesStroke(0, new BasicStroke(2.0f));

        plot.setRenderer(renderer);
        plot.setBackgroundPaint(Color.WHITE);

        plot.setRangeGridlinesVisible(true);
        plot.setRangeGridlinePaint(Color.BLACK);

        plot.setDomainGridlinesVisible(true);
        plot.setDomainGridlinePaint(Color.BLACK);

        chart.getLegend().setFrame(BlockBorder.NONE);

        chart.setTitle(
            new TextTitle("Relação tempo x distância",
            new Font("Serif", java.awt.Font.BOLD, 18))
        );

        return chart;
    }

    private XYDataset createDataset(double[] vetor1_, double[] vetor2_, double[] vetor3_) {
        XYSeries serie1 = new XYSeries("Velocidade média");

    


for(int i = 0; i < 9; i++){

    serie1.add(vetor2_[i],vetor3_[i]);

    // serie1.add(1,2);
    // serie1.add(2,4);
    // serie1.add(4,8);
   //  serie1.add(8,16);

}

   
        

        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(serie1);

        return dataset;
    }

}
