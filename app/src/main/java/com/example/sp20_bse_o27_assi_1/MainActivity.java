package com.example.sp20_bse_o27_assi_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button1,button2;
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=findViewById(R.id.textView);
        button1=findViewById(R.id.btn1);
        button2=findViewById(R.id.btn2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
ActionFragment q=new ActionFragment();
                FragmentTransaction t=getSupportFragmentManager().beginTransaction();
                t.replace(R.id.linearLayout2,q);
                t.commit();
                t1.setText("");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
MessageFragment w=new MessageFragment();
                FragmentTransaction tt=getSupportFragmentManager().beginTransaction();
tt.replace(R.id.linearLayout2,w);
tt.commit();
t1.setText("");
            }
        });
    }
}