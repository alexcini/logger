package com.example.cini.logger;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

/**
 * Created by logonrm on 12/06/2017.
 */
public class Logger extends Service {
    @Override
    public IBinder OnBind(Intent intent){return null;
    }
    public void onCreate(){
        Log.i("ServiçoMensagem", "****____Serviço Iniciado");}
    public void onDestroy(){
        Log.i("ServiçoMensagem", "****____Serviço Encerrado");}
}
