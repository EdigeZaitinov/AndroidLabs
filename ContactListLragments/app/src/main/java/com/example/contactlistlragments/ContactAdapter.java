package com.example.contactlistlragments;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ViewHolder> {

    private ArrayList<Contact>contacts;

    itemClicked activity;

    public interface itemClicked{
        void onItemClicked(int index);
    }

   public ContactAdapter(Context context,ArrayList<Contact>contacts){
        this.contacts=contacts;
        activity=(itemClicked) context;
    }

    public ContactAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.row,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactAdapter.ViewHolder holder, int position) {
        holder.tvName.setText(contacts.get(position).getName());
        holder.tvSurname.setText(contacts.get(position).getSurname());
        holder.itemView.setTag(contacts.get(position));
    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        TextView tvName,tvSurname;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName=itemView.findViewById(R.id.tvNameRow);
            tvSurname=itemView.findViewById(R.id.tvSurnameRow);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    activity.onItemClicked(contacts.indexOf((Contact) view.getTag()));
                }
            });
        }
    }
}
