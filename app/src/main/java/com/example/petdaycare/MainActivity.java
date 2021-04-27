package com.example.petdaycare;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import com.example.petdaycare.Data.PetConcract.PetEntry;
import com.example.petdaycare.Data.PetDBHelper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ArrayList<Animal> animal=new ArrayList<Animal>();
        setContentView(R.layout.activity_main);
        Button btn = (Button) findViewById(R.id.boton);

       btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(), Animal_Nuevo.class);
                startActivity(i);


            }
        });



        PetDBHelper myDBHelper = new PetDBHelper(this);
        SQLiteDatabase db = myDBHelper.getReadableDatabase();






        ListView lista_animal=(ListView)findViewById(R.id.lista_animales);
        Animal uno=new Animal("Thor","Pitbull");
        animal.add(uno);
        Animal dos=new Animal("Rocco","Pitbull");
        animal.add(dos);
        Animal tres=new Animal("Lua","Bull Dog");
        animal.add(tres);
        Animal cuatro=new Animal("Nina","Labrador");
        animal.add(dos);
        Animal cinco=new Animal("Peter","Bull Dog");
        animal.add(cinco);
        Animal seis=new Animal("Estrella","Labrador");
        animal.add(seis);

        Adapter adaptadorLista=new Adapter(this,0,animal);
        lista_animal.setAdapter(adaptadorLista);
        lista_animal.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent i =new Intent(getApplicationContext(), Datos.class);
                startActivity(i);

            }
        });


    }
}