package mx.edu.isc.tesoem.hugo4295.p1p2_7s21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class ImagenActivity extends AppCompatActivity {

    ImageView ivimagen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imagen);
        ivimagen = findViewById(R.id.ivfoto);

        Glide.with(this).load("https://drive.google.com/file/d/11NvMRShax_jnUMfGF5qUQ0-RGuGiQbID/view?usp=drive_link").into(ivimagen);
        //Glide.with(this).load("https://fastly.picsum.photos/id/237/200/300.jpg?hmac=TmmQSbShHz9CdQm0NkEjx1Dyh_Y984R9LpNrpvH2D_U").into(ivimagen);

    }
}