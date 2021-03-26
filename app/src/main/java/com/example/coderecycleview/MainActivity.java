package com.example.coderecycleview;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.coderecycleview.Model.Cat;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private CartAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.rev);
        adapter=new CartAdapter(this);
        adapter.setData(getAll());
        GridLayoutManager manager=new GridLayoutManager(this,3);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(adapter);
    }

    private List<Cat> getAll(){
        List<Cat> list=new ArrayList<>();
        list.add(new Cat(R.drawable.cat1,"Cat1"));
        list.add(new Cat(R.drawable.cat1,"Cat1"));
        list.add(new Cat(R.drawable.cat1,"Cat1"));
        list.add(new Cat(R.drawable.cat1,"Cat1"));
        list.add(new Cat(R.drawable.cat1,"Cat1"));
        list.add(new Cat(R.drawable.cat1,"Cat1"));

        return list;
    }
}