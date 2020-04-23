package cn.edu.sdwu.android02.classroom.sn170507180211;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.support.annotation.IntDef;
import android.util.Log;

public class MyService extends Service {
    private MediaPlayer mediaPlayer;
    public MyService() {
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mediaPlayer=MediaPlayer.create(this,R.raw.wav);
        mediaPlayer.setLooping(true);
        Log.i(MediaPlayer.class.toString(),"onCreate");
    }

    @Override
    public int onStartCommand(Intent intent,int flags, int startId) {
        mediaPlayer.start();
        Log.i(MediaPlayer.class.toString(),"onStartCommand");
        return super.onStartCommand(intent, flags, startId);

    }

    @Override
    public void onDestroy() {
        mediaPlayer.stop();
        mediaPlayer.release();
        super.onDestroy();
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
