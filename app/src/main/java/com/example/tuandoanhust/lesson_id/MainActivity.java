package com.example.tuandoanhust.lesson_id;

import android.graphics.Typeface;
import android.icu.text.DisplayContext;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Creat View Group Root
        RelativeLayout relativeLayoutRoot = new RelativeLayout(this);
        RelativeLayout.LayoutParams paramsRoot = new RelativeLayout.LayoutParams
                (ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        relativeLayoutRoot.setLayoutParams(paramsRoot);
        // Add Text View
        final TextView mtv_Sologan = new TextView(this);
        RelativeLayout.LayoutParams paramsSologan = new RelativeLayout.LayoutParams
                (ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        paramsSologan.addRule(RelativeLayout.CENTER_HORIZONTAL);
        paramsSologan.setMargins(0, 20, 0, 20);
        mtv_Sologan.setLayoutParams(paramsSologan);
        mtv_Sologan.setId(R.id.tvSologan);
        mtv_Sologan.setText(R.string.sologan);
        mtv_Sologan.setPadding(10, 10, 10, 10);
        mtv_Sologan.setTypeface(null,Typeface.BOLD);
        relativeLayoutRoot.addView(mtv_Sologan);

        // Add Button
        Button mbtn_Click = new Button(this);
        RelativeLayout.LayoutParams paramsClick = new RelativeLayout.LayoutParams
                (ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        paramsClick.addRule(RelativeLayout.BELOW, mtv_Sologan.getId());
        paramsClick.addRule(RelativeLayout.CENTER_HORIZONTAL);
        mbtn_Click.setLayoutParams(paramsClick);
        mbtn_Click.setText(R.string.click);
        mbtn_Click.setAllCaps(false);
        mbtn_Click.setPadding(30, 30, 30, 30);
        relativeLayoutRoot.addView(mbtn_Click);

        // Set display
        setContentView(relativeLayoutRoot);

        // Set event
        mbtn_Click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mtv_Sologan.setText(R.string.change);
            }
        });
    }
}
