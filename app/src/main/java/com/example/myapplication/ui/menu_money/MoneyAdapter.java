package com.example.myapplication.ui.menu_money;

import android.content.Context;
import android.graphics.Color;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;

import java.util.List;

public class MoneyAdapter extends RecyclerView.Adapter<MoneyAdapter.ViewHolder>{

    private final List<MoneyModel> moneyModels;
    private Context context;

    MoneyAdapter(Context context, List<MoneyModel> moneyModels) {
        this.moneyModels = moneyModels;
        this.context = context;
    }

    @Override
    public MoneyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_money, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        MoneyModel item = moneyModels.get(position);
        holder.name.setText(item.getName());
        holder.description.setText(item.getDescription());

        if (item.getIndex().equals("DOWN")) {
            holder.money.setTextColor(Color.RED);
        } else {
            holder.money.setTextColor(Color.GREEN);
        }
        holder.money.setText(item.getMoney());
    }

    @Override
    public int getItemCount() {
        return moneyModels.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        final TextView name, description, money;
        ViewHolder(View view){
            super(view);
            name = (TextView) view.findViewById(R.id.nameText);
            description = (TextView) view.findViewById(R.id.deccriptionText);
            money = (TextView) view.findViewById(R.id.moneyText);
        }
    }
}
