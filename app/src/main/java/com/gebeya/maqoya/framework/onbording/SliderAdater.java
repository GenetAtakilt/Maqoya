package com.gebeya.maqoya.framework.onbording;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.gebeya.maqoya.framework.R;

public class SliderAdater extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;



    public SliderAdater(Context context) {
        this.context = context;
    }

    public int[] images =
    {

        R.drawable.detailonbord,
        R.drawable.onboard,
            R.drawable.onboard

    };


    public String[] title =
            {
                "Discover daycares",
                    "Discover daycares",

                    "Discover daycares"

            };



    public String[] slideDescription =
            {
               "Explore daycares in addis Ababa \n or find the ones around \n you to put your children in",
                    "Explore daycares in addis Ababa \n or find the ones around \n you to put your children in",
                    "Explore daycares in addis Ababa \n or find the ones around \n you to put your children in"

            };
    @Override
    public int getCount() {
        return title.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }


    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        layoutInflater = (LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.activity_slide,container,false);

        ImageView imageView = view.findViewById(R.id.photo);
        TextView textView  =  view.findViewById(R.id.heading);
        TextView description = view.findViewById(R.id.description);

        imageView.setImageResource(images[position]);
        textView.setText(title[position]);
        description.setText(slideDescription[position]);

        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((RelativeLayout)object);
    }
}
