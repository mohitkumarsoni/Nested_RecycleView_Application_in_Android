package com.example.nestedrecycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.nestedrecycleview.adapter.ChildAdapter;
import com.example.nestedrecycleview.adapter.MyAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    MyAdapter myAdapter;
    ArrayList<Parent_Item> parentItemArrayList;
    ArrayList<Child_Item> childItemArrayList;
    RecyclerView rvParent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvParent = findViewById(R.id.rv);

        String[] orderId = {"S68RT6HB","E6S8TH4S","T68S4T4S2F","4SER684G5T4","68B4FB8FB","S1B68T4GS","S4B6S84BS65F"};
        String[] itemName = {"Burger","manchurian","sandwich","pizza","cake","noodles","thali"};
        int[] imageId = {R.drawable.burger1,R.drawable.manchurian1,R.drawable.sandwich1,R.drawable.pizza1,R.drawable.cake1,R.drawable.noodles1,R.drawable.thali1};

        parentItemArrayList = new ArrayList<>();
        childItemArrayList = new ArrayList<>();

        for (int i=0; i<orderId.length; i++){
            Parent_Item parentItem = new Parent_Item(orderId[i],String.valueOf(i+14),String.valueOf(i*43),imageId[i] );
            parentItemArrayList.add(parentItem);

            if (i<itemName.length){
                Child_Item childItem = new Child_Item(itemName[i] , String.valueOf(i+5),String.valueOf(i*15),imageId[i] );
                childItemArrayList.add(childItem);

            }

        }

        myAdapter = new MyAdapter(this, parentItemArrayList, childItemArrayList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rvParent.setLayoutManager(linearLayoutManager);
        rvParent.setAdapter(myAdapter);

    }
}