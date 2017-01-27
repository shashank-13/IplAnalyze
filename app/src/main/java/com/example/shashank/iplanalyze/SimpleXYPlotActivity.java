package com.example.shashank.iplanalyze;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;

import com.androidplot.xy.BarFormatter;
import com.androidplot.xy.BoundaryMode;
import com.androidplot.xy.CatmullRomInterpolator;
import com.androidplot.xy.LineAndPointFormatter;
import com.androidplot.xy.SimpleXYSeries;
import com.androidplot.xy.XYGraphWidget;
import com.androidplot.xy.XYPlot;
import com.androidplot.xy.XYSeries;

import java.text.FieldPosition;
import java.text.Format;
import java.text.ParsePosition;
import java.util.Arrays;

/**
 * Created by shashank on 12/13/2016.
 */

public class SimpleXYPlotActivity extends Activity {
    private XYPlot plot;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        Log.v("ACTIVITYENETERED", "REACHED");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simple_xy_plot_example);

        // initialize our XYPlot reference:
        plot = (XYPlot) findViewById(R.id.plot);

        // create a couple arrays of y-values to plot:
        int choose = getIntent().getExtras().getInt("TYPE");
        if (choose == 1) {
            final String[] domainLabels = getIntent().getExtras().getStringArray("KEY");
            int[] temp = getIntent().getExtras().getIntArray("VALUE");
            String var = getIntent().getExtras().getString("PARA");
            String title = getIntent().getExtras().getString("TITLE");
            String xlabel = getIntent().getExtras().getString("XLABEL");
            plot.setTitle(title);
            plot.setDomainLabel(xlabel);
            plot.setLinesPerDomainLabel(10);
            plot.setRangeLowerBoundary(0, BoundaryMode.FIXED);
            Number[] series1Numbers = new Number[temp.length];
            for (int i = 0; i < temp.length; i++) {
                series1Numbers[i] = temp[i];

            }


            XYSeries series1 = new SimpleXYSeries(
                    Arrays.asList(series1Numbers), SimpleXYSeries.ArrayFormat.Y_VALS_ONLY, var);


            BarFormatter bf = new BarFormatter(Color.RED, Color.WHITE);
            bf.setInterpolationParams(
                    new CatmullRomInterpolator.Params(10, CatmullRomInterpolator.Type.Centripetal));
            plot.addSeries(series1, bf);


            plot.getGraph().getLineLabelStyle(XYGraphWidget.Edge.BOTTOM).setFormat(new Format() {
                @Override
                public StringBuffer format(Object obj, StringBuffer toAppendTo, FieldPosition pos) {
                    int i = Math.round(((Number) obj).floatValue());
                    return toAppendTo.append(domainLabels[i]);
                }

                @Override
                public Object parseObject(String source, ParsePosition pos) {
                    return null;
                }
            });
        }

        else
        {
            final String[] domainLabels = getIntent().getExtras().getStringArray("KEY");
            double[] temp = getIntent().getExtras().getDoubleArray("VALUE");
            String var = getIntent().getExtras().getString("PARA");
            String title = getIntent().getExtras().getString("TITLE");
            String xlabel = getIntent().getExtras().getString("XLABEL");
            plot.setTitle(title);
            plot.setDomainLabel(xlabel);
            plot.setLinesPerDomainLabel(10);
            Number[] series1Numbers = new Number[temp.length];
            for (int i = 0; i < temp.length; i++) {
                series1Numbers[i] = temp[i];

            }


            XYSeries series1 = new SimpleXYSeries(
                    Arrays.asList(series1Numbers), SimpleXYSeries.ArrayFormat.Y_VALS_ONLY, var);


            LineAndPointFormatter series1Format =
                    new LineAndPointFormatter(this, R.xml.line_point_formatter_with_labels);
            plot.addSeries(series1, series1Format);
            plot.getGraph().getLineLabelStyle(XYGraphWidget.Edge.BOTTOM).setFormat(new Format() {
                @Override
                public StringBuffer format(Object obj, StringBuffer toAppendTo, FieldPosition pos) {
                    int i = Math.round(((Number) obj).floatValue());
                    return toAppendTo.append(domainLabels[i]);
                }

                @Override
                public Object parseObject(String source, ParsePosition pos) {
                    return null;
                }
            });
        }
    }
}
