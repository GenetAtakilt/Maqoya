package com.gebeya.maqoya.framework.onbording;

import android.os.Bundle;
import android.text.Html;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.gebeya.maqoya.framework.R;

public class slidePagerActivity extends AppCompatActivity {
    ViewPager mSlideViewPager;
    LinearLayout mDotLayout;

    private TextView[] mdots;
    private SliderAdater sliderAdater;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onbored);

        mSlideViewPager = findViewById(R.id.slideViewPager);
        mDotLayout = findViewById(R.id.dots);

        sliderAdater = new SliderAdater(this);
        mSlideViewPager.setAdapter(sliderAdater);
        addDotsIndicater(0);
        mSlideViewPager.addOnPageChangeListener(viewListener);
    }

    public void addDotsIndicater(int position)
    {

        mdots = new TextView[3];
        mDotLayout.removeAllViews();

        for (int i = 0; i<mdots.length; i++)
        {
             mdots[i] = new TextView(this);
             mdots[i].setText(Html.fromHtml("&#8226"));
             mdots[i].setTextSize(35);
             mdots[i].setTextColor(getResources().getColor(R.color.dark_blue));

             mDotLayout.addView(mdots[i]);
        }

        if (mdots.length > 0)
        {
            mdots[position].setTextColor(getResources().getColor(R.color.black_color));

        }
    }

    ViewPager.OnPageChangeListener viewListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {
                   addDotsIndicater(position);

        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };
}
