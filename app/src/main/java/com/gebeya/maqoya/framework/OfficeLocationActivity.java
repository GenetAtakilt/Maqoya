package com.gebeya.maqoya.framework;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;

import com.gebeya.maqoya.framework.base.BaseActivity;
import com.gebeya.maqoya.framework.register.RegisterActivity;

public class OfficeLocationActivity extends BaseActivity {

    Button start;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.office_location_setup);

        start = findViewById(R.id.start_button);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(OfficeLocationActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });

    }
}
