package com.example.deepamgoel.landingpage;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.facebook.shimmer.ShimmerFrameLayout;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView playStore = findViewById(R.id.play_store);
        ImageView appStore = findViewById(R.id.app_store);

        ImageView playStore1 = findViewById(R.id.play_store1);
        ImageView appStore1 = findViewById(R.id.app_store1);

        ShimmerFrameLayout container1 = findViewById(R.id.shimmer_view_container_1);
        ShimmerFrameLayout container2 = findViewById(R.id.shimmer_view_container_2);
        ShimmerFrameLayout container3 = findViewById(R.id.shimmer_view_container_3);
        ShimmerFrameLayout container4 = findViewById(R.id.shimmer_view_container_4);
        ShimmerFrameLayout container5 = findViewById(R.id.shimmer_view_container_5);
        ShimmerFrameLayout container6 = findViewById(R.id.shimmer_view_container_6);
        ShimmerFrameLayout containerLast = findViewById(R.id.last);
        ShimmerFrameLayout containerLast1 = findViewById(R.id.last1);
        container1.startShimmerAnimation();
        container2.startShimmerAnimation();
        container3.startShimmerAnimation();
        container4.startShimmerAnimation();
        container5.startShimmerAnimation();
        container6.startShimmerAnimation();
        containerLast.startShimmerAnimation();
        containerLast1.startShimmerAnimation();

        playStore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.tinyco.avengers&hl=en"));
                startActivity(intent);
            }
        });

        appStore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://itunes.apple.com/us/app/marvel-avengers-academy/id1061768547?mt=8"));
                startActivity(intent);
            }
        });

        playStore1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.tinyco.avengers&hl=en"));
                startActivity(intent);
            }
        });

        appStore1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://itunes.apple.com/us/app/marvel-avengers-academy/id1061768547?mt=8"));
                startActivity(intent);
            }
        });
    }
}
