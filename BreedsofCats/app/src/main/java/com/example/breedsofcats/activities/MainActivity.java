package com.example.breedsofcats.activities;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.breedsofcats.fragments.FavouritesFragment;
import com.example.breedsofcats.R;
import com.example.breedsofcats.fragments.SearchRecyclerFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements FavouritesFragment.OnFragmentInteractionListener {

    BottomNavigationView bottomNavigationView;


    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fragment fragment = new SearchRecyclerFragment();
        swapFragment(fragment);

        bottomNavigationView = findViewById(R.id.nav_view);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                if (menuItem.getItemId() == R.id.nav_search){
                    Fragment fragment = new SearchRecyclerFragment();
                    swapFragment(fragment);
                    return true;
                } else if (menuItem.getItemId() == R.id.nav_favourites){
                    Fragment fragment = new FavouritesFragment();
                    Bundle bundle = new Bundle();
                    bundle.putString("param1", "First Argument");
                    bundle.putString("param2", "Second Argument");
                    fragment.setArguments(bundle);
                    swapFragment(fragment);
                    return true;
                }
                return false;
            }
        });


    }

    private void swapFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_slot, fragment);
        fragmentTransaction.commit();
    }

    @Override
    public void onFragmentInteraction(String string) {
        Toast.makeText(this, "Hello! I have come from the fragment. Message: " + string, Toast.LENGTH_SHORT).show();
    }

    public void showCoolMessage(String string) {
        Toast.makeText(this, "wow you are so " + string, Toast.LENGTH_SHORT).show();

    }
}
