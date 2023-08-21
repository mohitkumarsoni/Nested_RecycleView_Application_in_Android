package com.example.nestedrecycleview.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nestedrecycleview.Child_Item;
import com.example.nestedrecycleview.Parent_Item;
import com.example.nestedrecycleview.R;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private Activity activity;
    ArrayList<Parent_Item> parentItemArrayList;
    ArrayList<Child_Item> childItemArrayList;

    public MyAdapter(Activity activity, ArrayList<Parent_Item> parentItemArrayList, ArrayList<Child_Item> childItemArrayList) {
        this.activity = activity;
        this.parentItemArrayList = parentItemArrayList;
        this.childItemArrayList = childItemArrayList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Parent_Item parentItem = parentItemArrayList.get(position);

        holder.orderId.setText(parentItem.getOrderId());
        holder.itemQty.setText(parentItem.getQuantity());
        holder.itemPrice.setText(parentItem.getPrice());
        holder.circleImageView.setImageResource(parentItem.getImageId());


        ChildAdapter childAdapter = new ChildAdapter(childItemArrayList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(activity);
        holder.nestedRv.setLayoutManager(linearLayoutManager);
        holder.nestedRv.setAdapter(childAdapter);


    }

    @Override
    public int getItemCount() {
        return parentItemArrayList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView orderId, itemQty, itemPrice;
        CircleImageView circleImageView;
        RecyclerView nestedRv;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            orderId = itemView.findViewById(R.id.tvOrderId);
            itemQty = itemView.findViewById(R.id.tvQtyParent);
            itemPrice = itemView.findViewById(R.id.tvPriceParent);
            circleImageView = itemView.findViewById(R.id.civ);
            nestedRv = itemView.findViewById(R.id.nested_rv);

        }
    }
}
