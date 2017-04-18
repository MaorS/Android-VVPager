package com.shams.maor.verticalviewpager;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.shams.maor.verticalviewpager.fragments.ContentFragmentAdapter;
import com.shams.maor.verticalviewpager.fragments.LoginFragment;
import com.shams.maor.verticalviewpager.fragments.PassResetFragment;
import com.shams.maor.verticalviewpager.fragments.RegisterFragment;

public class MainActivity extends AppCompatActivity {

    private static VVPager viewPager;

    // share the same instance
    public static VVPager getViewPager() {
        return viewPager;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViewPager();
    }


    private void initViewPager() {
        // get the viewPager
        viewPager = (VVPager) findViewById(R.id.vertical_viewpager);

        // create new adapter, add the fragments into the content fragment adapter holder
        ContentFragmentAdapter adapter = new ContentFragmentAdapter.Holder(getSupportFragmentManager())
                .add(new PassResetFragment())
                .add(new LoginFragment())
                .add(new RegisterFragment())
                .set();

        // set the adapter into the viewPager
        viewPager.setAdapter(adapter);

        // set the speed of scroll
        viewPager.setDurationScroll(1000);

        // set the main fragment as LoginFragment
        startFragment(1);

        // If you setting other scroll mode, the scrolled fade is shown from either side of display.
        viewPager.setOverScrollMode(View.OVER_SCROLL_NEVER);
    }

    // set the current item (fragment)
    private void startFragment(final int item) {
        new Handler().post(new Runnable() {
            @Override
            public void run() {
                viewPager.setCurrentItem(item, false);
            }
        });
    }
}

