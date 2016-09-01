package com.example.camil.navigationbar;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class PokemonArrayAdapter extends ArrayAdapter<String> {
    private final Context context;
    private final String[] values;

    public PokemonArrayAdapter(Context context, String[] values) {
        super(context, R.layout.list_pokemon, values);
        this.context = context;
        this.values = values;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.list_pokemon, parent, false);
        TextView textView = (TextView) rowView.findViewById(R.id.label);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.logo);
        textView.setText(values[position]);

        // Change icon based on name
        String s = values[position];

        System.out.println(s);

        if (s.equals("Caterpie")) {
            imageView.setImageResource(R.drawable.bit_caterpie);
        } else if (s.equals("Chansey")) {
            imageView.setImageResource(R.drawable.bit_chansey);
        } else if (s.equals("Charmander")) {
            imageView.setImageResource(R.drawable.bit_charmander);
        } else if (s.equals("Kakuna")) {
            imageView.setImageResource(R.drawable.bit_kakuna);
        } else if (s.equals("Marill")) {
            imageView.setImageResource(R.drawable.bit_marill);
        } else if (s.equals("Omanyte")) {
            imageView.setImageResource(R.drawable.bit_omanyte);
        } else if (s.equals("Pikachu")) {
            imageView.setImageResource(R.drawable.bit_pikachu);
        } else if (s.equals("Raichu")) {
            imageView.setImageResource(R.drawable.bit_raichu);
        } else if (s.equals("Blastoise")) {
            imageView.setImageResource(R.drawable.bit_blastoise);
        } else if (s.equals("Gloom")) {
            imageView.setImageResource(R.drawable.bit_gloom);
        } else if (s.equals("Horsea")) {
            imageView.setImageResource(R.drawable.bit_horsea);
        } else if (s.equals("Mewtwo")) {
            imageView.setImageResource(R.drawable.bit_mewtwo);
        } else if (s.equals("Paras")) {
            imageView.setImageResource(R.drawable.bit_paras);
        } else {
            imageView.setImageResource(R.drawable.bit_squirtle);
        }

        return rowView;
    }
}
