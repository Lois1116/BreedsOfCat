package com.example.breedsofcats.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.breedsofcats.R;
import com.example.breedsofcats.model.Cat;
import com.example.breedsofcats.model.FakeDatabase;
import com.example.breedsofcats.model.SearchAdapter;
import com.google.gson.Gson;

import java.util.Arrays;
import java.util.List;

public class SearchRecyclerFragment extends Fragment {
    private RecyclerView recyclerView;
    private TextView SearchTextView;
    private ImageButton SearchButton;
    private List<Cat>catList;
    private FakeDatabase fakeDatabase;

    public SearchRecyclerFragment(){

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_search_page, container, false);
        recyclerView = view.findViewById(R.id.rv_main);
        SearchButton = view.findViewById(R.id.SearchButton);
        SearchTextView = view.findViewById(R.id.SearchTextView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(view.getContext());
        recyclerView.setLayoutManager(layoutManager);

        final SearchAdapter searchAdapter = new SearchAdapter();

        final RequestQueue requestQueue = Volley.newRequestQueue(getActivity());
        String url = "https://api.thecatapi.com/v1/breeds?api_key=3GTLP2bU41oGSc9LgAQOb6twKkO1eKiY";

        StringRequest stringRequest = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                System.out.println("Request sucessed");
                Gson gson = new Gson();
                Cat[] catsArray = gson.fromJson(response, Cat[].class);
                List<Cat> catList = Arrays.asList(catsArray);

                searchAdapter.setData(catList);
                recyclerView.setAdapter(searchAdapter);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                System.out.println("The Request Failed");
            }
        });

        requestQueue.add(stringRequest);
        return view;


    }
}
