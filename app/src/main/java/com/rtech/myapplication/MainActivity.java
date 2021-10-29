package com.rtech.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.btnPdf);
        initView();
        initInstance();
        initClickListner();
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PDFAcitvity.class);
                startActivity(intent);
            }
        });
    }


    /*
     * Created BY : Ritik Dhakate.
     * Created ON : 29-10-2021 17:25
     * Description : This is used to create for
     * Updated BY :
     * Updated ON :
     * Description :
     */
    private void initView() {

        try {

        } catch (Exception exception) {
            System.out.println("@@@@@@@ Exception==>" + exception.toString());
            Log.d("@@@@ Exception==>", exception.toString());
        }
    }


    /*
     * Created BY : Ritik Dhakate.
     * Created ON : 29-10-2021 17:24
     * Description : This is used to create for
     * Updated BY :
     * Updated ON :
     * Description :
     */

    private void initInstance() {
                try {

        } catch (Exception exception) {
            System.out.println("@@@@@@@ Exception==>" + exception.toString());
            Log.d("@@@@ Exception==>", exception.toString());
        }
    }

    /*
     * Created BY : Ritik Dhakate.
     * Created ON : 29-10-2021 17:24
     * Description : This is used to create for
     * Updated BY :
     * Updated ON :
     * Description :
     */
    private void initClickListner() {

        try {

        } catch (Exception exception) {
            System.out.println("@@@@@@@ Exception==>" + exception.toString());
            Log.d("@@@@ Exception==>", exception.toString());
        }
    }
}