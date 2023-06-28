package org.matematicasfacil.registrodatos;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.matematicasfacil.registrodatos.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Método ViewBinding
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = String.valueOf(binding.editTextNombre.getText());
                String lastName = binding.editTextApellido.getText().toString();
                String email = binding.editTextEmail.getText().toString();
                String password = binding.editTextPassword.getText().toString();

                if(binding.editTextNombre.getText().toString().isEmpty() || binding.editTextApellido.getText().toString().isEmpty() || binding.editTextEmail.getText().toString().isEmpty()
                        || binding.editTextPassword.getText().toString().isEmpty()   ){
                    Toast.makeText(getBaseContext(), "Faltan campos por completar ", Toast.LENGTH_SHORT).show();
                    return;
                }
                if(!binding.editTextEmail.getText().toString().contains("@")){
                    Toast.makeText(getBaseContext(), "Campo correo invalido ", Toast.LENGTH_SHORT).show();
                    return;
                }

                String concatenado = "Nombre: " + name + " Apellido: " + lastName + " Correo: " + email + " Contraseña: " + password;
                Toast.makeText(getBaseContext(), concatenado, Toast.LENGTH_SHORT).show();
            }
        });


        //MÉTODO findViewById()
        /*
        setContentView(R.layout.activity_main);
        EditText nombre = findViewById(R.id.editTextNombre);
        EditText apellido = findViewById(R.id.editTextApellido);
        EditText correo = findViewById(R.id.editTextEmail);
        EditText clave = findViewById(R.id.editTextPassword);
        Button boton = findViewById(R.id.button);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = String.valueOf(nombre.getText());
                String lastName = apellido.getText().toString();
                String email = correo.getText().toString();
                String password = clave.getText().toString();

                if(nombre.getText().toString().isEmpty() || apellido.getText().toString().isEmpty() || correo.getText().toString().isEmpty()
                        || clave.getText().toString().isEmpty()   ){
                    Toast.makeText(getBaseContext(), "Faltan campos por completar ", Toast.LENGTH_SHORT).show();
                    return;
                }
                if(!correo.getText().toString().contains("@")){
                    Toast.makeText(getBaseContext(), "Campo correo invalido ", Toast.LENGTH_SHORT).show();
                    return;
                }

                String concatenado = "Nombre: " + name + " Apellido: " + lastName + " Correo: " + email + " Contraseña: " + password;
                Toast.makeText(getBaseContext(), concatenado, Toast.LENGTH_SHORT).show();
            }
        });*/
    }
}