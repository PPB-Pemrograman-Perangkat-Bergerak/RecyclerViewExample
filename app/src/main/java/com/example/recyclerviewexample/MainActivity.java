package com.example.recyclerviewexample;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyListData[] myListData = new MyListData[] {
                new MyListData("15-May-2019", "Cake",300000),
                new MyListData("12-March-2019", "Chocolate",30000),
                new MyListData("12-September-2019", "Laptop", 13000000),
                new MyListData("15-September-2019","Motorcycle",17000000),
                new MyListData("11-January-2020", "Vacation",2000000),
                new MyListData("7-February-2020", "Uang Kuliah Tunggal",4000000),
                new MyListData("10-February-2020", "Museum",750000),
                new MyListData("12-February-2020", "Bucket",100000),
                new MyListData("15-February-2020", "Ice Cream",3000),
                new MyListData("18-February-2020", "RAM 12 Gb",700000),
                new MyListData("20-February-2020", "Fuel",50000),
                new MyListData("21-February-2020", "Junk Foods",300000),

        };

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        MyListAdapter adapter = new MyListAdapter(myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}
