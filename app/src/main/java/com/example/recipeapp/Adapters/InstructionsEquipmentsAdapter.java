package com.example.recipeapp.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recipeapp.Models.Equipment;
import com.example.recipeapp.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class InstructionsEquipmentsAdapter extends  RecyclerView.Adapter<InstructionEquipmentsViewHolder>{
    Context context;
    List<Equipment> list;

    public InstructionsEquipmentsAdapter(Context context, List<Equipment> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public InstructionEquipmentsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new InstructionEquipmentsViewHolder(LayoutInflater.from(context).inflate(R.layout.list_instructions_step_items, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull InstructionEquipmentsViewHolder holder, int position) {
        holder.textView_instructions_step_item.setText(list.get(position).name);
        holder.textView_instructions_step_item.setSelected(true);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
class InstructionEquipmentsViewHolder extends RecyclerView.ViewHolder{
    ImageView imageView_instructions_step_items;
    TextView textView_instructions_step_item;
    public InstructionEquipmentsViewHolder(@NonNull View itemView) {
        super(itemView);
        textView_instructions_step_item=itemView.findViewById(R.id.textView_instructions_step_item);
    }
}