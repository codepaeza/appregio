package com.paez.edwin.appregio;

/**
 * Created by PC on 17/12/2017.
 */

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.telephony.PhoneNumberUtils;
import android.view.View;

/**
 * Created by PC on 17/12/2017.
 */
public class SolicitarActivity extends ActionBarActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.solicitar_servicio);
    }

    public void llamadaTelefono(View v) {
        Intent i = new Intent(android.content.Intent.ACTION_CALL,
                Uri.parse("tel:3213875100"));
        startActivity(i);
    }

    public void enviaWhatsapp(View view)
    {
        Intent intentwh = new Intent("android.intent.action.MAIN");
        intentwh.setComponent(new ComponentName("com.whatsapp","com.whatsapp.Conversation"));
        intentwh.putExtra("jid", PhoneNumberUtils.stripSeparators("57" + "3213875100")+"@s.whatsapp.net");
        startActivity(intentwh);
    }


    public void mandarCorreo(View view){
        Intent intent=new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_SUBJECT, "asunto");
        intent.putExtra(Intent.EXTRA_TEXT, "texto del correo");
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"epaeza36@gmail.com"});
        startActivity(intent);
    }

}

