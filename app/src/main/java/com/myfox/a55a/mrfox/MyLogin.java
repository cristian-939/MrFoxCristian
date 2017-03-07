package com.myfox.a55a.mrfox;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MyLogin extends AppCompatActivity {

    ImageView imageView;
    TextView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //_________________________________________________
        imageView = (ImageView)findViewById(R.id.imageView);
        textView=(TextView)findViewById(R.id.textView);
        button = (Button)findViewById(R.id.button);
        //_________________________________________________
        //String carpetaFuente = "fonts/Fine College.ttf";
        String carpetaFuente = "fonts/AmaticSC-Regular.ttf";

        // Cargamos la fuente
        Typeface fuente = Typeface.createFromAsset(getAssets(), carpetaFuente);

        // Aplicamos la fuente
        textView.setTypeface(fuente);
        //_________________________________________________

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MyLogin.this, MyMain.class);
                startActivity(i);
            }
        });
    }
}
