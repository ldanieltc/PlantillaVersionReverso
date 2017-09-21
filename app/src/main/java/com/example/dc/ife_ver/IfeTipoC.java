package com.example.dc.ife_ver;


import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import android.widget.TextView;

public class IfeTipoC extends Activity{

    String NumVerticales= "1234567894321";
    String cuadro1= "ESTE DOCUMENTO ES INTRANSFERIBLE, NO ES VALIDO SI PRESENTA TACHADURAS O ENMENDADURAS.";
    String cuadro2 = "EL TITULAR ESTA OBLIGADO A NOTIFICAR EL CAMBIO DE DOMICILIO EN LOS 30 DIAS SIGUIENTES A QUE ESTE OCURRA.";
    String cuadro3 = "EDMUNDO JACOBO MOLINA SECRETARIO EJECUTIVO DEL INSTITUTO FEDERAL ELECTORAL";

    TextView tvCuadro1;
    TextView tvCuadro2;
    TextView tvCuadro3;
    TextView tvNumeros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        setContentView(R.layout.ife_c);

        tvCuadro1 = (TextView) findViewById(R.id.textViewTextoJuntoFirma);
        tvCuadro1.setText(cuadro1);
        tvCuadro2 = (TextView) findViewById(R.id.textViewTextoInfIzq);
        tvCuadro2.setText(cuadro2);
        tvCuadro3 = (TextView) findViewById(R.id.textViewTextoBajoFirma);
        tvCuadro3.setText(cuadro3);
       //tvNumeros = (TextView) findViewById(R.id.textViewNumeros);
        // tvNumeros.setText(NumVerticales);

    }
}
