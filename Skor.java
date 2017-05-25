package com.example.onur.adamasmaca;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by ycl on 15.04.2017.
 */

public class Skor extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.skor);

        TextView textskor = (TextView)findViewById(R.id.textoyunskoru);
        Button   btnyenidenbasla = (Button)findViewById(R.id.buttonyenioyun);

        int skor = getIntent().getIntExtra("skor", 0);

        textskor.setText(String.valueOf(skor));

      btnyenidenbasla.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              finish();
              Intent intent = new Intent(getApplicationContext(), MainActivity.class);
              startActivity(intent);
          }
      });

    }
}
