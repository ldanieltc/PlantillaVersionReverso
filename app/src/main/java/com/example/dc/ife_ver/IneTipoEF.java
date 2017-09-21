package com.example.dc.ife_ver;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class IneTipoEF extends Activity{
    String textoId = "IDMEX1836577170<<0747116375842\n8007057M1812315MEX<02<<12345<7\nGOMEZ<VELAZQUEZ<<MARGARITA<<<<";
    TextView textViewTextoId;
    String cuadro3 = "EDMUNDO JACOBO MOLINA SECRETARIO EJECUTIVO DEL INSTITUTO NACIONAL ELECTORAL";
    TextView textoBajoFirma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        setContentView(R.layout.ine_e_f);

        textoBajoFirma = (TextView) findViewById(R.id.TextoBajoFirma);
        textoBajoFirma.setText(cuadro3);

        textViewTextoId = (TextView) findViewById(R.id.textosal);
        textViewTextoId.setText(textoId);

    }
}
