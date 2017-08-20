package com.touhidapps.androdiintentexamples;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button buttonImplicitIntent, buttonExplicitIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonImplicitIntent = (Button) findViewById(R.id.buttonImplicitIntent);
        buttonExplicitIntent = (Button) findViewById(R.id.buttonExplicitIntent);
        buttonImplicitIntent.setOnClickListener(this);
        buttonExplicitIntent.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.buttonImplicitIntent:
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://google.com"));
                startActivity(intent);
                break;

            case R.id.buttonExplicitIntent:
                Intent i = new Intent(getApplicationContext(), Main2Activity.class);
                startActivity(i);
                break;
        }
    }
}
