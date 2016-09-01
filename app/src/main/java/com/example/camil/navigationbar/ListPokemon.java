package com.example.camil.navigationbar;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;
import android.view.View;

public class ListPokemon extends ListActivity {

    static final String[] POKEMON =
            new String[] { "Caterpie", "Chansey", "Charmander", "Kakuna",
                    "Marill", "Omanyte", "Pikachu", "Raichu", "Squirtle", "Blastoise", "Gloom", "Horsea",
                    "Mewtwo", "Paras"};

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setListAdapter(new PokemonArrayAdapter(this, POKEMON));

    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {

        //get selected items
        String selectedValue = (String) getListAdapter().getItem(position);
        Toast.makeText(this, selectedValue, Toast.LENGTH_SHORT).show();

    }

}