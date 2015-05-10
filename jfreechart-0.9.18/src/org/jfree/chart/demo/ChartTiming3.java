/* ===========================================================
 * JFreeChart : a free chart library for the Java(tm) platform
 * ===========================================================
 *
 * (C) Copyright 2000-2004, by Object Refinery Limited and Contributors.
 *
 * Project Info:  http://www.jfree.org/jfreechart/index.html
 *
 * This library is free software; you can redistribute it and/or modify it under the terms
 * of the GNU Lesser General Public License as published by the Free Software Foundation;
 * either version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License along with this
 * library; if not, write to the Free Software Foundation, Inc., 59 Temple Place, Suite 330,
 * Boston, MA 02111-1307, USA.
 *
 * [Java is a trademark or registered trademark of Sun Microsystems, Inc. 
 * in the United States and other countries.]
 *
 * -----------------
 * ChartTiming3.java
 * -----------------
 * (C) Copyright 2002-2004, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * $Id: ChartTiming3.java,v 1.13 2004/03/05 12:15:10 mungady Exp $
 *
 * Changes
 * -------
 * 29-Oct-2002 : Version 1 (DG);
 *
 */

package org.jfree.chart.demo;

import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;

import javax.swing.Timer;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.XYDotRenderer;
import org.jfree.data.XYDataset;
import org.jfree.data.XYSeries;
import org.jfree.data.XYSeriesCollection;

/**
 * Draws a scatter plot over and over for 10 seconds.  Reports on how many redraws were achieved.
 * <p>
 * On my PC (SuSE Linux 8.2, JDK 1.4, 256mb RAM, 2.66ghz Pentium) I get 13-14 charts per second.
 *
 * @author David Gilbert
 */
public class ChartTiming3 implements ActionListener {

    /** A flag that indicates when time is up. */
    private boolean finished;

    /**
     * Creates a new application.
     */
    public ChartTiming3() {
        // nothing to do
    }

    /**
     * Runs the test.
     */
    public void run() {

        this.finished = false;

        // create a dataset...
        XYSeries series = new XYSeries("Random Data");
        for (int i = 0; i < 1440; i++) {
            double x = Math.random();
            double y = Math.random();
            series.add(x, y);
        }
        XYDataset data = new XYSeriesCollection(series);

        // create a scatter chart...
        boolean withLegend = true;
        JFreeChart chart = ChartFactory.createScatterPlot(
            "Scatter plot timing", "X", "Y",
            data, 
            PlotOrientation.VERTICAL,
            withLegend, 
            false, 
            false
        );

        XYPlot plot = chart.getXYPlot();
        plot.setRenderer(new XYDotRenderer());

        BufferedImage image = new BufferedImage(400, 300, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 = image.createGraphics();
        Rectangle2D chartArea = new Rectangle2D.Double(0, 0, 400, 300);

        // set up the timer...
        Timer timer = new Timer(10000, this);
        timer.setRepeats(false);
        int count = 0;
        timer.start();
        while (!this.finished) {
            chart.draw(g2, chartArea, null, null);
            System.out.println("Charts drawn..." + count);
            if (!this.finished) {
                count++;
            }
        }
        System.out.println("DONE");

    }

    /**
     * Receives notification of action events (in this case, from the Timer).
     *
     * @param event  the event.
     */
    public void actionPerformed(ActionEvent event) {
        this.finished = true;
    }

    /**
     * Starting point for the application.
     *
     * @param args  ignored.
     */
    public static void main(String[] args) {

        ChartTiming3 app = new ChartTiming3();
        app.run();

    }

}
