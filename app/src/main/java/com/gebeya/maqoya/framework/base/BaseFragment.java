package com.gebeya.maqoya.framework.base;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.gebeya.maqoya.framework.util.Util;

import butterknife.ButterKnife;

public class BaseFragment extends Fragment {

    protected View root;

    protected void inflate(int layoutId, ViewGroup container) {
        LayoutInflater inflater = getLayoutInflater();
        root = inflater.inflate(layoutId, container, false);


    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        d("< ---------- onAttach(Context) ---------- >");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        d("< ---------- onCreate(Bundle) ---------- >");
    }


    @Override
    public void onStart() {
        super.onStart();
        d("< ---------- onStart() ---------- >");
    }


    @Override
    public void onResume() {
        super.onResume();
        d("< ---------- onResume() ---------- >");
    }


    @Override
    public void onPause() {
        super.onPause();
        d("< ---------- onPause() ---------- >");
    }


    @Override
    public void onStop() {
        super.onStop();
        d("< ---------- onStop() ---------- >");
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        d("< ---------- onDestroy() ---------- >");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        d("< ---------- onDetach() ---------- >");
    }
    protected void d(String message) {
        Util.d(this, message);
    }

    /**
     * Send a simple Log error message, using the Error level.
     *
     * @param message Message to send.
     */
    protected void e(String message) {
        Util.e(this, message);
    }

    /**
     * Show a toast message using the default length of short for the duration.
     *
     * @param resId The string resource ID to lookup.
     */
    protected void toast(int resId) {
        toast(resId, Toast.LENGTH_SHORT);
    }

    /**
     * Show a toast message using the provided duration length for the duration.
     *
     * @param resId    The string resource ID to lookup.
     * @param duration Provided duration for the toast message.
     */
    protected void toast(int resId, int duration) {
        final String s = getString(resId);
        toast(s, duration);
    }

    /**
     * Show a toast message with a default length of short.
     *
     * @param message Message to show as the toast content.
     */
    protected void toast(String message) {
        toast(message, Toast.LENGTH_SHORT);
    }

    /**
     * Show a toast message with a provided length.
     *
     * @param message Message to show as the toast content.
     * @param length  Length of the toast message.
     */
    protected void toast(String message, int length) {
        Activity activity = getActivity();      // Could be null in some cases
        if (activity != null) {
            Toast.makeText(activity, message, length).show();
        }
    }

}

