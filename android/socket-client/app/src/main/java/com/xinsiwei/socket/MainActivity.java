package com.xinsiwei.socket;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.xinsiwei.socket.netty.NettyClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            new NettyClient().start("192.168.1.115",8888);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
