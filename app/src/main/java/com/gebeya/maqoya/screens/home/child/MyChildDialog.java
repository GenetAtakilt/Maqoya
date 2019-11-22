package com.gebeya.maqoya.screens.home.child;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import com.gebeya.maqoya.framework.R;

public class MyChildDialog extends DialogFragment {
    
    ImageView back;
    Button   save;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setStyle(DialogFragment.STYLE_NO_TITLE, 0);
        setStyle(DialogFragment.STYLE_NO_FRAME, 0);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.dialog_child_info,container,false);
        

        return view;
    }



    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        back = view.findViewById(R.id.back);
        save = view.findViewById(R.id.child_info_save);

        back.setOnClickListener(onCloseClickListener());

    }

    private View.OnClickListener onCloseClickListener() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyChildDialog.this.dismiss();
            }
        };
    }
}
