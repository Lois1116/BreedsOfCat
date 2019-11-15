package com.example.breedsofcats.model;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SearchView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.breedsofcats.R;
import com.example.breedsofcats.model.Cat;

import java.util.List;

public class SearchAdapter extends RecyclerView.Adapter<SearchAdapter.SearchViewHolder> {
    private List<Cat> catList;

    public void setData(List<Cat> catList) {this.catList = catList; }
    @NonNull
    @Override

    public SearchViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cat, parent, false);

        SearchViewHolder searchViewHolder = new SearchViewHolder(view);
        return searchViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull SearchViewHolder holder, int position) {
        final Cat catAtPosition = catList.get(position);
        holder.catNameTextView.setText(catAtPosition.getCatName());
    }

    @Override
    public int getItemCount() { return catList.size();}

    public class SearchViewHolder extends RecyclerView.ViewHolder {
        public View view;
        public TextView catNameTextView;
        public SearchViewHolder(View v) {
            super(v);
            view = v;
            catNameTextView = v.findViewById(R.id.catTextView);
        }
    }

}
