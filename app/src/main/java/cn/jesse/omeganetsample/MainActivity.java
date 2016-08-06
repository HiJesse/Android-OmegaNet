package cn.jesse.omeganetsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import cn.jesse.omeganet.OmegaNetClient;
import cn.jesse.omeganet.channel.ChannelInitializer;
import cn.jesse.omeganet.channel.socket.SocketChannel;

public class MainActivity extends AppCompatActivity {
    private OmegaNetClient omegaNetClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        omegaNetClient = new OmegaNetClient();
        omegaNetClient.handler(new ChannelInitializer<SocketChannel>() {
            @Override
            protected void initChannel(SocketChannel ch) throws Exception {

            }
        });
    }
}
