package com.example.shashank.iplanalyze;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner= (Spinner) findViewById(R.id.spinner);
        button= (Button) findViewById(R.id.button5);
        String [] items=getStrings();
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,items);
        spinner.setAdapter(arrayAdapter);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,ClickActivity.class);
                int i=spinner.getSelectedItemPosition();
                intent.putExtra("INDEX",i);
                startActivity(intent);
            }
        });
    }
 /* private void dumpedCode()
  {
      InputStream inputStream=this.getResources().openRawResource(R.raw.data);
      String s= null;
      try {
          s = getString(inputStream);
      } catch (IOException e) {
          e.printStackTrace();
      }
      Log.v("UNIQUECODE",s);
      try {
          JSONObject jsonObject=new JSONObject(s);
          JSONArray jsonArray=jsonObject.getJSONArray("check json");
          for (int i=0;i<jsonArray.length();i++)
          {
              Log.v("UNIQUECODE", String.valueOf(jsonArray.getInt(i)));
          }
      } catch (JSONException e) {
          e.printStackTrace();
      }
  }*/


    public String[] getStrings() {
        String [] strings=new String[]{"Chennai Super Kings","Deccan Chargers","Delhi Daredevils","Gujrat Lions","Kings XI Punjab"
        ,"Kochi Tuskers","Kolkata Knight Riders","Mumbai Indians","Pune Warriors","Rajasthan Royals","Rising Pune Supergiants"
        ,"Royal Challengers Bangalore","Sunrisers Hyderabad"};
        return strings;
    }
}
