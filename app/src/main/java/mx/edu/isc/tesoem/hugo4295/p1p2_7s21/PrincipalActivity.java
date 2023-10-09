package mx.edu.isc.tesoem.hugo4295.p1p2_7s21;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class PrincipalActivity extends AppCompatActivity {

    RadioButton rbhombre, rbbinario, rbmujer;

    Button btnverifica,btncbverficica, btnp2;

    CheckBox cbcasa, cbescuela, cbpublico;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        rbhombre = findViewById(R.id.rbhombre);
        rbbinario = findViewById(R.id.rbbinario);
        rbmujer = findViewById(R.id.rbmujer);
        btnverifica = findViewById(R.id.btnverifica);
        cbcasa = findViewById(R.id.cbcasa);
        cbescuela = findViewById(R.id.cbescuela);
        cbpublico = findViewById(R.id.cbpublico);
        btncbverficica = findViewById(R.id.btncbverifica);
        btnp2 = findViewById(R.id.btnp2);
    }

    public void acciones(View v){
        if (v.getId() == R.id.rbhombre){
            Toast.makeText(this, "Se selecciono Hombre", Toast.LENGTH_SHORT).show();
        } else if (v.getId() == R.id.rbbinario){
            Toast.makeText(this, "Se selecciono No binario", Toast.LENGTH_SHORT).show();
        }else if (v.getId() == R.id.rbmujer){
            Toast.makeText(this, "se Selecciono mujer", Toast.LENGTH_SHORT).show();
        }else if (v.getId() == R.id.btnverifica){
            checarradio();
        }else if (v.getId() == R.id.btncbverifica){
            checarcb();
        }else if (v.getId() == R.id.btnp2){
            Intent intent = new Intent(this, ImagenActivity.class);
            startActivity(intent);
        }
    }

    private void checarcb() {
        if (cbcasa.isChecked()){
            Toast.makeText(this, "lo usa en casa", Toast.LENGTH_SHORT).show();
        }else if (cbescuela.isChecked()){
            Toast.makeText(this, "Lo usa en escuela", Toast.LENGTH_SHORT).show();
        }else if (cbpublico.isChecked()){
            Toast.makeText(this, "Lo usa en lugares publicos", Toast.LENGTH_SHORT).show();
        }
    }

    public void checarradio(){
        if (rbhombre.isChecked()){
            Toast.makeText(this, "Selecciono hombre", Toast.LENGTH_SHORT).show();
        } else if (rbbinario.isChecked()){
            Toast.makeText(this, "Selecciono No Binario", Toast.LENGTH_SHORT).show();
        } else if (rbmujer.isChecked()){
            Toast.makeText(this, "Selecciono Mujer", Toast.LENGTH_SHORT).show();
        }
    }
}