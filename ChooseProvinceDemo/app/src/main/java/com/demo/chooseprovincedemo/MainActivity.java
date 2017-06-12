package com.demo.chooseprovincedemo;

import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.demo.chooseprovincedemo.adapter.MyAdapter;
import com.demo.chooseprovincedemo.list.AddressList;
import com.demo.chooseprovincedemo.model.person;
import com.demo.chooseprovincedemo.utils.SaveUtils;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rv_view;
    private RecyclerView.LayoutManager mLayoutManager;
    private MyAdapter mAdapter;
    private Button btGetList;

    private ArrayList<person> mProvinceList = new ArrayList<>();
    private ArrayList<person> mFirstList = new ArrayList<>();

    private String[] provinceName = new String[]{
            "山西", "内蒙古", "陕西", "天津", "山东", "河北", "河南", "新疆", "湖北", "湖南", "江苏",
            "宁夏", "四川", "安徽", "福建", "江西", "甘肃", "青海", "广东", "北京", "台湾", "香港",
            "澳门", "贵州", "云南", "西藏", "上海", "浙江", "辽宁", "吉林", "黑龙江", "广西", "海南", "重庆"
    };
    private Integer[] provinceId = new Integer[]{
            109000238, 109000380, 109003078, 109000022, 109001499, 109000043, 109001674, 109003404,
            109001868, 109001997, 109000887, 109003372, 109002520, 109001133, 109001273, 109001377,
            109003206, 109003319, 109002147, 109000001, 109003521, 109003522, 109003523, 109002741,
            109002842, 109002996, 109000865, 109001020, 109000502, 109000631, 109000709, 109002309,
            109002447, 109002476
    };

    public int i = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btGetList = (Button) findViewById(R.id.bt_get_list);

        mProvinceList = getList();

        Log.e("TAG","---------------"+ Build.VERSION.SDK_INT);
        Log.e("TAG","---------------"+ Build.VERSION_CODES.GINGERBREAD);

        if (Build.VERSION.SDK_INT >= 23){
            Log.e("TAG","当前手机系统在6.0以上");
        } else {
            Log.e("TAG","当前手机系统在6.0以下");
        }
        int m = Integer.MAX_VALUE;

        Log.e("TAG","-----------"+ m);


//        Log.e("TAG","----------mProvinceList---------"+mProvinceList.toString());
//
//        SaveUtils.saveObjectList(mProvinceList,"first");
//
//        btGetList.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                mFirstList = SaveUtils.readObjectList("first");
//                Log.e("TAG","----------mFirstList---------"+mFirstList.toString());
//            }
//        });

//        rv_view = (RecyclerView) findViewById(R.id.rv_view);
//        mLayoutManager = new LinearLayoutManager(this);
//        rv_view.setLayoutManager(mLayoutManager);
//
//        getList();
//
//        mAdapter = new MyAdapter(mProvinceList);
//        rv_view.setAdapter(mAdapter);
//
//        mAdapter.setOnItemClickListener(new MyAdapter.OnItemClickListener() {
//            @Override
//            public void onItemClick(View view, int position) {
//                Toast.makeText(MainActivity.this, mProvinceList.get(position).getName() +
//                        "---" + mProvinceList.get(position).getId(), Toast.LENGTH_SHORT).show();
//                int mProvinceId = mProvinceList.get(position).getId();
//                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
//                intent.putExtra("provinceId", mProvinceId);
//                startActivity(intent);
//            }
//        });
    }

    private ArrayList<person> getList() {
        for (int i = 0; i < provinceName.length; i++) {
            person mPerson = new person();
            mPerson.setId(provinceId[i]);
            mPerson.setName(provinceName[i]);
            mProvinceList.add(mPerson);
        }
        return mProvinceList;
    }
}
