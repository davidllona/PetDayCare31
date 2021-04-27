package com.example.petdaycare;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class Adapter extends ArrayAdapter<Animal> {
    public Adapter(@NonNull Context context, int resource, @NonNull ArrayList<Animal> words) {
        super(context, resource, words);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View lista_animal=convertView;
        if(lista_animal==null){
            lista_animal= LayoutInflater.from(getContext()).inflate(R.layout.item_list,parent,false);
        }
        Animal currentWord=getItem(position);
        TextView nombre=(TextView)lista_animal.findViewById(R.id.nombre);
        nombre.setText(currentWord.nombre);

        TextView raza=(TextView)lista_animal.findViewById(R.id.raza);
        raza.setText(currentWord.raza);
        return lista_animal;
    }
}
