package com.gdgbangla.scarycam.listviewandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String[] mobileArray = {"Android","IPhone","WindowsMobile","Blackberry","WebOS","Ubuntu","Windows7","Max OS X","WebOS","Ubuntu","Windows7","Max OS X"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initialize listview
        ListView listView=(ListView)findViewById(R.id.listView);
        //Array adapter object
        ArrayAdapter arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,mobileArray);
        //Bind listview into array adpter
        listView.setAdapter(arrayAdapter);

        //Clickable code
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String value=(String) parent.getItemAtPosition(position);
                Toast.makeText(getApplicationContext(),value+"",Toast.LENGTH_LONG).show();

            }
        });
    }
}
