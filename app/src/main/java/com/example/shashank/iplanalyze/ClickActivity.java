package com.example.shashank.iplanalyze;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by shashank on 12/12/2016.
 */

public class ClickActivity extends AppCompatActivity{
    private ImageView imageView;
    int index;
    Button top_Stats;
    Button top_bats,top_bowlers,top_fielders;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spinner_click);
        imageView= (ImageView) findViewById(R.id.imageView);
        top_Stats= (Button) findViewById(R.id.button2);
        top_bats= (Button) findViewById(R.id.button3);
        top_bowlers= (Button) findViewById(R.id.button);
        top_fielders= (Button) findViewById(R.id.button4);
        top_fielders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ClickActivity.this,StatsActivity.class);
                intent.putExtra("POS",4);
                intent.putExtra("INDEX",index);
                startActivity(intent);
            }
        });
        top_bowlers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ClickActivity.this,StatsActivity.class);
                intent.putExtra("POS",3);
                intent.putExtra("INDEX",index);
                startActivity(intent);
            }
        });
        top_bats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ClickActivity.this,StatsActivity.class);
                intent.putExtra("POS",2);
                intent.putExtra("INDEX",index);
                startActivity(intent);
            }
        });
        top_Stats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent intent=new Intent(ClickActivity.this,StatsActivity.class);
                intent.putExtra("POS",1);
                intent.putExtra("INDEX",index);
                startActivity(intent);
            }
        });
       index=getIntent().getExtras().getInt("INDEX");
        setImage(index);
    }

    private void setImage(int index) {
        switch (index)
        {
            case 0:
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.chennai_super_kings_logo, getApplicationContext().getTheme()));
                } else {
                   imageView.setImageDrawable(getResources().getDrawable(R.drawable.chennai_super_kings_logo));
                }
                break;
            case 1:
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.hyderabaddeccanchargers, getApplicationContext().getTheme()));
                } else {
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.hyderabaddeccanchargers));
                }
                break;
            case 2:
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.delhidaredevils, getApplicationContext().getTheme()));
                } else {
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.delhi_daredevils));
                }
                break;
            case 3:
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.gujarat_lions, getApplicationContext().getTheme()));
                } else {
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.gujarat_lions));
                }
                break;
            case 4:
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.kings_xi_punjab_logo, getApplicationContext().getTheme()));
                } else {
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.kings_xi_punjab_logo));
                }
                break;
            case 5:
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.kochi_tuskers_kerala_logo, getApplicationContext().getTheme()));
                } else {
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.kochi_tuskers_kerala_logo));
                }
                break;
            case 6:
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.kolkata_knight_riders_logo, getApplicationContext().getTheme()));
                } else {
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.kolkata_knight_riders_logo));
                }
                break;
            case 7:
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.mumbai_indians_logo, getApplicationContext().getTheme()));
                } else {
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.mumbai_indians_logo));
                }
                break;
            case 8:
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.pune_warriors_india_ipl_logo, getApplicationContext().getTheme()));
                } else {
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.pune_warriors_india_ipl_logo));
                }
                break;
            case 9:
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.rajasthan_royals_logo, getApplicationContext().getTheme()));
                } else {
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.rajasthan_royals_logo));
                }
                break;
            case 10:
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.risingpunesupergiantslogo, getApplicationContext().getTheme()));
                } else {
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.risingpunesupergiantslogo));
                }
                break;
            case 11:
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.royal_challengers_bangalore_logo_2016, getApplicationContext().getTheme()));
                } else {
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.royal_challengers_bangalore_logo_2016));
                }
                break;
            case 12:
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.sunrisers_hyderabad_logo, getApplicationContext().getTheme()));
                } else {
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.sunrisers_hyderabad_logo));
                }
                break;
        }
    }


}
