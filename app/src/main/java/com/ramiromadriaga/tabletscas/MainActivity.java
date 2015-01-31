package com.ramiromadriaga.tabletscas;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

public class MainActivity extends Activity {
    ViewGroup containerA;
    ViewGroup containerB;
    boolean isTablet = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        containerB = (ViewGroup) this.findViewById(R.id.container_b);
        containerA = (ViewGroup) this.findViewById(R.id.container_a);

        FragmentManager fm = getFragmentManager();

        if (containerB != null) {
            Fragment fragment = new FragmentB();
            isTablet = true;
            fm.beginTransaction().add(R.id.container_b, fragment).commit();
        }

        Fragment fragment = new FragmentA();
        fm.beginTransaction().add(R.id.container_a, fragment).commit();

        if (isTablet) {
            //lo que queres que haga si es tablet
        }
    }
}
