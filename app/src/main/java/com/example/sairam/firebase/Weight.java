package com.example.sairam.firebase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class Weight extends AppCompatActivity {

    BarChart chart ;
    ArrayList<BarEntry> BARENTRY ;
    ArrayList<String> BarEntryLabels ;
    BarDataSet Bardataset ;
    BarData BARDATA ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight);
        chart = (BarChart) findViewById(R.id.chart1);

        BARENTRY = new ArrayList<>();
        BarEntryLabels = new ArrayList<String>();
        AddValuesToBARENTRY();
        AddValuesToBarEntryLabels();
        Bardataset = new BarDataSet(BARENTRY, "Projects");
        BARDATA = new BarData(BarEntryLabels, Bardataset);
        Bardataset.setColors(ColorTemplate.COLORFUL_COLORS);
        chart.setData(BARDATA);
        chart.animateY(3000);
    }
    public void AddValuesToBARENTRY(){

        BARENTRY.add(new BarEntry(2f, 0));
        BARENTRY.add(new BarEntry(4f, 1));
        BARENTRY.add(new BarEntry(6f, 2));
        BARENTRY.add(new BarEntry(8f, 3));
        BARENTRY.add(new BarEntry(7f, 4));
        BARENTRY.add(new BarEntry(3f, 5));

    }

    public void AddValuesToBarEntryLabels(){

        BarEntryLabels.add("January");
        BarEntryLabels.add("February");
        BarEntryLabels.add("March");
        BarEntryLabels.add("April");
        BarEntryLabels.add("May");
        BarEntryLabels.add("June");

    }

    /*PieChart pieChart ;
    ArrayList<Entry> entries ;
    ArrayList<String> PieEntryLabels ;
    PieDataSet pieDataSet ;
    PieData pieData ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pieChart = (PieChart) findViewById(R.id.chart1);

        entries = new ArrayList<>();

        PieEntryLabels = new ArrayList<String>();

        AddValuesToPIEENTRY();

        AddValuesToPieEntryLabels();

        pieDataSet = new PieDataSet(entries, "");

        pieData = new PieData(PieEntryLabels, pieDataSet);

        pieDataSet.setColors(ColorTemplate.COLORFUL_COLORS);

        pieChart.setData(pieData);

        pieChart.animateY(3000);

    }

    public void AddValuesToPIEENTRY(){

        entries.add(new BarEntry(2f, 0));
        entries.add(new BarEntry(4f, 1));
        entries.add(new BarEntry(6f, 2));
        entries.add(new BarEntry(8f, 3));
        entries.add(new BarEntry(7f, 4));
        entries.add(new BarEntry(3f, 5));

    }

    public void AddValuesToPieEntryLabels(){

        PieEntryLabels.add("January");
        PieEntryLabels.add("February");
        PieEntryLabels.add("March");
        PieEntryLabels.add("April");
        PieEntryLabels.add("May");
        PieEntryLabels.add("June");

    }*/
}

