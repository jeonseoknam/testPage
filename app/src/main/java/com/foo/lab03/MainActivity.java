package com.foo.lab03;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//      setContentView(R.layout.activity_main);

        LinearLayout linear = new LinearLayout(this); //default는 수평이다(horizental)

        Button bt = new Button(this); //button도 textView의 자식이다
        bt.setText("Button 1");
        linear.addView(bt);

        Button bt2 = new Button(this);
        bt2.setText("Button 2");
        linear.addView(bt2);

        setContentView(linear);  // setContentView를 오버로드 해둔 것이다. 루트의 참조를 넣어둔 것이다
        }
    }
