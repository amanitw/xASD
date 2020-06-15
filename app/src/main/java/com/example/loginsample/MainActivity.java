package com.example.loginsample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public void gto(View view)
    {
        Intent intent = new Intent(getApplicationContext(),Finalp.class);
        startActivity(intent);
    }
    public void sgo(View view)
    {
        Intent intent = new Intent(getApplicationContext(),Sgo.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = findViewById(R.id.textView5);
        String text = "Signup";
        Spannable ss = new SpannableString(text);
        ForegroundColorSpan fcsblue = new ForegroundColorSpan(Color.BLUE);
        ss.setSpan(fcsblue,0,6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView.setText(ss);
    }
}
