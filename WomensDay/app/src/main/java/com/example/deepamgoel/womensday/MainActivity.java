package com.example.deepamgoel.womensday;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    int i = 0;
    private String[] array = {
            "She is woman.",
            "She is mother, daughter, wife, sister.",
            "She is a person.",
            "She is strong, smart, crafty.",
            "She is  passionate, courageous, generous.",
            "She is a action, emotion, devotion.",
            "She has hope, beauty, power",
            "She has a brain and she knows how to use it.",
            "She gives you life.",
            "She gives you respect, love, gratitude.",
            "She believes in you.",
            "She will nurture you, fight for you.",
            "She deserves nothing less from you.",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text);
        textView.setText(array[0]);
        ImageView previous = findViewById(R.id.previous);
        previous.setVisibility(View.INVISIBLE);
    }

    public void next(View view) {

        ImageView img = findViewById(R.id.img);
        ImageView next = findViewById(R.id.next);
        ImageView woman = findViewById(R.id.imgage);
        ImageView previous = findViewById(R.id.previous);

        i++;

        previous.setVisibility(View.VISIBLE);

        if (i >= 13) {

            img.setVisibility(View.VISIBLE);
            woman.setVisibility(View.INVISIBLE);
            next.setVisibility(View.INVISIBLE);
        } else {
            img.setVisibility(View.INVISIBLE);
            textView = findViewById(R.id.text);
            textView.setText(array[i]);
        }

    }

    public void previous(View view) {

        ImageView img = findViewById(R.id.img);
        ImageView next = findViewById(R.id.next);
        ImageView previous = findViewById(R.id.previous);
        ImageView woman = findViewById(R.id.imgage);
        RelativeLayout head = findViewById(R.id.head);

        i--;

        if (i <= 12) {
            woman.setVisibility(View.VISIBLE);
            img.setVisibility(View.INVISIBLE);
            next.setVisibility(View.VISIBLE);

        }
        if(i<=0){
            previous.setVisibility(View.INVISIBLE);
            i=0;
        }
        else
            previous.setVisibility(View.VISIBLE);

        textView = findViewById(R.id.text);
        textView.setText(array[i]);
    }
}
