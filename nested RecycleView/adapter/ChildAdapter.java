package com.example.nestedrecycleview.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nestedrecycleview.Child_Item;
import com.example.nestedrecycleview.R;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class ChildAdapter extends RecyclerView.Adapter<ChildAdapter.MyViewHolder> {

    ArrayList<Child_Item> childItemArrayList;

    public ChildAdapter(ArrayList<Child_Item> childItemArrayList) {
        this.childItemArrayList = childItemArrayList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.child_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Child_Item childItem = childItemArrayList.get(position);

        holder.tvPriceChild.setText(childItem.getItemPrice());
        holder.tvQtyChild.setText(childItem.getItemQty());
        holder.tvItemName.setText(childItem.getItemName());
        holder.circleImageView.setImageResource(childItem.getImageId());

    }

    @Override
    public int getItemCount() {
        return childItemArrayList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        CircleImageView circleImageView;
        TextView tvItemName, tvQtyChild, tvPriceChild;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            circleImageView = itemView.findViewById(R.id.civChild);
            tvItemName = itemView.findViewById(R.id.ivItemName);
            tvQtyChild = itemView.findViewById(R.id.tvQtyChild);
            tvPriceChild = itemView.findViewById(R.id.tvPriceChild);

        }
    }
}
