package mx.edu.isc.tesoem.arnold0824.micontrolspinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    String[]strEstados;
    List <String> listEstados;
    ArrayAdapter <String>Adaptador;
    Spinner ContenedorEStados;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ContenedorEStados= findViewById(R.id.spinnerEstados);
        strEstados= new String[]{"Baja California Sur", "Baja California Norte", "Aguas Calientes", "Durango","Chiapas", "Oaxaca"};
        listEstados = new ArrayList<String>();
        Collections.addAll(listEstados,strEstados);
        Adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,listEstados);
        ContenedorEStados.setAdapter(Adaptador);
        ContenedorEStados.setOnItemSelectedListener(this);



    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String texto =ContenedorEStados .getSelectedItem().toString();
        Toast.makeText(this,"Valor seleccionado "+ texto,Toast.LENGTH_LONG).show();

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
