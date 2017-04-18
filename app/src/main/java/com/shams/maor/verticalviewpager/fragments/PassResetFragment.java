package com.shams.maor.verticalviewpager.fragments;

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.shams.maor.verticalviewpager.MainActivity;
import com.shams.maor.verticalviewpager.R;

public class PassResetFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the view for the fragment based on layout XML
        return inflater.inflate(R.layout.forgot_password, container, false);
    }
}

