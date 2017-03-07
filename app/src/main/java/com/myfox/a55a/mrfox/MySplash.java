package com.myfox.a55a.mrfox;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MySplash extends AppCompatActivity {

    ImageView imageView;
    TextView textView;
    Animation a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //_________________________________________________
        imageView = (ImageView)findViewById(R.id.imageView);
        textView=(TextView)findViewById(R.id.textView);
        //_________________________________________________
        //String carpetaFuente = "fonts/Fine College.ttf";
        String carpetaFuente = "fonts/AmaticSC-Regular.ttf";

        // Cargamos la fuente
        Typeface fuente = Typeface.createFromAsset(getAssets(), carpetaFuente);

        // Aplicamos la fuente
        textView.setTypeface(fuente);
        //______________________ANIMACION__________________________
        a = AnimationUtils.loadAnimation(this, R.anim.pulse_animation);
        textView.setAnimation(a);



        abrirMain();

    }




    public void abrirMain() {

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(MySplash.this, MyLogin.class);
                startActivity(i);
                finish();
            }
        }, 3000);
    }
}
