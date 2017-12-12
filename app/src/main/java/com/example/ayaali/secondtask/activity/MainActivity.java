package com.example.ayaali.secondtask.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.ayaali.secondtask.R;
import com.example.ayaali.secondtask.adapter.AdapterList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private final String[] listOfText={"1","2","3","4","5","6","7","8"};
    private final int[] imagesIds={R.drawable.a1,R.drawable.a13,R.drawable.a14,R.drawable.a15,R.drawable.a16,R.drawable.a17,R.drawable.a18,R.drawable.a19};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AdapterList adapterList=new AdapterList(listOfText,imagesIds,this);
        ListView listView=(ListView)findViewById(R.id.list);
        listView.setAdapter(adapterList);
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(MainActivity.this,"clivked on"+listOfText[position],Toast.LENGTH_SHORT).show();
    }
}
