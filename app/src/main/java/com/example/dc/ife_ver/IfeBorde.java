package com.example.dc.ife_ver;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

/**
 * Created by DC on 20/09/2017.
 */

public class IfeBorde extends Activity{
    String textoId = "IDMEX1836577170<<07471163758428007057M1812315MEX<02<<12345<7GOMEZ<VELAZQUEZ<<MARGARITA<<<<";
    TextView textViewTextoId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        setContentView(R.layout.ife_borde);

        textViewTextoId = (TextView) findViewById(R.id.textosal);
        textViewTextoId.setText(textoId);
    }
}
