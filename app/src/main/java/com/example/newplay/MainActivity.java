package com.example.newplay;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * 引导页 5秒之后进入
 */
public class MainActivity extends AppCompatActivity  {


    private TextView time;
    private int times = 5;
    private Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if (msg.what==0){
                times--;
                time.setText(times+getResources().getString(R.string.timing));
                if (times>0){
                    handler.sendEmptyMessageDelayed(0,1000);
                }else {
                    Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        time = findViewById(R.id.time);
        time.setText(times+getResources().getString(R.string.timing));
        handler.sendEmptyMessageDelayed(0,1000);
    }

}
