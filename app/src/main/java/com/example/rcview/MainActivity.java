package com.example.rcview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.example.rcview.adapter.Videoadapter;
import com.example.rcview.model.ModelVideo;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private Videoadapter adapter;
    private Api api;
    ArrayList datalist = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_video);
        adapter = new Videoadapter();
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        api = RetrofitClient.getInstance().getMyApi();

        fetchData();
    }

    private void fetchData() {
        //   Call<List<ModelVideo>> call = api.getvideolist();
      //  Call<List<ModelVideo>> call = RetrofitClient.getInstance().getMyApi().getvideolist();
        Call<JsonObject> objectCall = RetrofitClient.getInstance().getMyApi().getvideolist();
        objectCall.enqueue(new Callback<JsonObject>() {
            @Override
            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
                Log.e("datavalue",response.body().toString());
               // datalist.add(response.body().getAsJsonArray("results"));
                for (JsonElement object : response.body().getAsJsonArray("results")){
                    datalist.add(object.getAsJsonObject());
                }
                Log.d("size", datalist.size() + "");
            }

            @Override
            public void onFailure(Call<JsonObject> call, Throwable t) {
                Log.e("erro", t.toString());
            }
        });
//        call.enqueue(new Callback<List<ModelVideo>>() {
//            @Override
//            public void onResponse(Call<List<ModelVideo>> call, Response<List<ModelVideo>> response) {
//                if (response.isSuccessful()) {
//                    List<ModelVideo> data = response.body();
//                    adapter.setData(data);
//                       Log.d("check", String.valueOf(response.body()));
//
//                }
//            }
//
//            @Override
//            public void onFailure(Call<List<ModelVideo>> call, Throwable t) {
//                Log.e("fail",t.getMessage());
//
//            }
//        });
    }
}
