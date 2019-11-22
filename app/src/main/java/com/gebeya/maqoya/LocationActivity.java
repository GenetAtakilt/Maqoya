package com.gebeya.maqoya;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;

import com.gebeya.maqoya.base.BaseActivity;
import com.gebeya.maqoya.framework.R;

public class LocationActivity extends BaseActivity {


    Button next;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location_setup);

        next = findViewById(R.id.next_button);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(LocationActivity.this,OfficeLocationActivity.class);
                startActivity(intent);


            }
        });

    }
}
