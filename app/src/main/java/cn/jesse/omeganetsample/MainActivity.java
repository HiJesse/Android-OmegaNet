package cn.jesse.omeganetsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import cn.jesse.omeganet.OmegaNetClient;

public class MainActivity extends AppCompatActivity {
    private OmegaNetClient omegaNetClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        omegaNetClient = new OmegaNetClient();

    }
}
