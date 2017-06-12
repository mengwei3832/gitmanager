package com.demo.chooseprovincedemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.demo.chooseprovincedemo.adapter.MyAdapter;
import com.demo.chooseprovincedemo.list.AddressList;
import com.demo.chooseprovincedemo.model.person;

import java.util.ArrayList;
import java.util.List;

public class Main3Activity extends AppCompatActivity {
    private RecyclerView rv_view;
    private RecyclerView.LayoutManager mLayoutManager;
    private MyAdapter mAdapter;

    private List<person> mProvinceList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        rv_view = (RecyclerView) findViewById(R.id.rv_view3);
        mLayoutManager = new LinearLayoutManager(this);
        rv_view.setLayoutManager(mLayoutManager);

        int mCityId = getIntent().getIntExtra("cityId",0);
        mProvinceList = AddressList.getCountryList(mCityId);

        mAdapter = new MyAdapter(mProvinceList);
        rv_view.setAdapter(mAdapter);

        mAdapter.setOnItemClickListener(new MyAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Toast.makeText(Main3Activity.this, mProvinceList.get(position).getName() +
                        "---" + mProvinceList.get(position).getId(), Toast.LENGTH_SHORT).show();
                int mCityId = mProvinceList.get(position).getId();
//                Intent intent = new Intent(Main3Activity.this, Main3Activity.class);
//                intent.putExtra("provinceId", mCityId);
//                startActivity(intent);
            }
        });
    }
}
