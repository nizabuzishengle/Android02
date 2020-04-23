package cn.edu.sdwu.android02.classroom.sn170507180211;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Ch12Activity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_ch12_1);
    }

    public void start_service(View view){
        Intent intent=new Intent(this,MyService.class);
        startService(intent);
    }
    public void stop_service(View view) {
    }

}
