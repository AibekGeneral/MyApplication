package com.example.myapplication.ui.menu_money;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.JSONObjectRequestListener;
import com.example.myapplication.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class Money extends AppCompatActivity {

    private RecyclerView recyclerView;
    ArrayList<MoneyModel> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.money);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        arrayList = new ArrayList<MoneyModel>();
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        setInitialData();

    }


    public void setInitialData() {
        AndroidNetworking.get("http://api.ernur.kz/main/currency")
                .build()
                .getAsJSONObject(new JSONObjectRequestListener() {
                    @Override
                    public void onResponse(JSONObject response) {
                        try {
                            JSONArray jsonArray = new JSONArray(response.getString("data"));

                            for (int i = 0; i < jsonArray.length(); i++) {
                                JSONObject jsonObject = jsonArray.getJSONObject(i);

                                MoneyModel moneyModel = new MoneyModel(
                                        jsonObject.getString("title"),
                                        jsonObject.getString("description"),
                                        jsonObject.getString("label"),
                                        jsonObject.getString("index"));

                                arrayList.add(moneyModel);
                            }
                            recyclerView.setAdapter(new MoneyAdapter(Money.this, arrayList));

                        } catch (JSONException e) {
                            e.printStackTrace();
                        }

                    }

                    @Override
                    public void onError(ANError error) {
                    }
                });
    }

}
