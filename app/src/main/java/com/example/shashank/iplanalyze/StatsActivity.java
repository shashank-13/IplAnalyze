package com.example.shashank.iplanalyze;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by shashank on 12/12/2016.
 */

public class StatsActivity extends AppCompatActivity {
    TextView textView1,textView2,textView3,textView4;
    ListView listView;
    TextView textView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getIntent().getExtras().getInt("POS") == 1) {
            setContentView(R.layout.top_stats);
            textView1 = (TextView) findViewById(R.id.textView6);
            textView2 = (TextView) findViewById(R.id.textView8);
            textView3 = (TextView) findViewById(R.id.textView11);
            textView4 = (TextView) findViewById(R.id.textView13);
            setStats(getIntent().getExtras().getInt("INDEX"));

        } else if (getIntent().getExtras().getInt("POS") == 2) {
            InputStream inputStream;
            String s=null;
            setContentView(R.layout.scroll_layout);
            listView = (ListView) findViewById(R.id.list_view);
            String [] listData=null;
            switch (getIntent().getExtras().getInt("INDEX")) {
                case 0:
                    inputStream=this.getResources().openRawResource(R.raw.cskktop_bats_strike_analyze);
                    s=null;
                    try {
                        s=getString(inputStream);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                   listData= setListView(R.raw.csktop_stats_batsman, "  runs");
                    break;
                case 1:
                    inputStream=this.getResources().openRawResource(R.raw.dctop_bats_strike_analyze);
                    s=null;
                    try {
                        s=getString(inputStream);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    listData=setListView(R.raw.dctop_stats_batsman, "  runs");
                    break;
                case 2:
                    inputStream=this.getResources().openRawResource(R.raw.ddtop_bats_strike_analyze);
                    s=null;
                    try {
                        s=getString(inputStream);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    listData= setListView(R.raw.ddtop_stats_batsman, "  runs");
                    break;
                case 3:
                    inputStream=this.getResources().openRawResource(R.raw.gltop_bats_strike_analyze);
                    s=null;
                    try {
                        s=getString(inputStream);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    listData= setListView(R.raw.gltop_stats_batsman, "  runs");
                    break;
                case 4:
                    inputStream=this.getResources().openRawResource(R.raw.kxiptop_bats_strike_analyze);
                    s=null;
                    try {
                        s=getString(inputStream);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    listData= setListView(R.raw.kxiptop_stats_batsman, "  runs");
                    break;
                case 5:
                    inputStream=this.getResources().openRawResource(R.raw.kttop_bats_strike_analyze);
                    s=null;
                    try {
                        s=getString(inputStream);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    listData= setListView(R.raw.kttop_stats_batsman, "  runs");
                    break;
                case 6:
                    inputStream=this.getResources().openRawResource(R.raw.kkrtop_bats_strike_analyze);
                    s=null;
                    try {
                        s=getString(inputStream);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    listData= setListView(R.raw.kkrtop_stats_batsman, "  runs");
                    break;
                case 7:
                    inputStream=this.getResources().openRawResource(R.raw.mitop_bats_strike_analyze);
                    s=null;
                    try {
                        s=getString(inputStream);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    listData= setListView(R.raw.mitop_stats_batsman, "  runs");
                    break;
                case 8:
                    inputStream=this.getResources().openRawResource(R.raw.pwtop_bats_strike_analyze);
                    s=null;
                    try {
                        s=getString(inputStream);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    listData= setListView(R.raw.pwtop_stats_batsman, "  runs");
                    break;
                case 9:
                    inputStream=this.getResources().openRawResource(R.raw.rrtop_bats_strike_analyze);
                    s=null;
                    try {
                        s=getString(inputStream);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    listData= setListView(R.raw.rrtop_stats_batsman, "  runs");
                    break;
                case 10:
                    inputStream=this.getResources().openRawResource(R.raw.rpstop_bats_strike_analyze);
                    s=null;
                    try {
                        s=getString(inputStream);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    listData= setListView(R.raw.rpstop_stats_batsman, "  runs");
                    break;
                case 11:
                    inputStream=this.getResources().openRawResource(R.raw.rcbtop_bats_strike_analyze);
                    s=null;
                    try {
                        s=getString(inputStream);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    listData= setListView(R.raw.rcbtop_stats_batsman, "  runs");
                    break;
                case 12:
                    inputStream=this.getResources().openRawResource(R.raw.srhtop_bats_strike_analyze);
                    s=null;
                    try {
                        s=getString(inputStream);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    listData=  setListView(R.raw.srhtop_stats_batsman, "  runs");
                    break;
            }

            final String finalS = s;
            final String[] finalListData = listData;
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, final int i, long l) {

                    AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                            StatsActivity.this);

                    // set title

                    alertDialogBuilder.setTitle("Detailed Analysis");

                    // set dialog message
                    alertDialogBuilder
                            .setMessage("Runs/StrikeRate")
                            .setCancelable(false)
                            .setPositiveButton("Runs Breakdown", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    int [] value=null;
                                    String [] labels=null;
                                    try {
                                        JSONArray jsonArray=new JSONArray(finalS);

                                        JSONObject jsonObject=jsonArray.getJSONObject(i);
                                        String key=finalListData[i];
                                        JSONArray temp = jsonObject.getJSONArray(finalListData[i]);
                                        value =new int[temp.length()];
                                        labels=new String[temp.length()];
                                        int k=1;
                                        for (int f=0;f<temp.length();f++)
                                        {
                                            value[f]=temp.getInt(f);
                                            labels[f]=String.valueOf(k)+"-"+String.valueOf(k+5);
                                            k+=6;
                                        }


                                    } catch (JSONException e) {
                                        e.printStackTrace();
                                    }
                                    Intent intent=new Intent(StatsActivity.this,SimpleXYPlotActivity.class);
                                    intent.putExtra("TYPE",1);
                                    intent.putExtra("KEY",labels);
                                    intent.putExtra("VALUE",value);
                                    intent.putExtra("XLABEL","Balls");
                                    intent.putExtra("PARA","Runs");
                                    intent.putExtra("TITLE",finalListData[i]);
                                    startActivity(intent);
                                }
                            })
                            .setNegativeButton("Strike Rate Breakdown", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    // if this button is clicked, just close
                                    // the dialog box and do nothing
                                    double [] value=null;
                                    String [] labels=null;
                                    try {
                                        JSONArray jsonArray=new JSONArray(finalS);

                                        JSONObject jsonObject=jsonArray.getJSONObject(i);
                                        String key=finalListData[i]+"_strike";
                                        JSONArray temp = jsonObject.getJSONArray(key);
                                        value =new double[temp.length()];
                                        labels=new String[temp.length()];
                                        int k=1;
                                        for (int f=0;f<temp.length();f++)
                                        {
                                            value[f]=temp.getInt(f);
                                            labels[f]=String.valueOf(k)+"-"+String.valueOf(k+5);
                                            k+=6;
                                        }


                                    } catch (JSONException e) {
                                        e.printStackTrace();
                                    }
                                    Intent intent=new Intent(StatsActivity.this,SimpleXYPlotActivity.class);
                                    intent.putExtra("TYPE",2);
                                    intent.putExtra("KEY",labels);
                                    intent.putExtra("VALUE",value);
                                    intent.putExtra("XLABEL","Balls");
                                    intent.putExtra("PARA","Strike Rates");
                                    intent.putExtra("TITLE",finalListData[i]);
                                    startActivity(intent);
                                }
                            });

                    // create alert dialog
                    AlertDialog alertDialog = alertDialogBuilder.create();

                    // show it
                    alertDialog.show();

                }
            });


        } else if (getIntent().getExtras().getInt("POS") == 3) {
            setContentView(R.layout.scroll_layout);
            listView = (ListView) findViewById(R.id.list_view);
            InputStream inputStream;
            String s=null;
            String[] listData=null;
            switch (getIntent().getExtras().getInt("INDEX")) {
                case 0:
                    inputStream=this.getResources().openRawResource(R.raw.csktop_bowlers_strike_analyze);
                    s=null;
                    try {
                        s=getString(inputStream);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                   listData= setListView(R.raw.csktop_stats_bowler, "  wickets");
                    break;
                case 1:
                    inputStream=this.getResources().openRawResource(R.raw.dctop_bowlers_strike_analyze);
                    s=null;
                    try {
                        s=getString(inputStream);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                   listData= setListView(R.raw.dctop_stats_bowler, "  wickets");
                    break;
                case 2:
                    inputStream=this.getResources().openRawResource(R.raw.ddtop_bowlers_strike_analyze);
                    s=null;
                    try {
                        s=getString(inputStream);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    listData=setListView(R.raw.ddtop_stats_bowler, "  wickets");
                    break;
                case 3:
                    inputStream=this.getResources().openRawResource(R.raw.gltop_bowlers_strike_analyze);
                    s=null;
                    try {
                        s=getString(inputStream);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                   listData= setListView(R.raw.gltop_stats_bowler, "  wickets");
                    break;
                case 4:
                    inputStream=this.getResources().openRawResource(R.raw.kxiptop_bowlers_strike_analyze);
                    s=null;
                    try {
                        s=getString(inputStream);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                   listData= setListView(R.raw.kxiptop_stats_bowler, "  wickets");
                    break;
                case 5:
                    inputStream=this.getResources().openRawResource(R.raw.kttop_bowlers_strike_analyze);
                    s=null;
                    try {
                        s=getString(inputStream);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                  listData=  setListView(R.raw.kttop_stats_bowler, "  wickets");
                    break;
                case 6:
                    inputStream=this.getResources().openRawResource(R.raw.kkrtop_bowlers_strike_analyze);
                    s=null;
                    try {
                        s=getString(inputStream);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                   listData= setListView(R.raw.kkrtop_stats_bowler, "  wickets");
                    break;
                case 7:
                    inputStream=this.getResources().openRawResource(R.raw.mitop_bowlers_strike_analyze);
                    s=null;
                    try {
                        s=getString(inputStream);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                   listData= setListView(R.raw.mitop_stats_bowler, "  wickets");
                    break;
                case 8:
                    inputStream=this.getResources().openRawResource(R.raw.pwtop_bowlers_strike_analyze);
                    s=null;
                    try {
                        s=getString(inputStream);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    listData=setListView(R.raw.pwtop_stats_bowler, "  wickets");
                    break;
                case 9:
                    inputStream=this.getResources().openRawResource(R.raw.rrtop_bowlers_strike_analyze);
                    s=null;
                    try {
                        s=getString(inputStream);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                   listData= setListView(R.raw.rrtop_stats_bowler, "  wickets");
                    break;
                case 10:
                    inputStream=this.getResources().openRawResource(R.raw.rpstop_bowlers_strike_analyze);
                    s=null;
                    try {
                        s=getString(inputStream);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                   listData= setListView(R.raw.rpstop_stats_bowler, "  wickets");
                    break;
                case 11:
                    inputStream=this.getResources().openRawResource(R.raw.rcbtop_bowlers_strike_analyze);
                    s=null;
                    try {
                        s=getString(inputStream);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                   listData= setListView(R.raw.rcbtop_stats_bowler, "  wickets");
                    break;
                case 12:
                    inputStream=this.getResources().openRawResource(R.raw.srhtop_bowlers_strike_analyze);
                    s=null;
                    try {
                        s=getString(inputStream);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                   listData= setListView(R.raw.srhtop_stats_bowler, "  wickets");
                    break;
            }

            final String finalS = s;
            final String[] finalListData = listData;
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    int [] value=null;
                    String [] labels=null;
                    try {
                        JSONArray jsonArray=new JSONArray(finalS);

                        JSONObject jsonObject=jsonArray.getJSONObject(i);
                        String key=finalListData[i];
                        JSONArray temp = jsonObject.getJSONArray(finalListData[i]);
                        value =new int[temp.length()+5];
                        labels=new String[temp.length()+5];
                        int counter=0;
                        for(int t=1;t<10;t+=2)
                        {
                            value[t]=0;
                            labels[t]="";
                        }
                        int k=1;

                        for (int f=0;f<temp.length();f++)
                        {
                            value[counter]=temp.getInt(f);

                            labels[counter]=String.valueOf(k)+"-"+String.valueOf(k+3);
                            counter+=2;
                            k+=4;
                        }


                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    Intent intent=new Intent(StatsActivity.this,SimpleXYPlotActivity.class);
                    intent.putExtra("TYPE",1);
                    intent.putExtra("KEY",labels);
                    intent.putExtra("VALUE",value);
                    intent.putExtra("XLABEL","Overs");
                    intent.putExtra("PARA","Wickets");
                    intent.putExtra("TITLE",finalListData[i]);
                    startActivity(intent);

                }
            });

        }

        else
        {
            setContentView(R.layout.scroll_layout);
            listView = (ListView) findViewById(R.id.list_view);
            switch (getIntent().getExtras().getInt("INDEX")) {
                case 0:
                    setListView(R.raw.csktop_stats_fielders, "  run-outs");
                    break;
                case 1:
                    setListView(R.raw.dctop_stats_fielders, "  run-outs");
                    break;
                case 2:
                    setListView(R.raw.ddtop_stats_fielders, "  run-outs");
                    break;
                case 3:
                    setListView(R.raw.gltop_stats_fielders, "  run-outs");
                    break;
                case 4:
                    setListView(R.raw.kxiptop_stats_fielders, "  run-outs");
                    break;
                case 5:
                    setListView(R.raw.kttop_stats_fielders, "  run-outs");
                    break;
                case 6:
                    setListView(R.raw.kkrtop_stats_fielders, "  run-outs");
                    break;
                case 7:
                    setListView(R.raw.mitop_stats_fielders, "  run-outs");
                    break;
                case 8:
                    setListView(R.raw.pwtop_stats_fielders, "  run-outs");
                    break;
                case 9:
                    setListView(R.raw.rrtop_stats_fielders, "  run-outs");
                    break;
                case 10:
                    setListView(R.raw.rpstop_stats_fielders, "  run-outs");
                    break;
                case 11:
                    setListView(R.raw.rcbtop_stats_fielders, "  run-outs");
                    break;
                case 12:
                    setListView(R.raw.srhtop_stats_fielders, "  run-outs");
                    break;
            }
        }
    }
    String[] setListView(int id,String var)
    {
        InputStream inputStream=this.getResources().openRawResource(id);
        String s=null;
        String [] items=null;
        String [] returnString=null;

        try {
            s=getString(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            JSONArray jsonArray=new JSONArray(s);
            items=new String[Math.min(10,jsonArray.length())];
            returnString=new String[Math.min(10,jsonArray.length())];
            for (int i=0;i<Math.min(10,jsonArray.length());i++) {
                JSONArray jsonArray1=jsonArray.getJSONArray(i);
                String temp="";
                for (int j=0;j<jsonArray1.length();j++)
                {
                    temp+=jsonArray1.getString(j);
                    if(j==0) {
                        returnString[i]=jsonArray1.getString(j);
                        temp += "     ";
                    }
                    else
                        temp+=var;
                }
                items[i]=temp;
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }


        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this,R.layout.text_list,items);
        listView.setAdapter(arrayAdapter);
 return returnString;
    }
    void setStats(int index)
    {
        switch (index)
        {
            case 0:
                InputStream inputStream=this.getResources().openRawResource(R.raw.csktop_stats);
                String s= null;
                try {
                    s = getString(inputStream);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    JSONObject jsonObject=new JSONObject(s);
                    int matches_won= jsonObject.getInt("Matches Won :");
                    int matches_lost= jsonObject.getInt("Matches Lost :");
                    int away_win= jsonObject.getInt("Away Win :");
                    int home_win= jsonObject.getInt("Home Win :");
                   int toss_win= jsonObject.getInt("Toss Win :");
                    int matches_played= jsonObject.getInt("Matches played :");
                    int conversion= jsonObject.getInt("Toss win Conversion :");
                   double home_percentage=(double) Math.round(((home_win/((matches_won-6)*1.0))*100)*100.0)/100.0 ;
                    double win_ratio= (double)Math.round((conversion/(toss_win*1.0)*100)*100.0)/100.0;
                    textView1.setText(String.valueOf(matches_won));
                    textView2.setText(String.valueOf(matches_lost));
                    textView3.setText(String.valueOf(home_percentage)+"\u0025");
                    textView4.setText(String.valueOf(win_ratio)+"\u0025");

                } catch (JSONException e) {
                    e.printStackTrace();
                }
                break;
          case 1:
                inputStream=this.getResources().openRawResource(R.raw.dctop_stats);
                 s= null;
                try {
                    s = getString(inputStream);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    JSONObject jsonObject=new JSONObject(s);
                    int matches_won= jsonObject.getInt("Matches Won :");
                    int matches_lost= jsonObject.getInt("Matches Lost :");
                    int away_win= jsonObject.getInt("Away Win :");
                    int home_win= jsonObject.getInt("Home Win :");
                   int toss_win= jsonObject.getInt("Toss Win :");
                    int matches_played= jsonObject.getInt("Matches played :");
                    int conversion= jsonObject.getInt("Toss win Conversion :");
                   double home_percentage=(double) Math.round(((home_win/((matches_won-6)*1.0))*100)*100.0)/100.0 ;
                    double win_ratio= (double)Math.round((conversion/(toss_win*1.0)*100)*100.0)/100.0;
                    textView1.setText(String.valueOf(matches_won));
                    textView2.setText(String.valueOf(matches_lost));
                    textView3.setText(String.valueOf(home_percentage)+"\u0025");
                    textView4.setText(String.valueOf(win_ratio)+"\u0025");

                } catch (JSONException e) {
                    e.printStackTrace();
                }
                break;
            case 2:
                inputStream=this.getResources().openRawResource(R.raw.ddtop_stats);
                 s= null;
                try {
                    s = getString(inputStream);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    JSONObject jsonObject=new JSONObject(s);
                    int matches_won= jsonObject.getInt("Matches Won :");
                    int matches_lost= jsonObject.getInt("Matches Lost :");
                    int away_win= jsonObject.getInt("Away Win :");
                    int home_win= jsonObject.getInt("Home Win :");
                   int toss_win= jsonObject.getInt("Toss Win :");
                    int matches_played= jsonObject.getInt("Matches played :");
                    int conversion= jsonObject.getInt("Toss win Conversion :");
                   double home_percentage=(double) Math.round(((home_win/((matches_won-6)*1.0))*100)*100.0)/100.0 ;
                    double win_ratio= (double)Math.round((conversion/(toss_win*1.0)*100)*100.0)/100.0;
                    textView1.setText(String.valueOf(matches_won));
                    textView2.setText(String.valueOf(matches_lost));
                    textView3.setText(String.valueOf(home_percentage)+"\u0025");
                    textView4.setText(String.valueOf(win_ratio)+"\u0025");

                } catch (JSONException e) {
                    e.printStackTrace();
                }
                break;
          case 3:
             inputStream=this.getResources().openRawResource(R.raw.gltop_stats);
               s= null;
              try {
                  s = getString(inputStream);
              } catch (IOException e) {
                  e.printStackTrace();
              }
              try {
                  JSONObject jsonObject=new JSONObject(s);
                  int matches_won= jsonObject.getInt("Matches Won :");
                  int matches_lost= jsonObject.getInt("Matches Lost :");
                  int away_win= jsonObject.getInt("Away Win :");
                  int home_win= jsonObject.getInt("Home Win :");
                  int toss_win= jsonObject.getInt("Toss Win :");
                  int matches_played= jsonObject.getInt("Matches played :");
                  int conversion= jsonObject.getInt("Toss win Conversion :");
                  double home_percentage=(double) Math.round(((home_win/((matches_won)*1.0))*100)*100.0)/100.0 ;
                  double win_ratio= (double)Math.round((conversion/(toss_win*1.0)*100)*100.0)/100.0;
                  textView1.setText(String.valueOf(matches_won));
                  textView2.setText(String.valueOf(matches_lost));
                  textView3.setText(String.valueOf(home_percentage)+"\u0025");
                  textView4.setText(String.valueOf(win_ratio)+"\u0025");

              } catch (JSONException e) {
                  e.printStackTrace();
              }
                break;
            case 4:
               inputStream=this.getResources().openRawResource(R.raw.kxiptop_stats);
               s= null;
                try {
                    s = getString(inputStream);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    JSONObject jsonObject=new JSONObject(s);
                    int matches_won= jsonObject.getInt("Matches Won :");
                    int matches_lost= jsonObject.getInt("Matches Lost :");
                    int away_win= jsonObject.getInt("Away Win :");
                    int home_win= jsonObject.getInt("Home Win :");
                   int toss_win= jsonObject.getInt("Toss Win :");
                    int matches_played= jsonObject.getInt("Matches played :");
                    int conversion= jsonObject.getInt("Toss win Conversion :");
                   double home_percentage=(double) Math.round(((home_win/((matches_won-6)*1.0))*100)*100.0)/100.0 ;
                    double win_ratio= (double)Math.round((conversion/(toss_win*1.0)*100)*100.0)/100.0;
                    textView1.setText(String.valueOf(matches_won));
                    textView2.setText(String.valueOf(matches_lost));
                    textView3.setText(String.valueOf(home_percentage)+"\u0025");
                    textView4.setText(String.valueOf(win_ratio)+"\u0025");

                } catch (JSONException e) {
                    e.printStackTrace();
                }
                break;
            case 5:
                 inputStream=this.getResources().openRawResource(R.raw.kttop_stats);
                 s= null;
                try {
                    s = getString(inputStream);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    JSONObject jsonObject=new JSONObject(s);
                    int matches_won= jsonObject.getInt("Matches Won :");
                    int matches_lost= jsonObject.getInt("Matches Lost :");
                    int away_win= jsonObject.getInt("Away Win :");
                    int home_win= jsonObject.getInt("Home Win :");
                    int toss_win= jsonObject.getInt("Toss Win :");
                    int matches_played= jsonObject.getInt("Matches played :");
                    int conversion= jsonObject.getInt("Toss win Conversion :");
                    double home_percentage=(double) Math.round(((home_win/((matches_won)*1.0))*100)*100.0)/100.0 ;
                    double win_ratio= (double)Math.round((conversion/(toss_win*1.0)*100)*100.0)/100.0;
                    textView1.setText(String.valueOf(matches_won));
                    textView2.setText(String.valueOf(matches_lost));
                    textView3.setText(String.valueOf(home_percentage)+"\u0025");
                    textView4.setText(String.valueOf(win_ratio)+"\u0025");

                } catch (JSONException e) {
                    e.printStackTrace();
                }
                break;
            case 6:
               inputStream=this.getResources().openRawResource(R.raw.kkrtop_stats);
               s= null;
                try {
                    s = getString(inputStream);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    JSONObject jsonObject=new JSONObject(s);
                    int matches_won= jsonObject.getInt("Matches Won :");
                    int matches_lost= jsonObject.getInt("Matches Lost :");
                    int away_win= jsonObject.getInt("Away Win :");
                    int home_win= jsonObject.getInt("Home Win :");
                   int toss_win= jsonObject.getInt("Toss Win :");
                    int matches_played= jsonObject.getInt("Matches played :");
                    int conversion= jsonObject.getInt("Toss win Conversion :");
                   double home_percentage=(double) Math.round(((home_win/((matches_won-6)*1.0))*100)*100.0)/100.0 ;
                    double win_ratio= (double)Math.round((conversion/(toss_win*1.0)*100)*100.0)/100.0;
                    textView1.setText(String.valueOf(matches_won));
                    textView2.setText(String.valueOf(matches_lost));
                    textView3.setText(String.valueOf(home_percentage)+"\u0025");
                    textView4.setText(String.valueOf(win_ratio)+"\u0025");

                } catch (JSONException e) {
                    e.printStackTrace();
                }
                break;
            case 7:
                inputStream=this.getResources().openRawResource(R.raw.mitop_stats);
                s= null;
                try {
                    s = getString(inputStream);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    JSONObject jsonObject=new JSONObject(s);
                    int matches_won= jsonObject.getInt("Matches Won :");
                    int matches_lost= jsonObject.getInt("Matches Lost :");
                    int away_win= jsonObject.getInt("Away Win :");
                    int home_win= jsonObject.getInt("Home Win :");
                   int toss_win= jsonObject.getInt("Toss Win :");
                    int matches_played= jsonObject.getInt("Matches played :");
                    int conversion= jsonObject.getInt("Toss win Conversion :");
                   double home_percentage=(double) Math.round(((home_win/((matches_won-6)*1.0))*100)*100.0)/100.0 ;
                    double win_ratio= (double)Math.round((conversion/(toss_win*1.0)*100)*100.0)/100.0;
                    textView1.setText(String.valueOf(matches_won));
                    textView2.setText(String.valueOf(matches_lost));
                    textView3.setText(String.valueOf(home_percentage)+"\u0025");
                    textView4.setText(String.valueOf(win_ratio)+"\u0025");

                } catch (JSONException e) {
                    e.printStackTrace();
                }
                break;
           case 8:
               inputStream=this.getResources().openRawResource(R.raw.pwtop_stats);
               s= null;
               try {
                   s = getString(inputStream);
               } catch (IOException e) {
                   e.printStackTrace();
               }
               try {
                   JSONObject jsonObject=new JSONObject(s);
                   int matches_won= jsonObject.getInt("Matches Won :");
                   int matches_lost= jsonObject.getInt("Matches Lost :");
                   int away_win= jsonObject.getInt("Away Win :");
                   int home_win= jsonObject.getInt("Home Win :");
                   int toss_win= jsonObject.getInt("Toss Win :");
                   int matches_played= jsonObject.getInt("Matches played :");
                   int conversion= jsonObject.getInt("Toss win Conversion :");
                   double home_percentage=(double) Math.round(((home_win/((matches_won)*1.0))*100)*100.0)/100.0 ;
                   double win_ratio= (double)Math.round((conversion/(toss_win*1.0)*100)*100.0)/100.0;
                   textView1.setText(String.valueOf(matches_won));
                   textView2.setText(String.valueOf(matches_lost));
                   textView3.setText(String.valueOf(home_percentage)+"\u0025");
                   textView4.setText(String.valueOf(win_ratio)+"\u0025");

               } catch (JSONException e) {
                   e.printStackTrace();
               }
                break;
            case 9:
                inputStream=this.getResources().openRawResource(R.raw.rrtop_stats);
                 s= null;
                try {
                    s = getString(inputStream);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    JSONObject jsonObject=new JSONObject(s);
                    int matches_won= jsonObject.getInt("Matches Won :");
                    int matches_lost= jsonObject.getInt("Matches Lost :");
                    int away_win= jsonObject.getInt("Away Win :");
                    int home_win= jsonObject.getInt("Home Win :");
                   int toss_win= jsonObject.getInt("Toss Win :");
                    int matches_played= jsonObject.getInt("Matches played :");
                    int conversion= jsonObject.getInt("Toss win Conversion :");
                   double home_percentage=(double) Math.round(((home_win/((matches_won-6)*1.0))*100)*100.0)/100.0 ;
                    double win_ratio= (double)Math.round((conversion/(toss_win*1.0)*100)*100.0)/100.0;
                    textView1.setText(String.valueOf(matches_won));
                    textView2.setText(String.valueOf(matches_lost));
                    textView3.setText(String.valueOf(home_percentage)+"\u0025");
                    textView4.setText(String.valueOf(win_ratio)+"\u0025");

                } catch (JSONException e) {
                    e.printStackTrace();
                }
                break;
           case 10:
                inputStream=this.getResources().openRawResource(R.raw.rpstop_stats);
                s= null;
               try {
                   s = getString(inputStream);
               } catch (IOException e) {
                   e.printStackTrace();
               }
               try {
                   JSONObject jsonObject=new JSONObject(s);
                   int matches_won= jsonObject.getInt("Matches Won :");
                   int matches_lost= jsonObject.getInt("Matches Lost :");
                   int away_win= jsonObject.getInt("Away Win :");
                   int home_win= jsonObject.getInt("Home Win :");
                   int toss_win= jsonObject.getInt("Toss Win :");
                   int matches_played= jsonObject.getInt("Matches played :");
                   int conversion= jsonObject.getInt("Toss win Conversion :");
                   double home_percentage=(double) Math.round(((home_win/((matches_won)*1.0))*100)*100.0)/100.0 ;
                   double win_ratio= (double)Math.round((conversion/(toss_win*1.0)*100)*100.0)/100.0;
                   textView1.setText(String.valueOf(matches_won));
                   textView2.setText(String.valueOf(matches_lost));
                   textView3.setText(String.valueOf(home_percentage)+"\u0025");
                   textView4.setText(String.valueOf(win_ratio)+"\u0025");

               } catch (JSONException e) {
                   e.printStackTrace();
               }
                break;
            case 11:
               inputStream=this.getResources().openRawResource(R.raw.rcbtop_stats);
                 s= null;
                try {
                    s = getString(inputStream);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    JSONObject jsonObject=new JSONObject(s);
                    int matches_won= jsonObject.getInt("Matches Won :");
                    int matches_lost= jsonObject.getInt("Matches Lost :");
                    int away_win= jsonObject.getInt("Away Win :");
                    int home_win= jsonObject.getInt("Home Win :");
                   int toss_win= jsonObject.getInt("Toss Win :");
                    int matches_played= jsonObject.getInt("Matches played :");
                    int conversion= jsonObject.getInt("Toss win Conversion :");
                   double home_percentage=(double) Math.round(((home_win/((matches_won-6)*1.0))*100)*100.0)/100.0 ;
                    double win_ratio= (double)Math.round((conversion/(toss_win*1.0)*100)*100.0)/100.0;
                    textView1.setText(String.valueOf(matches_won));
                    textView2.setText(String.valueOf(matches_lost));
                    textView3.setText(String.valueOf(home_percentage)+"\u0025");
                    textView4.setText(String.valueOf(win_ratio)+"\u0025");

                } catch (JSONException e) {
                    e.printStackTrace();
                }
                break;
            case 12:
                inputStream=this.getResources().openRawResource(R.raw.srhtop_stats);
                s= null;
                try {
                    s = getString(inputStream);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    JSONObject jsonObject=new JSONObject(s);
                    int matches_won= jsonObject.getInt("Matches Won :");
                    int matches_lost= jsonObject.getInt("Matches Lost :");
                    int away_win= jsonObject.getInt("Away Win :");
                    int home_win= jsonObject.getInt("Home Win :");
                    int toss_win= jsonObject.getInt("Toss Win :");
                    int matches_played= jsonObject.getInt("Matches played :");
                    int conversion= jsonObject.getInt("Toss win Conversion :");
                    double home_percentage=(double) Math.round(((home_win/((matches_won)*1.0))*100)*100.0)/100.0 ;
                    double win_ratio= (double)Math.round((conversion/(toss_win*1.0)*100)*100.0)/100.0;
                    textView1.setText(String.valueOf(matches_won));
                    textView2.setText(String.valueOf(matches_lost));
                    textView3.setText(String.valueOf(home_percentage)+"\u0025");
                    textView4.setText(String.valueOf(win_ratio)+"\u0025");

                } catch (JSONException e) {
                    e.printStackTrace();
                }
                break;
        }
    }
    private String getString(InputStream inputStream) throws IOException {
        ByteArrayOutputStream result = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int length;
        while ((length = inputStream.read(buffer)) != -1) {
            result.write(buffer, 0, length);
        }
        return result.toString("UTF-8");
    }
}
