package com.shams.maor.verticalviewpager.fragments;

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.shams.maor.verticalviewpager.MainActivity;
import com.shams.maor.verticalviewpager.R;
import com.shams.maor.verticalviewpager.VVPager;

public class LoginFragment extends Fragment {

    // viewPager reference
    final VVPager viewPager = MainActivity.getViewPager();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the view for the fragment based on layout XML
        LinearLayout mainLayout = (LinearLayout) inflater.inflate(R.layout.fragment_login, container, false);

        // get the forgotPass TextView, add listener
        TextView forgotPass = (TextView) mainLayout.findViewById(R.id.login_forgotPass_textView);
        forgotPass.setOnClickListener(forgotPassListener);

        // get the createAccount TextView, add listener
        TextView createAccount = (TextView) mainLayout.findViewById(R.id.login_createAccount);
        createAccount.setOnClickListener(createAccountListener);

        return mainLayout;
    }

    /**
     * Listener for when clicking on "Forgot Pass?" TextView
     * Go to the Register fragment
     */
    View.OnClickListener forgotPassListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            setCurrentItem(0);
        }
    };

    /**
     * Listener for when clicking on "Don't Have an Account?" TextView
     * Go to the Register fragment
     */
    View.OnClickListener createAccountListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            setCurrentItem(2);
        }
    };


    // set the current item (fragment)
    private void setCurrentItem(final int item) {
        new Handler().post(new Runnable() {
            @Override
            public void run() {
                viewPager.setCurrentItem(item, true);
            }
        });
    }
}
